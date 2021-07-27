package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {


    WebDriver driver;


    @FindBy(css = "div[class='site-header container-fluid'] div[class='header-cart'] [class='la la-shopping-bag']")
    public WebElement cart;

    @FindBy(css = "tbody tr td[class='product-quantity'] input")
    public WebElement productInCart;

    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String verifyProductInCart(){
        cart.click();
        return productInCart.getAttribute("value");
    }
}
