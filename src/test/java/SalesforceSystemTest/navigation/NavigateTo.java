
package SalesforceSystemTest.navigation;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class NavigateTo {

    @Step("Open the Salesforce home page")
    public void LogintoSalesforce(WebDriver driver) {
        String salesforceURL = getConfigurationDetails("webdriver.base.url");
        String userName = getConfigurationDetails("Salesforce.username");
        String passWord = getConfigurationDetails("Salesforce.password");
        driver.get(salesforceURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       WebElement a=driver.findElement(By.xpath("//input[@id='username']"));
               a.clear();
               a.sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passWord);
        driver.findElement(By.xpath("//input[@id='Login']")).click();
    }

    public String getConfigurationDetails(String nameURL) {
        EnvironmentVariables props = Injectors.getInjector().getInstance(EnvironmentVariables.class);
        String configDetails = EnvironmentSpecificConfiguration.from(props).getProperty(nameURL);
        return configDetails;
    }


    public void waitfortheelement() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickNewContact(WebDriver driver) {
        waitfortheelement();
        driver.findElement(By.xpath("//*[@data-id='Contact']")).click();
        //driver.findElement(By.xpath("(//lightning-icon[@class='slds-icon-utility-chevrondown slds-icon_container'])[2]")).click();
        waitfortheelement();
//        Actions act1 = new Actions(driver);
//        waitfortheelement();
//        waitfortheelement();
//        act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//        waitfortheelement();

    }

    public void enterAllDetails(WebDriver driver, String fieldName, String fieldValue) {
        driver.findElement(By.xpath("//div[contains(@class,'uiInput')]//span[contains(text(),'" + fieldName + "')]/../..//input")).sendKeys(fieldValue);
    }

    public void Click_on_opportunity(WebDriver driver) {
        waitfortheelement();
        driver.findElement(By.xpath("//span[@title=\"Opportunities\"]")).click();
    }

    public void Click_on_payments(WebDriver driver) {
        waitfortheelement();
        driver.findElement(By.xpath("//span[@title=\"Payments\"]")).click();
    }
   /* public void insertRecords(WebDriver driver, String fieldFirstName, String fieldLastName, String fieldPhone, String firstName, String lastName, String Phone) {
        waitfortheelement();
        //driver.findElement(By.xpath("//*[@class='firstName compoundBorderBottom form-element__row input' and @placeholder='"+firstName+"']")).click();
       // waitfortheelement();
       // driver.findElement(By.xpath("//*[@class=\"lastName compoundBLRadius compoundBRRadius form-element__row input\" and @placeholder='"+lastName+"']")).click();
        waitfortheelement();
        driver.findElement(By.xpath("")).click();
        waitfortheelement();
        enterAllDetails(driver, fieldFirstName, firstName);
        enterAllDetails(driver, fieldLastName, lastName);
        enterAllDetails(driver, fieldPhone, Phone);

    }*/

    public void clickOnSave(WebDriver driver, String buttonName) {
        waitfortheelement();
        driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button--neutral uiButton--b')]//span")).click();


    }

    public void click_on_new_opportunity_name(WebDriver driver, String opportunityName) {
        waitfortheelement();
        String e = driver.findElement(By.xpath("//th//span[@class='slds-grid slds-grid--align-spread']//a[@title='" + opportunityName + "']")).getText();
        driver.findElement(By.xpath("//th//span[@class='slds-grid slds-grid--align-spread']//a[@title='" + opportunityName + "']")).click();

    }

    public void contactNameInSearch(WebDriver driver, String name) {
        waitfortheelement();
        waitfortheelement();
//        String contactName = getConfigurationDetails("Salesforce.contactName");
        String contactName = name;
        driver.findElement(By.xpath("//input[@name='Contact-search-input']")).sendKeys(contactName);
        waitfortheelement();
       /* Actions act1 = new Actions(driver);
        waitfortheelement();
        act1.sendKeys(Keys.ENTER).build().perform();*/
        waitfortheelement();
    }

    public void searchContactName(WebDriver driver) {
        waitfortheelement();
        waitfortheelement();
        waitfortheelement();
        WebElement e = driver.findElement(By.xpath("//table[contains(@class,'uiVirtualDataTable')]//tbody"));
        e.click();
        waitfortheelement();

        List<WebElement> rows = e.findElements(By.tagName("tr"));
        WebElement firstRecordFound = rows.get(0);

        firstRecordFound.findElement(By.tagName("th")).findElement(By.tagName("a")).click();
        waitfortheelement();
        waitfortheelement();
        waitfortheelement();
    }

    public void clickTabName(WebDriver driver, String tagName) {
        waitfortheelement();
        //String filedTagName =TagName;
        WebElement elem = driver.findElement(By.xpath("//span[@class ='title'][text()='" + tagName + "']"));
        elem.click();
        waitfortheelement();
        waitfortheelement();
    }

    /* public void verifyDetails(WebDriver driver, String ept,String contactName){
         waitfortheelement();
         waitfortheelement();
        // String eptNum = driver.findElement(By.xpath("")).getText();
         //String cName= driver.findElement(By.xpath("")).getText();

 }*/
    public void abc(WebDriver driver) {
        driver.findElement(By.xpath("(//lightning-icon[@class='slds-icon-utility-chevrondown slds-icon_container'])[2]")).click();
    }

    public void abcd(WebDriver driver) {
        waitfortheelement();

        driver.findElement(By.xpath("//*[@class=\"slds-icon-utility-add slds-icon-text-default slds-m-right--x-small slds-shrink-none slds-icon_container\"]/../span")).click();
    }

    public void click_on_new_payment_number(WebDriver driver,String paymentnumber) {
        waitfortheelement();
       /* String e = driver.findElement(By.xpath("//tbody//a[contains(@href,'/lightning/r/a')][@title="+paymentnumber+"]")).getText();
        driver.findElement(By.xpath("//tbody//a[contains(@href,'/lightning/r/a')][@title="+paymentnumber+"]")).click();*/
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,50)");
        driver.findElement(By.xpath("//h1[@title='Payments']/../../../../../..//table//a[contains(@class,'slds-tr')]")).click();
        waitfortheelement();
    }
    public void i_click_on_paid_edit_button(WebDriver driver) {
        waitfortheelement();
        driver.findElement(By.xpath("//*[@title=\"Edit Paid\"]")).click();
    }
    public void I_make_payment_paid(WebDriver driver) {
        waitfortheelement();
        driver.findElement(By.xpath("//*[@class='uiInput uiInputCheckbox uiInput--default uiInput--checkbox']//input")).click();
    }
    public void I_click_on_date_edit_button(WebDriver driver) {
        waitfortheelement();
        driver.findElement(By.xpath("//a[@class=\"datePicker-openIcon display\"]")).click();
    }
    public void I_click_on_date(WebDriver driver,String pickDate) {
        waitfortheelement();
        System.out.println("***********************");
        System.out.println(pickDate);
        System.out.println("*********************");
        driver.findElement(By.xpath("//td[@class='slds-is-today slds-is-selected uiDayInMonthCell'][@data-datevalue='"+ pickDate + "']")).click();
    }
    public void clickOnrefund(WebDriver driver) {
        waitfortheelement();
        driver.findElement(By.xpath("(//span[@class=\"slds-form-element__label\" ])[1]")).click();
    }

    public void clickOnrefundtype(WebDriver driver) {
        waitfortheelement();
        waitfortheelement();
        driver.findElement(By.xpath("//*[@name=\"Refund_Type__c\"]")).click();
    }
    public void clickOnpartialrefund(WebDriver driver) {
        driver.findElement(By.xpath("//*[@data-value=\"Partial\"]")).click();
    }
    public void clickOnrefundamount(WebDriver driver) {
        waitfortheelement();
       WebElement e=driver.findElement(By.xpath("//*[@name=\"Refund_Amount__c\"]"));
                e.clear();
                e.sendKeys("50");
    }
    public void entervalue(WebDriver driver) {
        waitfortheelement();
        driver.findElement(By.xpath("")).click();
    }
    public void provideDetails(WebDriver driver,String fieldCaseOrigin,String fieldRefundInstrument,String fieldBankAccountNo,String fieldBankBSB,String CaseOrigin,String RefundInstrument,String BankAccountNo,String BankBSB) {
        waitfortheelement();
       // enterAllDetails(driver,fieldCaseOrigin, fieldRefundInstrument,fieldBankAccountNo,fieldBankBSB);

        driver.findElement(By.xpath("//*[@name='Origin']")).click();
        waitfortheelement();
        WebElement element = driver.findElement(By.xpath("//*[@name=\"Refund_Instrument__c\"]"));
        element.click();
        waitfortheelement();
        driver.findElement(By.xpath("//*[@name=\"Bank_Account_No__c\"]")).click();
        waitfortheelement();
        WebElement p = driver.findElement(By.xpath("//*[@name=\"Bank_BSB__c\"]"));
        p.click();
        waitfortheelement();

    }
    public void clickOnSavebutton(WebDriver driver) {
        waitfortheelement();
        driver.findElement(By.xpath("//*[@class=\"slds-button slds-button_brand\" and @name=\"save\"]")).click();
    }
}
