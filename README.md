# Framework de Testes - Advantage Shopping

Este projeto tem como foco testes automatizados para o site `Advantage Shopping Online Demo`, com foco no escopo de login.

Links do ambiente de testes:
* [`Advantage Shopping API`](https://www.advantageonlineshopping.com/api/docs/)
* [`Advantage Shopping WEB`](https://advantageonlineshopping.com/#/)

## Arquitetura e Tecnologias

O projeto atual implementa testes de API com as seguintes ferramentas e tecnologias:

* Linguagem: `Java 17`
* Build Tool: `Gradle`
* Framework de Testes: `JUnit 5`
* Testes de API: `Rest Assured`
* BDD: `Cucumber`
* Geracao de Massa de Dados: `Datafaker`
* Integracao Continua (CI): `GitHub Actions`

## Como Executar os Testes

Para rodar os testes localmente, voce precisa ter o `Java 17` instalado na sua maquina. 

A execucao e feita atraves do `Gradle Wrapper` nativo no projeto:

No Linux ou macOS:
```bash
./gradlew test
```

No Windows:
```cmd
gradlew.bat test
```

Apos a execucao, o relatorio HTML do Cucumber ficara disponivel em:
`build/reports/cucumber/report.html`
