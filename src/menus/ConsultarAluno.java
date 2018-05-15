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
public class ConsultarAluno extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Consultar aluno";
	}

	@Override
	public boolean executar() {
		String matricula = leitor.lerString("Matrícula: ");
		
		Aluno aluno = dao.pesquisar(matricula);
		
		if (aluno == null) {
			System.out.println("Aluno não encontrado!");
		}
		else {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("P1..: " + aluno.getP1());
			System.out.println("P2..: " + aluno.getP2());
                        System.out.println("P3..: " + aluno.getP3());
                        System.out.println("P4..: " + aluno.getP4());
		}
		
		return false;
	}

}

