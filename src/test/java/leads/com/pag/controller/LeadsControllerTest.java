package leads.com.pag.controller;

import leads.com.pag.entity.Leads;
import leads.com.pag.mapper.LeadsMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

//单元测试的测试类一定要和启动类在同一个根目录下。
@Slf4j
//@SpringBootTest(classes = DataConnect.class)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest//必须要有main
class LeadsControllerTest {
    @Autowired
    private DataSource dataSource;

    @Resource
    private LeadsMapper leadsMapper;

    @Test
    @SneakyThrows
    public void test_connect() throws SQLException {
//        dataSource.getConnection();
        List<Leads> list= leadsMapper.selectList(null);
        list.forEach(item->log.info("{}",item));
//        System.out.println(list);
    }

}