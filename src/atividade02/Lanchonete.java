package atividade02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atividade02.models.CarrinhoDeCompras.Produto;
import atividade02.services.Checagem;


public class Lanchonete {

	public void cardapio() {
		
		Scanner read = new Scanner(System.in);
		Checagem checar = new Checagem();
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		byte menu = 0;
		int indice = 0;
		float precoFinal = 0;
		
		do {
			
			
			
			System.out.println("O que você deseja: \n" 
								+ "1 - Cachorro Quente\t R$ 10.00\n"
								+ "2 - X-Salada       \t R$ 15.00\n" 
								+ "3 - X-Bacon        \t R$ 18.00\n" 
								+ "4 - Bauru          \t R$ 12.00\n"
								+ "5 - Refrigerante   \t R$ 8.00\n"
								+ "6 - Suco de laranja\t R$ 13.00\n"
								+ "7 - Finalizar compras");

			menu = read.nextByte();

			switch (menu) {

			case 1:
				
				indice = checar.checarIndice("Cachorro Quente", produtos);
				
				if( indice == -1) {
					float quantidade = 0f;
					System.out.println("Quantos produtos você quer adicionar ao carrinho: ");
					quantidade = read.nextFloat();
					
					while(quantidade < 1 ){
					System.out.println("Digite um valor valido: ");
					quantidade = read.nextFloat();
					}
					
					Produto produto1 = new Produto("Cachorro Quente", 10.00f, quantidade);
					produtos.add(produto1);
					
				}else {
					
					float quantidade = 0f;
					System.out.println("Digite a nova quantidade: ");
					quantidade = read.nextFloat();
					
					while(quantidade < 1 ){
					System.out.println("Digite um valor valido: ");
					quantidade = read.nextFloat();
					}
					
					Produto produto1 = produtos.get(indice);
			        produto1.alterarQuantidade(quantidade);
					
				}
				break;
				
			case 2:
				
				indice = checar.checarIndice("X-Salada", produtos);
				
				if( indice == -1) {
					float quantidade = 0f;
					System.out.println("Quantos produtos você quer adicionar ao carrinho: ");
					quantidade = read.nextFloat();
					
					while(quantidade < 1 ){
					System.out.println("Digite um valor valido: ");
					quantidade = read.nextFloat();
					}
					
					Produto produto2 = new Produto("X-Salada", 15.00f, quantidade);
					produtos.add(produto2);
					
				}else {
					
					float quantidade = 0f;
					System.out.println("Digite a nova quantidade: ");
					quantidade = read.nextFloat();
					
					while(quantidade < 1 ){
					System.out.println("Digite um valor valido: ");
					quantidade = read.nextFloat();
					}
					
					Produto produto2 = new Produto("X-Salada", 15.00f, quantidade);
					produtos.set(indice ,produto2);
					
				}
				
				break;

			case 3:
				
				indice = checar.checarIndice("X-Bacon", produtos);
				
				if( indice == -1) {
					float quantidade = 0f;
					System.out.println("Quantos produtos você quer adicionar ao carrinho: ");
					quantidade = read.nextFloat();
					
					while(quantidade < 1 ){
					System.out.println("Digite um valor valido: ");
					quantidade = read.nextFloat();
					}
					
					Produto produto3 = new Produto("X-Bacon", 18.00f, quantidade);
					produtos.add(produto3);
					
				}else {
					
					float quantidade = 0f;
					System.out.println("Digite a nova quantidade: ");
					quantidade = read.nextFloat();
					
					while(quantidade < 1 ){
					System.out.println("Digite um valor valido: ");
					quantidade = read.nextFloat();
					}
					
					Produto produto3 = new Produto("X-Bacon", 18.00f, quantidade);
					produtos.set(indice ,produto3);
					
				}
				
				
				break;

			case 4:
				
				indice = checar.checarIndice("Bauru", produtos);
				
				if( indice == -1) {
					float quantidade = 0f;
					System.out.println("Quantos produtos você quer adicionar ao carrinho: ");
					quantidade = read.nextFloat();
					
					while(quantidade < 1 ){
					System.out.println("Digite um valor valido: ");
					quantidade = read.nextFloat();
					}
					
					Produto produto4 = new Produto("Bauru", 12.00f, quantidade);
					produtos.add(produto4);
					
				}else {
					
					float quantidade = 0f;
					System.out.println("Digite a nova quantidade: ");
					quantidade = read.nextFloat();
					
					while(quantidade < 1 ){
					System.out.println("Digite um valor valido: ");
					quantidade = read.nextFloat();
					}
					
					Produto produto4 = new Produto("Bauru", 12.00f, quantidade);
					produtos.set(indice ,produto4);
					
				}
			
				break;

			case 5:
				
				indice = checar.checarIndice("Refrigerante", produtos);
				
				if( indice == -1) {
					float quantidade = 0f;
					System.out.println("Quantos produtos você quer adicionar ao carrinho: ");
					quantidade = read.nextFloat();
					
					while(quantidade < 1 ){
					System.out.println("Digite um valor valido: ");
					quantidade = read.nextFloat();
					}
					
					Produto produto5 = new Produto("Refrigerante", 8.00f, quantidade);
					produtos.add(produto5);
					
				}else {
					
					float quantidade = 0f;
					System.out.println("Digite a nova quantidade: ");
					quantidade = read.nextFloat();
					
					while(quantidade < 1 ){
					System.out.println("Digite um valor valido: ");
					quantidade = read.nextFloat();
					}
					
					Produto produto5 = new Produto("Refrigerante", 8.00f, quantidade);
					produtos.set(indice ,produto5);
					
				}
				
				break;
				
			case 6:
				
				indice = checar.checarIndice("Suco de laranja", produtos);
				
				if( indice == -1) {
					float quantidade = 0f;
					System.out.println("Quantos produtos você quer adicionar ao carrinho: ");
					quantidade = read.nextFloat();
					
					while(quantidade < 1 ){
					System.out.println("Digite um valor valido: ");
					quantidade = read.nextFloat();
					}
					
					Produto produto6 = new Produto("Suco de laranja", 13.00f, quantidade);
					produtos.add(produto6);
					
				}else {
					
					float quantidade = 0f;
					System.out.println("Digite a nova quantidade: ");
					quantidade = read.nextFloat();
					
					while(quantidade < 1 ){
					System.out.println("Digite um valor valido: ");
					quantidade = read.nextFloat();
					}
					
					Produto produto6 = new Produto("Suco de laranja", 13.00f, quantidade);
					produtos.set(indice ,produto6);
					
				}
				
				break;
				
				
			default:
				System.out.println(" ");
				break;
			}

			
		}while(menu != 7);
		
		read.close();
		
		System.out.println("Lista de compra: \n");
		
		System.out.println("Produto        " + "\t" + 
				   		   "Preço" + "\t" +
				   		   "Quantidade\n");
		
		for (Produto produto : produtos) {
			System.out.println(produto.getNome() + "\t" + 
							   produto.getPreco() + "\t" +
							   produto.getQuantidade());
			
			precoFinal += produto.getPreco() * produto.getQuantidade();
		}
		
		System.out.println("\nValor da compra: R$ " + precoFinal);
		
		
	}
}
