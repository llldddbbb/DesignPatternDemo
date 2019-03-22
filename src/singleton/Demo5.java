package singleton;

/**
 * Demo2
 *
 * @author bobbi
 * @date 2019/03/21 15:27
 * @email 571002217@qq.com
 * @description
 */
public class Demo5 {
    private final static ThreadLocal<Singleton> threadLocal = new ThreadLocal<Singleton>() {

        @Override
        protected Singleton initialValue() {
            return new Singleton();
        }
    };

    public  static Singleton getSingleton () {
        return threadLocal.get();
    }

}
