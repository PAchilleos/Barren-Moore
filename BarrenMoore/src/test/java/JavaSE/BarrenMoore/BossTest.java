package JavaSE.BarrenMoore;

import static org.junit.Assert.*;

import org.junit.Test;

public class BossTest {
	BossStuff c= new BossStuff();
	Boss b = c.bc(1, 1);	

	@Test
	public void test() {
		//System.out.println(b.getName());
		assertNotEquals("D",b.getName()); //d doesnt exist
		
		
		fail("Not yet implemented");
	}

}
