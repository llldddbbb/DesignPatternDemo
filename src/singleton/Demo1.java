package singleton;

/**
 * Demo1
 *
 * @author bobbi
 * @date 2019/03/22 16:19
 * @email 571002217@qq.com
 * @description
 */
public class Demo1 {
    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }
}
