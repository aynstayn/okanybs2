import java.util.Scanner;
public class Deneme {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int secimyap;
		int sayi1;
		int sayi2;
		
		System.out.println("Lüfen 2 sayı giriniz: ");
		sayi1 = input.nextInt();
		sayi2 = input.nextInt();
		
		
		System.out.println("Lütfen bir secim yapınız (0-5)");
		secimyap = input.nextInt();
		
		for(;;) {
		switch (secimyap) {
		
		case 1 :
			System.out.println("Toplama = " + (sayi1+sayi2) );
			break;
		case 2:
			System.out.println("Cikarma = " + (sayi1-sayi2) );
			break;
		case 3:
			System.out.println("Carpma = " + (sayi1*sayi2) );
			break;
		case 4:
			System.out.println("Bolme = " + (sayi1/sayi2) );
			break;
		case 5:
			break;
		
		}
		
		
		
		
		}
		
		
			
	}


}