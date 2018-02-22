package com.company.start.junitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
     ServiceImplTest.class,
     ServiceImplFindCatTest.class
})
public class ServiceImplTestSuite {

}
