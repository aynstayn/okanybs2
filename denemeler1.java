package aakdikaan;
import java.util.Scanner;
public class denemeler1 {


	public static void main(String[] args) {
		Scanner giris = new Scanner (System.in);
		System.out.println("Dizi uzunlugunu gir: ");
		int es=giris.nextInt();
		byte i, menu;
		int []sayi = new int [es];  // girisi eleman sayisina yaz
		
		for(i=0 ; i<es; i++) {
			System.out.println(i+" . sayiyi gir: ");
			sayi[i] =giris.nextInt();
			
		}
		
		while(true) {
			menu =menuAl();
			if (menu==5) {
				System.out.println("Program bitti. ");
				System.exit(0);
			}
		switch(menu) {
		case 1: System.out.println("Negatiflerin Ortalamasi: " + negatifOrt(sayi) ); break;
		case 2: System.out.println("Ciftlerin Ortalamasi: " + ciftOrt(sayi) ); break;
		case 3: System.out.println("5'ten buyuk ve 5 ten kucuk sayilar: " + metotBes() ); break;
		case 4: System.out.println("Teklerin toplami: " ); break;
		
		
		}
		}
		
			
		
		}

	

	private static void metotBes(int[] sayi) {
		int buyuk=0 , kucuk=0;
		for (int i=0 ; i<sayi.length; i++) {
			if (sayi[i]<5) kucuk++;
			else buyuk++;
		}
	System.out.println("5 ten kücüklerin sayisi: " +kucuk);
	System.out.println("5 ten buyuklerin sayisi " +buyuk);
	}



	private static float negatifOrt(int[] sayi) {
		int negTopla=0, negSayi=0;
		for (int i=0 ; i<sayi.length; i++) {
			if(sayi[i]<0) { 
			negTopla+=sayi[i];
			negSayi++;
			}
			}
			return negTopla/negSayi;
	}



	private static byte menuAl() {
		System.out.println("1-Negatif ort\n2-Cif ortalamasi\n3-5ten büyük ve 5 ten kucuk");
		System.out.println("4-Tekelrin toplami\n5-cikis");
		Scanner giris = new Scanner (System.in);
		byte menu = giris.nextByte();
		return menu;
		
	}

	private static float ciftfOrt(int[] sayi) {
		int ciftTopla=0, ciftSayi=0;
		for (int i=0 ; i<sayi.length; i++) {
			if(sayi[i]%2==0) { 
			ciftTopla+=sayi[i];
			ciftSayi++;
			}
			}
			return ciftTopla/ciftSayi;
	}

	
	private static int tektoplama(int[] sayi) {
		int tektop=0;
		for (int i=0 ; i<sayi.length; i++) {
			if(sayi[i]%2==1) tektop+=sayi[i] ;
			
		} return tektop;
	}

	
	}


