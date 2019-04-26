import com.orange.TkmybatisApplication;
import com.orange.entity.XpMoped;
import com.orange.mapper.XpMopedMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import tk.mybatis.mapper.entity.Example;

import static org.junit.Assert.assertEquals;

/**
 * <pre>
 *    @author : orange
 *    @e-mail : 495314527@qq.com
 *    @time   : 2019/4/26 14:21
 *    @desc   :
 *    @version: 1.0
 * </pre>
 */
@SpringBootTest(classes = TkmybatisApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class SimpleTkMapperTest {

    @Autowired
    private XpMopedMapper xpMopedMapper;

    @Test
    public void selectTest() {
        XpMoped xpMoped = xpMopedMapper.selectByPrimaryKey(3L);
        System.out.println(xpMoped.toString());
        assertEquals(true, xpMoped.getId() > 0);
    }

    @Test
    public void insertTest() {
        XpMoped xpMoped  = new XpMoped();
        int result = xpMopedMapper.insert(xpMoped);
        assertEquals(1, result);
    }

    @Test
    public void deleteByExampleTest() {
        Example example = new Example(XpMoped.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", 4);
        int result = xpMopedMapper.deleteByExample(example);
        assertEquals(1, result);
    }
}