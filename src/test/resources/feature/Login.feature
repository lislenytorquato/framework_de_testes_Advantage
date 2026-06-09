Feature: Login
  Scenario: Fazer login com username e senha corretos
    Given Eu quero acessar a url "https://www.advantageonlineshopping.com/accountservice/accountrest/api/v1/login"
    And Insiro email "123TEST_@hotmail.com" username "maria_silva" e senha "mS123TEST"
    When Eu fizer login
    Then Consigo fazer login
    And O status code é 200

  Scenario: Fazer login com username errado e senha correta
    Given Eu quero acessar a url "https://www.advantageonlineshopping.com/accountservice/accountrest/api/v1/login"
    And Insiro email "123TEST_@hotmail.com" username "maria" e senha "mS123TEST"
    When Eu fizer login
    Then Não consigo fazer login
    And O status code é 403

  Scenario: Fazer login com username correto e senha errada
    Given Eu quero acessar a url "https://www.advantageonlineshopping.com/accountservice/accountrest/api/v1/login"
    And Insiro email "123TEST_@hotmail.com" username "maria_silva" e senha "mS123TEST13"
    When Eu fizer login
    Then Não consigo fazer login
    And O status code é 403

  Scenario: Fazer login sem username e com senha errada
    Given Eu quero acessar a url "https://www.advantageonlineshopping.com/accountservice/accountrest/api/v1/login"
    And Insiro email "123TEST_@hotmail.com" username "" e senha "mS123TE"
    When Eu fizer login
    Then Não consigo fazer login
    And O status code é 403

  Scenario: Fazer login sem username e com senha correta
    Given Eu quero acessar a url "https://www.advantageonlineshopping.com/accountservice/accountrest/api/v1/login"
    And Insiro email "123TEST_@hotmail.com" username "" e senha "mS123TEST"
    When Eu fizer login
    Then Não consigo fazer login
    And O status code é 403

  Scenario: Fazer login com username errado e sem senha
    Given Eu quero acessar a url "https://www.advantageonlineshopping.com/accountservice/accountrest/api/v1/login"
    And Insiro email "123TEST_@hotmail.com" username "maria" e senha ""
    When Eu fizer login
    Then Não consigo fazer login
    And O status code é 403

  Scenario: Fazer login com username correto e sem senha
    Given Eu quero acessar a url "https://www.advantageonlineshopping.com/accountservice/accountrest/api/v1/login"
    And Insiro email "123TEST_@hotmail.com" username "maria_silva" e senha ""
    When Eu fizer login
    Then Não consigo fazer login
    And O status code é 403

  Scenario: Fazer login sem username e sem senha
    Given Eu quero acessar a url "https://www.advantageonlineshopping.com/accountservice/accountrest/api/v1/login"
    And Insiro email "123TEST_@hotmail.com" username "" e senha ""
    When Eu fizer login
    Then Não consigo fazer login
    And O status code é 403

  Scenario: Fazer login com username e senha não cadastrados
    Given Eu quero acessar a url "https://www.advantageonlineshopping.com/accountservice/accountrest/api/v1/login"
    And Insiro email "x@hotmail.com" username "x" e senha "xxxxXx123"
    When Eu fizer login
    Then Não consigo fazer login
    And O status code é 403

  Scenario: Fazer login com endpoint inexistente
    Given Eu quero acessar a url "https://www.advantageonlineshopping.com/accountservice/accountrest/api/v1/endpoint_inexistente"
    And Insiro email "x@hotmail.com" username "x" e senha "xxxxXx123"
    When Eu fizer login
    Then Não consigo fazer login
    And O status code é 404