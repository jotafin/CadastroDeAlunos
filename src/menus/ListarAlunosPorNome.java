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

public class ListarAlunosPorNome extends ListarAlunos {

	@Override
	public String getDescricao() {
		return "Listar alunos (ordem alfabética)";
	}

	@Override
	public boolean deveImprimir(Aluno aluno) {
		return true;
	}

}
