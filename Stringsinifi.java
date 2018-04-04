package mathsinif;

public class Stringsinifi {

	public static void main(String[] args) {
		char dizi[] = {'A','t','a','k','a','n'}; // tek tirnak.
		for(int i=0 ; i<dizi.length ; i++) {
			System.out.print(dizi[i]);
		}
		System.out.println(" ");
		String katar = new String(dizi);
		System.out.println("Katar verisi: " +katar);
		System.out.println("Stringin uzunlugu: " +katar.length());
		String katar1 = "Akdikan";
		System.out.println(katar+" "+katar1);
		// iki stringi ekler
		String birlesen = katar.concat(katar1);
		String ad="atakan",ad1="Atakan";
		String soyad="Akdikan" , soyad1 = "akdikan";
		System.out.println("Atakan equals atakan kiyaslama: " + ad.equals(ad1));
		System.out.println(" Akdikan equalignorecase akdikan kiyaslama: " + soyad.equalsIgnoreCase(soyad1));
		
			
		
		System.out.println("-----------------------------------------------------------------------------------------------");
		String isim1="Ali" , isim2="SEZER" , isim3="    Sezen    ", isim4="SEZEN";
		System.out.println(isim1 + " ve " +isim2 + "kiyaslamasi compareTo: " 
				+isim1.compareTo(isim2));
		System.out.println(isim1 + " ve " + isim2 + "kiyaslamasi ignorecase: " + isim1.compareToIgnoreCase(isim2));
		
		// isimden harf alma // charAt(x) x'e ne girilerse karakter sayisini getirir. 0 ilk harf.
		System.out.println("Sezen ilk karakteri: " + isim4.charAt(0));
		
		char[] karakterDizisi = new char[isim4.length()];
		karakterDizisi = isim4.toCharArray(); // karaktar dizisini yazar.
		
		// tumunu kucuk veya buyuge cevirme
		System.out.println("Kucuk harfe cevirme: " + isim1.toLowerCase());
		System.out.println("Buyuk harfe cevirme: " + isim1.toUpperCase());
		
		// harf degistirme
		String isim5 = isim4.replace('S', 'k');
		System.out.println("isim 5" + isim5);
		//bosluklari sil
		System.out.println("bosluklu isim3 : " + isim3);
		System.out.println("bosluklsuz isim3: " + isim3.trim());
		
		
		
		
	}

}
