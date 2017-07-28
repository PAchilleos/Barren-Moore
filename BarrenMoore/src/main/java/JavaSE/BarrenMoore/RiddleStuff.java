package JavaSE.BarrenMoore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RiddleStuff {
	
	public HashMap<Integer, String> ques(){
		HashMap<Integer, String> Q= new HashMap<Integer, String>(); // only create this once. creates whole list of riddles and answers
		String[] q = {"Who?","What","Where","Why"}; //again want to scan these;
		
		for (int i =0; i<q.length;i++) {
			Q.put(i,q[i]);
		}
		
		return Q;
		
	}
	public HashMap<Integer, String> ans(){
		HashMap<Integer, String> A= new HashMap<Integer, String>(); // only create this once. creates whole list of riddles and answers
		
		String[] a = {"me","that","there","coz"};
		for (int i =0; i<a.length;i++) {
			A.put(i,a[i]);
		}
		
		return A;
		
	}
	 //hashmaps of questions and answers should mirror eachother
	
	
	
	

}
