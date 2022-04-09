package br.com.dio.desafio.dominio;

import java.time.LocalDate;
/*
 *  Class: Conteúdo 
 *  Todo bootcamp tem cursos e mentoria
 *  
 * */
public abstract class Conteudo {

	protected static final Double XP_PADRAO = 10d;
	
	private String titulo ;
	private String descricao ;
	
	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
}
