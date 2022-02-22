### Automated SignIn and SignOut to GreytHR portal at configured time interval

Note: This readme.md is designed for linux user as of now

**Prerequistes:**
1. Python3
2. google-chrome: download from https://www.google.com/intl/en_in/chrome/
3. chromedriver
- download from https://chromedriver.chromium.org/downloads; based on your google-chrome version
4. pip: sudo apt install python3-pip
5. selenium library: sudo pip3 install selenium
6. cron: for installation refer - https://stackoverflow.com/questions/1802337/how-to-install-cron

**Steps:**
- create a crontab entry: 
    1. crontab -e
    2. append the entry provide at the end of file: _python3 ~/path/to/repo/Automation/SignInSignOut.py_
- extract the downloaded chromedriver package; and place 'chromedriver' file into the _/usr/bin/_ directory

- install selenium library using _pip install selenium_

- run the code using below command:
python3 ~/path/to/repo/Automation/SignInSignOut.py

- logs are stored in /tmp/test.txt

**Feautre scope:**
- to come up with auto-check-and-setup-prerequisite