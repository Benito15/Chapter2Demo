package ac.za.cput;

import javax.management.MXBean;

@Configuration
public class AppConfig {
    @Bean(name = "person")

        public Info getPersonInformation()
            {
                return new Person();

            }
    @Bean( name = "superHeroe")
    public Info getSuperHeroeInformation()
    {
        return new SuperHero();

    }

}
