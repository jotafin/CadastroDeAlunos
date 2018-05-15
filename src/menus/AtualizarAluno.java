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
public class AtualizarAluno extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Atualizar aluno";
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
			
			String nome = leitor.lerString("Novo nome: ");
			double p1 = leitor.lerDouble("Nova P1: ");
			double p2 = leitor.lerDouble("Nova P2: ");
                        double p3 = leitor.lerDouble("Nova P3: ");
                        double p4 = leitor.lerDouble("Nova P4: ");
			
			aluno.setNome(nome);
			aluno.setP1(p1);
			aluno.setP2(p2);
                        aluno.setP3(p3);
                        aluno.setP4(p4);
			
			dao.atualizar(aluno);
		}

		return false;
	}

}
