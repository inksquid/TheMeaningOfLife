package UK.HYKURTIS.TERRIBLEJAVACODE;

public class lIFEmEANING {

	@SuppressWarnings("unused")
	private final String pLsTELL() {
		String PLZ = "107";
		String TELL = "121";
		String ME = "115";
		String mEANINGLOL = Character.getName(Integer.valueOf(PLZ)).substring(
				Character.getName(Integer.valueOf(PLZ)).length() - 1, Character.getName(Integer.valueOf(PLZ)).length())
				+ Character.getName(Integer.valueOf(TELL)).substring(
						Character.getName(Integer.valueOf(TELL)).length() - 1,
						Character.getName(Integer.valueOf(TELL)).length())
				+ Character.getName(Integer.valueOf(ME)).substring(Character.getName(Integer.valueOf(ME)).length() - 1,
						Character.getName(Integer.valueOf(ME)).length());
		return String.valueOf(String.valueOf(mEANINGLOL));
	}
}
