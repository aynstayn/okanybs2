
public class Methodlar {

	
	public static void main(String[] args) {
	toplama (); //parametresiz
	int a=5 , b=10;
	toplaParametreli(a,b);
	int toplam = toplaParametreGeriDonus(a,b);
	}

	private static int toplaParametreGeriDonus(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	private static void toplaParametreli(int a, int b) {
		System.out.println("Parametreli metod");
		int toplam= a+b;
		System.out.println(a+" + " +b+ " = "+toplam);
	}

	private static void toplama() {
		System.out.println("parametresiz metod");
		int a=5 , b=10;
		int toplam= a+b;
		System.out.println(a+" + " +b+ " = "+toplam);
		
	// 1 kare 2 dikdörtgen switch case menü hesaplattır. 31/01/2018
		
	}

}
