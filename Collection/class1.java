package Collection;

import java.util.*;

public class class1 {
	public static ArrayList<String> Method1(String c1,String c2,String c3,String c4,String c5) {
		ArrayList<String> list=new ArrayList<String>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		return list;
	}	
	public static ArrayList<Integer> Method2(ArrayList<Integer> list1) {
		for(int i=1;i<=10;i++) {
			list1.add(i);
		}
		
		return list1;
	}
	public static ArrayList<Integer> Method3(ArrayList<Integer> list1) {
		for(int i=11;i<=15;i++) {
			list1.add(i);
		}
		return list1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<String> l=class1.Method1(s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine());
		s.close();
		System.out.println(l);
		ArrayList<Integer> list1=new ArrayList<Integer>();
		System.out.println(class1.Method2(list1));
		System.out.println(class1.Method3(list1));
	}

}
