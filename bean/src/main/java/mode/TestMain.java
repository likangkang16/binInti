package mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestMain
 * @Description //TODO
 * @Author lkk
 * Date 2023/03/22/14:52
 * @Version 1.0
 **/
public class TestMain {

    @Autowired
    @Qualifier(value = "user3")
    private  static Uers uers;

    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("User.xml");
        Uers bean = applicationContext.getBean("user",Uers.class);
        bean.show();
        Uers bean1 = applicationContext.getBean("user1",Uers.class);
        System.out.println(bean1.toString());
        Uers bean2 = applicationContext.getBean("user2",Uers.class);
        System.out.println(bean2.toString());
        Uers uers = applicationContext.getBean("user3",Uers.class);
        uers.showAuto();
        uers=  applicationContext.getBean("user3",Uers.class);
        uers.showAuto();
        ApplicationContext applicationContext =new AnnotationConfigApplicationContext(Config.class);
        Uers user =(Uers) applicationContext.getBean("setUser");
        System.out.println(user.toString());
    }


}
