package designpattern.singleton;

public class Singleton_V1 {
    private static final Singleton_V1 instance = new Singleton_V1();
    private Singleton_V1() {}

    public static Singleton_V1 getInstance() {
        return instance;
    }
}
