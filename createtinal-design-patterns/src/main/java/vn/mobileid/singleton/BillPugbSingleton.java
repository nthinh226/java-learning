package vn.mobileid.singleton;

public class BillPugbSingleton {
    private BillPugbSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPugbSingleton INSTANCE = new BillPugbSingleton();
    }

    public static BillPugbSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
