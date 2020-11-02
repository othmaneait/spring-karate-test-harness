package cmccarthyirl;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeEngines;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        BasicParallelKarateTest.class,
        DynamicParallelKarateTest.class
})
@ExcludeEngines("junit-vintage")
public class JunitSuiteTest {
    @Test
    @Ignore
    public void foo(){}
}