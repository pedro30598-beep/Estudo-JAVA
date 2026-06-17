import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
//conexão com as listas//
        Scanner sc = new Scanner(System.in);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Pessoa> homens = new ArrayList<>();
        ArrayList<Pessoa> mulheres = new ArrayList<>();

//cadastro de usarios//

    System.out.println("Qual o seu nome:");
    String nome = sc.nextLine();

    System.out.println("Digite sua idade:");
    int idade = sc.nextInt();

 System.out.println("Digite seu gênero 'M' para Miasculino e 'F' para Feminino:");
String genero = sc.next();

 System.out.println("Qual sua orientação sexual:");
String orientacao = sc.next();

    System.out.println("Qual seu CPF:");
String cpf = sc.next();

boolean maiorIdade = idade >= 18;
    if (!maiorIdade) {
        System.out.println("Você é menor de idade.");
        sc.close();
            return;
        }
    Pessoa pessoa = new Pessoa(
       nome, idade,  genero, orientacao,  cpf
        );
    pessoas.add(pessoa);

    if (genero.equalsIgnoreCase("M")) {
    homens.add(pessoa);
} 
else if (genero.equalsIgnoreCase("F")) {
    mulheres.add(pessoa);
}
    int opcao;
do {
System.out.println("\n--- MENU ---");
    System.out.println("1 -Homens");
    System.out.println("2 -Mulheres");
    System.out.println("3 -Os dois");
    System.out.println("4 - Sair");
    System.out.print("Escolha seu tipo de parceiro: ");
            opcao = sc.nextInt();

switch (opcao) {

    case 1:
    System.out.println("\n--- HOMENS ---");
        if (homens.isEmpty()) {
    System.out.println("Nenhum  quer você.");
}
 else {
    for (Pessoa p : homens) {
    System.out.println(p);
 }
}
 break;

     case 2:
     System.out.println("\n-MULHERES-");
    if (mulheres.isEmpty()) {
        System.out.println("Nenhuma mulher quer você.");
 } 
 else {
    for (Pessoa p : mulheres) {
         System.out.println(p);
    }
}break;
    case 3:
        System.out.println("\n-GOSTA DOS DOIS-");
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa  quer você.");
} 
else {
    for (Pessoa p : pessoas) {
        System.out.println(p);
 }
}
break;
    case 4:
 System.out.println("Saindo...");
  break;
     default:
    System.out.println("Opção inválida.");
    }
} while (opcao != 4);
        sc.close();
    }
}