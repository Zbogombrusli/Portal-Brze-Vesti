
package pages;

import framework.Helper;
import framework.Page;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RegionsPage extends Page{
    
    private void clickOnAddRegionButton() {
        clickOnElement(By.className("pull-right"));
    }

    private void sendTextOnTitleField() {
        sendTextOnField(By.id("title"), Helper.getRandomText());
    }

    private void clickOnSaveRegionButton() {
        clickOnElement(By.id("save-region-button"));
    }

    public void addNewRegion() {
        clickOnAddRegionButton();
        sendTextOnTitleField();
        clickOnSaveRegionButton();
    }

    private void clickOnEditButton(WebElement row) {
        WebElement editButton = row.findElement(By.cssSelector("a[title='Edit']"));
        editButton.click();
    }

    private void clickOnDeleteButton(WebElement row) {
        WebElement deleteButton = row.findElement(By.cssSelector("button[title='Delete']"));
        deleteButton.click();

        
    }

    private void sentTextOnTitleFieldWithClear(WebDriver driver) {
        WebElement titleField = driver.findElement(By.id("title"));
        titleField.clear();
        titleField.sendKeys(Helper.getRandomText());
    }

    private List<WebElement> getRowsFromTable() {
        WebElement tBody = waitForElementVisibility(By.className("ui-sortable"));
        List<WebElement> rows = tBody.findElements(By.tagName("tr"));
        System.out.println("Number of rows: " + rows.size());
        return rows;
    }

    private WebElement chooseFirstRegion() {
        List<WebElement> rows = getRowsFromTable();
        WebElement firstRow = rows.get(0);
        return firstRow;
    }

    private WebElement chooseLastRegion() {
        List<WebElement> rows = getRowsFromTable();
        WebElement lastRow = rows.get(rows.size() - 1);
        return lastRow;
    }

    private WebElement chooseRandomRegion() {
        List<WebElement> rows = getRowsFromTable();
        WebElement randomRow = rows.get(Helper.getRandomInteger(rows.size()));
        return randomRow;
    }

    public void editFirstRegion() {
        WebElement firstRow = chooseFirstRegion();
        clickOnEditButton(firstRow);
        sendTextOnField(By.id("title"));
        clickOnSaveRegionButton();
    }

    public void editLastRegion() {
        WebElement lastRow = chooseLastRegion();
        clickOnEditButton(lastRow);
        sendTextOnField(By.id("title"));
        clickOnSaveRegionButton();

    }

    public void editRandomRegion() {
        WebElement randomRow = chooseRandomRegion();
        clickOnEditButton(randomRow);
        sendTextOnField(By.id("title"));
        clickOnSaveRegionButton();
    }

    private void clickOnConfirmDeleteButton() {
        clickOnElement(By.xpath("//*[@id=\'regionDeleteDialog\']/div/div/div[3]/button[2]"));
    }

    public void deleteFirstRegion() {
        WebElement firstRow = chooseFirstRegion();
        clickOnDeleteButton(firstRow);
        clickOnConfirmDeleteButton();
    }

    public void deleteLastRegion() {
        WebElement lastRow = chooseLastRegion();
        clickOnDeleteButton(lastRow);
        clickOnConfirmDeleteButton();
    }

    public void deleteRandomRegion() {
        WebElement randomRow = chooseRandomRegion();
        clickOnDeleteButton(randomRow);
        clickOnConfirmDeleteButton();
    }

    
    
    
}
