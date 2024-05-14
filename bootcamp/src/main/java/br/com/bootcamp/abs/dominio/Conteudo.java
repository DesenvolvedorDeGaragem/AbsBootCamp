package br.com.bootcamp.abs.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Representa um conteúdo genérico no bootcamp.
 * Esta é uma classe abstrata que deve ser estendida por tipos específicos de conteúdos,
 * como cursos e mentorias. Cada conteúdo tem um título, uma descrição e um valor padrão de XP.
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    /**
     * Calcula a experiência (XP) obtida ao completar o conteúdo.
     * Este método deve ser implementado pelas subclasses.
     *
     * @return a experiência (XP) obtida ao completar o conteúdo
     */
    public abstract double calcularXp();
}
