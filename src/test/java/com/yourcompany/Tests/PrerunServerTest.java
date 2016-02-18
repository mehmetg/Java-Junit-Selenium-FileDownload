package com.yourcompany.Tests;

import org.junit.Test;
import org.openqa.selenium.InvalidElementStateException;


/**
 * Created by mehmetgerceker on 12/22/15.
 */

public class PrerunServerTest extends SampleSauceTestBase {

    public PrerunServerTest(String os,
                            String version, String browser, String deviceName, String deviceOrientation) {
        super(os, version, browser, deviceName, deviceOrientation);
    }

    /**
     * Runs a simple test verifying the checked checkbox state
     *
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyUncheckedSwitchInputTest() throws InvalidElementStateException {
        driver.get("localhost:5922/tunnel");
        System.out.println(driver.getPageSource());
    }


}