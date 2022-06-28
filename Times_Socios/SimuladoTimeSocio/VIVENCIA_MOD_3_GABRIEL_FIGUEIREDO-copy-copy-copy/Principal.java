/**
 * @author Gabriel Figueiredo
 * @version dos guri - 11/06/2022
 */
public class Principal
{ 
    public static void Main(String[] args)
    {
        Teclado teclado = new Teclado();
        
        int qntTime = 1;
        
        while (qntTime < 1 || qntTime > 50)
        {
            System.out.println("Digite a quantidade de time entre 1 e 50: ");
            qntTime = teclado.leInt();     
        }
        
        Time[] times = new Time[qntTime];
        int tipo = 0;
        int qntPrimeiraDivisao = 0;
        int qntSegundaDivisao = 0;

        for (int i = 0; i < qntTime; i++){
            
            //Tipo 1 = Primeira divisao.
            //Tipo 2 = Segunda divisao.
            tipo = 1 + (int) (Math.random() * 2);
            
            System.out.println("Digite nome do time: ");
            String nomeTime = teclado.leString();
            
            System.out.println("Digite a quantidade máxima de socios: ");
            int qntSocios = teclado.leInt();
                  
            if(tipo == 1){
                System.out.println("Digite a posição no ranking nacional do time: ");
                int ranking = teclado.leInt();  
            
                PrimeiraDivisao timePrimeira = new PrimeiraDivisao(nomeTime, qntSocios, ranking);
                times[i] = timePrimeira;
                qntPrimeiraDivisao += 1;
            }
            else if (tipo == 2){
                System.out.println("Digite quantos anos o time está rebaixado: ");
                int rebaixado = teclado.leInt();  
                
                SegundaDivisao timeSegunda = new SegundaDivisao(nomeTime, qntSocios, rebaixado);
                times[i] = timeSegunda;
                qntSegundaDivisao +=1;
            }
        }
        
        System.out.println("\nSão " + qntPrimeiraDivisao + " times de primeira divisão e " + qntSegundaDivisao + " times de segunda divisão!\n");
        
        for (int i = 0; i < times.length; i++){
            for (int j = 0; j <= 20; j++){
                //System.out.println("Digite o nome do socio: ");
                String nomeSocio = "Socio " + j + " - Time " + i;
                int idadeSocioSorteio = 1 + (int) (Math.random() * 80);             
                int idadeSocio = idadeSocioSorteio;       
                
                Socio socio = new Socio(nomeSocio, idadeSocio);
                
                if(times[i].insereSocio(socio)){
                    System.out.println("\nSocio inserido com sucesso!");
                }
                else{
                    System.out.println("\nSocio não inserido.");
                }
            }            
        }
        
        int rank = 0;
        
        for (int i = 0; i < times.length; i++){
            if (times[i] instanceof SegundaDivisao){
                SegundaDivisao segunda = ((SegundaDivisao)times[i]);
                System.out.println(segunda.toString());
            }
            else{
                PrimeiraDivisao primeira = ((PrimeiraDivisao)times[i]);
                System.out.println(primeira.toString());
                
                if (rank < primeira.getRanking()){
                    rank = primeira.getRanking();
                }
            }
            
            times[i].imprimeSocios();
            System.out.println(times[i].getNomeTime() + ": " + times[i].socioMaisVelho() + " é o sócio mais velho."); 
        }
        
        for (int i = 0; i < times.length; i++){
            if (times[i] instanceof PrimeiraDivisao){
                 PrimeiraDivisao primeiraDivisaoRanking = ((PrimeiraDivisao)times[i]);
                 
                 if (primeiraDivisaoRanking.getRanking() == rank){
                     primeiraDivisaoRanking.toString();
                 }
            }
        }
        
    }
}
