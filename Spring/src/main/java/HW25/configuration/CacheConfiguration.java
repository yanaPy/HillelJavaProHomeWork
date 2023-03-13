/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW25.configuration;

import HW25.service.CacheManagerServiceI;
import HW25.service.CustomCacheServiceI;
import HW25.service.impl.MyCacheManagerService;
import HW25.service.impl.MyCustomCacheService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CacheConfiguration {

    @Bean
    public CustomCacheServiceI getCustomCacheServiceA() {
        return new MyCustomCacheService("A");
    }

    @Bean
    public CustomCacheServiceI getCustomCacheServiceB() {
        return new MyCustomCacheService("B");
    }

    @Bean
    public CustomCacheServiceI getCustomCacheServiceC() {
        return new MyCustomCacheService("C");
    }

    @Bean
    public CacheManagerServiceI getCacheManagerService(List<CustomCacheServiceI> caches) {
        return new MyCacheManagerService(caches);
    }

}
