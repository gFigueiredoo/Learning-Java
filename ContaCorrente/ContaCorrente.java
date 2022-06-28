/**
 * @author Gabriel Figueiredo
 * @version dos guri - 28/05/2022
 */
public class ContaCorrente
{
    private int numeroConta;
    private double saldoConta;
    
    public ContaCorrente (int numeroConta, double saldoConta)
    {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }
    
    public int getNumeroConta()
    {
        return numeroConta;    
    }
    
    public void setNumeroConta(int numeroConta)
    {
        this.numeroConta = numeroConta;
    }
    
    public double getSaldoConta()
    {
        return saldoConta;    
    }
    
    public void setSaldoConta(double saldoConta)
    {
        this.saldoConta = saldoConta;
    }
    
    public String toString()
    {
         return "Número da conta corrente é " + this.numeroConta + " e o seu saldo é " + this.saldoConta;   
    }
    
    public void efetuaDeposito(double valorDepositado)
    {
        if (valorDepositado > 0)
        {
            this.saldoConta += valorDepositado;
            return;
        }
        
        System.out.println("Erro. O valor depositado não pode ser negativo.");    

    }
    
    public void efetuaSaque(double valorSacado)
    {
        if (valorSacado > 0 && this.saldoConta > valorSacado)
        {
            this.saldoConta -= valorSacado;
            return;
        }
        
        String mensagem = valorSacado < 0 ? "Erro. O saque não pode ser negativo" : "Erro. Sem saldo suficiente";
        System.out.println(mensagem);    
    }
    
    
    
}
