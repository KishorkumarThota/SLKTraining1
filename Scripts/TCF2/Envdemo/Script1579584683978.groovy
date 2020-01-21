import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/dashboard')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/h1_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Performance'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Manage Reviews'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Employee Name_performanceReview360SearchFormemployeeName'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Employee Name_performanceReview360SearchFormemployeeName'), 
    'an')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li_Hannah Flores'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OrangeHRM/select_AllAccount ClerkCEOFinance ManagerHR ExecutiveHR ManagerIT ExecutiveIT ManagerSales ExecutiveSales Manager'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OrangeHRM/select_AllInactiveActivatedApprovedIn Progress'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_From Date_performanceReview360SearchFormfromDate'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_22'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_To Date_performanceReview360SearchFormtoDate'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/td_30'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Reviewer_performanceReview360SearchFormreviwerName'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Reviewer_performanceReview360SearchFormreviwerName'), 
    't')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li_Thomas Fleming'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Reviewer_btnSearch'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Username_searchSystemUseruserName'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_fionagrace'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__systemUseremployeeNameempName'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__systemUseremployeeNameempName'), 'Fiona Grace')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li_Fiona Grace'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_OrangeHRM 433 2005 - 2020 OrangeHRM Inc All rights reserved'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__btnCancel'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Welcome Admin'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

