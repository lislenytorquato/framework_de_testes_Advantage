Feature: Login
Scenario: Fazer login com username e senha corretos
  Given Eu quero acessar a url "https://www.advantageonlineshopping.com/accountrest/api/v1/login"
  And Insiro username "username" e senha "senha" corretos
  When Eu fizer login
  Then Consigo fazer login e o status code é 200