public class Pessoa {

    public String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public Pessoa (){
    }

    public String getNome (){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
