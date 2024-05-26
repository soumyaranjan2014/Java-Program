import java.util.regex.Pattern;

public class String_Separate {
	 public static void main(String[] args) {
	        String input = "abc123def456";
	        
	        // Separate alphabetic characters
//	        String alphabets = input.replaceAll("[^a-zA-Z]", "");
	        
	        // Separate numeric characters
//	        String numbers = input.replaceAll("[^0-9]", "");
//	        
//	        System.out.println("Alphabets: " + alphabets);
//	        System.out.println("Numbers: " + numbers);
	        String Alpha = "[^a-zA-Z]";
	        int length = input.length();
	        for(int i=0;i<length;i++) {
	        	if(input.matches(Alpha)) {
	        		
	        	}
	        }
	    }
	 
	 

}
