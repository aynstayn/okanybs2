import java.util.Scanner;
public class menu {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int secimyap;
	int a;
	int b;
	int c;
	int r;
	int pi = 3;
	
	System.out.println("Kare icin a degeri, Dikdortgen icin b,c degeri, Daire icin r degerlerini giriniz: ");
	a = input.nextInt();
	b = input.nextInt();
	c = input.nextInt();
	r = input.nextInt();
	
	System.out.println("1)Kare Alanı" + "\n" + "2)Dikdorgen Alanı" + "\n" + "3)Daire Alanı" + "\n" + 
	" Yukarıda gordugunuz menuden bir secim yapınız: ");
	secimyap = input.nextInt();	
	
	switch (secimyap) {
		
	case 1: System.out.println("Kare Alanı: " + a*a +"\n"+ "Kare Cevresi: " + 4*a );
	case 2: System.out.println("Dikdortgen Alanı: " + c*b + "\n" + "Dikdortgen Cevresi: " + (2*c) + (2*b));
	case 3: System.out.println("Dairenin Alanı: " + pi*r*r +"\n" + "Daire Cevresi: " + 2*pi*r );
	case 4: System.out.println("Cikis...");
	                 break;
	default : System.out.println("Sayiyi yanlis girdiniz.... ");
	}
 	
	}

}
