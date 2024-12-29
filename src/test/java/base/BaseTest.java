package base;

import org.junit.After;
import org.junit.Before;


import utils.DriverManager;

public class BaseTest {

    @Before
    public void setup() {
        DriverManager.getDriver();
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
