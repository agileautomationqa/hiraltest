package ho.qat.seo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends PageObject {

    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElementFacade resultMessage;

    private String getResultMessage(){
        System.out.println("get H2 from webpage "+resultMessage.getText());
        System.out.println("xpath"+resultMessage);
       return resultMessage.getText();
    }

    public void confirmResultMessage(String expectedMessage){
        System.out.println("expected message "+expectedMessage);
        getResultMessage();
       Assert.assertTrue(getResultMessage().equalsIgnoreCase(expectedMessage));
    }
}
