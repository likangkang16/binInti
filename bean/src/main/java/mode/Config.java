package mode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName Config
 * @Description //TODO
 * @Author lkk
 * Date 2023/03/22/15:31
 * @Version 1.0
 **/
@Configuration
public class Config {

    @Bean
    public Uers setUser(){
        return new Uers("王五","25");
    }
}
