package UK.HYKURTIS.TERRIBLEJAVACODE;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mAIN {
	public static lIFEmEANING LIFEMEANING;

	public static void main(String[] ERGS) {
		mAIN.LIFEMEANING = new lIFEmEANING();

		System.out.println(blIp());

		JFrame JFRAME = null;
		JFRAME = new JFrame("THE MEANING OF LIFE");
		JPanel NORTH = new JPanel();
		NORTH.setLayout(new FlowLayout());
		JFRAME.add(NORTH, BorderLayout.CENTER);

		NORTH.add(new JLabel("the meaning of life: " + blIp()));

		JFRAME.setSize(400, 300);
		JFRAME.setLocationRelativeTo(null);
		JFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFRAME.setVisible(true);
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
