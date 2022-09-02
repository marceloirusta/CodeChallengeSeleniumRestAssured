# CodeChallengeSeleniumRestAssured
In order to run this repository, the only thing you'll need to do is making sure that the path on this lane has your OS:
factoryBrowser/Chrome.java:19

Example If you're using a mac, just replace 'windows' to 'mac':

System.setProperty("webdriver.chrome.driver",(PROJECT_PATH+"src+test+java+drivers+windows+chromedriver.exe").replace("+",File.separator));
 
 to
 
System.setProperty("webdriver.chrome.driver",(PROJECT_PATH+"src+test+java+drivers+mac+chromedriver.exe").replace("+",File.separator));

This repository is using chromedriver version 105, if you're using a different version please update the corresponding file in this path according to your OS"

src/test/java/drivers

---------------------------------------

To run shopping cart test:

1. Shopping cart: src/test/java/ShoppingCartTest.java
2. Run the test under this class

To run breaking bad API test:

1. Breaking bad test: src/test/java/breakingBadAPI/BreakingBadTest.java
2. Run the 2 test cases under this class
