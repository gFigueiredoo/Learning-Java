import java.util.Random;

/**
 * @ALGORITMOS E PROGRAMAÇÃO: FUNDAMENTOS - Tarefa - Desafio do Módulo 3
 * @author Gabriel Figueiredo
 * @Tamagotchi - 04/06/2022
 */
public class Main
{   
    public static void Main(String[] args)
    {
        while(true)
        {
            Teclado teclado = new Teclado();
            
            //Opcoes do usuario
            int option = 0;
            
            //Loops
            boolean loop = true;
            boolean loopInOption = false;
            boolean loopoptionComFome = false;
        
            //Parâmetros de criação do Tamagotchi
            int initialAge = 1;
            int initialAwake = 0;
            float initialWeight = 1;
            
            System.out.println("Escolha um nome para o seu Tamagotchi: ");
            String name = teclado.leString();
            
            //Criando o Tamagotchi.
            Tamagotchi tamagotchi = new Tamagotchi(name, initialAge, initialWeight, initialAwake);
            
            do
            {
                System.out.println(tamagotchi.toString());
                
                Random aleatorio = new Random();
                int action = aleatorio.nextInt(3) + 1;
                            
                if (loopoptionComFome)
                {
                    action = 2;
                }
                
                switch(action)
                {
                    //AÇÃO: Sentir sono.
                    case 1:
                        System.out.println("\nO " + tamagotchi.GetName() + " está com sono, escolha uma das opções:\n");
                        System.out.println("1. Dormir");
                        System.out.println("2. Permanecer acordado");
                        
                        do 
                        {   
                            loopInOption = false;
                            option = teclado.leInt();
                            int awakeDays = tamagotchi.GetAwakeDays();
                            
                            if (option == 1 || awakeDays > 5)
                            {
                                if (awakeDays > 5)
                                {
                                    System.out.println("\nO " + tamagotchi.GetName() + " esta 6 dias acordado, entao deve dormir!");
                                }
                                
                                tamagotchi.Sleeping();
                            } 
                            else if (option == 2)
                            {
                                tamagotchi.IncrementAwakeDays();
                                System.out.println("\nContinuarei acordado...");
                            }
                            else 
                            {
                                System.out.println("\nOpção inválida, tente novamente...");
                                loopInOption = true;
                            }
                        } while (loopInOption);
                        
                    break;
    
                    //AÇÃO: Sentir fome.
                    case 2:
                        System.out.println("\nO " + tamagotchi.GetName() + " está com fome, escolha uma das opções:\n");
                        System.out.println("1. Comer muito");
                        System.out.println("2. Comer pouco");
                        System.out.println("3. Nao comer");
                        
                        do
                        {
                            loopInOption = false;
                            option = teclado.leInt();
                            
                            if (option == 1) 
                            {
                                tamagotchi.IncrementWeight(5);
                                tamagotchi.Sleeping(); 
                            }
                            else if (option == 2) 
                            {
                                tamagotchi.IncrementWeight(1);
                            }
                            else if (option == 3) 
                            {
                                tamagotchi.IncrementWeight(-2);
                            }
                            else 
                            {
                                System.out.println("\nOpção inválida, tente novamente...");
                                loopInOption = true;
                            }
                        } while (loopInOption);
                        
                        loopoptionComFome = false;
                        
                    break;
                    
                    //AÇÃO: Entediado.
                    case 3:
                        System.out.println("\nO " + tamagotchi.GetName() + " está entediado, escolha uma das opções:\n");
                        System.out.println("1. Correr 10 minutos");
                        System.out.println("2. Caminhar 10 minutos ");
                        
                        do
                        {
                            loopInOption = false;
                            option = teclado.leInt();
                            
                            if(option == 1)
                            {
                                //Emagrecendo
                                tamagotchi.IncrementWeight(-4);
                                
                                //Comendo muito e engordando...
                                tamagotchi.IncrementWeight(5);
                                
                                //Dormindo...
                                tamagotchi.Sleeping();
                                
                            }
                            else if(option == 2)
                            {
                                tamagotchi.IncrementWeight(-1);
                                loopoptionComFome = true;
                            }
                            else
                            {
                                System.out.println("\nOpção inválida, tente novamente...");
                                loopInOption = true;                            
                            }
                        }while(loopInOption);
                    break;
                }            
            }while (tamagotchi.tamagotchiVivo);
            
            System.out.println("\nSeu tamagotchi morreu, deseja continuar? S ou N");
            char stop = teclado.leChar();
            
            if (stop == 'S') 
            {
                System.out.println("\nCriando outro Tamagotchi...");    
            }
            else if (stop == 'N')
            {
                System.out.println("\nEncerrando o programa...");
                System.exit(0);
            }
            else
            {
                System.out.println("\nOpção inválida, Encerrando o programa...");
                System.exit(0);
            }
        }
    }
}
