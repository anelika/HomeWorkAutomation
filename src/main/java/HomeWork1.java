import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeWork1 {
  public static void main(String[] args){
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();

    driver.get("https://www.bing.com/");
    WebElement searchField = driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
    searchField.sendKeys("wikipedia");
    searchField.submit();
    System.out.println(driver.getTitle());

    List<WebElement> titles = driver.findElements(By.xpath("//li[@class=\"b_algo\"]//h2/a"));
    System.out.println(titles.size());
    try {
      for (WebElement title : titles){
        System.out.println(title.getText());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    driver.quit();

  }
}
