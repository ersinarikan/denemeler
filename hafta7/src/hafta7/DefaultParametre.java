package hafta7;
public class DefaultParametre {
	
	public static void main(String[] args) {
		selam("");
		selam("Ali");

	}

	private static void selam(String isim) {
		if(isim==null || isim.isEmpty()) {
			isim="Bo�";
		}
		System.out.println("MErhaba "+isim);
		
	}

}
