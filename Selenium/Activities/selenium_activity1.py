from selenium import webdriver
from selenium.webdriver.common.by import By

#create WebDriver instance
with webdriver.Firefox() as driver:

    #go to web page
    driver.get("https://training-support.net")

    #do the stuff on the page
    pageTitle = driver.title
    print("Title of the page is : " + pageTitle)

    # Find the "About Us" button on the page using ID and click it
    #driver.find_element(By.LINK_TEXT, "About Us").click()
    driver.find_element(By.XPATH, "/html/body/div/main/div/div/main/a").click()

    # Print the title of the new page
    pageTitle = driver.title
    print("New page title is: ", pageTitle)
    #close the browser
    driver.quit()