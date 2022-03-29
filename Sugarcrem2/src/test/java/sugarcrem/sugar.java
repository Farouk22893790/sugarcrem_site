package sugarcrem;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sugar {
	WebDriver driver;
	@Test
public void runsugarcrem() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
        // System.setProperty("webdriver.chrome.driver","C:\\Users\\mrbaati\\Desktop\\jjjjj\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
	
        
        //                           open site web Sugarcrem 
        
        
                    driver.get("https://www.sugarcrm.com/uk/?utm_source=sugarcrm.com&utm_medium=referral");
                    
                 
                    
        //                            Attendre 3s       
                    
                    
              Thread.sleep(10000);
             
              
        //                           ACCEPT COCKIES
                
          
                    driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();  
              
       
        //                           click GET A DEMO
            
                    
                    
                    driver.findElement(By.xpath("//*[@id=\"menu-item-22271\"]/a/span[1]")).click();  
        
              

        //                           Attendre 3s       
              
              
     
                       Thread.sleep(3000);
    
                       
                       
      
        //                        remplir le champ First Name 
                       
 
                      driver.findElement(By.xpath("//*[@id=\"field7\"]/div/input"))
                      .sendKeys("Farouk");
                
       
                      
        //                         Attendre 3s        
        //                        remplir le champ Last Name 

              
                    
                    driver.findElement(By.xpath("//*[@id=\"field8\"]/div/input"))
                    .sendKeys("Trabelsi");
                
        
        //                        Attendre 3s       
       
                    
                   

        //                       Remplir le champ Busines EMAIL 

                driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input"))
                .sendKeys("trabelsifarou9@gmail.com");
                
   
                
        //                       Attendre 3s     
               
                
                
               
       
              
            
                
        //                        remplir le champ Busines PHONE 



                 driver.findElement(By.xpath("//*[@id=\"field25\"]/div/input"))
                .sendKeys("+21622893790");
                
        
                 
        //                       Attendre 3s     
                 
                 
               
                 
                 
                 
        //                         remplir le champ Job Title 

               
                driver.findElement(By.xpath("//*[@id=\"field26\"]/div/input"))
                .sendKeys("Consultant Test Logiciel");
                
       
                
        //                         Attendre 3s       
       
            
           
                
        //                      remplir le champ Company Name 

               
                
                driver.findElement(By.xpath("//*[@id=\"field9\"]/div/input"))
                .sendKeys("Neolians");
                
         //                     Attendre 3s       
               
            
                
          
              
                
        //                      remplir le champ Company Size

               
                
                driver.findElement(By.xpath("//*[@id=\"field27\"]/div/select"))
                .sendKeys("11 - 50 employees");
                
                
//                                         Attendre 3s       
                 
                
            
                
                
                
                driver.findElement(By.xpath("//*[@id=\"field27\"]/div/select")).click(); 
                
                
                
//                                  Attendre 3s   
       
               
                
                Thread.sleep(3000);
                
                
                
     //                             click Marketing Automation
       
                
                
                driver.findElement(By.xpath("//*[@id=\"interest_market_c0\"]")).click();
                
                

//                                   Attendre 2s   



                 Thread.sleep(2000);


        
    //                            click Sales Automation
     

                driver.findElement(By.xpath("//*[@id=\"interest_sell_c0\"]")).click();
        
                
//                                   Attendre 2s   


                Thread.sleep(2000);


        
   //                            click Customer Service Solution
       
                
                driver.findElement(By.xpath("//*[@id=\"interest_serve_c0\"]")).click();
        

//                                     Attendre 2s   


                 Thread.sleep(2000);


      //                                  click in :  I'm not interested in more information right now.
                
                
                
               driver.findElement(By.xpath("//*[@id=\"doi1\"]")).click();
        
                

//                                   Attendre 2s   


               Thread.sleep(2000);


                
   //                                click in : Please add me to marketing communications. I understand I may opt out at any time.
       
                
                
                driver.findElement(By.xpath("//*[@id=\"doi0\"]")).click();
                
                
//                                      Attendre 3s   


                Thread.sleep(3000);


                
   //                    click REQUEST A DEMO
      
                
                
                driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).click();
      
        

}
}