package demo;

import com.demo.conf.DemoModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoUsageApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoUsageApplication.class, args);

        String[] beanNames = ctx.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        System.out.println("###############################");
        DemoModule m = ctx.getBean(DemoModule.class);
        System.out.println(m.getP().getVersion());

    }
}