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
public class InserirAluno extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Inserir aluno";
	}

	@Override
	public boolean executar() {
		String matricula = leitor.lerString("Matrícula: ");
		String nome = leitor.lerString("Nome: ");
		double p1 = leitor.lerDouble("P1: ");
		double p2 = leitor.lerDouble("P2: ");
                double p3 = leitor.lerDouble("P3: ");
                double p4 = leitor.lerDouble("P4: ");

		Aluno aluno = new Aluno(matricula, nome);
		aluno.setP1(p1);
		aluno.setP2(p2);
                aluno.setP3(p3);
                aluno.setP4(p4);

		dao.inserir(aluno);

		System.out.println("Aluno cadastrado com sucesso!");

		return false;
	}

}

