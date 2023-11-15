import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.sikuli.script.Pattern as Pattern
import org.sikuli.script.Screen as Screen



WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.online-calculator.com//html5/simple/index.php?v=10')

WebUI.delay(5)

Screen s = new Screen()

Pattern click3Button = new Pattern(RunConfiguration.getProjectDir()+ '\\SikuliImages\\3Button.PNG')

Pattern click7Button = new Pattern(RunConfiguration.getProjectDir()+ '\\SikuliImages\\7Button.PNG')

Pattern clickPlusButton = new Pattern(RunConfiguration.getProjectDir()+ '\\SikuliImages\\plusButton.PNG')

Pattern click9Button = new Pattern(RunConfiguration.getProjectDir()+ '\\SikuliImages\\9Button.PNG')

Pattern click1Button = new Pattern(RunConfiguration.getProjectDir()+ '\\SikuliImages\\1Button.PNG')

Pattern clickequalButton = new Pattern(RunConfiguration.getProjectDir()+ '\\SikuliImages\\equalButton.PNG')

Pattern getresultButton = new Pattern(RunConfiguration.getProjectDir()+ '\\SikuliImages\\resultButton.PNG')


s.wait(click3Button, 10)
s.click(click3Button)

s.wait(click7Button, 10)
s.click(click7Button)

s.wait(clickPlusButton, 10)
s.click(clickPlusButton)

s.wait(click9Button, 10)
s.click(click9Button)

s.wait(click1Button, 10)
s.click(click1Button)

s.wait(clickequalButton, 10)
s.click(clickequalButton)



