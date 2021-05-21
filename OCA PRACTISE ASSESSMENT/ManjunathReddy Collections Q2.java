package assesment;

import java.util.*;
public class findingMaxMarks {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st1="deepak#12#12#12";
		String st2="john#13#12#11";
		
	String[] word1=st1.split("#");
	String[] word2=st2.split("#");
	int max1=Integer.parseInt(word1[1]);
	for(int i=1;i<word1.length;i++) {
		int j=Integer.parseInt(word1[i]);
		if(j > max1) {
			max1=j;
		}
	}
	int max2=Integer.parseInt(word2[1]);
	for(int i=1;i<word1.length;i++) {
		int j=Integer.parseInt(word2[i]);
		if(j > max2) {
			max2=j;
		}
	}
	
		System.out.println((max1>max2?word1[0]+"  "+max1:word2[0]+"  "+max2));
		
	}

}
