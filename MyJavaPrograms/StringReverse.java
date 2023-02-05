//Program to reverse string characters.

public class StringReverse {

	public static void main(String[] args) {
		String name="Pinky";
		char[] try1 = name.toCharArray();
		 
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
	}

}
