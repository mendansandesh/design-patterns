from selenium import webdriver
from time import sleep
from datetime import datetime
import os

with os.fdopen(os.open('/tmp/test.txt', os.O_WRONLY | os.O_CREAT, 0o664), 'a+') as f:
	USERNAME = '<your username>'
	PASSWORD = '<your password>'

	driver_location = '/usr/bin/chromedriver'
	binary_location = '/usr/bin/google-chrome'

	options = webdriver.ChromeOptions()
	options.binary_location = binary_location

	driver = webdriver.Chrome(executable_path=driver_location, options=options)
	f.write('{} - Visiting GreytHR URL: https://algonomy.greythr.com/ \n'.format(datetime.now()))
	driver.get('https://algonomy.greythr.com/')

	sleep(2)
	f.write('{} - Entering Username and Password \n'.format(datetime.now()))
	user_input = driver.find_element_by_id('username')
	user_input.send_keys(USERNAME)

	password_input = driver.find_element_by_id('password')
	password_input.send_keys(PASSWORD)

	driver.find_element_by_css_selector("button[type='submit']").click() 
	f.write('{} - Logged into the portal \n'.format(datetime.now()))
	sleep(4)

	elem = driver.find_element_by_xpath('//button[normalize-space()]')
	f.write('{} - Current button text: \n'.format(elem.text))
	
	if elem.text == 'Sign In':
		driver.find_element_by_class_name("btn-primary").click()
		f.write('{} - Employee SignIn Successful.. \n'.format(datetime.now()))

	if elem.text == 'Sign Out':
		driver.find_element_by_class_name("btn-primary").click()
		f.write('{} - Employee SignOut Successful.. \n'.format(datetime.now()))




