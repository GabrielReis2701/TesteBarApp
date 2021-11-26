package com.example.testebarapp;

import com.example.testebarapp.util.DriverFactory;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteCheckBox {
    private AndroidDriver driver;

    @Before
    public void setUp() {
        driver = DriverFactory.getDriver();

    }

    @Test
    public void testarCheckBox(){
        MobileElement checkboxRefrigerante = (MobileElement) driver.findElement(By.xpath("//*[@text='Refrigerante']"));
        MobileElement checkboxAgua = (MobileElement) driver.findElement(By.xpath("//*[@text='Agua']"));
        MobileElement checkboxTorta = (MobileElement) driver.findElement(By.xpath("//*[@text='Torta']"));
        MobileElement checkboxPizza = (MobileElement) driver.findElement(By.xpath("//*[@text='Pizza']"));
        MobileElement checkboxVinho = (MobileElement) driver.findElement(By.xpath("//*[@text='Vinho']"));
        MobileElement checkboxLazanha = (MobileElement) driver.findElement(By.xpath("//*[@text='Lazanha']"));

        checkboxLazanha.click();
        checkboxAgua.click();
        checkboxRefrigerante.click();
        checkboxPizza.click();
        checkboxTorta.click();
        checkboxVinho.click();

        Assert.assertFalse(checkboxLazanha.getAttribute("checked").equals("false"));
        Assert.assertFalse(checkboxAgua.getAttribute("checked").equals("false"));
        Assert.assertFalse(checkboxRefrigerante.getAttribute("checked").equals("false"));
        Assert.assertFalse(checkboxPizza.getAttribute("checked").equals("false"));
        Assert.assertFalse(checkboxTorta.getAttribute("checked").equals("false"));
        Assert.assertFalse(checkboxVinho.getAttribute("checked").equals("false"));
    }

    @After
    public void tearDown(){
        DriverFactory.finalizarDriver();
    }
}
