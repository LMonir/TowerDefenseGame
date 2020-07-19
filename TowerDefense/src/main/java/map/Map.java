package map;

public class Map {
	private Tile[][] karte;
	private Path weg;
	
	
	private Map(int breite, int hoehe) {
		karte = new Tile[breite][hoehe];
		weg = Path.generateRandomPath();
	}
	
	private Map(int breite, int hoehe, Path weg) {
		karte = new Tile[breite][hoehe];
		this.setWeg(weg);
	}

	public Path getWeg() {
		return weg;
	}

	public void setWeg(Path weg) {
		this.weg = weg;
	}
}
