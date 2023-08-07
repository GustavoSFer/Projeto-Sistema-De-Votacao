package main;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    int opcao = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("----------- Bem-vindo ao Sistema de Votação -----------");

    while (opcao != 2) {
      System.out.println("Cadastrar pessoa candidata?");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          cadastrarPessoaCandidata();
          break;
        case 2:
          break;
        default:
          System.out.println("Opção invalida");
      }
    }



  }

  public static void cadastrarPessoaCandidata() {

  }
}
