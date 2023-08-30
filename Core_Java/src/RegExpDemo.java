
public class RegExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name ="Srivatsan";
			String number = "9740970877";
			String email = "srivatsan@gmail.com";
			
			String nameRegex ="[A-Z]{1}[a-z]{3,}";
			String numberRegx = "[7-9]{1}[0-9]{9}";
			String emailRegx = "\"^(.+)@(\\\\S+)$\";";
			
			System.out.println(name.matches(nameRegex)? "Valid name" : "InValid name");
			System.out.println(number.matches(numberRegx)? "Valid num" : "InValid num");
			System.out.println(email.matches(emailRegx)? "Valid mail" : "InValid mail");

			
	}

}
