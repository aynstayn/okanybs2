import java.util.Scanner;
public class HocaDeneme1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner giris=new Scanner (System.in);
		int s1,s2,sonuc,menu;
		System.out.print("Birinci sayiyi gir: ");
		s1 = giris.nextInt();
		System.out.println("İkinci sayiyi gir: ");
		s2 = giris.nextInt();
		
		for (;;) {
			System.out.println("1)+\n2)-\n3)*\n4/\n5) Cikis\n\nSeciminiz: ");
			menu=giris.nextInt();
			switch (menu) {
			case 1: System.out.println(s1+" + " +s2 +" = "+ (s1+s2) );
			case 2: System.out.println(s1+" - "+s2 + " = "+ (s1-s2) );
			case 3: System.out.println(s1+" * "+s2 + " = "+ (s1*s2));
			case 4: System.out.println(s1+" / "+s2 + " = "+ (s1/s2));
			case 5: System.out.println("Calismasi bitti");
			System.exit(0);   			break;
			default: System.out.println("Yanlis sayi girdiniz:");
			
			}
		}
		
				
	}

}
