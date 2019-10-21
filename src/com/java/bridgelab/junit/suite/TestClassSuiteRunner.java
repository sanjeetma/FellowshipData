package com.java.bridgelab.junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestClassOne.class,TestClassTwo.class}) 

public class TestClassSuiteRunner {

}
