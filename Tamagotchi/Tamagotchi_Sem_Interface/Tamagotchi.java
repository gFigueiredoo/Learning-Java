/**
 * @ALGORITMOS E PROGRAMAÇÃO: FUNDAMENTOS - Tarefa - Desafio do Módulo 3
 * @author Gabriel Figueiredo
 * @Tamagotchi - 04/06/2022
 */

//Classe do Tamagotchi.
//Funções, métodos e manipulações do Tamagotchi.
public class Tamagotchi
{
    public boolean tamagotchiVivo = true;
    private String name;
    private int age;
    private float weight;
    private int awakeDays;
    
    //Construtor do Tamagotchi.
    //param name: Nome do Tamagotchi.
    //param age: Idade do Tamagotchi.
    //param weight: Idade do tamagotchi.
    public Tamagotchi (String name, int age, float weight, int awakeDays)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.awakeDays = awakeDays;
    }
    
    //Obter o nome do Tamagotchi.
    public String GetName()
    {
        return this.name;
    }
    
    //Obter a idade do Tamagotchi.
    public int GetAge()
    {
        return this.age;
    }
    
    //Atualizar a idade do Tamagotchi.
    //param age: Idade a ser atualizada.
    public void SetAge(int age)
    {
        this.age = age;
        
        if (this.age > 14)
        {
            System.out.println("\n" + this.GetName() + " está com 15 dias e chegou ao fim de sua vida...");
            this.tamagotchiVivo = false;
        }
    }

    //Obter o peso do Tamagotchi (kg).
    public float GetWeight()
    {
        return this.weight;    
    }
    
    //Atualizar o peso do Tamagotchi.
    //param weight: Peso a ser atualizado (kg).
    public void SetWeight(float weight)
    {
        this.weight = weight;
    }    

    //Increment o peso do Tamagotchi.
    //param weight: Peso a ser atualizado (kg).
    public void IncrementWeight(float weight)
    {
        this.weight += weight;
        
        String mensagem = weight > 0 ? "\nComendo..." : "\nEmagrecendo...";
        System.out.println(mensagem);
        
        if (this.weight > 20)
        {
            System.out.println("Ultrapassei os 20kg, vou explodir!!!!!");
            System.out.println("BUUUUUUUUUUUUUUUUUUUUUUUUUUUUUMMMMM!!!!!!!!!!!!!");
            this.tamagotchiVivo = false;
        }
        else if (this.weight < 1)
        {
            System.out.println("Estou desnutrido... Morrendo...");
            this.tamagotchiVivo = false;
        }
    }    
    
    //Obter os dias acordados do Tamagotchi.
    public int GetAwakeDays()
    {
        return this.awakeDays;    
    }
    
    //Incrementa os dias acordados.
    public void IncrementAwakeDays()
    {
        this.awakeDays += 1;
    }
    
     //Zera os dias acordados.
    public void SetAwakeDays()
    {
        this.awakeDays = 0;
    }
    
    //Tamagotchi esta dormindo.
    public void Sleeping()
    {
        this.SetAwakeDays();
        this.SetAge(this.age + 1);
        System.out.println("\n" + this.name + " está dormindo...");  
    }
    
    //Mostrar na tela todas informações do Tamagotchi.
    public String toString()
    {
        return "\nNome: " + this.name + "\nIdade: " + this.age + "\nPeso: " + this.weight + "kg" + "\nDias acordado: " + this.awakeDays;
    }
    
    
}
