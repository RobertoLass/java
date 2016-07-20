package teamstuff;

public class Arena {
	
	private String arenaName;
	private int visitorCapacity;
	private int parkingSpacesCapacity;
	private String owner;
	
	public Arena(String arenaName, int visitorCapacity,
			int parkingSpacesCapacity, String owner) {
		this.arenaName = arenaName;
		this.visitorCapacity = visitorCapacity;
		this.parkingSpacesCapacity = parkingSpacesCapacity;
		this.owner = owner;
	}
	public String getArenaName() {
		return arenaName;
	}
	public void setArenaName(String arenaName) {
		this.arenaName = arenaName;
	}
	public int getVisitorCapacity() {
		return visitorCapacity;
	}
	public void setVisitorCapacity(int visitorCapacity) {
		this.visitorCapacity = visitorCapacity;
	}
	public int getParkingSpacesCapacity() {
		return parkingSpacesCapacity;
	}
	public void setParkingSpacesCapacity(int parkingSpacesCapacity) {
		this.parkingSpacesCapacity = parkingSpacesCapacity;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	// fanShop, imbiss
	
	

}
