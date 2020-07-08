package GameDecodeTest;

import POGOProtos.Tools.*;
import com.google.protobuf.util.*;
import org.junit.*;

import java.io.*;

public class GameMasterDecodeTest {
	@Test
	public void TestFirmwareGameMasterDecode() throws Exception {
		try (InputStream is = getClass().getResourceAsStream("versions/latest/v2_GAME_MASTER")) {
			GameMasterDecoderTool response = GameMasterDecoderTool.parseFrom(is);
			JsonFormat.Printer printer = JsonFormat.printer();
			try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("target/test-classes/v2_GAME_MASTER.json"))) {
				printer.appendTo(response, writer);
			}
		}
	}
}