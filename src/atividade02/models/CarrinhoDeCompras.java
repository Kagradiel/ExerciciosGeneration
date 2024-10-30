package atividade02.models;

public class CarrinhoDeCompras {

	public static class Produto {
		
	    private String nome;
	    private float preco;
	    private float quantidade;
	    
	    public Produto(String nome, float preco, float quantidade) {
	        this.nome = nome;
	        this.preco = preco;
	        this.quantidade = quantidade;
	    }
	    
	    public String getNome() {
	    	return nome;
	    }
	    
	    public float getQuantidade() {
            return quantidade;
        }
	    
	    public float getPreco() {
	    	return preco;
	    }
	    
	    public void alterarQuantidade(float quantidade) {
	        this.quantidade = quantidade;
	    }
	    
	}
	
}
