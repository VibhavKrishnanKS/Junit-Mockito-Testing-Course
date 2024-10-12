package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @Disabled("Don't run this until JIRA #123 is resolved")
    void basicTest(){
        //Execute method and perform Asserts
    }

    // Runs only on Windows
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindows(){
        //Execute method and perform Asserts
    }

    // Runs only on MAC
    @Test
    @EnabledOnOs(OS.MAC)
    void testForMac(){
        //Execute method and perform Asserts
    }

    // Runs only on Linux
    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinux(){
        //Execute method and perform Asserts
    }

    // Runs on both Linux and Windows
    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testOnlyForJava17(){
        //Execute method and perform Asserts
    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testOnlyForJava13(){
        //Execute method and perform Asserts
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_13,max=JRE.JAVA_17)
    void testOnlyForJavaRange(){
        //Execute method and perform Asserts
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_11)
    void testOnlyForJavaRangeMin(){
        //Execute method and perform Asserts
    }

    @Test
    @EnabledIfEnvironmentVariable(named="LUV2CODE_ENV", matches="DEV")
    void testOnlyForDevEnvironment(){
        // Execute method and perform assets
    }

    @Test
    @EnabledIfSystemProperty(named="LUV2CODE_SYS_PROP", matches = "CI_CD_DEPLOY")
    void testOnlyForSystemProperties(){
        // Execute method and perform assets
    }
}
