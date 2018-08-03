package regions;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.CategoriesPage;
import pages.RegionsPage;
import pages.DashboardPage;
import pages.LoginPage;

public class TestRegions extends DashboardPage {

    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    private static CategoriesPage categoriesPage;
    private static RegionsPage regionsPage;

    @BeforeClass
    public static void setUpClass()throws IOException{
           
        Configuration.init();
        //loginPage = new LoginPage();
        //dashboardPage = loginPage.login();
    }

    @AfterClass
    public static void tearDownClass() throws InterruptedException {
        //Thread.sleep(3000);
        //loginPage.quitDriver();
    }

    @Before
    public void setUp() {
        regionsPage = this.goToRegions();

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCreateNewRegion() {

        regionsPage.addNewRegion();
        System.out.println("hello");
    }

    @Test
    public void testEditLastRegion() {

        regionsPage.editLastRegion();

        
    }

    @Test
    public void testEditFirstRegion() {
        regionsPage.editFirstRegion();

    }

    @Test
    public void testEditRandomRegion() {
        regionsPage.editRandomRegion();

    }

    @Test
    public void testDeleteFirstRegion() {
        regionsPage.deleteFirstRegion();
    }

    @Test
    public void testDeleteLastRegion() {
        regionsPage.deleteLastRegion();
    }

    @Test
    public void testDeleteRandomRegion() {
        regionsPage.deleteRandomRegion();
    }

    @Test
    public void testAddEditDeleteRegion() {
        regionsPage.addNewRegion();
        regionsPage.editLastRegion();
        regionsPage.deleteLastRegion();
    }

}
