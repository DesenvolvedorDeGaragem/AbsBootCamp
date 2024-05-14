package br.com.bootcamp.abs;

import br.com.bootcamp.abs.dominio.Bootcamp;
import br.com.bootcamp.abs.dominio.Conteudo;
import br.com.bootcamp.abs.dominio.Curso;
import br.com.bootcamp.abs.dominio.Dev;
import br.com.bootcamp.abs.dominio.Mentoria;
import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {
    Conteudo curso1 = new Curso(
      "Curso de Java",
      "Um curso TOP de Java para Javeiros",
      8
    );
    Conteudo curso2 = new Curso(
      "Curso de JavaScript",
      "Um curso TOP de Javacript para frontend developers",
      4
    );
    System.out.println(curso1);
    System.out.println(curso2);

    Conteudo mentoria = new Mentoria(
      "Mentoria Java",
      "Aprendendo Java de forma Aprofundada",
      LocalDate.now()
    );
    System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao(
      "Uma bateria de aprendizados otimizados para você crescer com Java"
    );
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);
    

    Dev devDanrley = new Dev();
    devDanrley.setNome("Danrley");
    devDanrley.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos "+devDanrley.getNome()+": "+ devDanrley.getConteudosInscritos());
    devDanrley.progredir();
    devDanrley.progredir();
    System.out.println("----");
    System.out.println("Conteúdos Inscritos "+devDanrley.getNome()+": "+ devDanrley.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos "+devDanrley.getNome()+": "+ devDanrley.getConteudosConcluidos());
    System.out.println("XP "+devDanrley.getNome()+": "+ devDanrley.calcularTotalXp());
    System.out.println("-----------------------");
    
    Dev devAleatorio = new Dev();
    devAleatorio.setNome("Dev Aleatorio");
    devAleatorio.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos "+devAleatorio.getNome()+": "+ devAleatorio.getConteudosInscritos());
    devAleatorio.progredir();
    System.out.println("----");
    System.out.println("Conteúdos Inscritos "+devAleatorio.getNome()+": "+ devAleatorio.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos "+devAleatorio.getNome()+": "+ devAleatorio.getConteudosConcluidos());
    System.out.println("XP "+devAleatorio.getNome()+": "+ devAleatorio.calcularTotalXp());


  }
}
