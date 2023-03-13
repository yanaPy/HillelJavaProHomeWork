package HW25.service;

public interface CacheManagerServiceI {

    boolean put(String cache, String key, Object o);

    Object get(String cache, String key);

    void clear();

    void clear(String cache);

    boolean isCacheExist(String cache);
}
