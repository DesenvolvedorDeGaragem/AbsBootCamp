package br.com.bootcamp.abs.dominio;

import lombok.Getter;
import lombok.Setter;

/**
 * Representa um curso no bootcamp.
 * Um curso é um tipo de conteúdo que possui uma carga horária específica.
 */
@Getter
@Setter
public class Curso extends Conteudo {

    private int cargaHoraria;

    /**
     * Construtor da classe Curso.
     *
     * @param titulo       o título do curso
     * @param descricao    a descrição do curso
     * @param cargaHoraria a carga horária do curso em horas
     */
    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * Retorna uma representação em string do curso.
     *
     * @return uma string contendo o título, a descrição e a carga horária do curso
     */
    @Override
    public String toString() {
        return "Título: " + super.getTitulo() + " ! descricao: " + super.getDescricao() + " ! cargaHoraria: "
                + cargaHoraria;
    }

    /**
     * Calcula a experiência (XP) obtida ao completar o curso.
     * A experiência é calculada somando a XP padrão com a carga horária do curso.
     *
     * @return a experiência (XP) obtida ao completar o curso
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO + getCargaHoraria();
    }
}
