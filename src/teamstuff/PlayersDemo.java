package teamstuff;

public class PlayersDemo {

	public static void main(String[] args) {
		
		Players tom0 = new Players(null, "horst", 25, false, "Türkei", "Male");
				
		System.out.println(tom0);
		System.out.println(Players.getPlayersPerTeam());

	}

}
