package singleton;

/**
 * Singleton
 *
 * @author bobbi
 * @date 2019/03/21 14:17
 * @email 571002217@qq.com
 * @description ��������
 */
public enum  SingletonEnum {
    INSTANCE;

    public SingletonEnum getInstance() {
        return INSTANCE;
    }
}
