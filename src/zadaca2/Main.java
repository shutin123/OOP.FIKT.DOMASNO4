package zadaca2;

public class Main {

	public static void main(String[] args) {
		Restoran obj1 = new Restoran ();

		obj1.setIme("THE CLUB");
		obj1.setLokacija("ul.Bidi viden bb");
		obj1.setTelefon("07550000");
		obj1.setBrNaSedista(200);
		
		System.out.println(obj1.getIme());
		System.out.println(obj1.getLokacija());
		System.out.println(obj1.getTelefon());
		System.out.println(obj1.getBrNaSedista());

	}

}
