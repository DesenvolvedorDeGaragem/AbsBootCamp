package br.com.bootcamp.abs.dominio;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mentoria extends Conteudo{
    private LocalDate data; 

    public  Mentoria(String titulo, String descricao, LocalDate data){
        super(titulo,descricao);
        this.data = data;
    }

    @Override
    public String toString() {
        return "Título: "+super.getTitulo()+" ! descricao: "+super.getDescricao()+" ! data: "+data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
