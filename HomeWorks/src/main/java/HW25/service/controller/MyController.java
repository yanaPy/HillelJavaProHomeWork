/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW25.service.controller;

import HW25.service.CacheManagerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

    private final CacheManagerServiceI cacheManagerService;

    public MyController(@Autowired CacheManagerServiceI cacheManagerService) {
        this.cacheManagerService = cacheManagerService;
    }

    @GetMapping("/{cache}/put")
    public ResponseEntity<Boolean> put(@PathVariable("cache") String cache,
            @RequestParam("key") String key,
            @RequestParam("value") Object o) {

        return ResponseEntity.ok(this.cacheManagerService.put(cache, key, o));
    }

    @GetMapping("/{cache}/get")
    public ResponseEntity get(@PathVariable("cache") String cache,
            @RequestParam("key") String key) {

        return ResponseEntity.ok(this.cacheManagerService.get(cache, key));
    }

    @GetMapping("/{cache}/clear")
    public ResponseEntity<Boolean> put(@PathVariable(name = "cache") String cache) {
        this.cacheManagerService.clear(cache);
        return ResponseEntity.ok(true);
    }

    @GetMapping("/{cache}")
    public ResponseEntity<Boolean> isCacheExist(@PathVariable(name = "cache") String cache) {
        return ResponseEntity.ok(this.cacheManagerService.isCacheExist(cache));
    }

}
