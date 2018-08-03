
package portals;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PortalsPage;

public class TestPortals extends DashboardPage{

    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    private static PortalsPage portalsPage;

    @BeforeClass
    public static void setUpClass() throws IOException {
        //Configuration.init();
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

       portalsPage = this.goToPortals();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void createNewPortal() {

        portalsPage.addNewPortal();
    }

    @Test
    public void editPortal() {

        portalsPage.editFirstPortal();


    }

    @Test
    public void deletePortal() {


        portalsPage.deleteRandomPortal();
        
        
    }

   
        

   
}