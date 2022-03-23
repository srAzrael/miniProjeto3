public class Personagem {
    String nome;
    int energia;

    Personagem(String nome)
    {
        this.nome = nome;
    }

    Personagem(String nome, int energia)
    {
        this.nome = nome;
        this.energia = 100;
    }

    void atualizarEnergia(int incremento)
    {
        if(incremento != 0)
        {
            this.energia += incremento;
            System.out.println("Energia de "+ nome + " " + this.energia); 
        }
    }

}