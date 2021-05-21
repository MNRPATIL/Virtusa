package assesment;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int f=s.nextInt();
		int se=s.nextInt();
		int sum=0;
		List<Integer> list=new ArrayList<>();
		for(int i=f;i<=se;i++) {
			String st=""+i;
			StringBuilder sb=new StringBuilder(st).reverse();
			String str=sb.toString();
			if(st.equals(str)) {
				sum +=i;
				list.add(i);
			}			
		}
		System.out.println(sum);

	}

}
