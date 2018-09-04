import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.nlbootcamps.com/')

WebUI.waitForPageLoad(10)

WebUI.waitForElementClickable(findTestObject('LoginPage/login_menu'), 5)

WebUI.click(findTestObject('LoginPage/login_menu'))

WebUI.waitForElementVisible(findTestObject('LoginPage/input_username'), 60)

WebUI.setText(findTestObject('LoginPage/input_username'), 'testss')

WebUI.waitForElementVisible(findTestObject('LoginPage/input_password'), 60)

WebUI.setText(findTestObject('LoginPage/input_password'), 'teststs')

WebUI.waitForElementClickable(findTestObject('LoginPage/input_btn submit-btn'), 17)

WebUI.click(findTestObject('LoginPage/input_btn submit-btn'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_NLBC  SignIn/a_Sign up'), 5)

WebUI.click(findTestObject('Object Repository/Page_NLBC  SignIn/a_Sign up'))

WebUI.waitForElementVisible(findTestObject('Page_NLBC  Register/signup_page_header'), 60)

String signUpPageHeader = WebUI.getText(findTestObject('Page_NLBC  Register/signup_page_header'))

WebUI.verifyEqual(signUpPageHeader,'Sign up to NLBootcamps')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_NLBC  Register/input_email'), 60)

WebUI.setText(findTestObject('Object Repository/Page_NLBC  Register/input_email'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_NLBC  Register/input_firstname'), 'tests')

WebUI.setText(findTestObject('Object Repository/Page_NLBC  Register/input_lastname'), 'sss')

WebUI.setText(findTestObject('Object Repository/Page_NLBC  Register/input_phoneNumber'), 'sss')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NLBC  Register/input_password'), 'exop7CN2+aE=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NLBC  Register/input_password2'), '8kB2e4WUG94=')

WebUI.click(findTestObject('Object Repository/Page_NLBC  Register/input_btn submit-btn'))

WebUI.closeBrowser()

