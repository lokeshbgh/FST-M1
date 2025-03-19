from selenium import webdriver
from selenium.webdriver.common.by import By

#create WebDriver instance
with webdriver.Firefox() as driver:

    #go to web page
    driver.get("https://training-support.net/webelements/dynamic-controls")

    #do the stuff on the page
    pageTitle = driver.title
    print("Title of the page is : " + pageTitle)

    #Find the 3rd header and print its text
    checkbox = driver.find_element(By.ID, "checkbox")
    print("Checkbox is visible: " , checkbox.is_displayed())

    #Find the 5th header and print its color
    print("Click the Toggle Checkbox button - ")
    checkbox_toggle = driver.find_element(By.XPATH, "/html/body/div/main/div/div/div/div/div[2]/section[1]/button").click()
    	
	#Find the violet button and print its classes
    print("Checkbox is visible: " , checkbox.is_displayed())
    
    #close the browser
    driver.quit()