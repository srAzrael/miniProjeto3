import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);

        Personagem Xicrinha = new Personagem("Xicrinha");
        Personagem Girassol = new Personagem("Girassol");
        Personagem Palhação = new Personagem("Palhação");
        Personagem Sereia = new Personagem("Sereia");
        Personagem Diabo = new Personagem("Diabo");
        
        
        System.out.println("Xicrinha precisa derrotar 3 chefes para coletar energia o suficiente para derrotar o chefe final! Você terá a opção de fugir ou enfrentar os monstros, se derrotá-los, ganhará 10 pontos de energia, porém se fugir, perderá 2 pontos de energia.");
        
        capitulo c1 = new capitulo("Xicrinha está prestes a enfrentar um Girasol mutante que solta bombas!", "Enfrentar", "Fugir", Xicrinha, Girassol, 0, 0, scanner);
        
        //Enfrenta vai pro capitulo 1.1 e depois pro capitulo 2
        capitulo c11 = new capitulo("Você consegui derrotar o Girassol maluco! e recebeu 10 pontos de energia", Xicrinha, Girassol, 10, 0);
        
        capitulo c12 = new capitulo("Você fugiu, ao fazer isso você perdeu 5 pontos de energia!", Xicrinha, Girassol, 0, 0);
        


        capitulo c2 = new capitulo("Agora apareceu um palhaço gigante para derrotar você!","Enfrenta",  "Foge", Xicrinha, Palhação, 0, 0, scanner);

        capitulo c21 = new capitulo("Você conseguiu derrotar o Palhaço Gigante!", Xicrinha, Palhação, 0, 0);
                
        capitulo c22 = new capitulo("Você fugiu, ao fazer isso você perdeu 5 pontos de energia!", Xicrinha, Palhação, 0, 0);


        
        capitulo c3 = new capitulo("Do nada apareceu uma sereia com um canto horrivel e te agarra!\nFaça rápido sua escolha!!A sereia está tentando te afogar!", "Enfrenta", "Foge", Xicrinha, Sereia, 0, 0, scanner);
        
        capitulo c31 = new capitulo("Você conseguiu derrotar a Sereia macabra!", Xicrinha, Sereia, 0, 0);
        
        capitulo c32 = new capitulo("Você fugiu, ao fazer isso você perdeu 5 pontos de energia!", Xicrinha, Palhação, -5, 0);


        
        capitulo c4 = new capitulo("Chegou a hora de enfrentar o chefão final!! Ele não é ninguem menos que o Capeta! Toda a energia que você coletou dos monstros na verdade eram as almas deles que eles deviam para o Diabo.\n Agora ele quer recuperá-las!\n Ele trancou todas as saídas! Não há para onde fugir!\n Sair na tapa com o Diabo ou Usar o Poder das almas para tentar derrota-lo.","Sair na tapa","Usar energia", Xicrinha, Diabo, 0, 0,  scanner);
        
        capitulo c41 = new capitulo("É uma pena, você escolheu sair na tapa e não aguentou a surra... Você perdeu!!");
        
        capitulo c42 = new capitulo("É uma pena, você não coletou energia o suficiente... Você perdeu!!");
        
        capitulo c43 = new capitulo("Parabéns, seu golpe foi forte o bastante para derrotar o Diabo! Você venceu!!");


        int escolha = 0;

        c1.mostrar();
        escolha = c1.escolher();

        if (escolha == 1)//c1 
        {
            c11.mostrar2();
            c2.mostrar();
            c2.escolher();

            if(escolha == 1)
            {
                c21.mostrar2();
                c3.mostrar();
                c3.escolher();

                if(escolha == 1)
                {
                    c31.mostrar2();
                    c4.mostrar();
                    c4.escolher();

                    if (escolha == 1) 
                    {
                        c41.mostrar2();
                    } 

                    else if(escolha == 2)
                    {
                        c42.mostrar2();
                        c43.mostrar2();
                    }
                }

            else if(escolha == 2)
            {
                c32.mostrar2();
                c4.mostrar();
                c4.escolher();    

                if (escolha == 1) 
                {
                    c41.mostrar2();
                } 
                else if(escolha == 2)
                {
                    c42.mostrar2();
                    c43.mostrar2();
                }
            }
            }

        else if(escolha == 2)
        {
            c22.mostrar2();
            c3.mostrar();
            c3.escolher();
        
        if(escolha == 1)
        {
            c31.mostrar2();
            c4.mostrar();
            c4.escolher();

            if (escolha == 1) 
            {
            c41.mostrar2();
            } 
        
            else if(escolha == 2)
            {
                c42.mostrar2();
                c43.mostrar2();
            }
        }

        else if(escolha == 2)
        {
            c32.mostrar2();
            c4.mostrar();
            c4.escolher();    

            if (escolha == 1) 
            {
                c41.mostrar2();
            } 
            
            else if(escolha == 2)
            {
                c42.mostrar2();
                c43.mostrar2();
            }
        }
        }
        }    
        
        else if(escolha == 2)
        {
            c12.mostrar2();
            c2.mostrar();
            c2.escolher();
                
            if(escolha == 1)
            {
                c21.mostrar2();
                c3.mostrar();
                c3.escolher();

                if(escolha == 1)
                {
                    c31.mostrar2();
                    c4.mostrar();
                    c4.escolher();

                    if (escolha == 1) 
                    {
                        c41.mostrar2();
                    } 
    
                    else if(escolha == 2)
                    {
                        c42.mostrar2();
                        c43.mostrar2();
                    }
                }

            else if(escolha == 2)
            {
                c32.mostrar2();
                c4.mostrar();
                c4.escolher();    

                if (escolha == 1) 
                {
                    c41.mostrar2();
                } 
            else if(escolha == 2)
            {
                c42.mostrar2();
                c43.mostrar2();
            }
            }
            }



        else if(escolha == 2)
        {
            c22.mostrar();
            c3.mostrar();
            c3.escolher();

            if(escolha == 1)
            {
                c31.mostrar2();
                c4.mostrar();
                c4.escolher();

                if (escolha == 1) 
                {
                    c41.mostrar2();
                } 
            else if(escolha == 2)
            {
                c42.mostrar2();
                c43.mostrar2();
            }
            }



        else if(escolha == 2)
        {
            c32.mostrar2();
            c4.mostrar();
            c4.escolher();    

            if (escolha == 1) 
            {
                c41.mostrar2();
            } 
        
        else if(escolha == 2)
        {
            c42.mostrar2();
            c43.mostrar2();
        }
        }
        }
        }
        scanner.close();
    }      
}
