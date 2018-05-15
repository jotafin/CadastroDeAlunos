package alunos;
import menus.AtualizarAluno;
import menus.ConsultarAluno;
import menus.InserirAluno;
import menus.ItemDeMenu;
import menus.ListarAlunosAprovados;
import menus.ListarAlunos;
import menus.ListarAlunosPorMedia;
import menus.ListarAlunosPorNome;
import menus.ListarAlunosReprovados;
import menus.RemoverAluno;
import menus.Sair;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		ItemDeMenu[] principal = new ItemDeMenu[] { 
				new InserirAluno(),
				new ListarAlunosPorNome(),
				new ConsultarAluno(),
				new AtualizarAluno(),
				new RemoverAluno(),
				new ListarAlunosAprovados(),
				new ListarAlunosReprovados(),
				new ListarAlunosPorMedia(),
				new Sair() 
		};

		boolean sair = false;
		do {
			for (int i = 0; i < principal.length; i++) {
				System.out.println(i + " - " + principal[i].getDescricao());
			}
			System.out.print("Qual a opção desejada: ");
			int opcao = Integer.parseInt(console.nextLine());

			sair = principal[opcao].executar();
		} while (!sair);
	}

}
