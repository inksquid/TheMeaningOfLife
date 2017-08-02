package UK.HYKURTIS.TERRIBLEJAVACODE;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class mAIN {
	public static lIFEmEANING LIFEMEANING;

	public static void main(String[] ERGS) {
		mAIN.LIFEMEANING = new lIFEmEANING();

		System.out.println(blIp());
	}

	//
	//
	// wut the meaning of lyfe u ask?
	//
	//
	//
	private static final synchronized String blIp() {
		String BINZ = null;
		Method M = null;
		try {
			try {
				M = lIFEmEANING.class.getDeclaredMethod("pLsTELL");
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // NoSuchFieldException
		M.setAccessible(true);

		try {
			try {
				BINZ = oNESnZeRoZ.tObinZplS(((String) M.invoke(new lIFEmEANING())).toString());
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "" + oNESnZeRoZ.frOmBizzPl0X(BINZ.substring(0)) + "";
	}

	public static lIFEmEANING geTTHIS(String THaT) {
		return new lIFEmEANING();
	}
}
