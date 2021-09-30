package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webFunctions.seleniumCreator;

public class acceptanceCriteria {
    seleniumCreator sel = new seleniumCreator();

    @Given("I add {int} different products to my wishlist")
    public void iAddNDifferentProductsToMyWishlist(int arg0){
        sel.addProducts(arg0);
    }

    @When("I view my wishlist table")
    public void iViewMyWishlistTable(){
        sel.viewWishlist();
    }

    @Then("I find total {int} selected item in my wishlist")
    public void iFindTotalNSelectedItemInMyWishlist(int arg0) {
        sel.findTotalProducts(arg0);
    }

    @When("I search for lowest priced product")
    public void iSearchForLowestPriceProduct() {
        sel.searchForLowestPricedProduct();
    }

    @And("I am able to add the lowest price item to my cart")
    public void iAmAbleToAddTheLowestPriceItemToMyCart() {
        sel.addLowestPricedItemToCart();
    }

    @Then("I am able to verify the item in my cart")
    public void iAmAbleToVerifyTheItemInMyCart() throws InterruptedException {
        sel.verifyItemIsInCart();
    }
}
