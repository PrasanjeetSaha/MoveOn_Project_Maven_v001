package TryRun;

import java.util.*;

import org.testng.annotations.Test;

public class Module1Tests {
	@Test
	public void secondMethod(){
		System.out.println("This is my test class");
	}
	
	public static void main(String args[]){
	
	//Remove duplicates and sort a string + adding next values	
		String s="1234 534 12";
		ArrayList<Character> li = new ArrayList<Character>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				li.add(s.charAt(i));
			}
		}
		System.out.println(li);
		TreeSet<Character> ts = new TreeSet<Character>(li);
		int max = ts.last();
		for(int j=ts.size(); j<li.size(); j++){
			ts.add((char) (max+1));
			max += 1;
		}
		
		System.out.println(ts);		
		
	//Adding number without any arithmetic operator
		int a=10, b=20;
		System.out.println("Sum is: "+Integer.sum(a, b));
		
	}

}
