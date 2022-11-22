package zadaca4;

public class Avtomobil {
	private String marka;
	private String model;
	private String boja;
	private int pominatiKm;
	
	public Avtomobil (String marka, String model, String boja, int pominatiKm) {
		this.marka = marka;
		this.model = model;
		this.boja = boja;;
		this.pominatiKm = pominatiKm;
	}
	
	public void mnozenjeKm (int pomnoziKm) {
		this.pominatiKm = pominatiKm * pomnoziKm;
	}
	
	public String getMarka () {
		return this.marka;
	}
	public String getModel () {
		return this.model;
	}
	public String getBoja () {
		return this.boja;
	}
	public int getPominatiKm () {
		return this.pominatiKm;
	}
}
