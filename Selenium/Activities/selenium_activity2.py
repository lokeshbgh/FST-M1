from selenium import webdriver
from selenium.webdriver.common.by import By

#create WebDriver instance
with webdriver.Firefox() as driver:

    #go to web page
    driver.get("https://training-support.net/webelements/login-form/")

    #do the stuff on the page
    pageTitle = driver.title
    print("Title of the page is : " + pageTitle)

    # enter credentials in the username and password fields
    username = driver.find_element(By.NAME, "username")
    username.send_keys("admin")
		
    driver.find_element(By.ID, "password").send_keys("password")
	#driver.find_element(By.NAME, "password").send_keys("password")
	#driver.find_element(By.XPATH, "//*[@id=\"password\"]").send_keys("password")

    #driver.find_element(By.LINK_TEXT, "Password").send_keys("password") --not working
		
	#click submit button
    #driver.find_element(By.LINK_TEXT, "Submit").click(); --not working
    driver.find_element(By.XPATH, "/html/body/div/main/div/div/div/div/div[2]/form/button").click()

	#Print the confirmation message
    message = driver.find_element(By.CSS_SELECTOR, "h1.text-center")
    print("confirmation message is: ", message.text)
    
    # Print the title of the new page
    pageTitle = driver.title
    print("New page title is: ", pageTitle)
    
    #close the browser
    driver.quit()