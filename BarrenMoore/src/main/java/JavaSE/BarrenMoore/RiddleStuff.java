package JavaSE.BarrenMoore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

public class RiddleStuff {
	
	
	public HashMap<Integer, String> ques() {
		
		HashMap<Integer, String> Q= new HashMap<Integer, String>(); // only create this once. creates whole list of riddles and answers
		ArrayList<String> l= new ArrayList<String>();
		String[] q = null;
		try {
			Scanner s1 = new Scanner(new File("C:\\Users\\Profile\\Desktop\\Questions.txt"));
			
			while (s1.hasNextLine()) {
				q=s1.nextLine().split("\n");
				for (int i =0; i<q.length; i++) {
					if (!q[i].equals(""))
						l.add(q[i]);
					
					
				}
				//for 
				//System.out.println(q);
			
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//String[] q = {"Who?","What","Where","Why"}; //again want to scan these;
		
		//System.out.println(l.get(0));
		for (int i =0; i<l.size();i++) {
 		Q.put(i,l.get(i));
 		
		}
		
		//System.out.println(Q.get(0));
		return Q;
		
	}
	public HashMap<Integer, String> ans(){
		HashMap<Integer, String> A= new HashMap<Integer, String>(); // only create this once. creates whole list of riddles and answers
		ArrayList<String> l= new ArrayList<String>();
		String[] a = null;
		try {
			Scanner s1 = new Scanner(new File("C:\\Users\\Profile\\Desktop\\Answers.txt"));
			
			while (s1.hasNextLine()) {
				a=s1.nextLine().split("\n");
				for (int i =0; i<a.length; i++) {
					if (!a[i].equals(""))
						l.add(a[i]);
					
					
				}
				//for 
				//System.out.println(q);
			
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String[] a = {"me","that","there","coz"};
		for (int i =0; i<l.size();i++) {
			A.put(i,l.get(i));
		}
		
		return A;
		
	}
	//hash maps of questions and answers should mirror each other
	
	public int ridd(HashMap<Integer, String> Q, HashMap<Integer, String> A, int d) {
		if (d==0) {
			System.out.println("Riddle Time! \n\n");
			int x = ThreadLocalRandom.current().nextInt(0, Q.size());
			List<char[]> res = bigram(A.get(x));
			System.out.println(Q.get(x));
			String answer = InputClass.sc.nextLine();
			
			List<char[]> ans = bigram(answer.toLowerCase().replaceAll("\\s+",""));
			System.out.println(sim(res,ans));
			if (sim(res,ans)>0.7){//Pattern.compile(Pattern.quote(answer.replaceAll("\\s+","")), Pattern.CASE_INSENSITIVE).matcher(A.get(x)).find()
				System.out.println("Correct");
			}
			else {
				System.out.println("Wrong");
			}
		}
		return d;
	}
	 
	public double sim(List<char[]> bigram1, List<char[]> bigram2) {
	    List<char[]> copy = new ArrayList<char[]>(bigram2);
	    int matches = 0;
	    for (int i = bigram1.size(); --i >= 0;) {
	        char[] bigram = bigram1.get(i);
	        for (int j = copy.size(); --j >= 0;) {
	            char[] toMatch = copy.get(j);
	            if (bigram[0] == toMatch[0] && bigram[1] == toMatch[1]) {
	                copy.remove(j);
	                matches += 2;
	                break;
	            }
	        }
	    }
	    return (double) matches / (bigram1.size() + bigram2.size());
	}
	
	public List<char[]> bigram(String input) {
	    ArrayList<char[]> bigram = new ArrayList<char[]>();
	    for (int i = 0; i < input.length() - 1; i++) {
	        char[] chars = new char[2];
	        chars[0] = input.charAt(i);
	        chars[1] = input.charAt(i+1);
	        bigram.add(chars);
	    }
	    return bigram;
	}
	

}
