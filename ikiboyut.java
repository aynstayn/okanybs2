package aakdikan;

import java.util.Scanner;

public class ikiboyut {

	public static void main(String[] args) {
		int urun[][] = new int [3][4];
		String sehir[]= {"Edirne","Istanbul","Ankara"};
		String aylar[]= {"Ocak","Subat","Mart","Nisan"};
		Scanner giris = new Scanner (System.in);
		byte i,j;
		
		for(i=0 ; i<sehir.length ; i++) {
			System.out.print(sehir[i]+" ilinin ");
			for (j=0 ; j<aylar.length ; j++) {
				System.out.println(aylar[j] + " Ayi satisi: ");
				urun[i][j] = giris.nextInt();
				
			} // j dongu sonu
		} // i dongusunun sonu
		
		
		// 2boyutlu dizide satır toplama
		int toplam[] = new int[sehir.length];
		toplam[0] = 0;
		toplam[1] = 0;
		toplam[2] = 0;
		for ( i=0 ; i<sehir.length ; i++ ) {
			for (j=0 ; j<aylar.length ; j++) {
				toplam[i] = toplam[i] + urun[i][j];
			}
		}

		int ek[] = new int [sehir.length];
		int eb[] = new int [sehir.length];
		
		for ( i=0 ; i<sehir.length ; i++ ) {
			ek[i] =ekVeri(urun[i]);
			eb[i] = ebVeri(urun[i]);
		}
			
		
		
		
		
		
		
		
		System.out.print("\t\t");
		for (j=0 ; j<aylar.length ; j++) {
		System.out.print(aylar[j] + "\t"); // println olursa alt alta yazar print yaz.
		}
		
		System.out.println("Toplam\t\tEn Kucuk\t\tEn Buyuk");
		for ( i=0 ; i<sehir.length ; i++ ) {
			System.out.print(sehir[i] + "\t\t");
			for (j=0 ; j<aylar.length ; j++) {
				System.out.print(urun[i][j] + "\t");
			}
			System.out.println(toplam[i]+"\t\t"+ek[i]+"\t\t"+eb[i]);
		}
		
		}

	private static int ebVeri(int[] urun) {
		int eb=urun[0];
		for (int i=0 ; i<urun.length ; i++) {
			if (urun[i] > eb)eb=urun[i];
		}
		return eb;
	}

	private static int ekVeri(int[] urun) {
		int ek=urun[0];
		for (int i=0 ; i<urun.length ; i++) {
			if (urun[i] < ek)ek=urun[i];
			
		}
		return ek;
	}

	

}

