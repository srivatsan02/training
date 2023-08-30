
public class MailValidator {

	    public static void main(String[] args) {
	        String email = "sriv@gmail.com"; 
	         
	        if (isValidEmail(email)) {
	            System.out.println(email+" is a VALID mail.");
	        } else {
	            System.out.println(email+" is NOT a VALID mail.");
	        }
	    }
	    
	    public static boolean isValidEmail(String email) {
	        int atCount = 0;
	        int dotCount = 0;
	        int atIndex = 0;
	        int dotIndex = 0;
	        
	        for (int i = 0; i < email.length(); i++) {
	            char c = email.charAt(i);
	            
	            if (c == '@') {
	                atCount++;
	                atIndex = i;
	            } else if (c == '.') {
	                dotCount++;
	                dotIndex = i;
	            }
	        }
	        
	        if (atCount != 1 || dotCount != 1) {
	            return false;
	        }
	        
	        if (atIndex < 4 || dotIndex - atIndex < 3 || email.length() - dotIndex < 3) {
	            return false;
	        }
	        
	        return true;
	    }
	}
