package cn.edu.shou.hsh.junit;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
/**
 * ���Ի���
 * @author HSH
 *
 */
@ContextConfiguration(locations = {"file:WebRoot/WEB-INF/springmvc-servlet.xml","file:WebRoot/WEB-INF/applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class BaseJunitTest {

}
