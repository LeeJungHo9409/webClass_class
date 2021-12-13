package adjuster;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Grape> grapes = new ArrayList<>();
		
		for(int i = 0; i<10; i++) {
			grapes.add(Grape.ran());
		}
		
		Collections.sort(grapes, GrapeAdjusters.priceAsc(false));
		
		System.out.println("[price, qty]");
		for(Grape grape : grapes) {
			System.out.println(grape);
		}
	}

}
