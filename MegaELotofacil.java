package loterias;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MegaELotofacil {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tap (1) to Megasena, and (2) for Lotofacil: ");
		int option = sc.nextInt();
		Set<Integer> lucky = new TreeSet<Integer>();
		
		if(option == 1) {
		
		
		for(int i = 0; i < 6; i++) {
			double x = Math.round(Math.random() * 59 + 1);
			int myInt = (int)x;
			
			lucky.add(myInt);
		}
		while(lucky.size() < 6) {
			double x = Math.round(Math.random() * 59 + 1);
			int myInt = (int)x;
			
			lucky.add(myInt);
			
		}
		}
		else if (option == 2) {
			for(int i = 0; i < 15; i++) {
				double x = Math.round(Math.random() * 24 + 1);
				int myInt = (int)x;
				
				lucky.add(myInt);
			}
			while(lucky.size() < 15) {
				double x = Math.round(Math.random() * 24 + 1);
				int myInt = (int)x;
				
				lucky.add(myInt);
				
			}
			
			
		}
		else {
			System.out.println("Invalid Tapped!");
		}
		System.out.println(lucky);
		System.out.println(lucky.size());
		
		sc.close();
		
	}

}
