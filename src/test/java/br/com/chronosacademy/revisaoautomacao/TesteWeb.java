package br.com.chronosacademy.revisaoautomacao;

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

   @Before
   public void inicializaTeste(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();

       driver.manage().window().maximize();

       driver.get("https://edu.google.com/");

   }


    @Test
    public void primeiroTeste(){

        String xpathTitulo = "//*[@id=\"gfe-main-content\"]/section[1]/div[1]/div/div/div/h2";
        WebElement htitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = htitulo.getText();

        assertEquals("A aprendizagem ao alcance de todos", titulo);

   }

   @After
    public void finalizaTeste(){
       driver.quit();
   }

}

