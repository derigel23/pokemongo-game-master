package GameDecodeTest;

import POGOProtos.Rpc.*;
import com.google.protobuf.util.*;
import org.junit.*;

import java.io.*;

public class AssetsDigestDecodeTest {
	@Test
	public void TestAssetsDigestDecode() throws Exception {
		try (InputStream is = getClass().getResourceAsStream("assetdigest/versions/latest/ASSET_DIGEST.protobuf")) {
			KFNOJNMNCKN response = KFNOJNMNCKN.parseFrom(is);
			JsonFormat.Printer printer = JsonFormat.printer();
			try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("target/test-classes/ASSET_DIGEST.json"))) {
				printer.appendTo(response, writer);
			}
		}
	}
}
