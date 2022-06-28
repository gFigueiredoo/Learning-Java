/**
 * @author Gabriel Figueiredo
 * @version dos guri - 11/06/2022
 */
public class PrimeiraDivisao extends Time
{
    private int posicaoRankingNacional;
    
    public PrimeiraDivisao(String nomeTime, int qntMaximaSocios, int posicaoRankingNacional) {
	super(nomeTime, qntMaximaSocios);
	this.posicaoRankingNacional = posicaoRankingNacional;
    }
    
    public int getRanking()
    {
        return this.posicaoRankingNacional;    
    }
    
    public void setRanking(int posicaoRankingNacional)
    {
        this.posicaoRankingNacional = posicaoRankingNacional;
    }
    
    public String toString()
    {
         return "\nTime: " + getNomeTime() + " \nQuantidade máxima de socios " + getSocios() + "\n Posição no Ranking: " + posicaoRankingNacional;   
    }
}
