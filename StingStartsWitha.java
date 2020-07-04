package epamLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class StingStartsWitha {
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		int n = o.nextInt();
		String[] s= new String[n];
		for(int i=0;i<n;i++)
			s[i]=o.next();
		o.close();
		List<String> list1 = Arrays.asList(s);
		List<String> finallist = StringsWithLength3(list1,(String str)-> str.length()==3);
		System.out.println(finallist);
	}
	public static List<String> StringsWithLength3(List<String> Slist, Predicate<String> predicate){
		List<String> Rstring = new ArrayList<>();
		for(String s: Slist) {
			if(predicate.test(s)&& s.startsWith("a")) {
				Rstring.add(s);
			}
		}
		return Rstring;
	}
}
