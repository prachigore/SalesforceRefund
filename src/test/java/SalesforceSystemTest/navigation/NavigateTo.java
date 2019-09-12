
package SalesforceSystemTest.navigation;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.JavascriptExecutor;
<<<<<<< HEAD
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
=======
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc

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
<<<<<<< HEAD
        WebElement a = driver.findElement(By.xpath("//input[@id='username']"));
        a.clear();
        a.sendKeys(userName);
=======
       WebElement a=driver.findElement(By.xpath("//input[@id='username']"));
               a.clear();
               a.sendKeys(userName);
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
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

<<<<<<< HEAD
   /* public void clickOnSave(WebDriver driver, String name) {
        waitfortheelement();
        driver.findElement(By.xpath("//button[@title='"+name+"']")).click();


    }*/

    public void click_on_new_opportunity_name(WebDriver driver, String opportunityName) {
        waitfortheelement();
        //String e = driver.findElement(By.xpath("//th//span[@class='slds-grid slds-grid--align-spread']//a[@title='" + opportunityName + "']")).getText();
        //System.out.println(e);
        driver.findElement(By.xpath("//*[@title='" + opportunityName + "']")).click();
=======
    public void clickOnSave(WebDriver driver, String buttonName) {
        waitfortheelement();
        driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button--neutral uiButton--b')]//span")).click();


    }

    public void click_on_new_opportunity_name(WebDriver driver, String opportunityName) {
        waitfortheelement();
        String e = driver.findElement(By.xpath("//th//span[@class='slds-grid slds-grid--align-spread']//a[@title='" + opportunityName + "']")).getText();
        driver.findElement(By.xpath("//th//span[@class='slds-grid slds-grid--align-spread']//a[@title='" + opportunityName + "']")).click();
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc

    }

    public void contactNameInSearch(WebDriver driver, String name) {
        waitfortheelement();
        waitfortheelement();
<<<<<<< HEAD
        //String contactName = getConfigurationDetails("Salesforce.contactName");
=======
//        String contactName = getConfigurationDetails("Salesforce.contactName");
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
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

<<<<<<< HEAD
   /* public void clickTabName(WebDriver driver, String tagName) {
=======
    public void clickTabName(WebDriver driver, String tagName) {
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
        waitfortheelement();
        //String filedTagName =TagName;
        WebElement elem = driver.findElement(By.xpath("//span[@class ='title'][text()='" + tagName + "']"));
        elem.click();
        waitfortheelement();
        waitfortheelement();
<<<<<<< HEAD
    }*/
=======
    }
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc

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

<<<<<<< HEAD
    public void click_on_new_payment_number(WebDriver driver, String paymentnumber) {
=======
    public void click_on_new_payment_number(WebDriver driver,String paymentnumber) {
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
        waitfortheelement();
       /* String e = driver.findElement(By.xpath("//tbody//a[contains(@href,'/lightning/r/a')][@title="+paymentnumber+"]")).getText();
        driver.findElement(By.xpath("//tbody//a[contains(@href,'/lightning/r/a')][@title="+paymentnumber+"]")).click();*/
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,50)");
        driver.findElement(By.xpath("//h1[@title='Payments']/../../../../../..//table//a[contains(@class,'slds-tr')]")).click();
        waitfortheelement();
    }
<<<<<<< HEAD

=======
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
    public void i_click_on_paid_edit_button(WebDriver driver) {
        waitfortheelement();
        driver.findElement(By.xpath("//*[@title=\"Edit Paid\"]")).click();
    }
<<<<<<< HEAD

=======
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
    public void I_make_payment_paid(WebDriver driver) {
        waitfortheelement();
        driver.findElement(By.xpath("//*[@class='uiInput uiInputCheckbox uiInput--default uiInput--checkbox']//input")).click();
    }
<<<<<<< HEAD

    /*public void I_click_on_date_edit_button(WebDriver driver) {
        waitfortheelement();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,-100)");
        driver.findElement(By.xpath("//button[contains(@class,'slds-button test-id__i') and @title=\"Edit Payment Date\"]")).click();
    }

    public void I_click_on_celender(WebDriver driver) {
        waitfortheelement();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,-100)");
        driver.findElement(By.xpath("(//*[@class=\"datePicker-openIcon display\"])[1]")).click();
    }*/
          /*public void selectPaymentDate(WebDriver driver, String fieldPaymentDate,String fieldDate) {
       driver.findElement(By.xpath("//div[@class='column left-col']//span[text()='"+fieldPaymentDate+"']/..//..//a[@class='datePicker-openIcon display']")).click();
//  driver.findElement(By.xpath("//label[@class='label inputLabel uiLabel-left form-element__label uiLabel']//span[text()='"+fieldPaymentDate+"']/..//..//a[@class='datePicker-openIcon display']")).click();
      waitfortheelement();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = new Date();
//        String strDate = dateFormat.format(date);

driver.findElement(By.xpath("//td[@class='uiDayInMonthCell'][@data-datevalue='"+fieldDate+"']")).click();

}*/

    public void I_click_on_date(WebDriver driver, String pickDate) {
        waitfortheelement();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,-200)");
        System.out.println("***********************");
        System.out.println(pickDate);
        System.out.println("*********************");
        //driver.findElement(By.xpath("//td[@class='slds-is-today slds-is-selected uiDayInMonthCell'][@data-datevalue='"+ pickDate + "']")).click();
        //driver.findElement(By.xpath("//*[@class='slds-day weekday selectedDate DESKTOP uiDayInMonthCell--default' and text()='14']")).click();
        driver.findElement(By.xpath("//*[text()='Today']/..")).click();
    }

    public void clickOnrefund(WebDriver driver, String refund) {
        waitfortheelement();
        driver.findElement(By.xpath("//*[text()='" + refund + "']")).click();
=======
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
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
    }

    public void clickOnrefundtype(WebDriver driver) {
        waitfortheelement();
        waitfortheelement();
        driver.findElement(By.xpath("//*[@name=\"Refund_Type__c\"]")).click();
    }
<<<<<<< HEAD

    public void clickOnpartialrefund(WebDriver driver) {
        driver.findElement(By.xpath("//*[@data-value=\"Partial\"]")).click();
    }

    public void clickOnrefundamount(WebDriver driver) {
        waitfortheelement();
        WebElement e = driver.findElement(By.xpath("//*[@name=\"Refund_Amount__c\"]"));
        e.clear();
        e.sendKeys("50");
    }
//    public void entervalue(WebDriver driver,String a) {
//        waitfortheelement();
//        driver.findElement(By.xpath("")).click();
//    }
  /*  public void provideDetails(WebDriver driver,String fieldCaseOrigin,String fieldRefundInstrument,String fieldBankAccountNo,String fieldBankBSB,String CaseOrigin,String RefundInstrument,String BankAccountNo,String BankBSB) {
        waitfortheelement();
        //enterAllDetails(driver,fieldCaseOrigin, fieldRefundInstrument,fieldBankAccountNo,fieldBankBSB);

        driver.findElement(By.xpath("//*[text()=\"Case Origin\"]")).click();
=======
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
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
        waitfortheelement();
        WebElement element = driver.findElement(By.xpath("//*[@name=\"Refund_Instrument__c\"]"));
        element.click();
        waitfortheelement();
        driver.findElement(By.xpath("//*[@name=\"Bank_Account_No__c\"]")).click();
        waitfortheelement();
        WebElement p = driver.findElement(By.xpath("//*[@name=\"Bank_BSB__c\"]"));
        p.click();
        waitfortheelement();
<<<<<<< HEAD
    }*/

   /* public void clickReund(WebDriver driver, String fieldCaseOrigin, String fieldRefundInstrument, String fieldBankAccountNo, String fieldBankBSB, String refundCaseOrigin, String refundRefundInstrument, String refundBankAccountNo, String refundBankBSB) {

        waitfortheelement();


        driver.findElement(By.xpath("//div[@class='slds-card__body']//label[text()='" + fieldCaseOrigin + "']")).click();
        driver.findElement(By.xpath("//div[@class='slds-card__body']//label[text()='" + fieldCaseOrigin + "']//..//..//span[@title='" + refundCaseOrigin + "']")).click();
        waitfortheelement();

        //driver.findElement(By.xpath("//div[@class='slds-card__body']//label[text()='" + fieldRefundType + "']")).click();
        //driver.findElement(By.xpath("//div[@class='slds-card__body']//label[text()='" + fieldRefundType + "']/..//span[@title='" + refundRefundType + "']")).click();

        waitfortheelement();
        waitfortheelement();
        driver.findElement(By.xpath("//div[@class='slds-card__body']//label[text()='" + fieldRefundInstrument + "']")).click();
        driver.findElement(By.xpath("//div[@class='slds-card__body']//label[text()='" + fieldRefundInstrument + "']/..//span[@title='" + refundRefundInstrument + "']")).click();

        waitfortheelement();
        waitfortheelement();
        driver.findElement(By.xpath("//div[@class='slds-card__body']//label[text()='" + fieldBankAccountNo + "']/..//input")).sendKeys(refundBankAccountNo);

        waitfortheelement();
        waitfortheelement();
        driver.findElement(By.xpath("//div[@class='slds-card__body']//label[text()='" + fieldBankBSB + "']/..//input")).sendKeys(refundBankBSB);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,50)");
        waitfortheelement();
        waitfortheelement();
    }*/

   /* public void clickOnSavebutton(WebDriver driver, String save) {
        waitfortheelement();
        driver.findElement(By.xpath("//*[@class='slds-button slds-button_brand' and @name='" + save + "']")).click();
    }*/


    public String validSuccessMessage(WebDriver driver, String message) {

        waitfortheelement();
        waitfortheelement();

        String str = driver.findElement(By.xpath("//div[@class='confirm uiMessage']//div[@class='uiBlock']//div[@class='bBody']")).getText();

        return str;
    }

//    public void ABC(WebDriver driver) {
//        waitfortheelement();
//        Actions action = new Actions(driver);
//        action.sendKeys(Keys.PAGE_UP).build().perform();
//        waitfortheelement();

//    }
    public void scrollUp(WebDriver driver){
        waitfortheelement();
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_UP).build().perform();
        waitfortheelement();
    }


  /*  public void clickSavebutton(WebDriver driver, String buttonName) {
        waitfortheelement();
        driver.findElement(By.xpath("//*[@class=\"slds-button slds-button_brand\" and @name='"+buttonName+"']")).click();

   }*/
/*adjustment*/

    public void recentlyViewedDropdown(WebDriver driver, String dropdown) {
        waitfortheelement();
        driver.findElement(By.xpath("//a[contains(@class,'slds-button slds-button--reset d')][contains(@title,'" + dropdown + "')]")).click();
        waitfortheelement();
//        Actions act1 = new Actions(driver);
//        waitfortheelement();
//        act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//        waitfortheelement();
    }

    public void allContacts(WebDriver driver, String contact) {
        waitfortheelement();
        driver.findElement(By.xpath("//span[@class= ' virtualAutocompleteOptionText'][contains(text(),'" + contact + "')]")).click();
        waitfortheelement();
        Actions act1 = new Actions(driver);
        waitfortheelement();
        act1.sendKeys(Keys.ENTER).build().perform();
        waitfortheelement();
    }

    public void contactNameInSearch1(WebDriver driver, String name) {
        waitfortheelement();
//        String contactName = getConfigurationDetails("Salesforce.contactName");
        String contactName = name;
        driver.findElement(By.xpath("//input[@name='Contact-search-input']")).sendKeys(contactName);
        waitfortheelement();
        Actions act1 = new Actions(driver);
        waitfortheelement();
        act1.sendKeys(Keys.ENTER).build().perform();
        waitfortheelement();
    }
    public void clickOpportunitybutton(WebDriver driver, String fieldValue) {
       waitfortheelement();
        driver.findElement(By.xpath("//div//a[@class='rlql-relatedListLink']//span[@title='" + fieldValue + "']")).click();
        waitfortheelement();
    }

    public void clickopportunityname(WebDriver driver, String opportunityName) {
        waitfortheelement();
        String e = driver.findElement(By.xpath("//th//span[@class='slds-grid slds-grid--align-spread']//a[@title='" + opportunityName + "']")).getText();
        driver.findElement(By.xpath("//th//span[@class='slds-grid slds-grid--align-spread']//a[@title='" + opportunityName + "']")).click();
        waitfortheelement();

        System.out.println("----------------------------");
        System.out.println(e);
//        System.out.println("----------------------------");
    }

    public void clickTabName(WebDriver driver, String tagName) {
        waitfortheelement();
        //String filedTagName =TagName;
        WebElement elem = driver.findElement(By.xpath("(//div[@class='uiTabBar']//a[@class='tabHeader'][@title='"+ tagName +"']//span[@class='title'][text()='"+ tagName +"'])[2]"));
        elem.click();
        waitfortheelement();
        waitfortheelement();
    }
    public void clickOnPayment(WebDriver driver) {
        waitfortheelement();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,150)");
        driver.findElement(By.xpath("//th//div//a[contains(@class,'textUnderline outputLookupLink')]")).click();
        waitfortheelement();
//        driver.findElement(By.xpath("//div[@class='showPreview forceRelatedListQuickLinksContainer']//span[@class='rlql-label'][text()='"+Payclick+"']")).click();

    }
    public void clickOnCheckbox(WebDriver driver, String filedCheckbox, String filedEditPaid) {
        waitfortheelement();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,150)");
        driver.findElement(By.xpath("//div[contains(@class,'slds-col slds-grid slds-has-flexi')]//span[text()='" + filedCheckbox + "']/../..//button[contains(@class,'slds-button test-id')][@title='" + filedEditPaid + "']")).click();
        driver.findElement(By.xpath("//div[contains(@class,'slds-col slds-grid slds-has-flexi')]/..//label//span[text()='" + filedCheckbox + "']/../..//input[@type='checkbox']")).click();
    }
    public void selectPaymentDate(WebDriver driver, String filedPaymentDate, String Date) {
        driver.findElement(By.xpath("//label[contains(@class,'label inputLabel')]//span[text()='" + filedPaymentDate + "']/../..//a[contains(@class, 'datePicker-openIcon')]")).click();
        waitfortheelement();
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = new Date();
//        String strDate =dateFormat.format(date);

        driver.findElement(By.xpath("//td[@class='uiDayInMonthCell'][@data-datevalue='" + Date + "']")).click();

    }

    public void clickOnSave(WebDriver driver, String buttonName) {

        driver.findElement(By.xpath("//button[@title='" + buttonName + "']//span[@class=' label bBody']")).click();

        try {
            String duplicateMessage = driver.findElement(By.xpath("//div[@class ='slds-col slds-align-middle']")).getText();

            if (duplicateMessage != null && duplicateMessage.contains("duplicate")) {
                driver.findElement(By.xpath("//button[@title='" + buttonName + "']//span[@class=' label bBody']")).click();
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Second Save Button Doesn't Exist");
        }
    }

    public void scrollUP(WebDriver driver) {
        waitfortheelement();
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_UP).build().perform();
        waitfortheelement();

    }

    public void clickRadioButton(WebDriver driver, String filedName) {
        waitfortheelement();
        driver.findElement(By.xpath("//label[@class='slds-radio__label']//span[text()='Adjustment']")).click();
    }
    //"//div//span[@class='slds-radio']/..//label[@class='slds-radio__label']//span[text()='"+ filedName +"']
    public void adjbtn(WebDriver driver, String arg0) {

       waitfortheelement();

   driver.findElement(By.xpath("//div[@class='slds-card__body']//label[@class='slds-radio__label']//span[@class='slds-radio_faux']//..//span[@class=\"slds-form-element__label\"and text()='"+arg0+"']")).click();
    }
    public void clearcampaignname (WebDriver driver){
        waitfortheelement();
      driver.findElement(By.xpath("//div[@class='slds-card__body']//button[@title='Remove']")).click();
    }

    public void clearproduct(WebDriver driver){
        waitfortheelement();
        driver.findElement(By.xpath("(//*[@class=\"slds-button slds-pill__remove slds-button_icon-bare\"])[2]")).click();
    }
    public void clearamount(WebDriver driver){
        waitfortheelement();
        driver.findElement(By.xpath("//input[@name='allAmount']")).clear();
    }
   /* public void clickcomponents(WebDriver driver,String fieldcampaignname,String fieldproduct,String fieldamount, String campaign, String product, String amount){
        waitfortheelement();
       *//* driver.findElement(By.xpath("//div[@class='slds-card__body']//input[contains(@class,'slds-lookup__search-input slds-input leftPaddingClass')][1]")).click();
        waitfortheelement();
        driver.findElement(By.xpath("//div[@class='slds-card__body']//span[@class='slds-listbox__option-text slds-listbox__option-text_entity'][text()='"+campaign+"']")).click();
        waitfortheelement();

        driver.findElement(By.xpath("//div[@class='slds-card__body']//input[contains(@class,'slds-lookup__search-input slds-input leftPaddingClass')][2]")).click();
        waitfortheelement();
        driver.findElement(By.xpath("//div[@class='slds-card__body']//span[@class='slds-listbox__option-text slds-listbox__option-text_entity'][text()='"+product+"']")).click();*//*

        driver.findElement(By.xpath("//div[@class=\"slds-form-element__control slds-grow\"]//input[@name='"+amount+"']")).sendKeys("-100");
        waitfortheelement();
    }*/

    public void enteramount(WebDriver driver){
        waitfortheelement();
        //driver.findElement(By.xpath("//div[@class=\"slds-form-element__control slds-grow\"]//input[@name='"+amount+"']")).click();
        //driver.findElement(By.xpath("//div[@class=\"slds-form-element__control slds-grow\"]//input[@name='"+amount+"']")).sendKeys("-100");
   driver.findElement(By.xpath("//div[@class=\"slds-form-element__control slds-grow\"]//input[@type='number']")).click();
        driver.findElement(By.xpath("//div[@class=\"slds-form-element__control slds-grow\"]//input[@type='number']")).sendKeys("-11");
    }
    public void message(WebDriver driver,String arg6){
        waitfortheelement();
        driver.findElement(By.xpath("//div[@class=\"bBody\"]")).click();
    }
}

=======

    }
    public void clickOnSavebutton(WebDriver driver) {
        waitfortheelement();
        driver.findElement(By.xpath("//*[@class=\"slds-button slds-button_brand\" and @name=\"save\"]")).click();
    }
}
>>>>>>> 282e19ec90068048ed0d4d5ae3e18a29ae88b2fc
