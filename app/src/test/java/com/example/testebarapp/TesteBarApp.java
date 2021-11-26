package com.example.testebarapp;

import com.example.testebarapp.util.DriverFactory;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteBarApp {

        private AndroidDriver driver;

        @Before
        public void setUp() {
            driver = DriverFactory.getDriver();

        }
        @Test
        public void Teste1CheckBox() throws InterruptedException {
            MobileElement el1 = (MobileElement) driver.findElementById("com.example.exercicio6:id/cb_Refrigerante");
            el1.click();
            MobileElement el2 = (MobileElement) driver.findElementById("com.example.exercicio6:id/bt_Ok");
            el2.click();
            Thread thread = new Thread();
            thread.sleep(5000);
            MobileElement el3 = (MobileElement) driver.findElementById("com.example.exercicio6:id/tv_ResumoP");
            el3.click();
            Assert.assertEquals("O Seu pedido é: \n" +
                    "1 Refrigerante \n",el3.getText());
        }

        @Test
        public void TesteTodosCheckBox() throws InterruptedException {
            MobileElement el1 = (MobileElement) driver.findElementById("com.example.exercicio6:id/cb_Refrigerante");
            el1.click();
            MobileElement el2 = (MobileElement) driver.findElementById("com.example.exercicio6:id/cb_Agua");
            el2.click();
            MobileElement el3 = (MobileElement) driver.findElementById("com.example.exercicio6:id/cb_Pizza");
            el3.click();
            MobileElement el4 = (MobileElement) driver.findElementById("com.example.exercicio6:id/cb_Lazanha");
            el4.click();
            MobileElement el5 = (MobileElement) driver.findElementById("com.example.exercicio6:id/cb_Torta");
            el5.click();
            MobileElement el6 = (MobileElement) driver.findElementById("com.example.exercicio6:id/cb_Vinho");
            el6.click();
            MobileElement el7 = (MobileElement) driver.findElementById("com.example.exercicio6:id/bt_Ok");
            el7.click();
            Thread thread = new Thread();
            thread.sleep(5000);
            MobileElement el8 = (MobileElement) driver.findElementById("com.example.exercicio6:id/tv_ResumoP");
            el8.click();
            Assert.assertEquals("O Seu pedido é: \n" +
                    "1 Agua \n" +
                    "1 Pizza \n" +
                    "1 Lazanha \n" +
                    "1 Refrigerante \n" +
                    "1 Torta \n" +
                    "1 Vinho",el8.getText());
        }


        @After
        public void tearDown() {
            DriverFactory.finalizarDriver();
        }
    }

