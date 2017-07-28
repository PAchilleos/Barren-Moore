package JavaSE.BarrenMoore;

public class Riddle {
	private String Q; //question
	private boolean isSolved;
	
	public Riddle(String q) {
		super();
		Q = q;
	}

	public String getQ() {
		return Q;
	}

	public void setQ(String q) {
		Q = q;
	}

	public boolean isSolved() {
		return isSolved;
	}

	public void setSolved(boolean isSolved) {
		this.isSolved = isSolved;
	}
	
	

}
