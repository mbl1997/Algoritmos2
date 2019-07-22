/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas;

/**
 *
 * @author marib
 */
public class NodoIndice <T> {
    
                   private NodoIndice<T> next;
	private NodoIndice<T> prev;
	private Nodo<T> alvo;
	
	public NodoIndice<T> getNext() {
		return next;
	}
	public void setNext(NodoIndice<T> next) {
		this.next = next;
	}
	public NodoIndice<T> getPrev() {
		return prev;
	}
	public void setPrev(NodoIndice<T> prev) {
		this.prev = prev;
	}
	public Nodo<T> getAlvo() {
		return alvo;
	}
	public void setAlvo(Nodo<T> alvo) {
		this.alvo = alvo;
	}	
}

