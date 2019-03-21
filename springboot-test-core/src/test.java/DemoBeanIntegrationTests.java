import com.shipc.test.core.junit.JunitConfig;
import com.shipc.test.core.junit.TestBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName DemoBeanIntegrationTests
 * @Description
 * @Author sxt
 * @Date 2019/3/19 13:48
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)  //在JUnit环境下提供Spring TestContext Framework的功能。
@ContextConfiguration(classes = {JunitConfig.class})  //用来加载配置ApplicationContext，其中classess属性用来加载配置类。
@ActiveProfiles("prod")  //用来生命活动的profile
public class DemoBeanIntegrationTests {
    @Autowired
    private TestBean testBean;

    @Test  //测试代码，通过JUnit的Assert来校验结果是否和预期一致
    public void prodBeanShouldInject() {
        String expected = "from production profile";
        String actual = this.testBean.getContent();
        System.out.println("测试代码运行：" + actual);
        Assert.assertEquals(expected, actual);
    }
}
