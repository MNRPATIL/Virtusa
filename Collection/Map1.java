package Collection;


import java.util.*;
public class Map1 {
	
	/*public static HashMap Method1(String name,int rollnumber,HashMap m) {
		m.put(rollnumber,name);
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String name=s.nextLine();
		int rollnum=s.nextInt();
		//HashMap m=new HashMap();
		//System.out.println(Map1.Method1(name,rollnum,m));
		TreeMap m=new TreeMap();
		System.out.println(Map1.Method1(name,rollnum,m));
	}
	*/
	public static TreeMap Method1(TreeMap m) {
		m.put("Joseph",2);
		m.put("jackson", 6);
		return m;
	}

	public static void main(String[] args) {
		
		TreeMap m=new TreeMap();
		System.out.println(Map1.Method1(m));
	}

}
