package JavaSE.BarrenMoore;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class PlayerStuff {  // THE METHODS HERE MOVE THE PLAYER TO AN EVENT
	RiddleStuff rid = new RiddleStuff();
	HashMap<Integer, String> Q= rid.ques();
	HashMap<Integer, String> A= rid.ans();
	
	public Player cr() {
		System.out.println("Please Enter your name: ");
		String name = InputClass.sc.nextLine();
		Player p = new Player(name, false, false, false, 10); //10 is base speed
		p.setDis(4);
		p.setOr("N");   //initial distance away from event set at 4 N	
		return p;
	}
	
	public int printstart(Player p) {
		System.out.println(p.getName()+" you are in the void.\n\n There is an event "+p.getDis()+ " steps " +p.getOr() );
		return p.getDis();
		
	}
	
	public int printstate(Player p) {
		System.out.println(p.getName()+" There is an event "+p.getDis()+ " steps " +p.getOr() );
		return p.getDis();
		
	}
	
	
	
	public int wh(Player p) {
		System.out.println("Which direction would you like to go to [N E S W]");
		String or = InputClass.sc.nextLine();
		if (or.equals(p.getOr())) {
			p.setDis(p.getDis()-1);
		}
		else {
			p.setDis(ThreadLocalRandom.current().nextInt(2, 4+1));
			p.setOr(or);
		}
		return p.getDis();
	}
	
	public int gm(Player p, int d) {
		while (d>0) {
			d=wh(p);	
			if (d!=0) {
				printstate(p);
			}
		}
		System.out.println("You have entered an event DUM DUM DUM!!!");
		rid.ridd(Q,A,d);
		return d;
	}
	

}
