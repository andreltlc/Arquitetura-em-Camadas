package dados;

import java.util.ArrayList;
import java.util.List;
import negocio.aluno.Aluno;
import negocio.aluno.Endereco;

public class RepositorioAluno implements IRepositorioAluno{
  private List<Aluno> alunos;

  public RepositorioAluno(){
    this.alunos = new ArrayList<>();
  }

  @Override
  public void inserirAluno(Aluno aluno) {
    this.alunos.add(aluno);
  }
  @Override
  public void removerAluno(Aluno aluno){
    this.alunos.remove(aluno);
  }
  @Override
  public void alteraNome(Aluno aluno, String nome){
    Aluno  a = buscaAluno(aluno);
    a.setNome(nome);
  }
  @Override
  public void alteraMatricula(Aluno aluno, String matricula){
    Aluno  a = buscaAluno(aluno);
    a.setMatricula(matricula);
  }
  @Override
  public void alteraEndereço(Aluno aluno , Endereco endereco){
    Aluno a = buscaAluno(aluno);
    a.setEndereco(endereco);
  }
  @Override
  public Aluno buscaAluno( String nome){
    for(Aluno aluno : alunos){
      if(aluno.getNome().equals(nome)){
          return aluno ;
      }
    }
    return RuntimeException("Aluno não existe");
  }
  
}
