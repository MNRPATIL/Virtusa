package assesment;

import java.util.*;
import java.util.Map.Entry;

public class States {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("goa");
		al.add("kerala");
		al.add("gujarath");
		
		LinkedHashMap<String,String> lhm=new LinkedHashMap<>();
		for(String st:al) {
			String sub=st.substring(0,3).toUpperCase();
			lhm.put(sub, st);
		}
		System.out.println(lhm);
		
		Set s1=lhm.entrySet();
		Iterator itr=s1.iterator();
		
		String s11="{";
		while(itr.hasNext()) {
			Entry m1=(Entry)itr.next();
			
			String s2="{"+m1.getKey()+","+m1.getValue()+"}";
			s11 += s2+",";			
		}
		String sr=s11.substring(0,s11.length()-1);
		System.out.println(sr+"}");
	}

}
