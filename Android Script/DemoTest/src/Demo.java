/*import java.util.regex.Pattern;*/
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
/*import static org.hamcrest.CoreMatchers.*;*/
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
/*import org.openqa.selenium.support.ui.Select;*/

public class Demo{
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://chessgame.anktechdemo.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("html/body/section/header/div/div[2]/nav/ul/li[6]/a")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("testuser9691");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("12345678");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.xpath("html/body/section/header/div/div[2]/nav/ul/li[3]/a")).click();
    driver.findElement(By.xpath("//div[2]/ul/li[2]")).click();
    driver.findElement(By.xpath("//div[2]/ul/li[3]")).click();
    driver.findElement(By.cssSelector("li.tab_last")).click();
    driver.findElement(By.linkText("Varsha Bansal")).click();
    driver.findElement(By.xpath("html/body/section/header/div/div[2]/nav/ul/li[10]/a")).click();
    driver.findElement(By.xpath("html/body/section/header/div/div[2]/nav/ul/li[11]/a")).click();
    driver.findElement(By.xpath("html/body/section/header/div/div[2]/nav/ul/li[7]/a")).click();
    driver.findElement(By.xpath("html/body/section/header/div/div[2]/nav/ul/li[6]/a")).click();
    driver.findElement(By.xpath("html/body/section/header/div/div[2]/nav/ul/li[5]/a")).click();
    driver.findElement(By.xpath("html/body/section/header/div/div[2]/nav/ul/li[4]/a")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
