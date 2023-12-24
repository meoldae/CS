package designpattern.singleton;

public class Singleton_Main {
    public static void main(String[] args) {
        Singleton_V1 singletonV1a = Singleton_V1.getInstance();
        Singleton_V1 singletonV1b = Singleton_V1.getInstance();

        System.out.println("V1 A : " + singletonV1a.hashCode());
        System.out.println("V1 B : " + singletonV1b.hashCode());

        System.out.println("==================");

        Singleton_V2 singletonV2a = Singleton_V2.INSTANCE;
        Singleton_V2 singletonV2b = Singleton_V2.INSTANCE;

        System.out.println("V2 A : " + singletonV2a.hashCode());
        System.out.println("V2 B : " + singletonV2b.hashCode());
    }
}