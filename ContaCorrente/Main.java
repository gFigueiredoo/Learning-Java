/**
 * @author Gabriel Figueiredo
 * @version dos guri - 28/05/2022
 */
public class Main
{
    public static void menu()
    {   
        System.out.println("\t\nMenu");
        System.out.println("1. Efetuar um saque");
        System.out.println("2. Efetuar um depósito");
        System.out.println("3. Imprimir informações da conta");
        System.out.println("4. Sair do menu");   
    }
    
    public static void Main(String[] args)
    {
        int opcao;
        Teclado teclado = new Teclado();
        
        System.out.println("Digite o número da conta: ");
        int numeroConta = teclado.leInt();
        System.out.println("Digite o saldo da conta: ");
        double saldoConta = teclado.leDouble();
        
        ContaCorrente conta = new ContaCorrente(numeroConta, saldoConta);
        
        do{
            menu();    
            opcao = teclado.leInt();
            
            switch(opcao){
                
            case 1:
                System.out.println("\nValor de saque: ");
                int valorSaque = teclado.leInt();
                
                conta.efetuaSaque(valorSaque);
                
                System.out.println("\nSeu saldo atual na conta é: " + conta.getSaldoConta());
                break;
                
            case 2:
                System.out.println("\nValor de depósito: ");
                int valorDeposito = teclado.leInt();
                
                conta.efetuaDeposito(valorDeposito);
                
                System.out.println("\nSeu saldo atual na conta é: " + conta.getSaldoConta());
                break;
                
            case 3:
                System.out.println(conta.toString());
                break;
                
            case 4:
                System.out.println("\nSaindo do menu...");
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 4);
        
        System.out.println("\n\nPorfavor, crie 3 imóveis.");
        
        for (int i = 0; i < 3; i++)
        {
            System.out.println("\n\nImovel " + i+1 +":");
            
            System.out.println("\n\nEndereço: ");
            String endereco = teclado.leString();
            
            System.out.println("\n\nValor de venda: ");
            double valorVenda = teclado.leInt();
            
            System.out.println("\n\nValor de alugel: ");
            double valorAlugel = teclado.leInt();
            
            System.out.println("\nImóvel novo? S ou N\n");
            char imovelNovo = teclado.leChar();
            char upperImovel = Character.toUpperCase(imovelNovo);   
            boolean isNovo = upperImovel == 'S' ? true : false;
            
            if (valorVenda <= 0 || valorAlugel <= 0)
            {
                System.out.println("\nERRO!!!!! O valor de alugel ou de venda é menor ou igual a zero.\n");
                System.out.println("Encerrando o programa...");
                System.exit(0);                
            }
            
            Imovel imovel = new Imovel(endereco, valorVenda, valorAlugel, isNovo);
            
            System.out.println("\n\n*********Informações do imóvel*********\n\n" + i+1);
            double imposto = imovel.calculaImposto(valorVenda, isNovo);
            
            System.out.println(imovel.toString());
            System.out.println("\nO imposto do imóvel é: " + imposto);
            
        }
    }
}
