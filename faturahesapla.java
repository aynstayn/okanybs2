import java.util.Scanner;
public class faturahesapla {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String isim ;
		double dakika ;
		double mesaj;
		int internet;
		
		System.out.println("Lutfen isminizi, kullandıgınız dakika, mesaj ve internet degerlerini giriniz: ");
		 
		isim = input.next();
		dakika = input.nextDouble();
		mesaj = input.nextDouble();
		internet = input.nextInt();
		
		System.out.print("Kullandıgınız degerlerere gore faturanız: "+ "\n"  + 
				"İsminiz: " + isim + "\n" +
				"Dakika: " + dakika*0.30+ " TL" +" \n" +
				"Mesaj: " + mesaj*0.25 + " TL" + "\n"  +
				"Internet: " + internet*6 + " TL" );
	}

}
