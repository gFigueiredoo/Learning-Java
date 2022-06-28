package prova_grauB;

public class Sala {

	private String nome;
	private Cadeira[] cadeiras;

	private static final int CADEIRA_COM_MESA = 1;
	private static final int CADEIRA_COM_RODINHA = 2;

	public Sala(String nome, int quantCadeiras) {
		this.nome = nome;
		this.cadeiras = new Cadeira[quantCadeiras];

		for (int i = 0; i < quantCadeiras; i++) {
			int tipoCadeira = (int) (Math.random() * 2) + 1;

			Cor cor = new Cor((int)(Math.random() * 255), 
							  (int)(Math.random() * 255),
							  (int)(Math.random() * 255));

			if (tipoCadeira == CADEIRA_COM_MESA) {
				this.cadeiras[i] = new CadeiraComMesa((int) (Math.random() * 10), (int) (Math.random() * 10));
				
			} else if (tipoCadeira == CADEIRA_COM_RODINHA) {			
				Data lastManutencao = new Data((int) (Math.random() * 30), 
											   (int) (Math.random() * 12),
											   (int) (Math.random() * (2022 - 1950) + 1950));

				this.cadeiras[i] = new CadeiraComRodinhas(lastManutencao);
			}
		}
		System.out.println("\nSala criada com " + quantCadeiras + " cadeiras!\n");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cadeira[] getCadeiras() {
		return cadeiras;
	}

	public void setCadeiras(Cadeira[] cadeiras) {
		this.cadeiras = cadeiras;
	}

	public String toString() {
		String retorno = "Nome da sala: " + this.nome + " \n\n### Cadeiras: ###\n\n";

		for (int i = 0; i < cadeiras.length; i++) {
			retorno += cadeiras[i].toString();
		}

		return retorno;

	}

	public int cadeirasComMesaDisponiveis() {
		int quantCadeirasDisp = 0;

		for (int i = 0; i < cadeiras.length; i++) {
			if (cadeiras[i] instanceof CadeiraComMesa && cadeiras[i].getAluno() == null) {
				quantCadeirasDisp++;
			}
		}
		return quantCadeirasDisp;
	}

	public int cadeirasComRodinhasDisponiveis() {
		int quantCadeirasDisp = 0;

		for (int i = 0; i < cadeiras.length; i++) {
			if (cadeiras[i] instanceof CadeiraComRodinhas && cadeiras[i].getAluno() == null) {
				quantCadeirasDisp++;
			}
		}
		return quantCadeirasDisp;
		
	}

	public String entraAluno(Aluno aluno, String tipoCadeira) {

		boolean cadeirasComMesaDisp = cadeirasComMesaDisponiveis() > 0;
		boolean cadeirasComRodinhasDisp = cadeirasComRodinhasDisponiveis() > 0;

		String mensagemCadeiraDesejada = "Ocupou a cadeira desejada";
		String mensagemCadeiraNaoDesejada = "ocupou outro tipo de cadeira";
		
		if (cadeirasComMesaDisp || cadeirasComRodinhasDisp) {
			
			if (tipoCadeira.equals("mesa")) {
				if (cadeirasComMesaDisp) {

					for (int i = 0; i < cadeiras.length; i++) {
						if (cadeiras[i] instanceof CadeiraComMesa && cadeiras[i].getAluno() == null) {
							cadeiras[i].setAluno(aluno);
							System.out.println("\n" + aluno.getNome() + " entrou na sala!\n");
							return mensagemCadeiraDesejada;
						}
					}
				} else {
					for (int i = 0; i < cadeiras.length; i++) {
						if (cadeiras[i] instanceof CadeiraComRodinhas && cadeiras[i].getAluno() == null) {
							cadeiras[i].setAluno(aluno);
							System.out.println("\n" + aluno.getNome() + " entrou na sala!\n");
							return mensagemCadeiraNaoDesejada;
						}
					}
				}
			} else if (tipoCadeira.equals("rodinha")) {
				if (cadeirasComRodinhasDisp) {

					for (int i = 0; i < cadeiras.length; i++) {
						if (cadeiras[i] instanceof CadeiraComRodinhas && cadeiras[i].getAluno() == null) {
							cadeiras[i].setAluno(aluno);
							System.out.println("\n" + aluno.getNome() + " entrou na sala!\n");
							return mensagemCadeiraDesejada;
						}
					}
				} else {
					for (int i = 0; i < cadeiras.length; i++) {
						if (cadeiras[i] instanceof CadeiraComMesa && cadeiras[i].getAluno() == null) {
							cadeiras[i].setAluno(aluno);
							System.out.println("\n" + aluno.getNome() + " entrou na sala!\n");
							return mensagemCadeiraNaoDesejada;
						}
					}
				}
			}
		}

		return "O aluno " + aluno.getNome() + "Não ocupou cadeira alguma";
	}
}
