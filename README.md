## Framework de Testes
Este é um projeto de 4 testes diferentes:
api, web, mobile, e performance. 
Onde todos compartilham a mesma massa de dados,
exceto performance. E o escopo escolhido para testes é o login.
Do site Advantage Shopping Online Demo: 
* [Advantage Shopping WEB](https://advantageonlineshopping.com/#/)
* [Advantage Shopping API](https://www.advantageonlineshopping.com/api/docs/)
 

## Ideia Inicial:

### Arquitetura e Tech Stack

* Front-end Web: Cypress 
* Back-end (API): Java + RestAssured + JUnit 5.
* Mobile: Appium (Java) + Selenium Grid.
* Mocks de Serviços: WireMock (para simular gateways de pagamento).
* Massa de Dados: Scripting em Python (Pandas/Faker) para gerar arquivos CSV/SQL.
* Performance: JMeter (testes de estresse nos endpoints).
* BDD: Cucumber (integrado ao Java e Cypress).
* CI/CD: Jenkins (Pipeline-as-Code).

### TESTE DE API COM REST ASSURED E CUCUMBER

#### FERRAMENTAS
* Maven
* Rest Assured
* Cucumber
* Java 24
* Pipeline github actions 