import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.EventHandler;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeWork2 {
  public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");
    EventFiringWebDriver driver = new EventFiringWebDriver(new ChromeDriver());
    driver.register(new EventHandler_HW2());
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebDriverWait wait = (new WebDriverWait(driver, 10));

    driver.get("https://www.bing.com/");  // 1 загрузка страницы
    WebElement images_link = driver.findElement(By.xpath("//a[@id='scpl1']")); //2 переходим в раздел Images и ждем пока загрузится
    images_link.click();

    String etalontitle = "Bing Image Feed";
    wait.until(ExpectedConditions.titleContains(etalontitle));

    //3 прокрутка страницы
    List<WebElement> imagesResults1 = driver.findElements(By.xpath("//div[@class='img_cont hoff']"));
    Integer searchesSize1 = imagesResults1.size();

    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");


    List<WebElement> imagesResults2 = driver.findElements(By.xpath("//div[@class='img_cont hoff']"));
    Integer searchesSize2 = imagesResults2.size();
    if (searchesSize2 > searchesSize1) {
      System.out.println("Images loaded " + imagesResults2.size());
    }




  }
}
