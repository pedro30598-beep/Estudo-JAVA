public class Pessoa {
    String nome;
    int idade;
    String genero;
    String orientacao;
    String cpf;

    public Pessoa(String nome, int idade, String genero, String orientacao, String cpf) {

    this.nome = nome;
    this.idade = idade;
    this.genero = genero;
    this.orientacao = orientacao;
    this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +" | Idade: " + idade +" | Gênero: " + genero +
        " | Orientação: " + orientacao;
    }
}