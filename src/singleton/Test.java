package singleton;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.concurrent.*;

/**
 * Test
 *
 * @author bobbi
 * @date 2019/03/21 14:22
 * @email 571002217@qq.com
 * @description
 */
public class Test {


    private static ExecutorService singleThreadPool = new ThreadPoolExecutor(5, 10,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>(1024), new ThreadFactoryBuilder()
            .setNameFormat("线程-%d").build(), new ThreadPoolExecutor.AbortPolicy());



    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, InterruptedException, IOException, ClassNotFoundException {
        Demo1 demo1;
//        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{new URL("file://home/bobbi/IdeaProjects/DesignPatternDemo/src/singleton/Demo1.java")});
//        urlClassLoader.loadClass("singleton.Demo1");
        System.in.read();
        Singleton singleton = Demo1.getInstance();
        // Demo1：
//        for (int i = 0; i < 10; i++) {
        singleThreadPool.execute(()-> {
            long start = System.currentTimeMillis();

            long end = System.currentTimeMillis();
//                System.out.println(Thread.currentThread().getName()+singleton + " 用时:"+ (end -start));
        });
//        }
//        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton singleton = constructor.newInstance();
//        System.out.println(singleton);
        singleThreadPool.shutdown();

//        // Demo1：
//        for (int i = 0; i < 10; i++) {
//            singleThreadPool.execute(()-> {
//                long start = System.currentTimeMillis();
//                SingletonEnum instance = SingletonEnum.INSTANCE;
//                long end = System.currentTimeMillis();
//                System.out.println(instance.toString() + " 用时:"+ (end -start));
//            });
//        }
//        Constructor<SingletonEnum> constructor = SingletonEnum.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        SingletonEnum singletonEnum = constructor.newInstance();
//        System.out.println(singletonEnum==SingletonEnum.INSTANCE);
//        singleThreadPool.shutdown();

    }
}
