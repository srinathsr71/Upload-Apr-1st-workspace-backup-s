package com.WAF.Actions;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Actionsclass {
	
	

		
		
		public void navigateToUrl(WebDriver driver,String url) {
		    try {
		        //driver.navigate().to(url);
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.open(arguments[0])", url);
		    } catch (Exception e) {
		        // Handle any exceptions that might occur during navigation
		        e.printStackTrace(); // For logging
		    }
		}
		public String getTitlePage(WebDriver driver)
		{
		return  driver.getTitle();
		}
		
		public void clickElement(WebDriver driver,WebElement element)
		{
			element.click();
		}
		
		//sending text to one web element use this method
		public void sendKeysToElement(WebElement element,CharSequence... keys) {
	              element.sendKeys(keys);
	   	}
		






		//sending text to more than one web element use this method
		public void sendKeysToElements(Map<WebElement, CharSequence> elementTextMap) {
		    try {
		        for (Map.Entry<WebElement, CharSequence> entry : elementTextMap.entrySet()) {
		            WebElement element = entry.getKey();
		            CharSequence keys = entry.getValue();
		            element.sendKeys(keys);
		        }
		    } catch (Exception e) {
		        e.printStackTrace(); // For logging
		    }
		}
		
		public String getElementText(WebElement ele) {
	       return ele.getText();
	   	}
		
		public String getElementAttribute(WebElement element,String attributeName) {
	       	return element.getAttribute(attributeName);
	   	}
		public boolean isElementPresent(WebElement ele) {
	       	try {
	           return true;
	       	} catch (NoSuchElementException e) {
	           	return false;
	       }
	   }
		
		public void scrollToElement(WebDriver driver,WebElement ele) {
	       	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	   	}
		public void selectDropdownByVisibleText(WebElement ele,String visibleText) {
	       	Select dropdown = new Select(ele);
	       	dropdown.selectByVisibleText(visibleText);
	   	}
		
		public void selectDropDownByValue(WebElement ele,String value) {
			Select dropdown=new Select(ele);
			dropdown.selectByValue(value);
		}
		
		public void selectDropDownByIndex(WebElement ele,int index) {
			Select dropdown=new Select(ele);
			dropdown.selectByIndex(index);
		}
		












		//validation methods of elements in selenium
		public boolean isElementDisplayed(WebElement ele) {
	       	try {
	       	ele.isDisplayed();
	           return true;
	       	} catch (ElementNotInteractableException e) {
	           return false;
	       }
	   }
		
		public boolean isElementEnabled(WebElement ele) {
	       	try {
	       	ele.isEnabled();
	           return true;
	       	} catch (ElementNotInteractableException e) {
	           return false;
	       }
	   }
		
		public boolean isElementSelected(WebElement ele) {
	      	 try {
	       	ele.isSelected();
	           return true;
	       	} catch (ElementNotInteractableException e) {
	           return false;
	       }
	   }


	public void clearAndSendKeysToElement(Map<WebElement, CharSequence> elementTextMap) { 
	       try {
		        for (Map.Entry<WebElement, CharSequence> entry : elementTextMap.entrySet()) {
		            WebElement element = entry.getKey();
		            CharSequence keys = entry.getValue();
		            element.clear();
		            element.sendKeys(keys);
		        }
		    } catch (Exception e) {
		        e.printStackTrace(); // For logging
		    }
	   }
		
		public int getNumberOfElements(List<WebElement> ele) {
	       return ele.size();
	   }
		
		public void deselectAllOptions(WebElement ele) {
	       Select dropdown = new Select(ele);
	       dropdown.deselectAll();
	   }




		
		public void switchToDefaultContent(WebDriver driver) {
	       driver.switchTo().defaultContent();
	   }
		
		public void switchToFrame(WebElement ele,WebDriver driver) {
	       driver.switchTo().frame(ele);
	   }
		
		public void clickAndHold(WebDriver driver,WebElement ele) {
	       Actions actions = new Actions(driver);
	       actions.clickAndHold(ele).build().perform();
	   }
		
		public void moveToElement(WebDriver driver,WebElement ele) {
	       Actions actions = new Actions(driver);
	       actions.moveToElement(ele).build().perform();
	   }
		
		public void doubleClickElement(WebDriver driver,WebElement ele) {
	       Actions actions = new Actions(driver);
	       actions.doubleClick(ele).build().perform();
	   }
		
		public void contextClickElement(WebDriver driver,WebElement ele) {
	       Actions actions = new Actions(driver);
	       actions.contextClick(ele).build().perform();
	  }
		
		public void dragAndDrop(WebElement source,WebElement target,WebDriver driver) {
	       Actions actions = new Actions(driver);
	       actions.dragAndDrop(source,target).build().perform();
	   }
	public void keyDownAndType(WebDriver driver,WebElement element, Keys key, CharSequence... keys) {
	       Actions actions = new Actions(driver);
	       actions.keyDown(element, key).sendKeys(keys).keyUp(element, key).build().perform();
	   }
		public void navigateBack(WebDriver driver) {
	       driver.navigate().back();
	   }
		
		public void navigateForward(WebDriver driver) {
	       driver.navigate().forward();
	   }
		
		public void refreshPage(WebDriver driver) {
	       driver.navigate().refresh();
	   }






		
		public void acceptAlert(WebDriver driver) {
	       Alert alert = driver.switchTo().alert();
	       alert.accept();
	   }
		
		public void dismissAlert(WebDriver driver) {
	       Alert alert = driver.switchTo().alert();
	       alert.dismiss();
	   }
		
		public String getAlertText(WebDriver driver) {
	       Alert alert = driver.switchTo().alert();
	       return alert.getText();
	   }
		
		public void sendKeysToAlert(WebDriver driver,String keys) {
	       Alert alert = driver.switchTo().alert();
	       alert.sendKeys(keys);
	   }
		
		public String getElementTagName(WebElement element) {
	       return element.getTagName();
	   }
		
		public String getElementCssValue(WebElement element,String propertyName) {
	       return element.getCssValue(propertyName);
	   }
		public int getTotalNumberOfWindows(WebDriver driver) {
		    try {
		        return driver.getWindowHandles().size();
		    } catch (Exception e) {
		        e.printStackTrace(); // For logging
		        return 0; // Return 0 if there's an exception
		    }
		}
		public boolean switchToWindowAtIndex(WebDriver driver, int index) {
		    try {
		        Set<String> windowHandles = driver.getWindowHandles();
		        List<String> handlesList = new ArrayList<>(windowHandles);
		        if (index >= 0 && index < handlesList.size()) {
		            driver.switchTo().window(handlesList.get(index));
		            return true;
		        } else {
		            System.out.println("Window index out of bounds");
		            return false;
		        }
		    } catch (Exception e) {
		        e.printStackTrace();// For logging
		        return false;
		    }
		}
		
		public void maximizeWindow(WebDriver driver) {
		    try {
		        driver.manage().window().maximize();
		    } catch (Exception e) {
		        e.printStackTrace(); // For logging
		    }
		}
		
		public void minimizeWindow(WebDriver driver) {
		    try {
		        driver.manage().window().minimize(); // Move window out of screen
		    } catch (Exception e) {
		        e.printStackTrace(); // For logging
		    }
		}
		public void enterFullscreenMode(WebDriver driver) {
		    try {
		        driver.manage().window().fullscreen();
		    } catch (Exception e) {
		        e.printStackTrace(); // For logging
		    }
		}
		public boolean switchToWindowHandle(WebDriver driver, String windowHandle) {
		    try {
		        driver.switchTo().window(windowHandle);
		        return true;
		    } catch (NoSuchWindowException e) {
		        System.out.println("Window with handle '" + windowHandle + "' not found.");
		        return false;
		    } catch (Exception e) {
		        e.printStackTrace(); // For logging other exceptions
		        return false;
		    }
		}
		
		public boolean switchToFrameByIndex(WebDriver driver, int index) {
		    try {
		        driver.switchTo().frame(index);
		        return true;
		    } catch (NoSuchFrameException e) {
		        System.out.println("Frame with index '" + index + "' not found.");
		        return false;
		    }
		}   
	   public boolean switchToFrameByNameOrId(WebDriver driver, String nameOrId) {
		        try {
		            driver.switchTo().frame(nameOrId);
		            return true;
		        } catch (NoSuchFrameException e) {
		            System.out.println("Frame with name or ID '" + nameOrId + "' not found.");
		            return false;
		        }  
	   }
	  
	   public boolean switchToFrameByElement(WebDriver driver, WebElement frameElement) {
	       try {
	           driver.switchTo().frame(frameElement);
	           return true;
	       } catch (NoSuchFrameException e) {
	           System.out.println("Frame with element '" + frameElement + "' not found.");
	           return false;
	       }
	   }
	  
	   public void takeScreenshot(WebDriver driver, String fileName) {
	       try {
	           File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	           FileUtils.copyFile(screenshotFile, new File(fileName));
	       } catch (Exception e) {
	           e.printStackTrace(); // For logging other exceptions
	       }
	   }
	//45
	   public void openNewTabAndSwitchToIt(WebDriver driver) {
	       try {
	           // Open a new tab using JavaScript
	           ((JavascriptExecutor) driver).executeScript("window.open()");
	          
	           // Switch to the newly opened tab
	           Set<String> windowHandles = driver.getWindowHandles();
	           List<String> handlesList = new ArrayList<>(windowHandles);
	           String newTabHandle = handlesList.get(handlesList.size() - 1);
	           driver.switchTo().window(newTabHandle);
	       } catch (Exception e) {
	           e.printStackTrace(); // For logging
	       }
	   }
	  
	   public void openNewWindowAndSwitchToIt(WebDriver driver) {
	       try {
	           // Open a new window using JavaScript
	           ((JavascriptExecutor) driver).executeScript("window.open()");
	          
	           // Switch to the newly opened window
	           Set<String> windowHandles = driver.getWindowHandles();
	           List<String> handlesList = new ArrayList<>(windowHandles);
	           String newWindowHandle = handlesList.get(handlesList.size() - 1);
	           driver.switchTo().window(newWindowHandle);
	       } catch (Exception e) {
	           e.printStackTrace(); // For logging
	       }
	   }




	   public void switchToOriginalWindow(WebDriver driver, String originalWindowHandle) {
	       try {
	           driver.switchTo().window(originalWindowHandle);
	       } catch (Exception e) {
	           e.printStackTrace(); // For logging
	       }
	   }
	  
	   public static List<String> getAllOptions(WebElement dropdownElement) {
	       List<String> optionsList = new ArrayList<>();
	       try {
	           Select select = new Select(dropdownElement);
	           List<WebElement> options = select.getOptions();
	           for (WebElement option : options) {
	               optionsList.add(option.getText());
	           }
	       } catch (Exception e) {
	           e.printStackTrace(); // For logging
	       }
	       return optionsList;
	   }
	   public static String getFirstSelectedOption(WebElement dropdownElement) {
	       String firstSelectedOption = null;
	       try {
	           Select select = new Select(dropdownElement);
	           WebElement selectedOption = select.getFirstSelectedOption();
	           firstSelectedOption = selectedOption.getText();
	       } catch (Exception e) {
	           e.printStackTrace(); // For logging
	       }
	       return firstSelectedOption;
	   }
	   public static List<String> getAllSelectedOptions(WebElement dropdownElement) {
	       List<String> selectedOptionsList = new ArrayList<>();
	       try {
	           Select select = new Select(dropdownElement);
	           List<WebElement> selectedOptions = select.getAllSelectedOptions();
	           for (WebElement option : selectedOptions) {
	               selectedOptionsList.add(option.getText());
	           }
	       } catch (Exception e) {
	           e.printStackTrace(); // For logging
	       }
	       return selectedOptionsList;
	   }
	//above 50 methods       	
		
	}