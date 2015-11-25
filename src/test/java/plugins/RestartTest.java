package plugins;

import com.google.inject.Inject;
import org.jenkinsci.test.acceptance.junit.AbstractJUnitTest;
import org.jenkinsci.test.acceptance.junit.WithPlugins;
import org.jenkinsci.test.acceptance.plugins.job_config_history.JobConfigHistory;
import org.jenkinsci.test.acceptance.plugins.priority_sorter.PriorityConfig;
import org.jenkinsci.test.acceptance.plugins.priority_sorter.PriorityConfig.Group;
import org.jenkinsci.test.acceptance.po.*;
import org.jenkinsci.test.acceptance.slave.SlaveController;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.jenkinsci.test.acceptance.po.Slave.runBuildsInOrder;

/**
 * @author Andres Rodriguez
 */
public class RestartTest extends AbstractJUnitTest {
    @Before
    public void setUp() throws Exception {
        jenkins.restart();
    }

    @Test
    public void justWait() throws InterruptedException {
        Thread.sleep(60000L);
    }
}
