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
public class RemoverAluno extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Remover aluno";
	}

	@Override
	public boolean executar() {
		String matricula = leitor.lerString("Matrícula: ");
		
		Aluno aluno = dao.pesquisar(matricula);
		
		if (aluno == null) {
			System.out.println("Aluno não encontrado!");
		}
		else {
			Aluno alunoParaRemover = new Aluno(matricula);
			
			dao.remover(alunoParaRemover);
		}
		
		return false;
	}

}
