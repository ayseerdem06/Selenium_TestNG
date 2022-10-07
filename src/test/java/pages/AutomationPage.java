package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationPage {

    public AutomationPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement login;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement newUserSignup;

    @FindBy(xpath = "  //*[@name='name']")
    public WebElement name;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement email;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy(xpath = "//p[@style='color: red;']")
    public WebElement emailAdressAlready;


    @FindBy(xpath = "//*[text()='Enter Account Information")
    public WebElement enterAccount;

    @FindBy(xpath = "//*[@id='id_gender2']")
    public WebElement gender;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='days']")
    public List<WebElement> days;

    @FindBy(xpath = "//*[@id='months']")
    public List<WebElement> months;

    @FindBy(xpath = "//*[@id='years']")
    public List<WebElement> years;

    @FindBy(xpath = "//*[@id='newsletter']")
    public WebElement newsletter;

    @FindBy(xpath = "//*[@id='optin']")
    public WebElement  optin;

    @FindBy(xpath = "//a[@href='/contact_us']")
    public WebElement  contactUs;

    @FindBy(xpath = "//*[text()='Get In Touch']")
    public WebElement  getInTouch;

    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement  getName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement  getEmail;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement  getISubject;

    @FindBy(xpath = "//*[@id='message']")
    public WebElement  getMEssage;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement  uploadFile;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement  submitClick;








}
