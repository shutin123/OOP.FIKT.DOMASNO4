package zadaca3;

public class Proizvod {
	private String ime;
	private String proizvoditel;
	private int cena;
	private double tezhina;
	
	public Proizvod () {
		this.ime = "Cokolino mleko";
		this.proizvoditel = "Vitaminka";
		this.cena = 45;
		this.tezhina = 60;
	}
	
	public String getIme () {
		return this.ime;
	}
	public String getProizvoditel () {
		return this.proizvoditel;
	}
	public int getCena () {
		return this.cena;
	}
	public double getTezhina () {
		return this.tezhina;
	}

}
