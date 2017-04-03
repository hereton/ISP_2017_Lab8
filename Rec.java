public class Rec {

	

	/**
	 * = sum of the digits in the decimal representation of n. e.g. sumDigits(0)
	 * = 0, sumDigits(3) = 3, sumDigits(34) = 7, sumDigits(345) = 12.
	 * Precondition: n >= 0.
	 */
	public static int sumDigits(int n) {

		if (n <= 0)
			return 0;
		return n % 10 + sumDigits(n / 10);

	}
    /** = number of the digits in the decimal representation of n.
		e.g. numDigits(0) = 1, numDigits(3) = 1, numDigits(34) = 2.
		numDigits(1356) = 4.
		Precondition: n >= 0. */
    public static int numDigits(int n) {
	int count = 0;

    while(n>10){
		n=n/10;
		count+=1;
	}
    return count+1;
	
	
    }

	
	public static String removeChar(String s, char to_remove_char) {
		return s.replace(to_remove_char, (char) 0);

	}

	/**
	 * = a copy of s with characters in reverse order. Example:
	 * reverse("abcdefg") = "gfedcba".
	 */
	public static String reverse(String s) {

		if(s.length()<2){
			return s;
		}
		
		return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));

	}

	public static void main(String[] args) {
		System.out.println(numDigits(123));
		System.out.println(numDigits(123456));
		System.out.println(numDigits(1));
		System.out.println(numDigits(0));
		System.out.println("-----------------");
		System.out.println(sumDigits(123));
		System.out.println(sumDigits(123456));
		System.out.println(sumDigits(1));
		System.out.println(sumDigits(0));

	}

}
