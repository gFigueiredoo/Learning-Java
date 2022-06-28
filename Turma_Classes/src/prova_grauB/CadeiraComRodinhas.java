package prova_grauB;

public class CadeiraComRodinhas extends Cadeira{

	private Data lastManutencao;
	
	public CadeiraComRodinhas(Data lastManutencao) {
		this.lastManutencao = lastManutencao;
	}
	
	public Data getLastManutencao() {
		return lastManutencao;
	}

	public void setLastManutencao(Data lastManutencao) {
		this.lastManutencao = lastManutencao;
	}

	public String toString() {
		return "Ultima manutenção: " + lastManutencao.toString() + "\n";
	}
}
