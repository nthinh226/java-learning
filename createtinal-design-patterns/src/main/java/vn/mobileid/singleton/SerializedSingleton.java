package vn.mobileid.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    /*
    JVM trong quá trình deserial hóa sẽ tự động kiểm tra xem đối tượng vừa được deserial hóa có định nghĩa một phương
    thức readResolve() hay không. Nếu có, nó sẽ gọi phương thức này thay vì trả về đối tượng được tạo ra từ deserial
    hóa. Nếu không có phương thức readResolve(), đối tượng deserial hóa sẽ được trả về như bình thường.
     */
    protected Object readResolve() {
        return getInstance();
    }

}
