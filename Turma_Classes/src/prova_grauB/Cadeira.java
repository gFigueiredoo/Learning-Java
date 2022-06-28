package prova_grauB;

public class Cadeira{

	private Aluno aluno;
	private Cor cor; 
	
	public Cadeira(Cor cor) {
		this.cor = cor;
		this.aluno = null;
	}
	
	public Cadeira() {
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public String toString() {
		return "Aluno: " + aluno.getNome() + "\nRGB: " + this.cor.getR() + ", " + this.cor.getG() + ", " + this.cor.getB();
	}

}
