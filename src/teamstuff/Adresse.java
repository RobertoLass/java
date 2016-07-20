package teamstuff;

public class Adresse {
	
	private String ort;
	private String strasse;
	private String hausnummer;
	public Adresse(String ort, String strasse, String hausnummer) {
		this.ort = ort;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	
	public String toString() {
		return "Adresse [ort=" + ort + ", strasse=" + strasse + ", hausnummer="
				+ hausnummer + "]";
	}
	
	

}
