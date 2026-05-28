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

public class LoginSteps {

    private RequestSpecification request;
    private Response response;
    private LoginFactory loginFactory;

    @Given("Eu quero acessar a url {string}")
    public void EuQueroAcessarAUrl(String url){
         request = RestAssured.given().baseUri(url).contentType(ContentType.JSON);
    }
    
    @And("Insiro username {string} e senha {string} corretos")
    public void insiroUsernameESenhaCorretos(){
        String payload = String.format("{\"email\": \"%s\", \"loginPassword\": \"%s\", \"loginUser\": \"%s\"}", "",
                loginFactory.returnLogin().getLoginPassword(), loginFactory.returnLogin().getLoginUser() );
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