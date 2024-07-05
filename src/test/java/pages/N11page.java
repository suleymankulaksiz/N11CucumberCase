package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class N11page {

    public N11page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "Giriş Yap")
    public WebElement btnGirisYap;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement btnEmail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement btnPassword;

    @FindBy(xpath = "//div[@id='loginButton']")
    public WebElement LoginButton;

    @FindBy(css = "a[title='Hesabım']")
    public WebElement btnHesabim;

    @FindBy(css = "a[title='Çıkış Yap']")
    public WebElement btnCikisYap;

    @FindBy(css = "input#searchData")
    public WebElement btnSearchbox;

    @FindBy(css = "a[title='ARA'] > .iconsSearch")
    public WebElement btnSearchBtn;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div[2]/div[2]/section/div[2]/ul/li[1]/div/div/a/h3")
    public WebElement productClick;

    @FindBy(css = ".unf-buy-button-group button[title='Sepete Ekle']")
    public WebElement productAddToCart;

    @FindBy(css = ".basket.box.box--medium > .box__title")
    public WebElement control_basket;


}