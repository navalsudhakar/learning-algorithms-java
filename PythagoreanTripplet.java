package practiceNew;

public class PythagoreanTripplet {

	public static void main(String[] args) {
		
		Integer[] input= new Integer[] {3,4,6};
		int length=input.length;
		if(isTripplet(input,length)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

	private static boolean isTripplet(Integer[] input, int length) {
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				for (int k = j + 1; k < length; k++) {
					int x = input[i] * input[i];
					int y = input[j] * input[j];
					int z = input[k] * input[k];
					if (x == y + z || y == x + z || z == x + y) {
						return true;
					}
				}
			}
		}
		return false;

	}

}
