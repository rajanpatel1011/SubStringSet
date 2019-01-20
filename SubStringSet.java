package temp;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class SubStringSet {

	public SubStringSet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abab";
		TreeSet<String> stringList = new TreeSet<String>();
		for(int i = 0 ; i< s.length();i++) 
			for(int j = i ; j<s.length();j++) 
				stringList.add(s.substring(i,j+1)); 
		
		int min = 2;
		int max = 3;
		TreeSet<String> MinMaxString = new TreeSet<String>();
		for(String s1:stringList) {
			if(s1.length()>=min && s1.length()<=max) {
				MinMaxString.add(s1);
			}
			}
		TreeSet<String> uniqueString = new TreeSet<String>();
		int j =0;
		for(String s3:MinMaxString) {
				char r []= s3.toCharArray();
			Arrays.sort(r);
			uniqueString.add(new String(r));
				
		}
		System.out.println(uniqueString);
System.out.println(stringList.toString()); 
System.out.println(MinMaxString.clone());		
		
	}
	
	/*public TreeSet<String> SubStringSet(String a){
		for(int i = 0 ; i< a.length();i++) 
			for(int j = i ; j<a.length();j++) 
				stringList.add(a.substring(i,j+1)); 
		
		return null;
		
	}*/

}
