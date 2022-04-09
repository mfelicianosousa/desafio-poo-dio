package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

	private String titulo ;
	private String descricao ;
	private LocalDate data ;
	private int cargaHoraria ;
	
	
	
	public Mentoria() {
	}



	public Mentoria(String titulo, String descricao, LocalDate data, int cargaHoraria) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
		this.cargaHoraria = cargaHoraria;
	}



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



	public LocalDate getData() {
		return data;
	}



	public void setData(LocalDate data) {
		this.data = data;
	}



	public int getCargaHoraria() {
		return cargaHoraria;
	}



	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}



	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + ", cargaHoraria="
				+ cargaHoraria + "]";
	}
	
	
	
}
