import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wuxinjian on 2017/2/5.
 */
public class XmlDITest {
    @Test
    public void DIBaseTest() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "bean.xml");
        Soldier soldier = context.getBean(Soldier.class);
        soldier.execute();
        context.close();
    }
}
