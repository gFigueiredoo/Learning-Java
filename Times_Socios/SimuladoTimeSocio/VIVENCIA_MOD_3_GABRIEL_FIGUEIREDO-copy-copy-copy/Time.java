/**
 * @author Gabriel Figueiredo
 * @version dos guri - 11/06/2022
 */
public class Time
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nomeTime;
    private Socio[] sociosTime;
    
    /**
     * Construtor para objetos da classe Time
     */
    public Time(String nomeTime, int qntMaximaSocios)
    {
        // inicializa variáveis de instância
        this.nomeTime = nomeTime;
        this.sociosTime = new Socio[qntMaximaSocios];
    }

    public String getNomeTime()
    {
        return this.nomeTime;    
    }
    
    public void setNomeTime(String nome)
    {
        this.nomeTime = nomeTime;
    }
    
    public Socio[] getSocios()
    {
        return this.sociosTime;    
    }
    
    public void setSocios(Socio[] socios)
    {
        this.sociosTime = socios;
    }
    
    public String toString()
    {
         return "\nTime: " + this.nomeTime + " \nQuantidade máxima de socios " + this.sociosTime;   
    }
    
    public boolean insereSocio(Socio socio){
        
        for (int i = 0; i < this.sociosTime.length; i++){
            if(this.sociosTime[i] == null){
                this.sociosTime[i] = socio;
                return true;
            }
        }
        
        return false;
    }
    
    public String socioMaisVelho(){
        
        String socioMaisVelho = sociosTime[0].GetNomeSocio();
        
        for (int i = 1; i < sociosTime.length; i++){  
            if(sociosTime[i-1].GetIdadeSocio() > sociosTime[i].GetIdadeSocio()){
                socioMaisVelho = this.sociosTime[i-1].GetNomeSocio();
            }
        }
        
        return socioMaisVelho;
    }
    
    public void imprimeSocios(){
        for (int i = 0; i < sociosTime.length; i++){
            if (sociosTime[i] != null)
               // System.out.println("\n\nSocio " + i + ":" + sociosTime[i].GetNomeSocio() + "Idade: " + sociosTime[i].GetIdadeSocio());
                System.out.println("\n" + sociosTime[i].toString());
        }

    }
}
