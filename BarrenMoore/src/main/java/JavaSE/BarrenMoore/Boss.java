package JavaSE.BarrenMoore;
import java.util.concurrent.ThreadLocalRandom;

public class Boss {
	private String Name;
	private int Health;  //stats of boss
	private int spe;
	private int pow;
	private int def; // 
	private boolean alive; //whether its alive or not
	
	
	

	public Boss(String name, boolean alive) { 
		super();
		Name = name;
		this.alive = alive;
	}

	

	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public int getHealth() {
		return Health;
	}

	public void setHealth(int basehealth, int lvl,int riddles_solved) {  // base health = 10
		int x = ThreadLocalRandom.current().nextInt(-3, 3 + 1);	
		Health = (int) (lvl*(basehealth+riddles_solved+x));
	}

	public int getSpe() {
		return spe;
	}

	public void setSpe(int basespe, int lvl, int riddles_solved) { //base speed = 3
		int x = ThreadLocalRandom.current().nextInt(-3, 3 + 1);		
		this.spe =(int) (lvl*(basespe+riddles_solved+x));//x adds random
	}

	public int getPow() {
		return pow;
	}

	public void setPow(int basepow,int lvl, int riddles_solved) { //base pow = 8
		int x = ThreadLocalRandom.current().nextInt(-3, 3 + 1);	
		this.pow = (int) (lvl*(basepow+riddles_solved+x));
	}

	public int getDef() {
		return def;
	}
	
	
		public boolean isAlive() {
		return alive;
	}



	public void setAlive(boolean alive) {
		this.alive = alive;
	}



	public void setDef(int basede,int lvl, int riddles_solved) { //base def = 8
		int x = ThreadLocalRandom.current().nextInt(-3, 3 + 1);	
		this.def = (int) (lvl*(basede+riddles_solved+x));
	}
	
	
	
	
	

}
