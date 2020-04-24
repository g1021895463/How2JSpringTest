package Main;

import Pojo.Category;
import Pojo.Daughter;
import Pojo.Father;
import Pojo.Mather;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String("spring-config.xml"));
        Father father = (Father) context.getBean("father");
        Mather mather = (Mather) context.getBean("mather");
        Daughter daughter = (Daughter) mather.getDaughter();

        father.setName("Wu");
        mather.setName("Cai");
        daughter.setName("Yu");

        System.out.println("F.name is"+father.getName()+"M.name is"+mather.getName()+"D.name is"+daughter.getName());
    }
}
