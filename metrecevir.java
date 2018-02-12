
package hafta4;

import java.util.Scanner;

public class metrecevir {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	byte menu; // sistemde en az yer kaplamak için byte= 8'e kadar menumuz.
	int metre;
	int dm = 10;
	int cm = 100;
	int mm = 1000;
	double dekametre = 0.1;
	double hektametre = 0.01;
	double kilometre = 0.001;
		
	System.out.println("Lutfen metre degerini giriniz: ");
	metre = input.nextInt();
	
	
	System.out.println("1) desimetre\n2) santimetre\n3) milimetre\n4) dekametre\n5) hektametre\n6) kilometre"
			+ "\nYukardaki menuden lutfen birini seciniz: ");
	menu = input.nextByte();
	for (;;) {
	
	switch (menu) {
	case 1: System.out.println(metre + " metre " + metre*dm + " desimetredir."); break;
	case 2: System.out.println(metre + " metre " + metre*cm + " santimetredir."); break;
	case 3: System.out.println(metre + " metre " + metre*mm + " milimetredir."); break;
	case 4: System.out.println(metre + " metre " + metre/dekametre + " dekametredir. "); break;
	case 5: System.out.println(metre + " metre " + metre*hektametre +  " hektametredir."); break;
	case 6: System.out.println(metre + " metre " + metre*kilometre + " kilometredir."); break;
	case 7: System.out.println("Program sonlandırıldı."); break;
	
	
	
		
	}
		
		
		

	}
	}
}
