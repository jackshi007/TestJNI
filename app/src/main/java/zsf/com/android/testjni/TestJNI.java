package zsf.com.android.testjni;

/**
 * Created by zhangsf on 17-3-16.
 */
public class TestJNI {
    public native boolean Init();
    public native int Add(int x,int y);
    public native void Destroy();
}
