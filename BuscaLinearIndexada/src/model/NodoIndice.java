/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import estruturas.Nodo;
/**
 *
 * @author marib
 */
public class NodoIndice <T> {
    
                   private NodoIndice<T> proximo;
	private NodoIndice<T> anterior;
	private Nodo<T> alvo;
	
	public NodoIndice() {}
	
	public NodoIndice(Nodo<T> alvo) {
		this.alvo = alvo;
	}

	public NodoIndice<T> getProximo() {
		return proximo;
	}

	public void setProximo(NodoIndice<T> proximo) {
		this.proximo = proximo;
	}

	public NodoIndice<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoIndice<T> anterior) {
		this.anterior = anterior;
	}

	public Nodo<T> getAlvo() {
		return alvo;
	}

	public void setAlvo(Nodo<T> alvo) {
		this.alvo = alvo;
	}
	
	
}

