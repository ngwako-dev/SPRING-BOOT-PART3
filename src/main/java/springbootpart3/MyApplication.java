package springbootpart3;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching

public class MyApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyApplication.class, args);

//        UserServiceImpl user =new UserServiceImpl();


//        System.out.println(user.addUser(2,"Ngwako","ME"));
//         System.out.println(user.getUser(2));
//         System.out.println(user.getUser(2));
//

    }
}

