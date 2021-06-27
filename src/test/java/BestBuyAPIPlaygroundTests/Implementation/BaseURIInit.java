package BestBuyAPIPlaygroundTests.Implementation;

import net.serenitybdd.rest.SerenityRest;

public class BaseURIInit {

    public void BaseURI()
    {
        SerenityRest.rest().baseUri("http://localhost:8080");
    }
}
