package test;

import com.wuge.api.sale.IContractService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/com/wuge/study/soa/spring/config-business.xml")
public class RootTest {

    @Autowired
    private IContractService contractService;
    @Test
    public void test1() {
        System.out.println(111);
        String param = "test it";
        contractService.testContract(param);
    }
}
