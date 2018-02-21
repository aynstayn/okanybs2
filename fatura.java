package aakdikaan;

import java.util.Scanner;

public class fatura {

	public static void main(String[] args) {
	Scanner giris = new Scanner (System.in);
	System.out.println("Kisi sayisini giriniz: ");
	int ks = giris.nextInt();
	String ad[] = new String[ks];
	int dakika, sms, internet, i;
	int [] vergisizF = new int[ks];
	int [] vergiliF = new int[ks];
	int [] tvergi = new int[ks];
	
	for (i=0 ; i<ks ; i++) {
		System.out.println("İsim giriniz: ");
		ad[i] = giris.next();
		System.out.println("Kullanilan Dakika: ");
		dakika = giris.nextInt();
		System.out.println("Kullanilan Sms: ");
		sms = giris.nextInt();
		System.out.println("Kullanilan Internet: ");
		internet = giris.nextInt();
		
		vergisizF[i] = (int) ( dakika*0.35 + sms*0.25 + internet*10);
		tvergi[i] = (int) ( vergisizF[i]*0.25 + vergisizF[i]*0.004 + vergisizF[i]*0.17);
		vergiliF[i] = vergisizF[i] + tvergi[i];
		
	
	}
	for(;;) {
		// menuyu cagir ve gerekli işlemleri yap..
	
	/* 1)listeleme
	   2)isim ile arama
	   3) devlete ödenecek toplam vergi
	   4) en kucuk en buyuk yas bilgisi (en kucuk yas: Atakan Akdıkan kullandıgı dakika sms internet ödeyecegi telefon..)
	   5)cikis
	   
	
*/
	}
	
	
	
	}

}
