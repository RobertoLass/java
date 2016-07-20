package teamstuff;

public class Team {
	
	private String teamName;
	private Adresse adresse;
	private Players players;
	private Games gamePlan;
	private Arena spielStaette;
	
	public Team(String teamName, Adresse adresse, Players players,
			Games gamePlan, Arena spielStaette) {
		this.teamName = teamName;
		this.adresse = adresse;
		this.players = players;
		this.gamePlan = gamePlan;
		this.spielStaette = spielStaette;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Players getPlayers() {
		return players;
	}

	public void setPlayers(Players players) {
		this.players = players;
	}

	public Games getGamePlan() {
		return gamePlan;
	}

	public void setGamePlan(Games gamePlan) {
		this.gamePlan = gamePlan;
	}

	public Arena getSpielStaette() {
		return spielStaette;
	}

	public void setSpielStaette(Arena spielStaette) {
		this.spielStaette = spielStaette;
	}
	
	
	
	
	

}
