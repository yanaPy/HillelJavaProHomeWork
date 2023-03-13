package HW25.service;

public interface CustomCacheServiceI {

    String getName();

    boolean put(String key, Object o);

    Object get(String key);

    void clear();

}
