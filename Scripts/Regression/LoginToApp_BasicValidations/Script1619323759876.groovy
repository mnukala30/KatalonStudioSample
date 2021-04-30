import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/AmazonLaunch_BookSearch/Page_Amazon.com Online Shopping for Electro_1f0c68/span_Hello, Sign in'))

WebUI.maximizeWindow()

WebUI.getWindowTitle()

WebUI.setText(findTestObject('Object Repository/AmazonLaunch_BookSearch/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    'mahesh.nukala.tcs@gmail.com')

WebUI.click(findTestObject('Object Repository/AmazonLaunch_BookSearch/Page_Amazon Sign-In/input_Enter your email or mobile phone numb_fc7402'))

WebUI.setEncryptedText(findTestObject('Object Repository/AmazonLaunch_BookSearch/Page_Amazon Sign-In/input_Forgot your password_password'), 
    'woLEO5Tizr6Fn08VUhqm7w==')

WebUI.click(findTestObject('Object Repository/AmazonLaunch_BookSearch/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

WebUI.setText(findTestObject('Object Repository/AmazonLaunch_BookSearch/Page_Amazon.com Online Shopping for Electro_1f0c68/input_All_field-keywords'), 
    'Python Programming in books')

WebUI.sendKeys(findTestObject('Object Repository/AmazonLaunch_BookSearch/Page_Amazon.com Online Shopping for Electro_1f0c68/input_All_field-keywords'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Object Repository/AmazonLaunch_BookSearch/Page_Amazon.com  Python Programming in books/span_Python Programming in books'), 
    0)

WebUI.click(findTestObject('Object Repository/AmazonLaunch_BookSearch/Page_Amazon.com  Python Programming in books/img_Kindle_s-image'))

WebUI.closeBrowser()

