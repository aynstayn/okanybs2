package mathsinif;

import java.util.Scanner;

public class mathsinif {

	public static void main(String[] args) {
		
		
		
		System.out.println("3 ün 5 inci kuvveti: "+Math.pow(3, 2));
		System.out.println("yuvarlama: /23.4: "+Math.round(23.4));
		System.out.println("yuvarlama: /23.6: "+Math.round(23.6));
		System.out.println("9un karakoku: "+Math.sqrt(9));
		System.out.println("9un karakoku: "+Math.pow(9, 0.5));
		System.out.println("-40'ın mutlak degeri: " + Math.abs(-40));
		System.out.println("Math Floor(assagi ceker) 23.6 icin: " +Math.floor(23.6) );
		System.out.println("Math ceil (yukari ceker) 23.3 icin: "+ Math.ceil(23.3));
		
		// iki sayidan büyügü bulma max methodu:
		System.out.println("3 ve 7den buyuk olan: " + Math.max(3, 7));
		System.out.println("3 ve 7den kucuk olan: " + Math.min(3, 7));
		
		// 0 ile 1 arasında sayı üretir. ve rastgele 2 sayı gir sayı üretir.
		
		
		Scanner giris = new Scanner (System.in);
		System.out.println("alt siniri giriniz:");
		int as = giris.nextInt();
		System.out.println("üst siniri giriniz: ");
		int us = giris.nextInt();
		System.out.println("Random sayi uretme: "+ ( as+(int)(Math.random()* (us-as) ) +"\t") );
		
		
		// 
		
		
		
		
	
	
	
	}

}
