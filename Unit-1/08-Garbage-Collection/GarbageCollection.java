class Demo {

    protected void finalize() {
        System.out.println("Object is garbage collected");
    }
}

public class GarbageCollection {

    public static void main(String[] args) {

        Demo obj = new Demo();

        System.out.println("Object created");

        obj = null;

        System.gc();

        System.out.println("Garbage collection requested");
    }
}
