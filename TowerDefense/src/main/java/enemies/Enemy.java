package enemies;

import java.awt.Color;

public class Enemy {
	private int geschwindigkeit;
	
	private int leben;
	
	private Color farbe;
	
	public Enemy(int geschwindigkeit, int leben, Color farbe) {
		this.setGeschwindigkeit(geschwindigkeit);
		this.setLeben(leben);
		this.setFarbe(farbe);
	}

	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(int geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}

	public int getLeben() {
		return leben;
	}

	public void setLeben(int leben) {
		this.leben = leben;
	}

	public Color getFarbe() {
		return farbe;
	}

	public void setFarbe(Color farbe) {
		this.farbe = farbe;
	}
	
}
