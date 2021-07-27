package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;

    @FindBy(css="div a[class='cc-btn cc-accept-all cc-btn-no-href']")
    public WebElement acceptAll;

    @FindBy(css = "div[data-elementor-type='wp-post'] section:nth-child(6)  > div >div> div div[class='elementor-tabs'] > div:nth-child(2) > div:nth-child(2) ul li:nth-child(1) div[class='product-wishlist'] span")
    public WebElement addWishListBikini;

    @FindBy(css = "div[data-elementor-type='wp-post'] section:nth-child(6)  > div >div> div div[class='elementor-tabs'] > div:nth-child(2) > div:nth-child(2) ul li:nth-child(2) div[class='product-wishlist'] span")
    public WebElement addWishListHardTop;

    @FindBy(css = "div[data-elementor-type='wp-post'] section:nth-child(6)  > div >div> div div[class='elementor-tabs'] > div:nth-child(2) > div:nth-child(2) ul li:nth-child(4) div[class='product-wishlist'] span")
    public WebElement addWishListSingleShirt;

    @FindBy(css="div[class='elementor-tabs-wrapper'] div:nth-child(2)")
    public WebElement tabMensClothing;

    @FindBy(css = "div[data-elementor-type='wp-post'] section:nth-child(6)  > div >div> div div[class='elementor-tabs'] > div:nth-child(2) >div:nth-child(4) ul li:nth-child(2) div[class='product-wishlist'] a span")
    public WebElement addWishListBlackTrousers;

    @FindBy(css = "div[class='elementor-tabs-content-wrapper'] >div:nth-child(4) ul>li:nth-child(1) div[class='product-wishlist'] a span")
    public WebElement addWishlistBlackPants;

    @FindBy(css = "div[class='heading-row row'] a[title='Wishlist'] i[class='lar la-heart']")
    public WebElement wishlist;

    @FindBy(xpath="//*[@id='elementor-tab-content-9292']//ul/li[3]//div//a/span")
    public WebElement addWishlistEveningTrousers;

    @FindBy(css="div[class='elementor-tabs-wrapper'] div:nth-child(3)")
    public WebElement tabWatches;

    @FindBy(css="div[class='elementor-tabs-content-wrapper'] >div:nth-child(6) ul li:nth-child(2) div[class='product-wishlist'] a span")
    public WebElement addToWishlistWatchModern;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void addProductsToWishlist() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,550)");
        WebDriverWait wait = new WebDriverWait(driver,30);
        acceptAll.click();
        addWishListBikini.click();
        wait.until(ExpectedConditions.textToBePresentInElement(addWishListBikini, "Product added!"));
        addWishListHardTop.click();
        wait.until(ExpectedConditions.textToBePresentInElement(addWishListHardTop, "Product added!"));
        //addWishListSingleShirt.click();
       jse.executeScript("arguments[0].click();", addWishListSingleShirt);
        wait.until(ExpectedConditions.textToBePresentInElement(addWishListSingleShirt, "Product added!"));
        tabMensClothing.click();
        addWishListBlackTrousers.click();
     //   wait.until(ExpectedConditions.textToBePresentInElement(addWishListBlackTrousers, "Product added!"));
//        addWishlistEveningTrousers.click();
//       jse.executeScript("arguments[0].click();", addWishlistEveningTrousers);
//        wait.until(ExpectedConditions.textToBePresentInElement(addWishlistEveningTrousers, "Product added!"));

       // jse.executeScript("window.scrollBy(0,-550)");

    }

    public void clickWishList(){
        wishlist.click();
    }
}
