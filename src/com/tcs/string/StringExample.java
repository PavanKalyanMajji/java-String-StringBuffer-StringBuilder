package com.tcs.string;
/**
 * 
 *toUpperCase method is used to convert the string lower case to Upper case.
 *charAt method return the character at the index value.
 *compareTo method is used to compare the another string if both the strings are match return's 0 else 1.
 *concat used to concat other string ie., appending the string
 *equals method gives true value when both the strings are matching if it is not matching return false.
 *
 */
public class StringExample {
	public static void main(String[] args) {
		String name = "Pavan kalyan Majji";
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(3));
		System.out.println(name.compareTo("Pavan kalyan Majji"));
		System.out.println(name.concat(" S/o : M.Ramu"));
		System.out.println(name.equals("Pavan kalyan Majji"));
		System.out.println(name.endsWith("Majji"));
		System.out.println(name.contains("alyan"));
		System.out.println(name.compareToIgnoreCase("pavan kalyan majji"));
		System.out.println(name.indexOf('a'));
		System.out.println(name.indexOf('a', 2));
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.lastIndexOf('M', 17));
		System.out.println(name.codePointAt(1));
		System.out.println(name.length());//it gives length of the string
		System.out.println(name.intern());
		System.out.println(name.isEmpty());//it will check string empty or not
	}
}
