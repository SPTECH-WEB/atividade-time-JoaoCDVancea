[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/c3uKte28)
[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/Tqve7Fv2)
# Sistema de Gerenciamento de Desempenho de Times de Voleibol 🏐

Crie um sistema que permita gerenciar o desempenho de um time de voleibol. O sistema deve ser capaz
de registrar os resultados de jogos (vitórias, empates e derrotas), calcular o total de pontos e o
aproveitamento do time, além de comparar o desempenho entre diferentes times. Também deve exibir
todas as informações relevantes sobre o time.

## Especificações de Campos

A classe `Time` deve conter os seguintes campos:

- **nome** (String): O nome do time.
- **vitorias** (Integer): O número de vitórias acumuladas pelo time.
- **empates** (Integer): O número de empates acumulados pelo time.
- **derrotas** (Integer): O número de derrotas acumuladas pelo time.

> **Nota:** Os campos `vitorias`, `empates`, e `derrotas` devem ser inicializados com o valor `0`
> quando o objeto `Time` for criado.

## Métodos

O sistema deve incluir os seguintes métodos:

1. **void registrarVitoria()**
    - **Descrição:** Incrementa o número de vitórias do time em 1.

2. **void registrarEmpate()**
    - **Descrição:** Incrementa o número de empates do time em 1.

3. **void registrarDerrota()**
    - **Descrição:** Incrementa o número de derrotas do time em 1.

4. **Integer getPontos()**
    - **Descrição:** Retorna o total de pontos acumulados pelo time. Cada vitória equivale a 3
      pontos e cada empate equivale a 1 ponto.

5. **Integer getTotalPartidas()**
    - **Descrição:** Retorna o total de partidas disputadas pelo time, somando vitórias, empates e
      derrotas.

6. **Integer getAproveitamento()**
    - **Descrição:** Retorna o percentual de vitórias em relação ao total de partidas disputadas.

7. **void compararAproveitamento(Time adversario)**
    - **Descrição:** Compara o aproveitamento do time com o de outro time passado como parâmetro e
      exibe mensagens indicando qual time tem o melhor desempenho.

8. **void exibirInformacoes()**
    - **Descrição:** Exibe todas as informações sobre o time, incluindo nome, número de vitórias,
      empates, derrotas, pontos, total de partidas, e aproveitamento.

## Cálculo de Aproveitamento

O aproveitamento é calculado utilizando a seguinte fórmula:

```bash
Aproveitamento = (Vitórias / Total de Partidas) * 100
```

Essa fórmula retorna a porcentagem de vitórias em relação ao número total de partidas jogadas.

## Exemplos de Saída

### Exemplo 1:

```plaintext
Time: Estrela do Norte
Vitórias: 10
Empates: 5
Derrotas: 2

Pontos: 35
Total de Partidas: 17
Aproveitamento: 58%

---

Time: Águia Branca
Vitórias: 7
Empates: 4
Derrotas: 6

Pontos: 25
Total de Partidas: 17
Aproveitamento: 41%

---

O time Estrela do Norte tem um aproveitamento maior que o time Águia Branca.
```

### Exemplo 2:

```plaintext
Time: Vento Forte
Vitórias: 2
Empates: 3
Derrotas: 12

Pontos: 9
Total de Partidas: 17
Aproveitamento: 11%

---

Time: Maré Alta
Vitórias: 5
Empates: 5
Derrotas: 7

Pontos: 20
Total de Partidas: 17
Aproveitamento: 29%

---

O time Maré Alta tem um aproveitamento maior que o time Vento Forte.
```

### Exemplo 3:

```plaintext
Time: Rocha Sólida
Vitórias: 4
Empates: 3
Derrotas: 10

Pontos: 15
Total de Partidas: 17
Aproveitamento: 23%

---

Time: Fogo Ardente
Vitórias: 4
Empates: 5
Derrotas: 8

Pontos: 17
Total de Partidas: 17
Aproveitamento: 23%

---

Os times Rocha Sólida e Fogo Ardente têm o mesmo aproveitamento.
```

### Implementação Sugerida

Utilize a especificação acima para implementar a classe `Time`, garantindo que todos os métodos e
campos sejam corretamente inicializados e manipulados conforme descrito. A implementação deve ser
capaz de produzir saídas como as mostradas nos exemplos, utilizando interpolação de strings para
exibir as informações do time.