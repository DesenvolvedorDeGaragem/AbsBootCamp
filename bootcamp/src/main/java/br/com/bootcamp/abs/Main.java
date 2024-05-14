package br.com.bootcamp.abs;

import java.time.LocalDate;

import br.com.bootcamp.abs.dominio.Conteudo;
import br.com.bootcamp.abs.dominio.Curso;
import br.com.bootcamp.abs.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Curso Java", "Descrição curso", 8);
        Conteudo curso2 = new Curso("JavaScript", "Curso de JavaScript", 10);
        System.out.println(curso1);
        System.out.println(curso2);

        Conteudo mentoria = new Mentoria("Mentoria Java", "Descrição Mentoria Java",  LocalDate.now());
        System.out.println(mentoria);
    }
}