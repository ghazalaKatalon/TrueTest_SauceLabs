import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Click on div AppLogo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_html/div_AppLogo'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on div AppLogo.png')

"Step 4: Click on button OpenMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_html/button_OpenMenu'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button OpenMenu.png')

"Step 5: Click on link AllItems"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_html/link_AllItems'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link AllItems.png')

"Step 6: Click on link AllItems"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_html/link_AllItems'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link AllItems.png')

"Step 7: Click on div AppLogo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_html/div_AppLogo'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on div AppLogo.png')

"Step 8: Click on button addToCart (CloseMenu)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_html/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_html/button_addToCart', ['button_addToCart_dataTest': button_addToCart_dataTest]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button addToCart CloseMenu.png')

"Step 9: Click on button addToCart (AddToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_html/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_html/button_addToCart', ['button_addToCart_dataTest': button_addToCart_dataTest_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button addToCart AddToCart.png')

"Step 10: Click on button addToCart (AddToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_html/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_html/button_addToCart', ['button_addToCart_dataTest': button_addToCart_dataTest_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button addToCart AddToCart2.png')

"Step 11: Click on button addToCart (AddToCart3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_html/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_html/button_addToCart', ['button_addToCart_dataTest': button_addToCart_dataTest_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on button addToCart AddToCart3.png')

"Step 12: Click on button addToCart (AddToCart4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_html/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_html/button_addToCart', ['button_addToCart_dataTest': button_addToCart_dataTest_4]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on button addToCart AddToCart4.png')

"Step 13: Click on link ShoppingCart -> Navigate to page 'static#cart.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_html/link_ShoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on link ShoppingCart - Navigate to page staticcarthtml.png')

"Step 14: Click on link ShoppingCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_static/link_ShoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on link ShoppingCart.png')

"Step 15: Click on button Checkout -> Navigate to page 'checkout process#checkout-step-one.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_static/button_Checkout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on button Checkout - Navigate to page checkout processcheckout-step-onehtml.png')

"Step 16: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_process/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on input FirstName.png')

"Step 17: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_process/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on input LastName.png')

"Step 18: Click on input PostalCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_process/input_PostalCode'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on input PostalCode.png')

"Step 19: Click on input Continue -> Navigate to page 'checkout#checkout-step-two.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_process/input_Continue'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on input Continue - Navigate to page checkoutcheckout-step-twohtml.png')

"Step 20: Click on button Finish -> Navigate to page 'checkout complete#checkout-complete.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_Finish'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on button Finish - Navigate to page checkout completecheckout-completehtml.png')

"Step 21: Click on button BackHome -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout-complete.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_complete/button_BackHome'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on button BackHome - Navigate to page .png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Shopping Workflow from Login to Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}