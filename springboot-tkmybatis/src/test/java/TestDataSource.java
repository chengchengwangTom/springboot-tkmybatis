import com.orange.TkmybatisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * <pre>
 *    @author : orange
 *    @e-mail : 495314527@qq.com
 *    @time   : 2019/4/26 14:21
 *    @desc   : 测试数据源是否可用
 *    @version: 1.0
 * </pre>
 */
@SpringBootTest(classes = TkmybatisApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestDataSource {
    @Resource
    private DataSource dataSource;
    @Test
    public void testConnection() throws Exception {
        System.out.println(this.dataSource);
    }
}
