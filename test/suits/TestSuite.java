package suits;

import categories.TestCategories;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import portals.TestPortals;
import regions.TestRegions;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestCategories.class, TestRegions.class, TestPortals.class})
    
public class TestSuite{
   

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        
         
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
