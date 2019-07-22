/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author marib
 */
public class ItemNaoEncontradoException extends Exception  {
    
/**
	 * Número serial da excecão.
	 */
	private static final long serialVersionUID = 5900427092809923593L;

	/**
	 * Inicializa um objeto ItemNotFoundException recém-criado.
	 */
	public ItemNaoEncontradoException() {
		super("Item Não Encontrado");
	}
}

