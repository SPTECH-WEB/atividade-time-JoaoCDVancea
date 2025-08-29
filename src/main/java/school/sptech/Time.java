package school.sptech;

public class Time {
    String nome;
    Integer vitorias, empates, derrotas;

    public Time() {
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
    }

    public Time(Integer vitorias, Integer empates, Integer derrotas, String nome) {
        this.nome = nome;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
    }

    public void registrarVitoria() {
        vitorias++;
    }

    public void registrarEmpate() {
        empates++;
    }

    public void registrarDerrota() {
        derrotas++;
    }

    public Integer getPontos() {
        return (vitorias * 3) + empates;
    }

    public Integer getTotalPartidas() {
        return vitorias + empates + derrotas;
    }

    public Integer getAproveitamento() {
        Integer totalPartidas = getTotalPartidas();

        return  (int) (((double) this.vitorias / totalPartidas) * 100);
    }

    public void compararAproveitamento(Time adversario) {

        Integer aproveitamentoTime = getAproveitamento();
        Integer aproveitametnoTimeAdversario = adversario.getAproveitamento();

        String timeMaiorAproveitamento = (aproveitamentoTime > aproveitametnoTimeAdversario) ? this.nome : adversario.nome;
        String timeMenorAproveitamento = (aproveitamentoTime > aproveitametnoTimeAdversario) ? adversario.nome : this.nome;

        System.out.printf("O time %s tem um aproveitamento maior que o time %s", timeMaiorAproveitamento, timeMenorAproveitamento);
    }

    public void exibirInformacoes() {
        System.out.printf("""
                Time: %s
                Vitórias: %d
                Empates: %d
                Derrotas: %d
                
                Pontos: %d
                Total de partidas: %d
                Aproveitamento: %d%%
                
                ---
                """, nome, vitorias, empates, derrotas, getPontos(), getTotalPartidas(), getAproveitamento());
    }
}
