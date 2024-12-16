## 5. Indicadores de desempenho

| Indicador                          | Objetivos                                           | Descrição                                                         | Fonte de Dados     | Fórmula de Cálculo                                                                       |
|------------------------------------|-----------------------------------------------------|-------------------------------------------------------------------|---------------------|------------------------------------------------------------------------------------------|
| **Avaliação Média de Satisfação**  | Monitorar a satisfação dos usuários com as transações | Média das avaliações dadas pelos usuários após uma negociação    | Tabela Feedback    | `SUM(avaliacao) / Número de feedbacks`                                                   |
| **Percentual de Veículos com Propostas**| Monitorar o percentual de veículos com propostas        | Percentual de veículos com pelo menos uma proposta enviada por compradores | Tabela Veículo  | `(Número de veículos com Proposta > 0 / Número total de veículos) * 100`             |
| **Média de Proposta por Veiculo** | Monitorar a media de propostas enviadas por veiculo | Calculo médio, de propostas enviadas para um único veículo | Tabela Propostas | `Número total de propostas / Número total de veiculos`                                           |

