package prova_grauB;

public class CadeiraComMesa extends Cadeira{
	
	private int largura;
	private int profundidade;
	
	public CadeiraComMesa(int largura, int profundidade) {
		this.largura = largura;
		this.profundidade = profundidade;
	}
	
	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
	
	public int calculaArea() {
		return this.profundidade * this.largura;
	}

	public String toString() {
		return "Cadeira com mesa - " + " Profundidade: " + this.profundidade + " | Largura: " + this.largura + "\n";
	}
}
