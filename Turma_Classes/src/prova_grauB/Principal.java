package prova_grauB;

public class Principal {

	public static void main(String[] args) {
		String nomeSala = Teclado.leString("Digite o nome da sala: ");

		Sala sala = new Sala(nomeSala, (int) (Math.random() * 20 + 1));
		System.out.println(sala.toString());

		for (int i = 0; i < 20; i++) {
			
			Aluno aluno = new Aluno("Aluno " + i, (int) (Math.random() * 70 + 18));
			
			// Se não for igual a 1, será igual a 2.
			boolean tipoCadeiraMesa = (int) (Math.random() * 2 + 1) == 1;
			String tipoCadeira = tipoCadeiraMesa ? "mesa" : "rodinha";
			
			sala.entraAluno(aluno, tipoCadeira);
		}

		Cadeira[] cadeiras = sala.getCadeiras();

		System.out.println("\n\n###Informações das cadeiras ###\n");
		for (int i = 0; i < cadeiras.length; i++) {
			System.out.println("\n# Cadeira " + i + " #");
			if (cadeiras[i] instanceof CadeiraComMesa) {
				int areaMesaCadeira = ((CadeiraComMesa) cadeiras[i]).calculaArea();
				System.out.println("A area da mesa é: " + areaMesaCadeira);
			} else {
				System.out.println(((CadeiraComRodinhas) cadeiras[i]).toString());
			}
		}

	}

}
