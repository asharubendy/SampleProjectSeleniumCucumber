package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.BeforeAll;
import webFunctions.seleniumCreator;

public class acceptanceCriteria {
    seleniumCreator sel = new seleniumCreator();

    @Given("I add {int} different products to my wishlist")
    public void iAddNDifferentProductsToMyWishlist(int arg0) throws InterruptedException {
        sel.given(arg0);
    }

    @When("I view my wishlist table")
    public void iViewMyWishlistTable() throws InterruptedException {
        sel.when();
    }

    @Then("I find total {int} selected item in my wishlist")
    public void iFindTotalNSelectedItemInMyWishlist(int arg0) {
        sel.then(arg0);
    }

    @When("I search for lowest price product")
    public void iSearchForLowestPriceProduct() {
    }

    @And("I am able to add the lowest price item to my cart")
    public void iAmAbleToAddTheLowestPriceItemToMyCart() {
    }

    @Then("I am able to verify the item in my cart")
    public void iAmAbleToVerifyTheItemInMyCart() {
    }
}
