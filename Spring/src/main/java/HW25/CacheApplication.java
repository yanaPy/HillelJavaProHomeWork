package HW25;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CacheApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class, args);
    }
//
//    /**
//     * {@inheritDoc}
//     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CacheApplication.class);
    }

}
