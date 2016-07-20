package teamstuff;

/**
 * 
 * @author Roberto Lass
 * 
 *
 */
public class Players {
	
	
	private Adresse adress;
	private String name;
	private int age;
	private boolean teamLeader;	
	private String nationality;
	private String gender;
	
	/**
	 * Konstruktor zum Generierung eines Spielers
	 * */
	public Players(Adresse adress, String name, int age, boolean teamLeader,
			String nationality, String gender) {
		this.adress = adress;
		this.name = name;
		this.age = age;
		this.teamLeader = teamLeader;
		this.nationality = nationality;
		this.gender = gender;
	}
	public Adresse getAdress() {
		return adress;
	}
	public void setAdress(Adresse adress) {
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isTeamLeader() {
		return teamLeader;
	}
	public void setTeamLeader(boolean teamLeader) {
		this.teamLeader = teamLeader;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "Players [adress=" + adress + ", name=" + name + ", age=" + age
				+ ", teamLeader=" + teamLeader + ", nationality=" + nationality
				+ ", gender=" + gender + "]";
	}
	
	// GamePositions Enum
	// GameStats extra Klasse? 
	

}
