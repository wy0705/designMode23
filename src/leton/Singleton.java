package leton;
//为了避免内存的浪费，我们可以采用懒加载，即用到该单例对象的时候再创建。
public class Singleton {
    private static volatile Singleton instance = null;
    private Singleton() {
    };
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }



}
