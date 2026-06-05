Feature: Login
Scenario: Fazer login com username e senha corretos
  Given Eu quero acessar a url "https://www.advantageonlineshopping.com/accountservice/accountrest/api/v1/login"
  And Insiro email "123TEST_@hotmail.com" username "maria_silva" e senha "mS123TEST" corretos
  When Eu fizer login
  Then Consigo fazer login e o status code é 200