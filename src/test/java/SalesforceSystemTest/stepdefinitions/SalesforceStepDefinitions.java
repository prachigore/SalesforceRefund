package SalesforceSystemTest.stepdefinitions;

import SalesforceSystemTest.navigation.NavigateTo;
import SalesforceSystemTest.navigation.SalesforceHomePage;
<<<<<<< HEAD
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
=======
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
import cucumber.api.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
<<<<<<< HEAD
import org.junit.Assert;
=======
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

<<<<<<< HEAD
=======
import java.util.List;
import java.util.Map;

>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc

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
<<<<<<< HEAD
//    @And("^I scroll up to page$")
//    public void I_scroll_up_to_page() {
//      navigateTo.ABC(driver);
//     }
=======

>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc

    @When("^I click on Contacts Page$")      //done
    public void i_click_on_contacts_page() throws Throwable {
        navigateTo.clickNewContact(driver);
        //   restapi.testRestApi();

    }

<<<<<<< HEAD
   /* @And("I scroll up to page")
    public void scroll_up(){
        navigateTo.scrollUp(driver);
    }*/

=======
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
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
<<<<<<< HEAD

=======
  /*  @And("^I Click on (.*) button$")
    public void i_click_on_Save_button(String buttonName) {
        navigateTo.clickOnSave(driver,buttonName);
    }*/
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc

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

<<<<<<< HEAD
    @And("^I click on Payments under related list quick links$")
=======
    @And("^I click on Payments under related list quick links$")   //done
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
    public void i_click_on_payments() {
        navigateTo.Click_on_payments(driver);
    }

<<<<<<< HEAD
    @And("I click on Payment \"(.*)\" link$")
=======
    @And("I click on Payment \"(.*)\" link$")   //done
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
    public void i_click_on_payment_number(String paymentnumber)
            throws Throwable {
        navigateTo.click_on_new_payment_number(driver, paymentnumber);
    }

<<<<<<< HEAD
    @When("^I click on paid edit button$")
=======
    @When("^I click on paid edit button$")  //done
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
    public void i_click_on_paid_edit_button() {
        navigateTo.i_click_on_paid_edit_button(driver);
    }

<<<<<<< HEAD
    @When("^I make payment paid$")
=======
    @When("^I make payment paid$")    //done
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
    public void I_make_payment_paid() {
        navigateTo.I_make_payment_paid(driver);
    }

<<<<<<< HEAD
    /*@And("^I click on date edit button$")
    public void I_click_on_date_edit_button() {
        navigateTo.I_click_on_date_edit_button(driver);
    }
    @And("^I click on celender$")
    public void I_click_on_celender() {
        navigateTo.I_click_on_celender(driver);
    }*/


    @When("^I select date \"(.*)\" for payment$")
    public void I_click_on_date(String pickDate) {
        System.out.println("-----------------------------");
        System.out.println(pickDate);
        System.out.println("-----------------------------");
        navigateTo.I_click_on_date(driver, pickDate);
    }


    @And("^I Click on (.*) button$")
    public void i_click_on_Save_button(String name) {
        navigateTo.clickOnSave(driver, name);
    }

    @And("^I click on (.*) radio button$")
    public void i_click_on_refund_button(String refund) {
        navigateTo.clickOnrefund(driver, refund);
=======
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
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
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

<<<<<<< HEAD
//    @And("^I enter \"(.*)\"$")
//    public void i_enter_value(String a) {
//        navigateTo.entervalue(driver,a);
//    }


   /* @And("^I provide fields as (.*),(.*),(.*) and (.*)$")
    public void iProvideFieldsAsCaseOriginRefundTypeRefundInstrumentBankAccountNoAndBankBSB(String fieldCaseOrigin, String fieldRefundInstrument, String fieldBankAccountNo, String fieldBankBSB, DataTable dataTable) throws Throwable {

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String refundCaseOrigin = data.get(0).get("Case Origin");
        // String refundRefundType = data.get(0).get("Refund Type");
        String refundRefundInstrument = data.get(0).get("Refund Instrument");
        String refundBankAccountNo = data.get(0).get("Bank Account No");
        String refundBankBSB = data.get(0).get("Bank BSB");

        navigateTo.clickReund(driver, fieldCaseOrigin, fieldRefundInstrument, fieldBankAccountNo, fieldBankBSB, refundCaseOrigin, refundRefundInstrument, refundBankAccountNo, refundBankBSB);


    }
*/
   /* @And("I click refund (.*) button")
    public void i_click_on_Save(String save) {
        navigateTo.clickOnSavebutton(driver, save);

    }*/

    @Then("^I verify message \"(.*)\"$")
    public void iVerifyMessage(String message) throws Throwable {


        String msg = navigateTo.validSuccessMessage(driver, message);
        String[] tokens = message.split("/n");
        int i;
        try {
            for (i = 0; i < tokens.length; i++)
//            System.out.println(tokens[i]);

//        System.out.println("----------------------");
                System.out.println(tokens[i]);
            System.out.println("----------------------");
            System.out.println(tokens[i]);
            System.out.println("----------------------");
            System.out.println(msg);
            System.out.println("-----------------------");
            Assert.assertEquals(tokens[i], msg);
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println(exp);
        }

    }
@And("^I select Payment Date from payment date 2019-08-27$")
    public void I_select(String fieldPaymentDate,String fieldDate){
    navigateTo.selectPaymentDate(driver, fieldPaymentDate,fieldDate);
}

/*adjustment*/

    @And("^I click on Recently Viewed dropdown (.*)$")
    public void recently_viewed_dropdown(String filedDropdown) {
        navigateTo.recentlyViewedDropdown(driver, filedDropdown);
    }

    @And("^I select \"(.*)\" from the list view$")
    public void select_all_contacts(String allContact) {
        navigateTo.allContacts(driver, allContact);
    }

    @And("^I type the contact \"(.*)\" in the Search box and press Enter to view the particular contact detail$")
    public void searchenter(String arg1) {

        navigateTo.contactNameInSearch1(driver,arg1);
    }
    @And("^I clickon (.*) button$")
    public void i_click_opportunities(String fieldValue) {
        navigateTo.clickOpportunitybutton(driver, fieldValue);
    }

    @And("^I click on Opportunities name (.*) link$")
    public void i_click_opportunity_name(String opportunityName) {

        System.out.println(opportunityName);
        navigateTo.clickopportunityname(driver, opportunityName);
    }
    @And("^I click on \"(.*)\" Tab$")
    public void clickrequiredtab(String fieldTagName) {
        navigateTo.clickTabName(driver, fieldTagName);
    }

    @And("I click on Payment")
    public void i_click_Payment() {
        navigateTo.clickOnPayment(driver);
    }

    @And("^I click on (.*) CheckBox with click on (.*) option$")
    public void i_click_on_checkbox(String filedCheckbox, String filedEditPaid) {
        navigateTo.clickOnCheckbox(driver, filedCheckbox, filedEditPaid);
    }

    @And("^I select (.*) from payment date (.*)$")
    public void i_select_the_payment_date(String filedPaymentDate, String Date) {
        navigateTo.selectPaymentDate(driver, filedPaymentDate, Date);
    }

    @When("^I click on (.*) button")
    public void i_clickon_Save_button(String saveButton) {
        navigateTo.clickOnSave(driver, saveButton);
    }

    @And("I scroll up to page")
    public void scrollup() {
        navigateTo.scrollUP(driver);
    }

    @And("^I click (.*) radiobutton$")
    public void i_clicked_radio_button(String filedName) {
        navigateTo.clickRadioButton(driver, filedName);
    }

    @And("^I clicked \"(.*)\" radio button$")
    public void RadioButton(String arg0)throws Throwable {
        navigateTo.adjbtn(driver,arg0);
    }
    @And("^I clear CAMPAIGN NAME field$")
    public void campaignname(){
        navigateTo.clearcampaignname(driver);
    }
    @And("^I clear out PRODUCT field$")
    public void product(){
        navigateTo.clearproduct(driver);
    }
    @And("^I cleared AMOUNT field$")
    public void cleared_AMOUNT_field(){
        navigateTo.clearamount(driver);
    }
    /*@And("^I provide (.*),(.*) and (.*)$")
    public void components(String fieldcampaignname, String fieldproduct, String fieldamount, DataTable dataTable) throws Throwable {

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String campaignname = data.get(0).get("campaignname");
        // String refundRefundType = data.get(0).get("Refund Type");
        String product = data.get(0).get("product");
        String amount = data.get(0).get("amount");
        String refundBankBSB = data.get(0).get("Bank BSB");

        navigateTo.clickcomponents(driver, fieldcampaignname, fieldproduct, fieldamount, campaignname, product, amount);


    }*/
    @And("^I entered negative amount$")
    public void enteramount(){
        navigateTo.enteramount(driver);
    }
    @Then("^I verify \"(.*)\" display$")
    public void message(String arg6){
        navigateTo.message(driver,arg6);
=======
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

>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
    }
}
