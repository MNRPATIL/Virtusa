package assesment;

import java.util.*;
import java.util.Map.Entry;

public class regnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> lhm=new LinkedHashMap<>();
		lhm.put(12, 90);
		lhm.put(35, 90);
		lhm.put(33, 90);
		lhm.put(56, 88);
		
		Set s1=lhm.entrySet();
		Iterator itr=s1.iterator();
		int count=0;
		int sum=0;
		String st="avg of (";
		while(itr.hasNext()) {
			Entry m1=(Entry)itr.next();
			if(((int)m1.getKey())%2==1) {
				st +=(int)m1.getValue()+"+";
				count++;
				sum +=(int)m1.getValue();
			}
		}
		String sr=st.substring(0,st.length()-1)+")";
		System.out.println(sr+" ="+sum/count);
		
	}

}
