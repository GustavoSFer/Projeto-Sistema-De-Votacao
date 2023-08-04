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

  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora eleitora : pessoaEleitora) {
      if (eleitora.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
      } else {
        pessoaEleitora.add(new PessoaEleitora(nome, cpf));
      }
    }
  }

  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    for (String cpf : cpfComputado) {
      if (cpf.equals(cpfPessoaEleitora)) {
        System.out.println("Pessoa eleitora já votou!");
      } else {
        for (PessoaCandidata candidato : pessoasCandidatas) {
          if (candidato.getNumero() == numeroPessoaCandidata) {
            candidato.receberVoto();
            cpfComputado.add(cpfPessoaEleitora);
          }
        }
      }
    }
  }

}
