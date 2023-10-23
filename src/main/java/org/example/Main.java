package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver banana = new ChromeDriver();
        banana.get("https://demo.opencart.com/");
        WebElement myAccount = banana.findElement(By.xpath("//span[text()='My Account']"));
        myAccount.click();
        WebElement register = banana.findElement(By.xpath("//a[text()='Register']"));
        register.click();
        WebElement firstName = banana.findElement(By.id("input-firstname"));
        firstName.sendKeys("Diana");
        WebElement lastName = banana.findElement(By.id("input-lastname"));
        lastName.sendKeys("Dovhan");
        WebElement email = banana.findElement(By.id("input-email"));
        email.sendKeys("sddsd@sdas.dsf");
        WebElement password = banana.findElement(By.id("input-password"));
        password.sendKeys("12345");
        banana.close();
        banana.quit();

        }
    }



