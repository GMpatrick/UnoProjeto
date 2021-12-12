package br.com.patrick.visao;

import java.util.Stack;

import br.com.patrick.modelo.Cartas;

public class principal {
	public static void main(String[] args) {
		
		Stack baralho = new Stack();
		
		Cartas cartas = new Cartas();
		
		baralho.push(cartas.gerarCartas());
		
		
		
		System.out.println(baralho);
		System.out.println(baralho.size());

		
		
		
	}
}
