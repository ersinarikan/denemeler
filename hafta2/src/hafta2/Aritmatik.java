package hafta2;

public class Aritmatik {

	public static void main(String[] args) {
		int a = 5;
		a = a + 3;
		System.out.println(a);
		a += 2;
		System.out.println(a);
		a++; // a nýn deðeri 1 artar
		System.out.println(a);
		a = a - 3;
		System.out.println("a - 3 "+a);
		a -= 3;
		System.out.println("a - 3 "+a);
		a--; //a nýn deðeri 1 azalýr
		System.out.println("a-- "+a); 
		a=15;
		a=a*2; //a*=2;
		System.out.println("a*2: "+a);
		a=a/3; //a/=3;
		System.out.println("a/3 : "+a);
		a=a%3; //a%=3;
		System.out.println("a%3 : "+a);
	}

}
