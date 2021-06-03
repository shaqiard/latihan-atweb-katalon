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

WebUI.navigateToUrl('https://gist.github.com/discover')

WebUI.click(findTestObject('Object Repository/Page_Discover gists  GitHub/a_Signin'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 
    'shaqiard')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Password_password'), 'W1jrqma3d7gRjEvJ9/jOBw==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Password_commit'))

WebUI.click(findTestObject('Object Repository/Page_Discover gists/svg_Sign out_octicon octicon-plus d-none d-_8b831b'))

WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/input_View your gists_gistdescription'), 'testing')

WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/input_View your gists_gistcontentsname'), 'testing')

WebUI.click(findTestObject('Object Repository/Page_Create a new Gist/div_1'))

WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/div_1testing2testing3testing'), '<div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">1</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">testing</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">2</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">testing</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">3</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">testing</span></pre></div>')

WebUI.click(findTestObject('Object Repository/Page_Create a new Gist/button_Create secret gist'))

WebUI.click(findTestObject('Object Repository/Page_testing/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Editing testing/input_Delete_gistdescription'), 'testing edit testing update testing')

WebUI.setText(findTestObject('Object Repository/Page_Editing testing/input_Delete_gistcontentsname'), 'testing update testing')

WebUI.click(findTestObject('Object Repository/Page_Editing testing/div_1testing2testing3testing'))

WebUI.setText(findTestObject('Object Repository/Page_Editing testing/div_1testing2testing3testing4update5update'), '<div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">1</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">testing</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">2</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">testing</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">3</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">testing</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">4</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">update</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">5</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">update</span></pre></div>')

WebUI.click(findTestObject('Object Repository/Page_Editing testing/button_Update secret gist'))

WebUI.click(findTestObject('Object Repository/Page_testing edit testing update testing/button_Delete'))

WebUI.click(findTestObject('Object Repository/Page_shaqiards gists/summary_Sign out_Header-link name'))

WebUI.click(findTestObject('Object Repository/Page_shaqiards gists/button_Sign out'))

WebUI.click(findTestObject('Object Repository/Page_Sign out/input_Are you sure you want to sign out_btn_960785'))

