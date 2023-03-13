package HW25.service.impl;

import java.util.HashMap;
import java.util.Map;
import HW25.service.CustomCacheServiceI;

public class MyCustomCacheService implements CustomCacheServiceI {

    private final String name;
    private final Map<String, Object> holder;

    public MyCustomCacheService(String name) {
        this.name = name;
        this.holder = new HashMap<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean put(String key, Object o) {
        return null != this.holder.put(key, o);
    }

    @Override
    public Object get(String key) {
        return this.holder.get(key);
    }

    @Override
    public void clear() {
        this.holder.clear();
    }

}
