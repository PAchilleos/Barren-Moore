package JavaSE.BarrenMoore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BossStuff {
	
	public Boss bc(int lvl, int rs) {
		int base_hp =50;
		int base_spe = 3;
		int base_pow =8;
		int base_def= 8;		
		//Scanner s1 = new Scanner(new File("C:\\Users\\Profile\\Desktop\\Names.txt")); want to scan a list of names in the future
		String[] N= {"A","B","C"}; // dummy names
		int x = ThreadLocalRandom.current().nextInt(0, N.length);	
		Boss b = new Boss(N[x],true);
		b.setSpe(base_spe,lvl,rs);
		b.setDef(base_def, lvl, rs);
		b.setHealth(base_hp, lvl, rs);
		b.setPow(base_pow, lvl,rs);
		
		
		return b;
		
		
	}

	

}
