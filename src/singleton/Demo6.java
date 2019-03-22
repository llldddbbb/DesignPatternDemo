package singleton;

/**
 * Demo2
 *
 * @author bobbi
 * @date 2019/03/21 15:27
 * @email 571002217@qq.com
 * @description
 */
public class Demo6 {
    private static class LazyHolder {
       private static final Singleton INSTANCE = new Singleton();
    }

    public  static Singleton getInstance () {
        return LazyHolder.INSTANCE;
    }

}
