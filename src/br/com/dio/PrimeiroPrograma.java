package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		Gato gato = new Gato();
		Livros livros = new Livros();
		System.out.println(gato);
		System.out.println(livros);
	}
	/*
	 * int a = 4; int b = 3; System.out.println("quanto � 4 + 3? -->" + (a+b)); }
	 */

}

class Livros {
	private String nome;
	private String npag;
}