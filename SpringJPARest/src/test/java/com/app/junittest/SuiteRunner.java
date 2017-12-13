package com.app.junittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value = { AddTest.class, MultiplyTest.class, DivTest.class, SubTest.class })
public class SuiteRunner {

}
