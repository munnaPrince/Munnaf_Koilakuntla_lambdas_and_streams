package epamLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class PalindromeStrings {
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		int n = o.nextInt();
		String s[]= new String[n];
		for(int i=0;i<n;i++)
			s[i]=o.next();
		o.close();
		List<String> list = Arrays.asList(s);
		List<String> Resultlist = stringspal(list,(String str)-> 
		(new StringBuffer(str).reverse().toString().equals(str)));
		System.out.println(Resultlist);
	}
	public static List<String> stringspal(List<String> list,Function<String, Boolean> function){
		List<String> finallist = new ArrayList<>();
		for(String str: list) {
			if(function.apply(str))
				finallist.add(str);	
		}
		return finallist;
	}
}
