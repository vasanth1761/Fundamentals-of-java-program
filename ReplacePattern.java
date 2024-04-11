package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplacePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=("This is the pattern and sum");
		Pattern pattern=Pattern.compile("pattern");
		Matcher m= pattern.matcher(str);
		str = m.replaceFirst("product");
		System.out.println("\nThe replaced word:"+str);
		str = m.replaceAll("product");
		System.out.println("The replaced all word:"+str);
		

	}

}
