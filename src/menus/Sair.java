/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

/**
 *
 * @author Jefferson
 */
public class Sair extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Sair";
	}

	@Override
	public boolean executar() {
		return true;
	}

}