package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;

public class LoginSteps {

    private RequestSpecification request;
    private Response response;

    @Given("Eu quero acessar a url {string}")
    public void EuQueroAcessarAUrl(String url){
         request = RestAssured.given().baseUri(url).contentType(ContentType.JSON);
    }
    
    @And("Insiro username {string} e senha {string} corretos")
    public void insiroUsernameESenhaCorretos(String username, String senha){
        String payload = String.format("{\"email\": \"%s\", \"loginPassword\": \"%s\", \"loginUser\": \"%s\"}", "", senha, username);
        request.body(payload);
    }
    
    @When("Eu fizer login")
    public void EuFizerLogin(){
        response = request.post();
    }
    
    @Then("Consigo fazer login e o status code é {int}")
    public void consigoFazerLoginEOStatusCodeÉ(int statusCode){
        Assertions.assertEquals(statusCode, response.statusCode());
    }
}