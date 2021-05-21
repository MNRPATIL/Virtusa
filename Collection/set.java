package Collection;

import java.util.*;

public class set {
	public static HashSet<String> Method1(String c1,String c2,String c3,String c4,String c5) {
	     HashSet<String> list=new HashSet<String>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		return list;
	}	
	public static HashSet<Integer> Method2(HashSet<Integer> list1) {
		for(int i=1;i<=10;i++) {
			list1.add(i);
		}
		
		return list1;
	}
	public static HashSet<Integer> Method3(HashSet<Integer> list1) {
		for(int i=11;i<=15;i++) {
			list1.add(i);
		}
		return list1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		HashSet<String> l=set.Method1(s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine());
		s.close();
		System.out.println(l);
		HashSet<Integer> list1=new HashSet<Integer>();
		System.out.println(set.Method2(list1));
		System.out.println(set.Method3(list1));
	}

}
