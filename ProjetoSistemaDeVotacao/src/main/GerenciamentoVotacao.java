package main;

import java.util.ArrayList;

public class GerenciamentoVotacao {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoaEleitora;
  private ArrayList<String> cpfComputado;
  private int totalVotos;

  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoa : pessoasCandidatas) {
      if (pessoa.getNumero() == numero) {
        System.out.println("Número pessoa candidata já utilizado!");
      } else {
        pessoasCandidatas.add(new PessoaCandidata(nome, numero));
      }
    }
  }
}
