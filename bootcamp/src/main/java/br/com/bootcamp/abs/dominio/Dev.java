package br.com.bootcamp.abs.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

/**
 * Representa um desenvolvedor que participa de um bootcamp.
 * Cada desenvolvedor tem um nome, conteúdos inscritos e conteúdos concluídos.
 * A classe fornece métodos para inscrever-se em um bootcamp, progredir nos conteúdos
 * e calcular a experiência total (XP) acumulada.
 */
@Getter
@Setter
public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    /**
     * Inscreve o desenvolvedor em um bootcamp.
     * Adiciona todos os conteúdos do bootcamp à lista de conteúdos inscritos do desenvolvedor
     * e adiciona o desenvolvedor à lista de inscritos do bootcamp.
     *
     * @param bootcamp o bootcamp em que o desenvolvedor será inscrito
     */
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    /**
     * Marca o próximo conteúdo inscrito como concluído.
     * Remove o conteúdo concluído da lista de conteúdos inscritos e adiciona à lista de conteúdos concluídos.
     * Se não houver conteúdos inscritos, exibe uma mensagem indicando que não há conteúdos matriculados.
     */
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.out.println("Você não está matriculado em nenhum conteúdo");
        }
    }

    /**
     * Calcula o total de experiência (XP) acumulada pelo desenvolvedor.
     * A experiência é a soma da XP de todos os conteúdos concluídos.
     *
     * @return o total de XP acumulado
     */
    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Dev dev = (Dev) obj;

        return Objects.equals(nome, dev.nome) &&
                Objects.equals(conteudosInscritos, dev.conteudosInscritos) &&
                Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }
}
