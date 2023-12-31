package ho.qat.seo.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class VisaConfirmationSteps {

    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    DurationOfStayPage durationOfStayPage;
    ResultPage resultPage;

    @Given("I am on the Check UK visa website")
    public void i_am_on_the_Check_UK_visa_website() {
        startPage.open();
    }

    @And("I start visa check")
    public void i_start_visa_check() {
        startPage.clickStartNow();
    }

    @When("I select a nationality of {string}")
    public void iSelectANationalityOfAustralia(String nationality) {
        selectNationalityPage.selectNationality(nationality);
        selectNationalityPage.clickNextStepButton();
    }

    @And("I select reason {string}")
    public void iSelectReasonTourism(String reason) {
        reasonForTravelPage.selectReasonForVisit(reason);
        reasonForTravelPage.clickNextStepButton();
    }

    @Then("I will be informed {string}")
    public void confirm_visa_result(String resultText) {
        resultPage.confirmResultMessage(resultText);
    }

    @And("I state I am intending to stay for {string} than 6 months")
    public void iStateIAmIntendingToStayForMoreThanMonths(String moreOrLess) {
        durationOfStayPage.selectLengthOfStay(moreOrLess);
        durationOfStayPage.clickNextStepButton();
    }

    @And("I state I want to do {string} work")
    public void iStateIWantToDoOtherWork(String reason) {
reasonForTravelPage.selectReasonForVisit(reason);
        reasonForTravelPage.clickNextStepButton();

    }

    @And("I select a reason {string}")
    public void iSelectAReasonFamily(String reason) {
        reasonForTravelPage.selectReasonForVisit(reason);
        reasonForTravelPage.clickNextStepButton();
    }
}
