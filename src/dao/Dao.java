
package dao;
import java.util.ArrayList;
import modelos.Aluno;
/**
 *
 * @author Jefferson
 */
public interface Dao {

	void inserir(Aluno aluno);

	ArrayList<Aluno> listar();

	Aluno pesquisar(String matricula);
	
	void atualizar(Aluno aluno);
	
	void remover(Aluno aluno);

}
