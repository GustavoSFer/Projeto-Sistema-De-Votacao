package main;

public class PessoaEleitora extends Pessoa {
  private String cpf;

  public PessoaEleitora(String nome, String cpf) {
    super.nome = nome;
    this.cpf = cpf;
  }

  @Override
  public String getNome() {
    return super.nome;
  }

  @Override
  public void setNome(String nome) {
    super.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

}
