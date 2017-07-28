package JavaSE.BarrenMoore;

public class Player {
	private String Name;
	private int dis;   // Distance away from next event
	private String or;    // N S E or W
    private boolean inRid;  // in riddle
    private boolean inBoss;   // in boss
    private boolean inFinal;  // in final boss - invoke win condition 
    private int spe; //speed
	
    
    public Player(String name, boolean inRid, boolean inBoss, boolean inFinal, int spe) {
		super();
		Name = name;
		this.inRid = inRid;
		this.inBoss = inBoss;
		this.inFinal = inFinal;
		this.spe = spe;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getDis() {
		return dis;
	}


	public void setDis(int dis) {
		this.dis = dis;
	}


	public String getOr() {
		return or;
	}


	public void setOr(String or) {
		this.or = or;
	}


	public boolean isInRid() {
		return inRid;
	}


	public void setInRid(boolean inRid) {
		this.inRid = inRid;
	}


	public boolean isInBoss() {
		return inBoss;
	}


	public void setInBoss(boolean inBoss) {
		this.inBoss = inBoss;
	}


	public boolean isInFinal() {
		return inFinal;
	}


	public void setInFinal(boolean inFinal) {
		this.inFinal = inFinal;
	}


	public int getSpe() {
		return spe;
	}


	public void setSpe(int spe) {
		this.spe = spe;
	}
        
    
    
}
