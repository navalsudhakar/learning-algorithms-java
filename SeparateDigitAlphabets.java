
public class SeparateDigitAlphabets {

	public static void main(String[] args) {

		String s = "xyz164532abcd";

		filterData(s);
	}

	private static void filterData(String s) {
		StringBuilder evenNum = new StringBuilder();
		StringBuilder alphabet = new StringBuilder();
		StringBuilder oddNum = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				if (s.charAt(i) % 2 == 0) {
					evenNum.append(s.charAt(i));
				}

				else {
					oddNum.append(s.charAt(i));
				}
			} else {
				alphabet.append(s.charAt(i));

			}
		}

		System.out.println(oddNum.toString() + evenNum + alphabet);

	}

}
