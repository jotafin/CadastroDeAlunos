/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;
import dao.Dao;
import dao.DaoArrayList;
import io.Leitor;
/**
 *
 * @author Jefferson
 */
public abstract class ItemDeMenu {
	
	protected Leitor leitor;
	protected Dao dao;
	
	public ItemDeMenu() {
		leitor = new Leitor();
		dao = new DaoArrayList();
	}
	
	public abstract String getDescricao();

	public abstract boolean executar();

}
