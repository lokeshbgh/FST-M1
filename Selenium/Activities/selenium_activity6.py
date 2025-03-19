from selenium import webdriver
from selenium.webdriver.common.by import By

#create WebDriver instance
with webdriver.Firefox() as driver:

    #go to web page
    driver.get("https://training-support.net/webelements/dynamic-controls")

    #do the stuff on the page
    pageTitle = driver.title
    print("Title of the page is : " + pageTitle)

    #Find the checkbox input element.
    checkbox = driver.find_element(By.ID, "checkbox")

    #Check if the checkbox is selected and print the result.
    print("Checkbox is selected: " , checkbox.is_selected())
    
    #Click the checkbox to select it.
    checkbox.click()
    
    #Check if the checkbox is selected again and print the result.
    print("Checkbox is selected: " , checkbox.is_selected())

    #close the browser
    driver.quit()