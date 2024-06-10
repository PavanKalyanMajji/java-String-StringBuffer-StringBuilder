package com.tcs.stringstringbuffstringbuild;

/**
 * String Introduced JDK 1.0, StringBuffer is Introduced JDK 1.0 and StringBuilder introduced at JDK 1.5
 * String is an immutable, StringBuffer is mutable and StringBuilder is also mutable
 * String is No-Synchronization, StringBuffer is Synchronization and StringBuilder No-Synchronization.
 * String performance is High, StringBuffer performance is Low and StringBuilder High.
 *
 */
public class StringVsStringBufferVsStringBuilder {
	public static void main(String[] args) {
		// String is immutable Proof of code.
		String name = new String("Pavan Kalyan");
		String lastName = new String("Pavan Kalyan");

		System.out.println(name.hashCode());
		System.out.println(lastName.hashCode());
		System.out.println(name.equals(lastName));

		// StringBuffer is mutable Proof of code.
		StringBuffer stBuffer = new StringBuffer("Pavan Kalyan");
		StringBuffer stringBuffer = new StringBuffer("Pavan Kalyan");

		System.out.println(stBuffer.hashCode());
		System.out.println(stringBuffer.hashCode());
		System.out.println(stBuffer.equals(stringBuffer));

		// StringBuilder is mutable proof of code.
		StringBuilder strBuilder = new StringBuilder("Pavan Kalyan");
		StringBuilder stringBuilder = new StringBuilder("Pavan Kalyan");

		System.out.println(strBuilder.hashCode());
		System.out.println(stringBuilder.hashCode());
		System.out.println(strBuilder.equals(stringBuilder));
	}
}
