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
public class ListaVaziaException  extends Exception{
    
/**
	 * Número serial da excecão.
	 */
	private static final long serialVersionUID = 8745038878316077813L;

	/**
	 * Inicializa um objeto ListaVaziaException recém-criado.
	 */
	public ListaVaziaException() {
		super("Operação em Lista Vazia");
	}
}

