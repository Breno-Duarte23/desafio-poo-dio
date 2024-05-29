package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Curso curso1 = new Curso();
		
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descricao curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descricao curso JavaScript");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descricao mentoria Java");
		mentoria.setData(LocalDate.now());
		/*
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		*/
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devBreno = new Dev();
		devBreno.setNome ("Breno");
		devBreno.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos Inscritos" + devBreno.getConteudosInscritos());
		
		Dev devAndre = new Dev();
		devAndre.setNome ("Andre");
		devAndre.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + devAndre.getConteudosInscritos());
	}
}
