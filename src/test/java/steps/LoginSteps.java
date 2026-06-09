package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import util.factory.LoginFactory;
import util.model.Login;

public class LoginSteps {

    private RequestSpecification request;
    private Response response;
    private LoginFactory loginFactory = new LoginFactory();

    @Given("Eu quero acessar a url {string}")
    public void EuQueroAcessarAUrl(String url){
         request = RestAssured.given().baseUri(url).contentType(ContentType.JSON);
    }
    
    @And("Insiro email {string} username {string} e senha {string}")
    public void insiroEmailEUsernameESenha(String email, String username, String senha){
        Login login = loginFactory.createLogin(email, username, senha);
        request.body(login);
    }
    
    @When("Eu fizer login")
    public void EuFizerLogin(){
        response = request.post();
    }
    
    @Then("Consigo fazer login")
    @Then("Não consigo fazer login")
    public void consigoFazerLogin(){
        response.then().log().all().extract().response();
    }

    @And("O status code é {int}")
    public void eOStatusCodeÉ(int statusCode){
        Assertions.assertEquals(statusCode, response.statusCode());
    }
}