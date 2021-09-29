package webFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class seleniumCreator {
        private final WebDriver driver;
        private int inputAmount = 0;
        JavascriptExecutor js;

        public seleniumCreator() {
            System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
            js = (JavascriptExecutor) driver;
    }

    public WebDriver getDriver(){
        return this.driver;
    }
    public JavascriptExecutor getExecutor(){
        return this.js;
    }
    public void setInputAmount(int input){
        this.inputAmount = input;
    }
    public void tearDown() {
        driver.quit();

    }
    private void addMultipleItemsToWishlist() throws InterruptedException {
        int[] numbersBetween = new int[inputAmount];
        Thread.sleep(5000);
        for (int i=0; i < (inputAmount); i++) {
            numbersBetween[i] = i+1;
        }
        for (int i:numbersBetween){

            System.out.println("aaaaaaaaa");

            try {
                driver.findElement(By.xpath("//div[@id='site-content']/div/div/article/ul/li[" + i + "]/div/div[2]/div/div/a/span")).click();
                Thread.sleep(1000);
            } catch (Exception E){
                System.out.println("broken lol");
                System.out.println(E.getMessage());
                break;
            }
        }
    }
    public void given(int amount) throws InterruptedException {
        driver.manage().deleteAllCookies();
        setInputAmount(amount);

        driver.get("https://testscriptdemo.com/?post_type=product");
        js.executeScript("window.scrollBy(0,500)", "");
        driver.manage().window().setSize(new Dimension(1920, 1080));
        addMultipleItemsToWishlist();
    }
    public void when(){
        driver.get("https://testscriptdemo.com/?post_type=product");
        js.executeScript("window.scrollBy(0,0)", "");
  driver.findElement(By.xpath("//body[@id='blog']/div[3]/div/div/div/div[3]/div[3]/a/i")).click();
    }

}
