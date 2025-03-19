from selenium import webdriver
from selenium.webdriver.common.by import By

#create WebDriver instance
with webdriver.Firefox() as driver:

    #go to web page
    driver.get("https://training-support.net/webelements/dynamic-controls")

    #do the stuff on the page
    pageTitle = driver.title
    print("Title of the page is : " + pageTitle)

    #Find the text field.
    textInput = driver.find_element(By.ID, "textInput")

    #Check if the text field is enabled and print it.
    print("textInput is enabled: " , textInput.is_enabled())
    
    #Click the "Enable Input" button to enable the input field.
    driver.find_element(By.XPATH, "//*[@id=\"textInputButton\"]").click()
    
    #Check if the text field is enabled again and print it.
    print("textInput is enabled: " , textInput.is_enabled())


    if textInput.is_enabled() != True:
        driver.find_element(By.XPATH, "//*[@id=\"textInputButton\"]").click()
		
    textInput.send_keys("Example text")
    print(textInput.get_attribute("value"))

    #close the browser
    driver.quit()