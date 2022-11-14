package dados;

import negocio.aluno.Aluno;

public interface IRepositorioAluno {

  public void inserirAluno(Aluno aluno);
  
  public void removerAluno(Aluno aluno);

  public void alteraNome(Aluno aluno, String nome);

  public void alteraMatricula(Aluno aluno, String matricula);

  public void alteraEndereço(Aluno aluno , Endereco endereco);

  public static Aluno buscaMatricula( String matricula){
    for(Aluno aluno : alunos){
      if(aluno.getMatricula().equals(matricula)){
          return aluno ;
      }
    }
    return RuntimeException("Aluno não existe");
  }
  public default Aluno buscaAluno( String nome){
    for(Aluno aluno : alunos){
      if(aluno.getNome().equals(nome)){
          return aluno ;
      }
    }
    return RuntimeException("Aluno não existe");
  }
}
