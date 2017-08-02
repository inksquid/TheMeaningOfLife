package UK.HYKURTIS.TERRIBLEJAVACODE;

import java.util.Arrays;

public class oNESnZeRoZ {
	public static String tObinZplS(String SUMTINERE) {
		byte[] BITES = SUMTINERE.trim().getBytes();
		StringBuilder BINARY = new StringBuilder();
		for (byte B : BITES) {
			int val = B;
			for (int i = 0; i < 8; i++) {
				BINARY.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
		}
		return BINARY.toString();
	}

	public static String frOmBizzPl0X(String BINZ) {
		StringBuilder BS = new StringBuilder();
		Arrays.stream(BINZ.trim().split("(?<=\\G.{8})")).forEach(S -> BS.append((char) Integer.parseInt(S, 2)));
		String WUTTOGIVESOUT = BS.toString();
		return WUTTOGIVESOUT;
	}
}
