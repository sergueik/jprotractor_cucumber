### Info
This project exercised a  Cucumber jProtracror integration.
Thanks to the class hierarchy of the latter, it is quite easy to mix the core Selenium-backed annotationa and jProtractor ones:

e.g. in the angular Calculator demo Page definiton class one can swap

```java
private static final By button = By.id("gobutton"); 

```
wih
```Java
private static final By button = NgBy.partialButtonText("Go"); 
```
The custom methods with `org.openqa.selenium.By` arguments would accept `com.github.sergueik.jprotractor.NgBy`.

### See Also

  * [maggie-wang/CucumberProject](https://github.com/maggie-wang/CucumberProject), 
  * [hdeiner/Java-Cucumber-Selenium-Sample](https://github.com/hdeiner/Java-Cucumber-Selenium-Sample)
  * [Java Cucumber Youtube Tutorial](https://www.youtube.com/watch?v=pD4B839qfos&list=PL_noPv5wmuO_t6yYbPfjwhJFOOcio89tI)
  * [cucumber-jvm](https://github.com/cucumber/cucumber-jvm)
  * [Cucumber hooks](https://sukesh15.gitbooks.io/cucumber-jvm-test-framework-)
  * [old Cucumber scenario hooks](http://zsoltfabok.com/blog/2012/09/cucumber-jvm-hooks/)
  * [Java](http://www.dokwork.ru/2015/08/cucumber.html)
  
  
### License
This project is licensed under the terms of the MIT license.

### Author
[Serguei Kouzmine](kouzmine_serguei@yahoo.com)
