import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

//To import the dependencies such as "cucumber.api.java.en.And , Given, Then, & When" press "Ctrl + Shift + O" on your keyboard


public class LoginSteps {

	@Given("User in login page")
	public void user_in_login_page() {

		//println "I am inside Given"
		WebUI.openBrowser('')
		WebUI.delay(3)
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
	}

	@When("User input (.*) & (.*)")
	public void user_input_username_Password(String username, String password) {

		//println "I am inside When"
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), password)
	}

	@And("Clicks on button login")
	public void clicks_on_button_login() {

		//println "I am inside And"
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))
	}

	@Then("User redirected to homepage")
	public void user_redirected_to_homepage() {

		//println "I am inside Then"
		WebUI.verifyTextPresent('Welcome', false)
		WebUI.closeBrowser()
	}

}
