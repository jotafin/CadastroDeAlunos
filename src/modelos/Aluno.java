/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Jefferson
 */
public class Aluno {

	private String matricula, nome;
	private double p1, p2, p3, p4;

	public Aluno(String matricula) {
		this(matricula, null);
	}
	
	public Aluno(String matricula, String nome) {
		this(matricula, nome, 0, 0, 0, 0);
	}

	public Aluno(String matricula, String nome, double p1, double p2, double p3, double p4) {
		this.matricula = matricula;
		this.nome = nome;
		this.p1 = p1;
		this.p2 = p2;
                this.p3 = p3;
                this.p4 = p4;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}
        public double getP3() {
		return p3;
	}

	public void setP3(double p3) {
		this.p3 = p3;
	}
        public double getP4() {
		return p4;
	}

	public void setP4(double p4) {
		this.p4 = p4;
	}
	public double calcularMedia() {
		return (p1 + p2 + p3 + p4) / 4;
	}

	public boolean passou() {
		return calcularMedia() >= 7.0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
	
}
