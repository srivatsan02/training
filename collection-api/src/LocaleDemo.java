import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {

	public static void main(String[] args) {
		//ResorceBundle bundle = ResorceBundle.getBundle("msgs",Locale.FRENCH);
		
		Locale desi = new Locale("hi");
		ResourceBundle bundle = ResourceBundle.getBundle("msgs", desi);
		
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));

	}

}
