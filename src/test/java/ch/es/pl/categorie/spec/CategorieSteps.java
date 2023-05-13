package ch.es.pl.categorie.spec;

import org.openapitools.client.api.CategoriesApi;
import org.openapitools.client.api.CategorieEndPointApi;


public class CategorieSteps {

    private final CategorieEndPointApi api = new CategorieEndPointApi();
    private Categorie categorie;
    private int statusCode;

    @Given("I have an categorie payload")
    public void i_have_an_categorie_payload() throws Throwable {
        categorie = new Categorie();
        /*categorie.setAuthor("Coluche");
        categorie.setCitation("Se pencher sur son passé, c'est risquer de tomber dans l'oubli.");*/
    }

    @When("I POST it to the \\/categories endpoint")
    public void i_POST_it_to_the_categories_endpoint() throws Throwable {
        try {
            ApiResponse response = api.addCategorieWithHttpInfo(categorie);
            statusCode = response.getStatusCode();
        } catch (ApiException e) {
            statusCode = e.getCode();
        }
    }

    @Then("I receive a {int} status code")
    public void i_receive_a_status_code(int arg1) throws Throwable {
        assertEquals(arg1, statusCode);
    }
}