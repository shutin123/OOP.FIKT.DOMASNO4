package zadaca2;

public class Restoran {
	private String ime;
	private String lokacija;
	private String telefon;
	private int brNaSedista;
	
	public Restoran () {
		
	}
	
	
	public void setIme (String ime) {
		this.ime = ime;
	}
	public void setLokacija (String lokacija) {
		this.lokacija = lokacija;
	}
	public void setTelefon (String telefon) {
		this.telefon = telefon;
	}
	public void setBrNaSedista (int brNaSedista) {
		this.brNaSedista = brNaSedista;
	}
	
	public String getIme () {
		return this.ime;
	}
	public String getLokacija () {
		return this.lokacija;
	}
	public String getTelefon () {
		return this.telefon;
	}
	public int getBrNaSedista () {
		return this.brNaSedista;
	}

}
