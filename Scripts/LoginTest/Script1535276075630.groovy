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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.nlbootcamps.com/')

WebUI.verifyEqual(WebUI.getWindowTitle(), 'NLBC')

WebUI.waitForElementClickable(findTestObject('LoginPage/login_menu'), 5)

WebUI.verifyElementPresent(findTestObject('LoginPage/login_menu'), 5)

WebUI.verifyElementVisible(findTestObject('LoginPage/login_menu'))

WebUI.click(findTestObject('LoginPage/login_menu'))

WebUI.waitForElementVisible(findTestObject('LoginPage/login_page_header'), 60)

WebUI.verifyElementText(findTestObject('LoginPage/login_page_header'), 'Log in to NLBootcamps')

WebUI.waitForElementVisible(findTestObject('LoginPage/input_username'), 60)

WebUI.setText(findTestObject('LoginPage/input_username'), username)

WebUI.waitForElementVisible(findTestObject('LoginPage/input_password'), 60)

WebUI.setText(findTestObject('LoginPage/input_password'), password)

WebUI.waitForElementClickable(findTestObject('LoginPage/input_btn submit-btn'), 17)

WebUI.click(findTestObject('LoginPage/input_btn submit-btn'))

WebUI.closeBrowser()

