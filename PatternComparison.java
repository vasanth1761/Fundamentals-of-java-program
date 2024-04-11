package com.regex;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class PatternComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pattern pattern= Pattern.compile("[a-z]");
		Pattern pattern= Pattern.compile("s|c");
		//Pattern pattern= Pattern.compile("[A-Z]");
		Matcher m=pattern.matcher("chainsys");
		while(m.find())
		{
			System.out.println("starts from:" +m.group()+m.start() +"to"+(m.end()-1));
		}

	}

}
