package main;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    int opcao = 0;
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao gerenciamento = new GerenciamentoVotacao();

    System.out.println("----------- Bem-vindo ao Sistema de Votação -----------");

    while (opcao != 2) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1- Sim\n2- Não\nEntre com o número correspondente à opção desejada:");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("Entre com o nome da pessoa candidata:");
          String nome = scanner.next();

          System.out.println("Entre com o número da pessoa candidata:");
          int numero = scanner.nextInt();

          gerenciamento.cadastrarPessoaCandidata(nome, numero);
          break;
        case 2:
          break;
        default:
          System.out.println("Opção invalida! Escolha uma opção valida: ");
      }
    }

    opcao = 0;

    while (opcao != 2) {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1- Sim\n2- Não\nEntre com o número correspondente à opção desejada:");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("Entre com o nome da pessoa eleitora:");
          String nome = scanner.next();

          System.out.println("Entre com o cpf da pessoa eleitora:");
          String cpf = scanner.next();

          gerenciamento.cadastrarPessoaEleitora(nome, cpf);
          break;
        case 2:
          break;
        default:
          System.out.println("Opção invalida! Escolha uma opção valida: ");
      }
    }

    scanner.close();

  }
}
