package br.com.chronosacademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrincipalMap {
    @FindBy(xpath = "//section[1]/div[1]//h2")
    public WebElement hTitulo;

    @FindBy(xpath = "//div[2]/div[1]/div/a[1]/span")
    public WebElement btntitulo;

}
