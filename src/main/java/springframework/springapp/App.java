package springframework.springapp;

/**
 * Hello world!
 *
 */
import com.bean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springbean.xml");
        Technician technician=context.getBean(Technician.class,"technician");
        System.out.println(technician);
    }
}
