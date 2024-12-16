# DriveNShop


**Kayque Allan Ribeiro Freitas, karfreitas@sga.pucminas.br**

**Kaio Mendes, kaio.mendes@sga.pucminas.br**

**Vinicius Zegarra, vinicius.palhares@sga.pucminas.br**

**Davi Vinícius Barbosa de Oliveira, davi.oliveira.1489055@sga.pucminas.br**

**Vinicius Oliveira Ramos, vinicius.ramos@sga.pucminas.br**

**Lucas Souza Aguiar, lsaguiar@sga.pucminas.br**

---

Professores:

** Prof. Aline Norberta de Brito **

** Prof. Eveline Alonso Veloso **

** Prof. Juliana Amaral Baroni de Carvalho **

---

_Curso de Engenharia de Software_

_Instituto de Informática e Ciências Exatas – Pontifícia Universidade Católica de Minas Gerais (PUC MINAS), Belo Horizonte – MG – Brasil_

---

**Resumo**. 

O projeto DriveNShop visa criar um marketplace inovador para a compra e venda de veículos, atuando como uma plataforma de intermediação que conecta compradores e vendedores de forma segura e eficiente. No contexto de um mercado automotivo brasileiro em recuperação e transformação, marcado pelo crescimento de veículos leves e pela entrada de novas marcas como BYD e Great Wall Motors, há uma necessidade crescente por soluções digitais robustas. O DriveNShop se propõe a enfrentar desafios enfrentados por plataformas existentes como OLX e Webmotors, como a falta de clareza nas informações dos veículos, comunicação ineficaz e riscos de fraudes. A plataforma permitirá que clientes atuem tanto como usuários quanto compradores, facilitando a negociação através da automação de processos como cadastro de clientes e veículos, comunicação simplificada e gestão de feedbacks. A implementação bem-sucedida deste sistema visa melhorar a experiência do usuário, estabelecer o DriveNShop como uma referência confiável no mercado automotivo e abordar desafios como a segurança de dados e a adaptação tecnológica. Com um foco claro em eficiência e confiança, o DriveNShop busca criar um ambiente de negociação mais seguro e acessível para todos os participantes.

---


## 1. Introdução

O projeto DriveNShop apresentará um marketplace inovador e confiável para
facilitar a compra e venda de veículos, proporcionando uma experiência segura,
eficiente e transparente com os clientes, servindo tanto para compradores quanto vendedores no mercado automotivo.

### 1.1 Contextualização

O mercado automotivo brasileiro, em 2024, mostra sinais de recuperação e transformação, apesar dos desafios econômicos globais. O mercado de veículos leves, por exemplo, cresceu 37,2% em abril, indicando uma recuperação robusta, embora ainda abaixo dos níveis recordes de 2019 [1.5]. Esse crescimento tem sido fortemente impulsionado pela entrada de marcas chinesas, como BYD e Great Wall Motors, que estão investindo massivamente no Brasil e transformando o mercado local, especialmente no segmento de veículos elétricos e híbridos [1.6].

Além disso, a flexibilização das taxas de juros pelo Banco Central do Brasil e a inflação sob controle têm aumentado a acessibilidade dos veículos, sustentando a demanda ao longo de 2024 [1.2]. As perspectivas são positivas, com previsões de crescimento contínuo, embora moderado, até 2023 [1.5].

### 1.2 Problema

O setor automotivo brasileiro enfrenta dificuldades nas suas execuções seguras e eficientes em suas aplicações. As plataformas digitais, como OLX e Webmotors, apresentam problemas como a falta de transparência nas informações dos veículos, o que pode levar a incertezas sobre a condição real dos veículos e impactar negativamente as decisões de compra [1.4]. Além disso, a comunicação entre compradores e vendedores frequentemente é ineficaz, com respostas lentas e informações insuficientes, o que complica a negociação e aumenta o risco de fraudes [1.4]. Sem tecnologia, a negociação ocorre por classificados impressos e feirões, métodos que são menos práticos e seguros, além de mais suscetíveis a erros e fraudes [1.1].

### 1.3 Objetivo geral

O objetivo principal deste projeto é desenvolver uma plataforma digital especializada que automatize os processos relacionados à compra e venda de veículos, promovendo uma experiência de negociação eficiente, segura e transparente para compradores e vendedores.

### 1.4 Objetivos específicos

- **Gerenciamento de usuários**:
Processo que permite a compradores e vendedores atualizarem, editarem ou excluírem suas informações cadastradas na       plataforma, garantindo o controle sobre seus dados pessoais e preferências.

- **Gerenciamento de veículos**
Funcionalidade que possibilita aos vendedores editar, atualizar ou remover anúncios de veículos, assegurando que as informações estejam sempre corretas e atualizadas.

- **Propostas**
Processo que permite aos compradores enviarem propostas aos vendedores, incluindo informações de contato. Essa funcionalidade facilita a comunicação para negociações externas à plataforma.

- **Gestão de Feedback e Avaliações**
Sistema que coleta e gerencia avaliações dos compradores sobre os vendedores. Os vendedores podem responder a essas avaliações, promovendo transparência e confiança. As avaliações ficam visíveis nos perfis dos vendedores, ajudando outros compradores a tomar decisões informadas.

### 1.4 Justificativas

Este projeto é justificado pela necessidade de superar as limitações enfrentadas por plataformas tradicionais de compra e venda de veículos, como a falta de transparência, a dificuldade de comunicação entre as partes e os riscos de fraudes, fatores que frequentemente resultam em experiências insatisfatórias. Com o uso da automação e foco em segurança, a plataforma proposta visa solucionar esses problemas, oferecendo maior clareza nas informações dos veículos anunciados, proteção de dados dos usuários e a simplificação do processo de negociação. Em um mercado automotivo brasileiro em transformação, o DriveNShop busca se destacar pela inovação, confiança e agilidade, atendendo às expectativas dos usuários e contribuindo para a modernização do setor.

## 2. Participantes do processo

O sucesso do DriveNShop depende da interação eficiente entre diferentes perfis de usuários-chave. Cada grupo tem necessidades e expectativas distintas, e entender essas características é essencial para desenvolver uma plataforma que atenda a todos de forma eficaz.

### 2.1 Usuário

Os usuários, se dividem em compradores e vendedores

Compradores:
**Perfil:**

- **Idade:** 25 a 60 anos.
- **Gênero:** Ambos os gêneros.
- **Aspectos Culturais:** Interessados em adquirir veículos novos ou usados, com uma crescente demanda por veículos elétricos e híbridos devido à conscientização ambiental.
- **Nível de Educação:** Diversificado, desde ensino médio até ensino superior.
- **Renda:** Médio a alto, variando conforme a capacidade de investimento em veículos.

**Papel:**

- **Objetivo:** Buscar e adquirir veículos que atendam às suas necessidades e orçamento.
- **Atividades:** Utilizar a plataforma para buscar veículos com base em filtros específicos (marca, modelo, preço, etc.), visualizar detalhes e fotos dos veículos, e negociar diretamente com os vendedores através do sistema de mensagens.
- **Expectativas:** Desejam uma experiência de compra simplificada, com informações claras e detalhadas sobre os veículos, e comunicação eficiente com os vendedores.

Vendedores

**Perfil:**

- **Idade:** 30 a 65 anos.
- **Gênero:** Ambos os gêneros.
- **Aspectos Culturais:** Inclui tanto proprietários individuais quanto concessionárias de veículos. A diversidade no portfólio de veículos (novos e usados) é significativa.
- **Nível de Educação:** Variado, de ensino médio a superior.
- **Renda:** Médio a alto, dependendo da natureza do negócio (individual ou concessionária).

**Papel:**

- **Objetivo:** Anunciar e vender veículos de forma eficiente.
- **Atividades:** Criar anúncios de veículos com detalhes precisos e fotos, responder a consultas de compradores, negociar preços e condições de venda, e agendar test drives ou inspeções.
- **Expectativas:** Buscam uma plataforma que facilite a criação de anúncios, permita uma comunicação clara com compradores potenciais e maximize a visibilidade de seus veículos.




## 3. Modelagem do processo de negócio

### 3.1. Análise da situação atual

Atualmente, o mercado automotivo brasileiro conta com diversas plataformas digitais para compra e venda de veículos, como OLX e Webmotors, que oferecem funcionalidades como o cadastro de veículos, busca por filtros e comunicação entre compradores e vendedores [1.3]. Essas plataformas ajudam a conectar rapidamente compradores e vendedores e facilitam a visualização de uma ampla gama de opções. No entanto, os sistemas existentes enfrentam desafios significativos na solução dos problemas que propõem resolver. A falta de transparência nas informações sobre os veículos é uma questão crítica, com dados frequentemente incompletos ou não verificados, o que pode gerar incertezas sobre a real condição dos veículos e impactar a decisão de compra [1.4].

Além disso, a comunicação nas plataformas digitais muitas vezes é ineficiente, com respostas lentas ou insuficientes que complicam a negociação e podem frustrar usuários. A ausência de mecanismos robustos para garantir a autenticidade e a segurança das transações também contribui para o risco de fraudes, como anúncios falsos ou veículos com problemas ocultos, o que continua sendo uma preocupação para muitos [1.4]. Esses problemas indicam que, apesar das melhorias tecnológicas, os sistemas atuais ainda enfrentam desafios na criação de um ambiente completamente seguro e transparente para transações automotivas online.

Sem o uso de tecnologia, as negociações de veículos são realizadas por meio de classificados impressos e feirões de veículos e redes de contato [1.1]. Esses métodos tradicionais, embora permitam uma interação mais direta e pessoal, são menos práticos e seguros. A falta de ferramentas digitais nesses métodos limita a acessibilidade e a transparência das transações, tornando o processo mais sujeito a erros e fraudes. Esses métodos exigem mais tempo e esforço para conectar compradores e vendedores e são menos eficientes em comparação com as soluções digitais modernas, destacando a necessidade de soluções mais integradas, seguras e ágeis no mercado automotivo [1.1].


### 3.2. Descrição geral da proposta de solução

A proposta de solução do **DriveNShop** visa transformar o mercado automotivo ao criar um ambiente de compra e venda de veículos mais transparente, simples e seguro aos negociadores. A plataforma se destaca ao não apenas conectar compradores e vendedores, mas ao atuar como um intermediário confiável que aprimora a experiência de negociação, garantindo transações fluidas e seguras. A seguir, detalharemos os limites da proposta, suas ligações com as estratégias e objetivos do negócio, e as oportunidades de melhorias.

### Limites da Proposta : 

#### Dependência da Tecnologia
- **Acesso e Usabilidade**: A eficácia do DriveNShop depende fortemente da tecnologia. Problemas técnicos ou falta de acesso à internet podem limitar o uso da plataforma, especialmente em áreas com infraestrutura limitada.
- **Adaptação do Usuário**: Embora a plataforma seja intuitiva, alguns usuários, especialmente os menos familiarizados com tecnologia, podem enfrentar dificuldades na adaptação e no uso eficiente das funcionalidades.

#### Segurança e Privacidade
- **Risco de Fraudes**: Apesar dos mecanismos de segurança e verificação, sempre há um risco potencial de fraudes e abusos. A segurança da informação e a proteção contra ataques cibernéticos são desafios constantes.
- **Privacidade de Dados**: A gestão e a proteção dos dados pessoais dos usuários são críticas. Qualquer falha na proteção desses dados pode comprometer a confiança na plataforma.

#### Qualidade e Atualização das Informações
- **Precisão das Informações**: A qualidade das descrições e informações dos veículos depende da precisão dos dados fornecidos pelos vendedores. Informações incorretas ou enganosas podem levar a problemas de confiança e insatisfação.
- **Verificação de Condição**: A plataforma não realiza inspeções físicas dos veículos. Portanto, a verificação da condição real dos veículos ainda depende da honestidade dos vendedores e da diligência dos compradores.

#### Competição e Saturação do Mercado
- **Concorrência**: O mercado de plataformas de compra e venda de veículos é altamente competitivo. Atrair e reter usuários pode ser desafiador, especialmente diante de plataformas já estabelecidas.
- **Adoção e Retenção**: A plataforma pode enfrentar dificuldades para conquistar uma base de usuários significativa e manter o engajamento ao longo do tempo.

### Ligações com Estratégias e Objetivos do Negócio :

#### Estratégia de Mercado
- **Foco em Transparência e Segurança**: A proposta do DriveNShop está alinhada com a estratégia de oferecer uma plataforma mais transparente e segura aos clientes, o que é essencial para conquistar a confiança dos usuários em um mercado tradicionalmente caracterizado por incertezas e fraudes.
- **Diferenciação Competitiva**: Ao proporcionar uma vitrine digital com informações completas e um sistema de comunicação direta, a plataforma se diferencia das soluções existentes, alinhando-se com a estratégia de oferecer valor agregado aos usuários.

#### Objetivos de Negócio
- **Facilitar Transações**: O objetivo de simplificar e agilizar o processo de compra e venda é atendido através das ferramentas de busca personalizada, comunicação direta e facilitação das transações.
- **Aumentar a Transparência**: Com descrições detalhadas e verificação de identidade, a proposta almeja aumentar a transparência, o que está diretamente ligado ao objetivo de criar um ambiente mais confiável para todas as partes envolvidas.

#### Estratégia de Crescimento
- **Expansão e Escalabilidade**: A plataforma está projetada para suportar crescimento e escalabilidade, permitindo a adição de novos recursos e funcionalidades à medida que o mercado evolui e as necessidades dos usuários mudam.

### Oportunidades de Melhorias :

#### Melhoria da Tecnologia e Usabilidade
- **Experiência do Usuário**: Investir em melhorias contínuas na interface e na experiência do usuário pode ajudar a superar barreiras tecnológicas e tornar a plataforma mais acessível para todos os perfis de usuários.
- **Aplicativos Móveis**: Desenvolver e otimizar aplicativos móveis pode aumentar o acesso e a usabilidade, permitindo que os usuários gerenciem suas transações de forma mais conveniente.

#### Segurança e Proteção de Dados
- **Tecnologia de Segurança**: Adotar tecnologias de segurança avançadas e realizar auditorias regulares pode ajudar a mitigar riscos de fraudes e proteger dados pessoais.
- **Educação do Usuário**: Fornecer orientações e informações sobre práticas seguras pode empoderar os usuários a proteger suas informações e a reconhecer possíveis fraudes.

#### Qualidade das Informações
- **Sistema de Avaliação e Feedback**: Implementar um sistema robusto de avaliação e feedback pode melhorar a qualidade das informações e aumentar a confiança na plataforma.
- **Parcerias de Inspeção**: Considerar parcerias com serviços de inspeção veicular para oferecer relatórios de condição dos veículos pode adicionar uma camada extra de confiança para os compradores.

#### Estratégias de Engajamento e Marketing
- **Campanhas de Marketing**: Investir em campanhas de marketing direcionadas pode ajudar a aumentar a visibilidade da plataforma e atrair novos usuários.
- **Programas de Fidelidade**: Implementar programas de fidelidade e recompensas pode ajudar a reter usuários e incentivá-los a usar a plataforma de forma mais frequente.

### Conclusão :
O site desenvolvido alcançou com sucesso seu objetivo de facilitar a negociação de compra e venda de veículos, oferecendo uma interface intuitiva e bem organizada para cadastro e busca de anúncios. O projeto destacou a importância de um planejamento estruturado e da realização de testes contínuos, resultando em um sistema funcional, eficiente e acessível, capaz de atender às necessidades dos usuários de forma prática e confiável.

Como perspectivas para o futuro, recomenda-se a criação de um aplicativo mobile, permitindo maior acessibilidade e conveniência aos usuários. Além disso, a integração com inteligência artificial para estimativa de preços pode agregar valor ao sistema, fornecendo informações mais precisas e úteis para as negociações. Outras propostas incluem a implementação de ferramentas para análise detalhada de anúncios, promovendo maior transparência e confiabilidade na plataforma.

O desenvolvimento deste projeto representou uma experiência altamente enriquecedora, oferecendo aprendizado prático e insights valiosos. Com potencial de impactar positivamente o mercado automotivo, o trabalho reforça a relevância de soluções tecnológicas inovadoras e centradas no usuário.

### 3.3. Modelagem dos processos

[PROCESSO 1 - Gerenciamento de Usuario](https://github.com/ICEI-PUC-Minas-PMGES-TI/pmg-es-2024-2-ti2-3687100-drivenshop/blob/main/docs/processo-1-Gerenciamento%20de%20Usuario.md)

[PROCESSO 2 - Gerenciamento de Veículos](https://github.com/ICEI-PUC-Minas-PMGES-TI/pmg-es-2024-2-ti2-3687100-drivenshop/blob/main/docs/processo-2-Gerenciamento%20de%20Ve%C3%ADculo.md)

[PROCESSO 3 - Propostas](https://github.com/ICEI-PUC-Minas-PMGES-TI/pmg-es-2024-2-ti2-3687100-drivenshop/blob/main/docs/processo-3-Propostas.md)

[PROCESSO 4 - Gestão de Feedback e Avaliações](https://github.com/ICEI-PUC-Minas-PMGES-TI/pmg-es-2024-2-ti2-3687100-drivenshop/blob/main/docs/processo-4-Gest%C3%A3o%20de%20Feedback%20e%20Avalia%C3%A7%C3%B5es.md)

## 4. Projeto da solução

_O documento a seguir apresenta o detalhamento do projeto da solução. São apresentadas duas seções que descrevem, respectivamente: modelo relacional e tecnologias._

[Projeto da solução](solution-design.md "Detalhamento do projeto da solução: modelo relacional e tecnologias.")


## 5. Indicadores de desempenho

_O documento a seguir apresenta os indicadores de desempenho dos processos._

[Indicadores de desempenho dos processos](performance-indicators.md)


## 6. Interface do sistema

_A sessão a seguir apresenta a descrição do produto de software desenvolvido._ 

[Documentação da interface do sistema](interface.md)

## 7. Conclusão

### Conclusão  

O site desenvolvido atingiu seu objetivo de facilitar a negociação de compra e venda de veículos, oferecendo uma interface intuitiva e bem organizada para cadastro e busca de anúncios. O projeto demonstrou a importância do planejamento e de testes constantes, resultando em um sistema funcional e de fácil uso.  

Como sugestões futuras, propõe-se a criação de um aplicativo mobile, integração com inteligência artificial para estimativa de preços, e adição de recursos para análise de anúncios. O trabalho foi uma experiência enriquecedora, com potencial de impacto positivo no mercado automotivo.

# REFERÊNCIAS

http://portal.pucminas.br/imagedb/documento/DOC_DSC_NOME_ARQUI20160217102425.pdf

# Referências

**[1.1]** AUTO CANGO. Portal dedicado a notícias e análises sobre o setor automotivo. Disponível em: [https://www.autocango.com.br](https://www.autocango.com.br). Acesso em: 25 ago. 2024.

**[1.2]** FITCH SOLUTIONS. Oferece análises e previsões econômicas, incluindo o impacto no mercado automotivo. Disponível em: [https://www.fitchsolutions.com](https://www.fitchsolutions.com). Acesso em: 25 ago. 2024.

**[1.3]** OLX. OLX Brasil. Disponível em: [https://www.olx.com.br/](https://www.olx.com.br/). Acesso em: 25 ago. 2024.

**[1.4]** DIGITAL DEALER. The power of transparency in used vehicle sales. Disponível em: [https://digitaldealer.com/sales-variable-ops/the-power-of-transparency-in-used-vehicle-sales/](https://digitaldealer.com/sales-variable-ops/the-power-of-transparency-in-used-vehicle-sales/). Acesso em: 25 ago. 2024.

**[1.5]** FEDERAÇÃO NACIONAL DA DISTRIBUIÇÃO DE VEÍCULOS AUTOMOTORES (FENABRAVE). Relatórios e estatísticas sobre o mercado automotivo brasileiro. Disponível em: [https://www.fenabrave.org.br](https://www.fenabrave.org.br). Acesso em: 3 set. 2024.

**[1.6]** JATO DYNAMICS. Análises e dados sobre o mercado automotivo global e local. Disponível em: [https://www.jato.com](https://www.jato.com). Acesso em: 3 set. 2024.

**[1.7]** CARROS NA WEB. Portal especializado em análises e tendências do mercado automotivo. Disponível em: [https://www.carrosnaweb.com.br](https://www.carrosnaweb.com.br). Acesso em: 1 set. 2024.

**[1.8]** ANFAVEA. Associação Nacional dos Fabricantes de Veículos Automotores. Disponível em: [https://www.anfavea.com.br](https://www.anfavea.com.br). Acesso em: 3 set. 2024.



# APÊNDICES

## Apêndice A - Código fonte

[Código do front-end](../src/frontend) -- repositório do código do front-end

[Código do back-end](../src/back)  -- repositório do código do back-end


## Apêndice B - Apresentação final


[Slides da apresentação final](slides.pdf)


[Vídeo da apresentação final](video/)






