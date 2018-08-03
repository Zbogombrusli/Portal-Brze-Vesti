package pages;

import framework.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage extends Page {

 
    

    
    
    
    public CategoriesPage goToCategories() {
        clickOnElement(By.linkText("Categories"));
       return PageFactory.initElements(getDriver(), CategoriesPage.class);
    }
    
    
    public RegionsPage goToRegions() {
        clickOnElement(By.linkText("Regions"));
        return PageFactory.initElements(getDriver(), RegionsPage.class);
}
    
    public PortalsPage goToPortals() {
        clickOnElement(By.linkText("Portals"));
        return PageFactory.initElements(getDriver(), PortalsPage.class);
    
}
    
    
    
}