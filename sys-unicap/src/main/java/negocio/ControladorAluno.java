package negocio;

import dados.IRepositorioAluno;
import dados.RepositorioAluno;
import negocio.aluno.Aluno;
import negocio.aluno.Endereco;

public class ControladorAluno {
  private IRepositorioAluno repositorioAluno;

  public ControladorAluno(){
    this.repositorioAluno = new RepositorioAluno();
  }

  public void inserirAluno(Aluno aluno) {
    this.repositorioAluno.inserirAluno(aluno);
  }
  public void removerAluno(Aluno aluno){
    this.repositorioAluno.removerAluno(aluno);
  }
  public void buscaAluno (Aluno aluno){
    this.repositorioAluno.buscaAluno(aluno);
  }
  public void alterarNome(Aluno aluno, String nome){
    this.repositorioAluno.alteraNome(aluno, nome);
  }
  public void alterarMatricula(Aluno aluno, String matricula){
    this.repositorioAluno.alteraMatricula(aluno, matricula);
  }
  public void alterarEndereco(Aluno aluno, Endereco endereco){
    this.repositorioAluno.alteraEndereço(aluno, endereco);
  }
  
}
