package android.mtp;

public class MtpServer implements java.lang.Runnable {
    private long mNativeContext;
    private final android.mtp.MtpDatabase mDatabase = null;
    private final java.lang.Runnable mOnTerminate = null;
    private final android.content.Context mContext = null;
    private static final int sID_LEN_BYTES = 16;
    private static final int sID_LEN_STR = 32;
    public MtpServer(android.mtp.MtpDatabase p0, java.io.FileDescriptor p1, boolean p2, java.lang.Runnable p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) {}
    private java.lang.String getRandId() { return null; }
    public void start() {}
    public void run() {}
    public void sendObjectAdded(int p0) {}
    public void sendObjectRemoved(int p0) {}
    public void sendObjectInfoChanged(int p0) {}
    public void sendDevicePropertyChanged(int p0) {}
    public void addStorage(android.mtp.MtpStorage p0) {}
    public void removeStorage(android.mtp.MtpStorage p0) {}
    private final native void native_setup(android.mtp.MtpDatabase p0, java.io.FileDescriptor p1, boolean p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6);
    private final native void native_run();
    private final native void native_cleanup();
    private final native void native_send_object_added(int p0);
    private final native void native_send_object_removed(int p0);
    private final native void native_send_object_info_changed(int p0);
    private final native void native_send_device_property_changed(int p0);
    private final native void native_add_storage(android.mtp.MtpStorage p0);
    private final native void native_remove_storage(int p0);
}
