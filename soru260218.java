package akdikan;

import java.util.Scanner;

public class soru260218 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Kac tane sayi gireceksiniz? ");
		int ks = input.nextInt();
		int ctoplam = 0 , ttoplam=0 , csayi=0, tsayi=0 , sayi, toplam=0;
		
		for ( int i = 0 ; i<=ks ; i++) {
			System.out.println(i + ".sayiyi giriniz");
		sayi = input.nextInt();
		if (sayi%2==0) {
			ctoplam=sayi;
			csayi++;
		} else {
			ttoplam+=sayi;
			tsayi++;
		}
		toplam+=sayi;
		}
			
				
					System.out.println("teklerin ortalamasi: " + (ttoplam/tsayi));
					System.out.println("ciftlerin ortalamasi: " + (ctoplam/csayi));
	/*-------------------------------------------------------------------------------------------------*/	
	
	System.out.println("Do dongusu ");
	int i=1;
	toplam=0;
	do {
		System.out.println(i+ "nci sayiyi giriniz.");
		sayi = input.nextInt();
		toplam+= sayi;
	i++;
	} while (i%2==0);
	System.out.println("teklerin ortalamasi: " + (ttoplam/tsayi));
	System.out.println("ciftlerin ortalamasi: " + (ctoplam/csayi));
	
	System.out.println("While dongusu");
	i=1;
	toplam=0;
	while (i%2==0) {
		System.out.println(i+ " inci sayiyi giriniz");
		sayi = input.nextInt();
		toplam+=sayi;
		i++;
	}
	System.out.println("teklerin ortalamasi: " + (ttoplam/tsayi));
	System.out.println("ciftlerin ortalamasi: " + (ctoplam/csayi));
	}


		
	}

