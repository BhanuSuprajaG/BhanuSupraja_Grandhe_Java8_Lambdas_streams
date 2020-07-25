package lambdas_streams;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Palindrome {
	public static boolean PalindromeCheck(String s)
	{
		return s.equalsIgnoreCase(new StringBuilder().append(s).reverse().toString());
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		List<String> s1=new ArrayList<String>();
		List<String> res;
		Predicate<String> p=Palindrome::PalindromeCheck;
		int n;
		System.out.println("enter no of strings");
		n=s.nextInt();
		System.out.println("enter strings");
		for(int i=1;i<n;i++)
			s1.add(s.next());
		res=s1.stream().filter(p).collect(Collectors.toList());
		System.out.println(res);
		s.close();
	}

}
