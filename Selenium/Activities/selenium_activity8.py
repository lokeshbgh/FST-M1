from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

#create WebDriver instance
with webdriver.Firefox() as driver:

    # Declare the actions variable
    builder = ActionChains(driver)

    #go to web page
    driver.get("https://training-support.net/webelements/mouse-events")

    #do the stuff on the page
    pageTitle = driver.title
    print("Title of the page is : " + pageTitle)

    cargoLock = driver.find_element(By.XPATH, "//h1[text()='Cargo.lock']")
    cargoToml = driver.find_element(By.XPATH, "//h1[text()='Cargo.toml']")
    srcButton = driver.find_element(By.XPATH, "//h1[text()='src']")
    targetButton = driver.find_element(By.XPATH, "//h1[text()='target']")
        
    #Perform left click on Cargo.lock and then on Cargo.toml
    builder.click(cargoLock).pause(1).perform()
        
    #Print the front side text
    actionMessage = driver.find_element(By.ID, "result").text
    print(actionMessage)
        
    builder.move_to_element(cargoToml).pause(1).click(cargoToml).perform()
        
    #Print the front side text
    actionMessage = driver.find_element(By.ID, "result").text
    print(actionMessage)

    #Perform double click on src then right click on target
    builder.double_click(srcButton).pause(1).perform()
        
    #Print the front side text
    actionMessage = driver.find_element(By.ID, "result").text
    print(actionMessage)
        
    builder.context_click(targetButton).pause(1).perform()
        
    #and then open it
    builder.click(driver.find_element(By.XPATH, "//div[@id='menu']/div/ul/li[1]")).pause(1).perform()
        
    #Print the front side text
    actionMessage = driver.find_element(By.ID, "result").text
    print(actionMessage)

    #close the browser
    driver.quit()