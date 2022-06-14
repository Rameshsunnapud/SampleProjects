package com.cs;

public class StringAllCharacters {
	public static void main(String[] args) {
		String str = "DileepandRamesh123@$#";

		for (int i = 0; i < str.length(); i++) {
			System.out.println(i);
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')
				System.out.println("Vowel");
			else
				System.out.println("Not a vowel");
		}

		for (int i = 0; i < str.length(); i++) {

			if (Character.isUpperCase(str.charAt(i))) {
				System.out.print("UpperCharacters:"+str.charAt(i)+"\n");
			} 

		}
		System.out.println();
		for (int i = 0; i < str.length(); i++) {

			   if (Character.isLowerCase(str.charAt(i)))
               {
                    System.out.print("Lowercase:"+str.charAt(i)+"\n");
               }
			

		}
		

	}

}
