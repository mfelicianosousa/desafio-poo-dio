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
		
		
		Mentoria mentoria1 = new Mentoria() ;
		
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria java");
        mentoria1.setData(LocalDate.now());
   
/*
		System.out.println(curso1) ;
		System.out.println(curso2) ;
		
        System.out.println(mentoria1) ;
	*/
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Desc Bootcampo Developer");
        bootcamp.getConteudos().add(curso1) ;
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        
        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila "+devCamila.getConteudosInscritos());
        System.out.println("===================");      
        
        devCamila.progredir();
        devCamila.progredir();
        
        System.out.println("Conteúdos Inscritos Camila "+devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila "+devCamila.getConteudosConcluidos());
        System.out.println("XP:"+ devCamila.calcularXp());
        
        System.out.println("---------------------------------------------------------------");      
        Dev devMarcelino = new Dev();
        devMarcelino.setNome("Marcelino");
        devMarcelino.inscreverBootcamp(bootcamp);
        
        System.out.println("Conteúdos Inscritos Marcelino "+devMarcelino.getConteudosInscritos());
        System.out.println("Progresso -> ");  
        devMarcelino.progredir();
        devMarcelino.progredir();
        devMarcelino.progredir();
        System.out.println("Conteúdos Inscritos Marcelino "+devMarcelino.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Marcelino "+devMarcelino.getConteudosConcluidos());
        System.out.println("XP:"+ devMarcelino.calcularXp());
	}

}
