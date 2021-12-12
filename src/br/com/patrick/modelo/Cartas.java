package br.com.patrick.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cartas {
	
	/*Declaração das listas que receberão o baralho*/
	ArrayList <String> baralhoMontagem = new ArrayList<>();
	ArrayList <String> baralho = new ArrayList<>();
	
	// esse método retornara cartas 
	public ArrayList gerarCartas() {
		
		String[] numeros = {"1","2","3","4","5","6","7","8","9"};
		String[] cores = {"VERDE","AMARELO","AZUL","VERMELHO"};
		String[] especiais = {"CORINGA", "VOLTAR", "+2", "ESCOLHACOR"};
		
		// neses for ele junta o baralho para transformar em um só
		
		for(int j = 0; j < especiais.length; j++) {
			baralhoMontagem.add(especiais[j]);
		}
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < cores.length; j++) {
				baralhoMontagem.add(numeros[i] + cores[j]);
			}
		}
		
		baralho.addAll(baralhoMontagem );
		baralho.addAll(baralhoMontagem );
		
		return baralho;
	}
}
