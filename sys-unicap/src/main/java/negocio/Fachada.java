package negocio;

import negocio.aluno.Aluno;

public class Fachada implements IFachada{
  private ControladorAluno controladorAluno;

  public Fachada(){
    this.controladorAluno = new ControladorAluno();
  }

  @Override
  public void inserirAluno(Aluno aluno) {
    this.controladorAluno.inserirAluno(aluno);
  }

  @Override
  public void alterarNome(Aluno aluno, String nome) {
    this.controladorAluno.alterarNome(aluno, nome);
  }
  public void alterarMatricula(Aluno aluno, String matricula) {
    this.controladorAluno.alterarMatricula(aluno, matricula);
  }
  public void alterarEndereco ( Aluno aluno, Endereco endereco){
    this.controladorAluno.alterarEndereco(aluno, endereco);
  }

  @Override
  public void removerAluno(Aluno aluno) {
    this.controladorAluno.removerAluno(aluno);
  }
  public Aluno buscaAluno(String nome){
    return  a = this.controladorAluno.buscaAluno(nome);
  }
}
