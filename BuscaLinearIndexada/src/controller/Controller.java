/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import estruturas.ListaOrdenada;
import exceptions.ItemNaoEncontradoException;
import exceptions.ListaVaziaException;
import model.ListaIndices;
import view.Console;

/**
 *
 * @author marib
 */
public class Controller implements Runnable {
    
private ListaOrdenada<String> listaOrdenada;
	private ListaIndices<String> listaIndices;
	
	public Controller() {
		listaOrdenada 	= new ListaOrdenada<String>();
		listaIndices	= new ListaIndices<String>();
		
		iniciarListas();
	}
	//Aqui crio um Scanner para ler o arquivo csv
	private void iniciarListas() {
		Scanner arquivo = null;
		try {
			arquivo = new Scanner(new BufferedReader(new FileReader("dados.csv")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (arquivo.hasNext()) {
			String dados = arquivo.nextLine();
			listaIndices.inserir(dados);
			listaOrdenada.inserir(dados);
		}
	}
	//Verifico o dado digitado no menu
	public void run() {
		Console.exibirSaudacao();
		
		int saida = 0;
		
		while (saida == 0) {
			saida = menu();
		}
	}
	//Opções do menu
	public int menu() {
		int op = Console.exibirMenu();
		
		switch (op) {
		case 1 :
			opcaoInserir();
			break;
		case 2 :
			opcaoRemover();			
			break;
		case 3 :
			opcaoProcurar();
			break;
		case 4 :
			Console.exibirSaida();
			return 1;
		default :
			Console.exibirOpcaoInvalida();
		}
		
		return 0;
	}

	private void opcaoProcurar() {
		Console.exibirProcura();
		
		String valor = Console.receberValor();
		
		try {
			listaOrdenada.procura(valor);
			listaIndices.procurar(valor);
		} catch (ListaVaziaException e) {
			Console.exibirErro(e.getMessage());
			e.printStackTrace();
		} catch (ItemNaoEncontradoException e) {
			Console.exibirErro(e.getMessage());
			e.printStackTrace();
		}
		
	}

	private void opcaoRemover() {
		Console.exibirRemover();
		
		String valor = Console.receberValor();
		
		try {
			listaOrdenada.remover(valor);
			listaIndices.remover(valor);
		} catch (ListaVaziaException e) {
			Console.exibirErro(e.getMessage());
			e.printStackTrace();
		} catch (ItemNaoEncontradoException e) {
			Console.exibirErro(e.getMessage());
			e.printStackTrace();
		}
	}

	private void opcaoInserir() {
		Console.exibirInserir();
		
		String valor = Console.receberValor();
		
		listaOrdenada.inserir(valor);
		listaIndices.inserir(valor);
	}

	public static void main(String[] args) {
		new Controller().run();
	}
	
}
