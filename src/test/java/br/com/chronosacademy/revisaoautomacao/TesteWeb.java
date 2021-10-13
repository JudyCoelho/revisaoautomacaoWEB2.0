package br.com.chronosacademy.revisaoautomacao;

import br.com.chronosacademy.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class TesteWeb {

   WebDriver driver;
   Driver driverWeb;

   @Before
   public void inicializaTeste(){
      driverWeb = new Driver("chrome");

      driver = driverWeb.getDriver();

       driver.get("https://edu.google.com/");

   }


    @Test
    public void primeiroTeste(){

        String xpathTitulo = "//section[1]/div[1]//h2";
        WebElement htitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = htitulo.getText();

        assertEquals("A aprendizagem ao alcance de todos", titulo);

   }

    @Test
    public void segundoTeste(){

        String xpathBotao = "//div[2]/div[1]/div/a[1]/span";
        WebElement btntitulo = driver.findElement(By.xpath(xpathBotao));
        btntitulo.click();
        String xpathtitulo = "//section[1]/div[1]//h2";
        WebElement htitulo = driver.findElement(By.xpath(xpathtitulo));

        assertEquals("A aprendizagem ao alcance de todos", htitulo.getText());

    }

   @After
    public void finalizaTeste(){
       driver.quit();
   }

}

