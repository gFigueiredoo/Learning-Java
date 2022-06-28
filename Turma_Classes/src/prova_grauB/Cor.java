package prova_grauB;

public class Cor {

	private int R;
	private int G;
	private int B;
	
	public Cor(int R, int G, int B) {
		this.R = R;
		this.G = G;
		this.B = B;
	}
	
	public int getR() {
		return R;
	}

	public void setR(int r) {
		R = r;
	}

	public int getG() {
		return G;
	}

	public void setG(int g) {
		G = g;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}
	
	public String toString() {
		return "R: " + this.R + " G: " + this.G + " B: " + this.B; 
	}
}
