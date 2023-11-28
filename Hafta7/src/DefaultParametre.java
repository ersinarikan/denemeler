
public class DefaultParametre {
	
	public static void main(String[] args) {
		selam("");
		selam("Ali");

	}

	private static void selam(String isim) {
		if(isim==null || isim.isEmpty()) {
			isim="Boþ";
		}
		System.out.println("MErhaba "+isim);
		
	}

}
