package org.springframework.samples.petclinic.sixty_seconds;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.samples.petclinic.sixty_seconds.RegressionTest0;
import org.springframework.samples.petclinic.sixty_seconds.RegressionTest1;
import org.springframework.samples.petclinic.sixty_seconds.RegressionTest2;
import org.springframework.samples.petclinic.sixty_seconds.RegressionTest3;

@RunWith(Suite.class)
@Suite.SuiteClasses({ RegressionTest0.class, RegressionTest1.class, RegressionTest2.class, RegressionTest3.class })
public class RegressionTest {
}

