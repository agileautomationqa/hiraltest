package ho.qat.seo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends PageObject {
@FindBy(xpath = "(//input[@id='response-0'])[1]")
    WebElementFacade reasonToSelect;

    @FindBy(css = "#current-question > button")
    private WebElementFacade nextStepButton;


    public void selectReasonForVisit(String reason){
        String selector = String.join("","input[value='", reason.toLowerCase(), "']");
        reasonToSelect = find(By.cssSelector(selector));
        clickOn(reasonToSelect);
    }

    public void clickNextStepButton(){
        clickOn(nextStepButton);
    }

}


