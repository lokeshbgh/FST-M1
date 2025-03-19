from selenium import webdriver
from selenium.webdriver.common.by import By

#create WebDriver instance
with webdriver.Firefox() as driver:

    #go to web page
    driver.get("https://training-support.net/webelements/target-practice")

    #do the stuff on the page
    pageTitle = driver.title
    print("Title of the page is : " + pageTitle)

    #Find the 3rd header and print its text
    textHeader = driver.find_element(By.XPATH, "/html/body/div/main/div/div/div/div/div[2]/h3[1]").text
    print("Text on 3rd header is: " + textHeader)

    #Find the 5th header and print its color
    colorHeader = driver.find_element(By.XPATH, "//h5[contains(text(), '#5')]").value_of_css_property("color")
    print("color of 5th header is: " + colorHeader)
	
	#Find the violet button and print its classes
    classButton = driver.find_element(By.XPATH, "/html/body/div/main/div/div/div/div/div[2]/button[5]").get_attribute("class")
    print("classes of violet button is: " + classButton)

    #Find the grey button and print its text
    textHeader = driver.find_element(By.XPATH, "//button[contains(@class, 'slate')]").text
    print("Text on grey button is: " + textHeader)
    
    #close the browser
    driver.quit()