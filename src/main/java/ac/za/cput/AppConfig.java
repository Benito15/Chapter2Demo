package ac.za.cput;

import javax.management.MXBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "person")

        public Info getPersonInformation()
            {
                return new Person();

            }
    @Bean( name = "superHeroes")
    public Info getSuperHeroeInformation()
    {
        return new SuperHero();

    }

}
