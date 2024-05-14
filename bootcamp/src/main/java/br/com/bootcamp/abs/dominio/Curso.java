package br.com.bootcamp.abs.dominio;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso( String titulo , String descricao, int cargaHoraria  ){
        super();
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Título: " + super.getTitulo() + " ! descricao: " + super.getDescricao() + " ! cargaHoraria: "
                + cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + getCargaHoraria();
    }
}
