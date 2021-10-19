package br.com.chronosacademy.revisaoautomacao;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.pages.CursoPage;
import br.com.chronosacademy.pages.PrincipalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;


public class TesteWeb {

   WebDriver driver;
   Driver driverWeb;
   PrincipalPage principalPage;
   CursoPage cursoPage;


   @Before
   public void inicializaTeste(){
      driverWeb = new Driver("chrome");
      driver = driverWeb.getDriver();

       driver.get("https://edu.google.com/");
       principalPage = new PrincipalPage(driver);

   }


    @Test
    public void primeiroTeste(){
        String titulo = principalPage.getTitulo();

        assertEquals("A aprendizagem ao alcance de todos", titulo);

   }


    @Test
    public void segundoTeste(){
        principalPage.clickBotao();
        cursoPage = new CursoPage(driver);
        String titulo = cursoPage.getTitulo2();

        assertEquals("A aprendizagem ao alcance de todos", titulo);

    }

    private WebElement getElement(String xpathtitulo) {
        return driver.findElement(By.xpath(xpathtitulo));
    }


    @After
    public void finalizaTeste(){
       driver.quit();
   }

}

