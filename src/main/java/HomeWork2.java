import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeWork2 {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");
    EventFiringWebDriver driver = new EventFiringWebDriver(new ChromeDriver());
    driver.register(new EventHandler_HW2());
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    driver.get("https://www.bing.com/");  // 1 загрузка страницы
    WebElement images_link = driver.findElement(By.xpath("//a[@id='scpl1']")); //2 переходим в раздел Images и ждем пока загрузится
    images_link.click();

    //3 прокрутка страницы
    List<WebElement> imagesResults1 = driver.findElements(By.xpath("//div[@class='img_cont hoff']"));
    System.out.println("Images Loaded " + imagesResults1.size());

    JavascriptExecutor jse = driver;
    jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    List<WebElement> afterScroll = driver.findElements(By.xpath("//div[@class='img_cont hoff']"));
    System.out.println("Images Loaded " + afterScroll.size());





  }

}
