package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("curso Js");
		curso2.setCargaHoraria(8);
		
		System.out.println(curso1) ;
		System.out.println(curso2) ;
		
		Mentoria mentoria1 = new Mentoria() ;
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria java");
        mentoria1.setData(LocalDate.now());
        mentoria1.setCargaHoraria(2);
        
        System.out.println(mentoria1) ;
		
	}

}
