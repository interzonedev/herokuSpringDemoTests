package com.interzonedev.herokuspringdemo.service.user;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ UserServiceCreateUserIntegrationTest.class, UserServiceDeleteUserIntegrationTest.class,
		UserServiceGetAllUsersIntegrationTest.class, UserServiceGetByIdIntegrationTest.class,
		UserServiceUpdateUserIntegrationTest.class })
public class UserServiceTestSuite {
}
