/**
 * @author Gabriel Figueiredo
 * @version dos guri - 28/05/2022
 */
public class Imovel
{
    private String endereco;
    private double valorVenda;
    private double valorAlugel;
    private boolean isNovo;
    
    public Imovel (String endereco, double valorVenda, double valorAlugel, boolean isNovo)
    {
        this.endereco = endereco;
        this.valorVenda = valorVenda;
        this.valorAlugel = valorAlugel;
        this.isNovo = isNovo;
    }
    
    public String getEndereco()
    {
        return this.endereco;    
    }
    
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
    
    public double getValorVenda()
    {
        return this.valorVenda;    
    }
    
    public void setValorVenda(double valorVenda)
    {
        this.valorVenda = valorVenda;
    }

    public double getValorAlugel()
    {
        return this.valorAlugel;    
    }
    
    public void setValorAlugel(double valorAlugel)
    {
        this.valorAlugel = valorAlugel;
    }    

    public boolean getIsNovo()
    {
        return this.isNovo;    
    }
    
    public void setIsNovo(boolean isNovo)
    {
        isNovo = !isNovo;
    }    
    
    public String toString()
    {
        String mensagemNovo = isNovo ? "Sim" : "Não";
        return "\nEndereco: " + this.endereco + "\nValor da venda: " + this.valorVenda + "\nValor do alugel " + this.valorAlugel + "\nImovel novo: " + mensagemNovo;
    }
    
    public double calculaImposto(double valorVenda, boolean isNovo)
    {
        return isNovo 
                ? valorVenda  * 0.15 
                : valorAlugel  * 0.1;  
    }
}
