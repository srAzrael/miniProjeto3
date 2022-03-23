import java.util.Scanner;

public class capitulo 
{
   String texto;
   String escolha1;
   String escolha2;
   Personagem personagem1;
   Personagem personagem2;
   int energiaPersonagem1;
   int energiaPersonagem2;
   int incrementoPersonagem1;
   int incrementoPersonagem2;
   Scanner scanner;

     //Construtor


      capitulo(String texto,
               String escolha1, 
               String escolha2, 
               Personagem personagem1, 
               Personagem personagem2,  
               int incrementoPersonagem1, 
               int incrementoPersonagem2,
               Scanner scanner)
      {
         this.texto = texto;
         this.escolha1 = escolha1;
         this.escolha2 = escolha2;
         this.personagem1 = personagem1;
         this.personagem2 = personagem2;
         this.incrementoPersonagem1 = incrementoPersonagem1;
         this.incrementoPersonagem2 = incrementoPersonagem2;
         this.scanner = scanner;
      }

      capitulo(String texto,
               Personagem personagem1, 
               Personagem personagem2,  
               int incrementoPersonagem1, 
               int incrementoPersonagem2)
      {
         this.texto = texto;
         this.personagem1 = personagem1;
         this.personagem2 = personagem2;
         this.incrementoPersonagem1 = incrementoPersonagem1;
         this.incrementoPersonagem2 = incrementoPersonagem2;
      }

      capitulo(
               String texto,
               String escolha1, 
               String escolha2)
      {
      this.texto = texto;
      this.escolha1 = escolha1;
      this.escolha2 = escolha2;
      }

      capitulo(String texto)
      {
         this.texto = texto;
      }

      void mostrar()
      {
         System.out.println(texto);
         personagem1.atualizarEnergia(incrementoPersonagem1);
         personagem2.atualizarEnergia(incrementoPersonagem2);
         System.out.println("-" + escolha1);
         System.out.println("-" + escolha2);
      }
      void mostrar2()
      {
         System.out.println(texto);
         personagem1.atualizarEnergia(incrementoPersonagem1);
         personagem2.atualizarEnergia(incrementoPersonagem2);
      }

      int escolher()
      {
         int resultado = 0;
      
         String escolha;

         boolean escolhaValida = false;

        //Analiza se a escolha do usuário é válida
         while(!escolhaValida)
         {
            escolha = scanner.nextLine();
            //Analisa a encolha do uduario se foi escolha 1 ou dois
            if(escolha.equals(escolha1))
            {
               escolhaValida = true;
               resultado = 1;
               personagem1.atualizarEnergia(+10);
            }
            else if(escolha.equals(escolha2))
            {
            escolhaValida = true;
            resultado = 2;
            personagem1.atualizarEnergia(-5);
            }
            else
            {
               escolhaValida = false;
               System.out.println("Escolha inválida! Tente novamente.");
            }
         }

         

      return resultado;
         
      }
}
