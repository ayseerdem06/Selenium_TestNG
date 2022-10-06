package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SearcProductPage {

    public SearcProductPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement products;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement allPruductTitle;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchPruduct;


    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement submitSearch;

    @FindBy(xpath = " //h2[@class='title text-center']")
    public WebElement textCenter;

    @FindBy(xpath = "//*[@style='color: brown;']")
    public WebElement viewPruduct;

    @FindBy(xpath = "//*[@class='newarrival']")
    public WebElement blueTop;

    @FindBy(xpath = "//*[@class='product-image-wrapper']")
    public List<WebElement> urunListesi;






}
