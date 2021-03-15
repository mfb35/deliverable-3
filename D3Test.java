// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void fUNCATHY() {
    driver.get("https://cs1632.appspot.com/");
    driver.findElement(By.linkText("Cathedral Pics")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("li:nth-child(1) > img"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("li:nth-child(3) > img"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("li:nth-child(5) > img"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void fUNFACT() {
    driver.get("https://cs1632.appspot.com/");
    driver.findElement(By.linkText("Factorial")).click();
    driver.findElement(By.name("value")).click();
    driver.findElement(By.name("value")).sendKeys("5");
    driver.findElement(By.cssSelector("input:nth-child(2)")).click();
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Factorial of 5 is 120!"));
  }
  @Test
  public void fUNFIB() {
    driver.get("https://cs1632.appspot.com/");
    driver.findElement(By.linkText("Fibonacci")).click();
    driver.findElement(By.name("value")).click();
    driver.findElement(By.name("value")).sendKeys("5");
    driver.findElement(By.cssSelector("input:nth-child(2)")).click();
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Fibonacci of 5 is 5!"));
  }
  @Test
  public void fUNHELLO() {
    driver.get("https://cs1632.appspot.com/");
    driver.findElement(By.linkText("Hello")).click();
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Hello CS1632, from Dr. Ahn!"));
  }
  @Test
  public void fUNHELLOTRAILING() {
    driver.get("https://cs1632.appspot.com//hello/jazzy");
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Hello CS1632, from jazzy!"));
  }
  @Test
  public void fUNINVALIDVALUE() {
    driver.get("https://cs1632.appspot.com/");
    driver.findElement(By.linkText("Fibonacci")).click();
    driver.findElement(By.name("value")).click();
    driver.findElement(By.name("value")).sendKeys("-100");
    driver.findElement(By.cssSelector("input:nth-child(2)")).click();
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Fibonacci of -100 is 1!"));
  }
  @Test
  public void fUNLINKS() {
    driver.get("https://cs1632.appspot.com/");
    {
      WebElement element = driver.findElement(By.linkText("CS1632 D3 Home"));
      String attribute = element.getAttribute("href");
      vars.put("val", attribute);
    }
    assertEquals(vars.get("val").toString(), "/");
  }
  @Test
  public void fUNWELCOME() {
    driver.get("https://cs1632.appspot.com//");
    assertThat(driver.findElement(By.cssSelector(".jumbotron > .lead")).getText(), is("Debugging is twice as hard as writing the code in the first place. Therefore, if you write the code as cleverly as possible, you are, by definition, not smart enough to debug it.\\\\n- Brian W. Kernighan"));
  }
}
