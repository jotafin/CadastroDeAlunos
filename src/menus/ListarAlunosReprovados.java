/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;
import modelos.Aluno;
/**
 *
 * @author Jefferson
 */
public class ListarAlunosReprovados extends ListarAlunos {

	
	public String getDescricao() {
		return "Listar alunos reprovados";
	}

	
	public boolean deveImprimir(Aluno aluno) {
		return !aluno.passou();
	}

}
