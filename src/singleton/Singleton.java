package singleton;

/**
 * Demo1
 *
 * @author bobbi
 * @date 2019/03/21 14:21
 * @email 571002217@qq.com
 * @description
 */
public class Demo1 {

    private final static Singleton singleton = new Singleton();


    public static Singleton getInstance () {
        return singleton;
    }

}
