package singleton;

/**
 * Demo2
 *
 * @author bobbi
 * @date 2019/03/21 15:27
 * @email 571002217@qq.com
 * @description
 */
public class Demo3 {
    private static Singleton singleton;

    public synchronized static Singleton getSingleton () {
        if(singleton == null) {
            singleton =  new Singleton();
        }
        return singleton;
    }

}
