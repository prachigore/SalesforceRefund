package SalesforceSystemTest.stepdefinitions;

import SalesforceSystemTest.navigation.NavigateTo;
import SalesforceSystemTest.navigation.SalesforceHomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Map;


//import static org.assertj.core.api.Assertions.assertThat;

public class SalesforceStepDefinitions {

    @Steps
    NavigateTo navigateTo;
    SalesforceHomePage homePage;
    String firstName, lastName, Salutation, Phone, tagName;
    String expectedString;
    String enteredSupporterLevel, expectedSupporterLevel, expectedLevelOfService, expectedSelectService, expectedchoosedSupporter, enteredSelectService;
    WebDriver driver = initialize();

    public WebDriver initialize() {
        String saleforceNotifications = getConfigurationDetails("webdriver.base.disable_notifications");
        String driverName = getConfigurationDetails("webdriver.name.chrome");
        String driverPath = getConfigurationDetails("webdriver.chrome.driver");
        ChromeOptions option = new ChromeOptions();
//        option.addExtensions(new File("C:\\Users\\Aniket\\Downloads\\Block-image_v1.0.crx"));
        option.addArguments(saleforceNotifications);
        System.setProperty(driverName, driverPath);
        WebDriver driver = new ChromeDriver(option);
        return driver;
    }

    public String getConfigurationDetails(String nameURL) {
        EnvironmentVariables props = Injectors.getInjector().getInstance(EnvironmentVariables.class);
        String configDetails = EnvironmentSpecificConfiguration.from(props).getProperty(nameURL);
        return configDetails;
    }

    @Given("^I login to Salesforce URL$")
    public void i_login_to_Salesforce_URL() throws Throwable {
        navigateTo.LogintoSalesforce(driver);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @When("^I click on Contacts Page$")      //done
    public void i_click_on_contacts_page() throws Throwable {
        navigateTo.clickNewContact(driver);
        //   restapi.testRestApi();

    }

    @And("^I click on 'opportunities' under related list quick links$")   //done
    public void i_click_on_new_button() {
        navigateTo.Click_on_opportunity(driver);
    }

   /* @And("^I enter following details in (.*), (.*) and (.*) fields under New Contact Page:$")
    public void i_enter_details(String fieldFirstName, String fieldLastName, String fieldPhone, DataTable dataTable) throws Throwable {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        firstName = data.get(0).get("First Name");
        lastName = data.get(0).get("Last Name");
        Phone = data.get(0).get("Phone");
        navigateTo.insertRecords(driver, fieldFirstName, fieldLastName, fieldPhone, firstName, lastName, Phone);
    }
*/
  /*  @And("^I Click on (.*) button$")
    public void i_click_on_Save_button(String buttonName) {
        navigateTo.clickOnSave(driver,buttonName);
    }*/

    @And("I click on particular opportunity name \"(.*)\" link$")   //done
    public void i_click_on_contacts(String opportunityName) throws Throwable {
        navigateTo.click_on_new_opportunity_name(driver, opportunityName);
    }

    @And("^I type the existing contact name (.*) in the Search this list Search box and press Enter to view the particular contact detail$")
    public void search_enter(String arg1) {
        navigateTo.contactNameInSearch(driver, arg1); //done
    }

    @And("^I click on the searched contact name$")   //done
    public void searched_contact_name() {
        navigateTo.searchContactName(driver);
    }

    @And("^And I click on \"(.*)\" tab$")
    public void click_required_tab(String fieldTagName) {

        navigateTo.clickTabName(driver, fieldTagName);
    }

    /* @When("^I verify the  Contact is created$")
     public void i_enter_details(DataTable dataTable) throws Throwable {

         List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
         String ept = data.get(0).get("Engagement Plan Template");
         String contactName = data.get(0).get("Contact Name");

         navigateTo.verifyDetails(driver, ept, contactName);
     }*/
    @And("^I click on dropdown$")
    public void i_click_on_dropdown() {
        navigateTo.abc(driver);
    }

    @And("^I click on 'New Contact' button$")
    public void i_click_on_Newcontact() {
        navigateTo.abcd(driver);
    }

    @And("^I click on Payments under related list quick links$")   //done
    public void i_click_on_payments() {
        navigateTo.Click_on_payments(driver);
    }

    @And("I click on Payment \"(.*)\" link$")   //done
    public void i_click_on_payment_number(String paymentnumber)
            throws Throwable {
        navigateTo.click_on_new_payment_number(driver, paymentnumber);
    }

    @When("^I click on paid edit button$")  //done
    public void i_click_on_paid_edit_button() {
        navigateTo.i_click_on_paid_edit_button(driver);
    }

    @When("^I make payment paid$")    //done
    public void I_make_payment_paid() {
        navigateTo.I_make_payment_paid(driver);
    }

    @When("^I click on date edit button$")   //done
    public void I_click_on_date_edit_button() {
        navigateTo.I_click_on_date_edit_button(driver);
    }

    @When("^I select date \"(.*)\" for payment$")    //done
    public void I_click_on_date(String pickdate) {
        System.out.println("-----------------------------");
        System.out.println(pickdate);
        System.out.println("-----------------------------");
        navigateTo.I_click_on_date(driver, pickdate);
    }

    @And("^I Click on (.*) button$")
    public void i_click_on_Save_button(String buttonName) {
        navigateTo.clickOnSave(driver, buttonName);
    }

    @And("^I click on refund radio button$")
    public void i_click_on_refund_button() {
        navigateTo.clickOnrefund(driver);
    }

    @And("^I click on Refund Type$")
    public void i_click_on_refund_type() {
        navigateTo.clickOnrefundtype(driver);
    }

    @And("^I select Partial$")
    public void i_click_on_partial() {
        navigateTo.clickOnpartialrefund(driver);
    }

    @And("^I click on refund amount$")
    public void i_click_on_refundamount() {
        navigateTo.clickOnrefundamount(driver);
    }

    @And("^I enter \"(.*)\"$")
    public void i_enter_value() {
        navigateTo.entervalue(driver);
    }

    @And("^I provide (.*),(.*),(.*) and (.*)$")
    public void i_enter_opportunity_details(String fieldCaseOrigin, String fieldRefundInstrument, String fieldBankAccountNo, String fieldBankBSB, DataTable dataTable) throws Throwable {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String CaseOrigin = data.get(0).get("Case Origin");
        String RefundInstrument = data.get(0).get("Refund Instrument");
        String BankAccountNo = data.get(0).get("Bank Account No");
        String BankBSB = data.get(0).get("Bank BSB");
        System.out.println(CaseOrigin);
        System.out.println(RefundInstrument);
        System.out.println(BankAccountNo);
        System.out.println(BankBSB);
        navigateTo.provideDetails(driver, fieldCaseOrigin, fieldRefundInstrument, fieldBankAccountNo, fieldBankBSB, CaseOrigin, RefundInstrument, BankAccountNo, BankBSB);
    }

    @And("^I Click on (.*) button$")
    public void i_click_on_Save(String buttonName) {
        navigateTo.clickOnSavebutton(driver, buttonName);

    }
}
