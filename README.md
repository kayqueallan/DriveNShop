# DriveNShop

O objetivo deste trabalho é desenvolver um sistema para automação de processos que viabilize um marketplace especializado em veículos, facilitando a compra e venda de automóveis com foco em proporcionar uma experiência de negociação eficiente, segura e transparente para compradores e vendedores.

## Integrantes

* Vinicius Oliveira Ramos
* Kayque Allan Ribeiro Freitas
* Lucas Sousa Aguiar
* Davi Vinícius Barbosa de Oliveira
* Kaio Mendes Araujo Ribeiro
* Vinicius Zegarra Palhares

## Professores

* Juliana Amaral Baroni de Carvalho
* Eveline Alonso Veloso
* Aline Norberta de Brito

## Instruções de Utilização

Para executar o projeto DriveNShop, siga as etapas abaixo:

#### Pré-requisitos

1. **Docker**: O Docker deve estar instalado no seu sistema. Se não tiver o Docker, siga as instruções de instalação no [site oficial do Docker](https://docs.docker.com/get-docker/).

2. **Java 21**: O Java 21 deve estar instalado. Caso não tenha o Java 21, instale-o a partir do [site oficial da Oracle](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html) ou use o OpenJDK.

3. **Maven**: O Maven é necessário para gerenciar as dependências e construir o projeto. Você pode instalar o Maven a partir do [site oficial do Apache Maven](https://maven.apache.org/install.html).

4. **Docker Compose**: O Docker Compose é necessário para gerenciar os containers. Para instalar, siga as instruções em [Docker Compose Installation](https://docs.docker.com/compose/install/).

## Como executar a aplicação:

### Passo 1: Clone o repositório

Clone o repositório do projeto DriveNShop para o seu ambiente local.

**``bash
git clone <URL_do_repositório>
cd DriveNShop**

### Passo 2: Compilação do projeto

Compile o projeto utilizando Maven. Certifique-se de que o Maven está instalado corretamente e que o JAVA_HOME está configurado para Java 21.

-> **mvn clean install**

### Passo 3: Configuração do Docker
Dentro da pasta do projeto, crie os containers necessários para a aplicação utilizando o Docker Compose. Isso irá configurar o ambiente com os serviços necessários para o funcionamento do sistema.

-> **docker-compose up -d**

Este comando iniciará os containers em segundo plano (-d significa "detached mode").

### Passo 4: Acessando a aplicação
Após iniciar os containers, a aplicação estará disponível em um navegador na URL configurada no arquivo de configuração (geralmente em localhost ou 127.0.0.1). Verifique se o sistema foi inicializado corretamente ao acessar a interface.

# Histórico de Versões

## Versão 0.0.1
**Descrição**:  
- **Documentação**: A primeira versão do projeto, focada em detalhar a proposta e os objetivos do sistema. Inclui uma visão geral do DriveNShop e sua proposta de valor. O principal foco foi a descrição da plataforma e das funcionalidades planejadas para o marketplace de veículos.

## Versão 0.1.0 
**Descrição**:  
- **Modelagem de Processos**: Definição dos processos principais da plataforma. Inclui as etapas de cadastro de usuários, listagem de veículos, negociação e fechamento de vendas, além de outras interações essenciais.  
- **Atualização da Documentação**: A documentação foi ajustada para refletir as mudanças realizadas na modelagem dos processos e a descrição detalhada das funcionalidades planejadas.

## Versão 0.1.1
**Descrição**:  
- **Modelo Relacional**: Primeira versão do modelo de dados do sistema, com foco na definição de tabelas e relacionamentos entre usuários, veículos, negociações e avaliações.  
- **Atualização de Documentação**: A documentação foi atualizada para incluir detalhes sobre o modelo relacional e as integrações entre os diferentes componentes do sistema.

## Versão 0.1.2
**Descrição**:  
- **Front-End do Primeiro Processo**: Implementação da interface para o Cadastro de Usuários e Cadastro de Veículos, facilitando a interação do usuário com o sistema.  
- **Back-End do Segundo Processo**: Desenvolvimento da lógica para o processo de Negociação de Propostas. Foi integrado o sistema de mensagens e feedbacks entre compradores e vendedores.  
- **Atualização da Documentação**: A documentação foi atualizada para refletir as mudanças feitas no front-end e back-end, incluindo detalhes de como os processos de negociação funcionam.  
- **Atualização de Modelagem de Processos e Modelo Relacional**: Melhoria no processo de busca, com novos campos de pesquisa e relacionamento entre veículos e filtros.

## Versão 0.1.3
**Descrição**:  
- **Front-End do Segundo Processo**: Conclusão da interface de Gestão de Feedback e Avaliações, permitindo que os usuários possam avaliar as transações realizadas.  
- **Back-End do Segundo Processo**: Implementação da lógica de Gestão de Feedback e Avaliações, permitindo o armazenamento e o processamento das avaliações dos usuários.  
- **Atualização da Documentação**: Documentação atualizada para descrever a nova funcionalidade de feedback, detalhando como os dados são processados e exibidos.  
- **Atualização de Modelagem de Processos e Modelo Relacional**: Melhoria no processo de busca, com novos campos de pesquisa e relacionamento entre veículos e filtros.  
- **Integração**: Integração da funcionalidade de feedback com o processo de negociação, permitindo que as avaliações influenciem a reputação dos usuários.

## Versão 0.1.4
**Descrição**:  
- **Front-End do Terceiro Processo**: Finalização da tela de Consulta de Veículo, permitindo aos usuários buscar e visualizar veículos listados no marketplace.  
- **Back-End do Terceiro Processo**: Implementação da lógica para Busca e Filtro de Veículos, com filtros de pesquisa como marca, modelo, ano, entre outros.  
- **Atualização da Documentação**: A documentação foi atualizada para refletir as novas funcionalidades de busca e filtro, bem como os detalhes técnicos de implementação.  
- **Atualização de Modelagem de Processos e Modelo Relacional**: Melhoria no processo de busca, com novos campos de pesquisa e relacionamento entre veículos e filtros.  
- **Integração**: A interface de consulta de veículos foi integrada com a lógica de busca no back-end, permitindo resultados dinâmicos conforme os filtros aplicados.

## Versão 0.1.5
**Descrição**:  
- **Front-End do Quarto Processo**: Criação da interface de Edição de Veículos, permitindo aos vendedores editar informações dos veículos listados.  
- **Back-End do Quarto Processo**: Implementação da lógica de Edição de Veículos, permitindo que os vendedores atualizem os dados de seus anúncios.  
- **Atualização da Documentação**: A documentação foi atualizada para incluir informações sobre a edição de veículos, tanto na interface quanto no backend.  
- **Atualização de Modelagem de Processos e Modelo Relacional**: Melhoria no processo de busca, com novos campos de pesquisa e relacionamento entre veículos e filtros.  
- **Integração**: A edição de veículos foi integrada com o processo de listagem, permitindo que as alterações sejam refletidas nas visualizações de anúncios.

## Versão 0.1.6
**Descrição**:  
- **Indicadores de Desempenho**: Implementação dos indicadores para medir o desempenho do sistema, como Tempo Médio para Fechamento de Negócio, Avaliação Média de Satisfação e Tempo Médio de Resposta em Mensagens.  
- **Atualização da Documentação**: A documentação foi atualizada para incluir a descrição dos indicadores de desempenho e como esses são calculados e utilizados.  
- **Atualização de Modelagem de Processos e Modelo Relacional**: Melhoria no processo de busca, com novos campos de pesquisa e relacionamento entre veículos e filtros.  
- **Integração**: Implementação dos indicadores no painel administrativo, permitindo que os usuários e administradores acompanhem o desempenho do sistema em tempo real.

## Versão Final
**Descrição**:  
- **Finalização do Sistema**: O sistema foi completamente integrado, com todos os processos de compra e venda de veículos funcionando de forma eficiente e segura.  
- **Front-End e Back-End**: Todos os processos foram implementados e integrados entre si, com as interfaces de cadastro, negociação, avaliação, busca e edição de veículos completamente funcionais.  
- **Indicadores de Desempenho**: Todos os indicadores de desempenho estão operacionais, oferecendo insights sobre o uso da plataforma e desempenho das transações.  
- **Atualização de Documentação**: A documentação foi finalizada e inclui todas as funcionalidades, integrações e modelos utilizados no sistema.  
- **Conclusão**: O DriveNShop está pronto para ser utilizado como um marketplace especializado em veículos, com foco na experiência do usuário e eficiência nas negociações.
