//1 Alert
		WebElement btn1 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		btn1.click();
		Thread.sleep(2000);
		
		Alert alrt1 = driver.switchTo().alert();
		alrt1.accept();
		Thread.sleep(2000);
		
		
		//3rd Alert
		WebElement btn3 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		btn3.click();
		Thread.sleep(2000);
		
		Alert alrt3 = driver.switchTo().alert();
		alrt3.accept();
		Thread.sleep(2000);
		
