package BestBuyAPIPlaygroundTests.Implementation;

import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class BestBuyAPIPlaygroundStepDefinitions {

    @When("GetServices API is called list of services are returned")

@Step
    public void retrieveservices()
    {
        SerenityRest.given().header("Accept", "application/json").
                when().
                get("/services").then().statusCode(200);
    }

    @When("PostService API is called service is created")

    @Step
    public void createservice()
    {
        SerenityRest.given().header("Accept", "application/json").contentType("application/json")
                .body("{\n" +
                        "  \"name\": \"CVBLATESTSERVICE\"\n" +
                        "}").when().
                post("/services").then();
    }

    @When("GetProducts API is called list of products are returned")

    @Step
    public void retrieveproducts()
    {
        SerenityRest.given().header("Accept", "application/json").
                when().
                get("/products").then().log().all().statusCode(200);
    }

    @When("PostProduct API is called product is created")

    @Step
    public void createproduct()
    {
        SerenityRest.given().header("Accept", "application/json").contentType("application/json")
                .body("{\n" +
                        "      \"name\": \"TESTDuracell - AA 1.5V CopperTop Batteries (4-Pack)\",\n" +
                        "      \"type\": \"TESTHardGood\",\n" +
                        "      \"price\": 5.00,\n" +
                        "      \"shipping\": 8,\n" +
                        "      \"upc\": \"041543415017\",\n" +
                        "      \"description\": \"TESTLong PDAs and more\",\n" +
                        "      \"manufacturer\": \"TESTDuracell\",\n" +
                        "      \"model\": \"TTTMN1500B4Z\",\n" +
                        "      \"url\": \"http://www.bestbuy.com/site/duracell-aa-1-5v-coppertop-batteries-4-pack/48530.p?id=1099385268988&skuId=48530&cmp=RMXCC\",\n" +
                        "      \"image\": \"http://img.bbystatic.com/BestBuy_US/images/products/4853/48530_sa.jpg\"\n" +
                        "}")
                .when().
                post("/products").then().log().all();
    }
    @When("GetCategories API is called list of categories are returned")

    @Step
    public void retrievecategories()
    {
        SerenityRest.given().header("Accept", "application/json").
                when().
                get("/categories").then().log().all().statusCode(200);
    }
    @When("PostCategory API is called category is created")

    @Step
    public void createcategory()
    {
        SerenityRest.given().header("Accept", "application/json").contentType("application/json")
                .body("{\n" +
                        "  \"name\": \"ABCTESTCATEGORY\",\n" +
                        "  \"id\": \"0555555\"\n" +
                        "}")
                .when().
                post("/categories").then().log().all();
    }
}
