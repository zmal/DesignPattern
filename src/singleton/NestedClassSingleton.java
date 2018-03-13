package singleton;

/**
 * 单例模式内部类实现
 * Created by zy on 2018/3/12.
 */

public class NestedClassSingleton {

    private NestedClassSingleton() {
    }

    public static class SingletonHolder {
        public static final NestedClassSingleton SINGLETON = new NestedClassSingleton();
    }

    public NestedClassSingleton get() {
        return SingletonHolder.SINGLETON;
    }
}
