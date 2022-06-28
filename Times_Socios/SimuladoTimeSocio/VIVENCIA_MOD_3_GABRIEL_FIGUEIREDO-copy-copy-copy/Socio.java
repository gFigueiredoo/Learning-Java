/**
 * @author Gabriel Figueiredo
 * @version dos guri - 11/06/2022
 */
public class Socio
{
    private String nome;
    private int idade;
    
    public Socio (String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String GetNomeSocio()
    {
        return this.nome;    
    }
    
    public void SetNomeSocio(String nome)
    {
        this.nome = nome;
    }
    
    public int GetIdadeSocio()
    {
        return this.idade;    
    }
    
    public void SetIdadeSocio(int idade)
    {
        this.idade = idade;
    }
    
    public String toString()
    {
         return "\nNome: " + this.nome + " \nIdade " + this.idade;   
    }
}
