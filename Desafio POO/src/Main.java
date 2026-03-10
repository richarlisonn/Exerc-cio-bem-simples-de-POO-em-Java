
public class Main {
    public static void main(String[] args) {

        Pessoa inae = new Pessoa("Inae", 16, "SP");
        Pessoa richarlison = new Pessoa("Richarlison", 18, "SP");

        inae.soma();
        richarlison.soma();
    }
}

class Pessoa {
    String nome;
    int idade;
    String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public void soma(){
        int idadeSoma = idade + 1;
        System.out.println("OLá, meu nome é " + nome + " Tenho " + idadeSoma + " anos e moro em " + cidade + "!");

    }
}
