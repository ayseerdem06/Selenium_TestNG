package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProductsPages {

    public ProductsPages() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //kubraesra27@hotmail.com Esrakubra2!

    // Giris Login kısmı

    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement singIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='woocommerce-button button woocommerce-form-login__submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myAccount;


    @FindBy(xpath = "//a[@href='https://pearlymarket.com/store-manager/']")
    public WebElement storeManager;

    @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-products']")
    public WebElement products;

    @FindBy(xpath = "//span[text()='Add New']")
    public WebElement addNew;

    @FindBy(xpath = "(//*[text()='Categories'])[1]")
    public WebElement categories;

    @FindBy(xpath = "//*[text()='Besin takviyeleri']")
    public WebElement besinTakviyeleriText;

    @FindBy(xpath = "(//input[@class='wcfm-checkbox checklist_type_product_cat '])[9]")
    public WebElement besinTakviyeleriCheckBox;

    @FindBy(xpath = "(//*[text()='Cok satanlar'])[1]")
    public WebElement cokSatanlarText;

    @FindBy(xpath = "(//input[@class='wcfm-checkbox checklist_type_product_cat '])[17]")
    public WebElement cokSatanlarCheckBox;

    @FindBy(xpath = "(//*[text()='Elektrik & Elektronik'])[2]")
    public WebElement elektrikElektroniktext;

    @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_cat '])[30]")
    public WebElement elektrikElektronikCheckBox;

    @FindBy(xpath = "(//*[text()='Home&Life'])[1]")
    public WebElement homeLifetext;

    @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_cat '])[64]")
    public WebElement homeLifeCheckBox;

    @FindBy(xpath = "(//*[text()='Discounted'])[1]")
    public WebElement discountedtext;

    @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_cat '])[20]")
    public WebElement discountedCheckBox;

    @FindBy(xpath = "(//*[text()='Books & Music & Film'])[1]")
    public WebElement booksMusicFilmtext;

    @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_cat '])[11]")
    public WebElement booksMusicFilmCheckBox;

    @FindBy(xpath = "(//*[text()='Cosmetics&Personal Care'])[1]")
    public WebElement cosmeticstext;

    @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_cat '])[19]")
    public WebElement cosmeticsCheckBox;


    @FindBy(xpath = "(//*[text()='Fashion&Clothing'])[1]")
    public WebElement fashionClothingtext;

    @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_cat '])[32]")
    public WebElement fashionClothingCheckBox;










}
