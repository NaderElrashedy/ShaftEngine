package result;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {
    private WebDriver driver;

    public static By getResultStatus(){
        return By.id("result-stats");
    }
    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }


}
