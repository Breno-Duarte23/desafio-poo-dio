package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	private String titulo;
	private String descricao;
	protected static final double XP_PADRAO = 10; 
	
	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titutlo) {
		this.titulo = titutlo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
