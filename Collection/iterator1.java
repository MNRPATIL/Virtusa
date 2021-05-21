package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class iterator1 {

		
		public static ArrayList<String> Method1(String c1,String c2,String c3,String c4,String c5) {
			ArrayList<String> list=new ArrayList<String>();
			list.add(c1);
			list.add(c2);
			list.add(c3);
			list.add(c4);
			list.add(c5);
			return list;
		}	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			ArrayList<String> l=iterator1.Method1(s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine());
			s.close();
			Iterator itr=l.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		}


}
