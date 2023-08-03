package main;

public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  public PessoaCandidata(String nome, int numero) {
    super.nome = nome;
    this.numero = numero;
    this.votos = 0;

  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  @Override
  public String getNome() {
    return super.nome;
  }

  @Override
  public void setNome(String nome) {
    super.nome = nome;

  }

  public void receberVoto() {
    this.votos += 1;
  }

}
