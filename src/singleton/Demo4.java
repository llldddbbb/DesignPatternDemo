package singleton;

/**
 * Demo2
 *
 * @author bobbi
 * @date 2019/03/21 15:27
 * @email 571002217@qq.com
 * @description
 */
public class Demo4 {

    private volatile static Singleton singleton;

    public  static Singleton getInstance () {
        if(singleton ==null) {
            synchronized(Singleton.class) {
                if(singleton == null) {
                    singleton =  new Singleton();
                }
            }
        }

        return singleton;
    }

}
