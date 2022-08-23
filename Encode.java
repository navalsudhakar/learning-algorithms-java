package practiceNew;

public class Encode {
	
	public static String encode(String input) {
		char[] c = input.toCharArray();
		char prevCharacter=0;
		int counter=0;
		StringBuilder sb= new StringBuilder();
		for(char value:c) {
			if(value==prevCharacter) 
				counter++;
			
			else {
				
				if(prevCharacter!=0) 
				sb.append(counter).append(prevCharacter);
			
				prevCharacter=value;
				counter=1;			
		}}
		sb.append(counter).append(prevCharacter);
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(encode("aaaabbbdddyyyabz"));
	}

}
