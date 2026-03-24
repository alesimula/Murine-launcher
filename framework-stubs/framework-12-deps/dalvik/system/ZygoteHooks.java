package dalvik.system;

public class ZygoteHooks {
    public ZygoteHooks() {}
    public void preFork() {}
    public void postForkCommon() {}
    public void postForkSystemServer(int p0) {}
    public void postForkChild(int p0, boolean p1, boolean p2, java.lang.String p3) {}
    public void onBeginPreload() {}
    public void onEndPreload() {}
    public void gcAndFinalize() {}
    public void startZygoteNoThreadCreation() {}
    public void stopZygoteNoThreadCreation() {}
    public boolean isIndefiniteThreadSuspensionSafe() { return false; }
}
