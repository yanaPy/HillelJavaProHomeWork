package HW25.service.impl;

import java.util.List;
import java.util.Optional;

import HW25.service.CacheManagerServiceI;
import HW25.service.CustomCacheServiceI;

public class MyCacheManagerService implements CacheManagerServiceI {

    private final List<CustomCacheServiceI> caches;

    public MyCacheManagerService(List<CustomCacheServiceI> caches) {
        this.caches = caches;
    }

    @Override
    public boolean put(String cache, String key, Object o) {
        return getCache(cache)
                .map((c) -> c.put(key, o))
                .isPresent();
    }

    private Optional<CustomCacheServiceI> getCache(String name) {
        return this.caches.stream()
                .filter((cache) -> cache.getName().endsWith(name))
                .findFirst();
    }

    @Override
    public Object get(String cache, String key) {
        return getCache(cache)
                .map((c) -> c.get(key))
                .orElse(null);

    }

    @Override
    public void clear() {
        this.caches.forEach((c) -> c.clear());
    }

    @Override
    public void clear(String cache) {
        getCache(cache)
                .ifPresent((c) -> c.clear());
    }

    @Override
    public boolean isCacheExist(String cache) {
        return getCache(cache).isPresent();
    }

}
