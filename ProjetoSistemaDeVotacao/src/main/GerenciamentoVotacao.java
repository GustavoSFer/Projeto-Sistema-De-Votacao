package main;

import java.util.ArrayList;

public class GerenciamentoVotacao {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfComputado = new ArrayList<String>();
  private int totalVotos;



  /**
   * Verifica se ja existe a pessoa eleitora.
   */
  private boolean existePessoaEleitora(String cpf) {
    for (PessoaEleitora eleitora : pessoasEleitoras) {
      if (eleitora.getCpf().equals(cpf)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Verifica se ja existe voto da pessoa com o cpf.
   */
  private boolean isVotou(String cpf) {
    return cpfComputado.contains(cpf);
  }

  /**
   * Verifica se ja existe a pessoa candidata.
   */
  private boolean existePessoaCandidata(int numero) {
    for (PessoaCandidata candidato : pessoasCandidatas) {
      if (candidato.getNumero() == numero) {
        return true;
      }
    }
    return false;
  }

  /**
   * Cadastra uma pessoa candidata.
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    boolean isExist = existePessoaCandidata(numero);

    if (isExist) {
      System.out.println("Número pessoa candidata já utilizado!");
      return;
    } else {
      this.pessoasCandidatas.add(new PessoaCandidata(nome, numero));
    }
  }

  /**
   * Cadastra uma pessoa eleitora.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    boolean isExist = existePessoaEleitora(cpf);

    if (isExist) {
      System.out.println("Pessoa eleitora já cadastrada!");
      return;
    } else {
      this.pessoasEleitoras.add(new PessoaEleitora(nome, cpf));
    }
  }

  /**
   * Realiza a votação.
   */
  public void votar(String cpf, int numero) {
    boolean votou = isVotou(cpf);

    if (votou) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    } else {
      for (PessoaCandidata candidato : pessoasCandidatas) {
        if (candidato.getNumero() == numero) {
          candidato.receberVoto();
          break;
        }
      }
      cpfComputado.add(cpf);
      totalVotos++;
      System.out.println("Voto computado com sucesso!\n");
    }
  }

  /**
   * Calcula a porcentagem de votos.
   */
  private double calcularPorcentagemVotos(int indexObj) {
    PessoaCandidata pessoa = pessoasCandidatas.get(indexObj);
    double porcetagemVoto = (double) pessoa.getVotos() / this.totalVotos * 100;
    return porcetagemVoto;
  }

  /**
   * Retorna o resultado dos votos.
   */
  public void mostrarResultado() {
    if (this.cpfComputado.size() > 0) {
      for (PessoaCandidata pessoa : pessoasCandidatas) {
        String nome = pessoa.getNome();
        int votos = pessoa.getVotos();
        int index = pessoasCandidatas.indexOf(pessoa);
        double porcentagem = this.calcularPorcentagemVotos(index);

        System.out.println("Nome: " + nome + " - " + votos + " votos ( " + porcentagem + "% )");
      }
      System.out.println("Total de votos: " + this.totalVotos);
    } else {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }
  }
}
