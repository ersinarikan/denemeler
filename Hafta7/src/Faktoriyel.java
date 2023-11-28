
public class Faktoriyel {
 public static int Faktoriyel(int n) {
	 if(n==0 || n==1)
	 return 1;
	 else {
		 return n*Faktoriyel(n-1);
	 }
 }
	public static void main(String[] args) {
		int sayi=5;
		int sonuc=Faktoriyel(sayi);
		System.out.println(sayi+" nýn faktöriyeli "+sonuc+" dur.");


	}

}
