package org.apereo.cas;

import org.apereo.cas.monitor.DataSourceMonitorTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The {@link AllTestsSuite} is responsible for
 * running all jdbc test cases.
 *
 * @author Misagh Moayyed
 * @since 4.2.0
 */

@RunWith(Suite.class)
@Suite.SuiteClasses(DataSourceMonitorTests.class)
public class AllTestsSuite {
}
