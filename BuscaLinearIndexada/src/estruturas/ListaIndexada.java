/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas;
import exceptions.ItemNaoEncontradoException;
import exceptions.ListaVaziaException;
import model.ListaOrdenada;
import model.Nodo;
import model.NodoIndice;

/**
 *
 * @author marib
 */
public class ListaIndexada <T extends Comparable<T>>  {
    

	private NodoIndice<T> head;
	private NodoIndice<T> tail;
	private ListaOrdenada<T> lista;
	
	public ListaIndexada() {
		lista = new ListaOrdenada<T>();
	}
	
	public void inserir(T valor) {
		lista.inserir(valor);
	}
	
	public Nodo<T> procurar(T valor) throws ListaVaziaException, ItemNaoEncontradoException {
		return lista.procura(valor);
	}
	
	public void remover(T valor) throws ListaVaziaException, ItemNaoEncontradoException {
		lista.remover(valor);
	}
	
	
	
}

