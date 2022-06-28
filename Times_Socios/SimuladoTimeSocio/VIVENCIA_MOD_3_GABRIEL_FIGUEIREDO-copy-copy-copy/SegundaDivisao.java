/**
 * @author Gabriel Figueiredo
 * @version dos guri - 11/06/2022
 */
public class SegundaDivisao extends Time
{
    private int anosRebaixado;
    
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public SegundaDivisao(String nomeTime, int qntMaximaSocios, int anosRebaixado) {
	super(nomeTime, qntMaximaSocios);
	this.anosRebaixado = anosRebaixado;
    }
    
    public String toString()
    {
         return "\nTime: " + getNomeTime() + " \nQuantidade máxima de socios " + getSocios() + "\nAnosRebaxados: " + this.anosRebaixado;   
    }
}
