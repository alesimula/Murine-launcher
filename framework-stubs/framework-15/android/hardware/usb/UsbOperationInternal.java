package android.hardware.usb;

public final class UsbOperationInternal extends android.hardware.usb.IUsbOperationInternal.Stub {
    final java.util.concurrent.locks.ReentrantLock mLock = null;
    final java.util.concurrent.locks.Condition mOperationWait = null;
    public static final int USB_OPERATION_SUCCESS = 0;
    public static final int USB_OPERATION_ERROR_INTERNAL = 1;
    public static final int USB_OPERATION_ERROR_NOT_SUPPORTED = 2;
    public static final int USB_OPERATION_ERROR_PORT_MISMATCH = 3;
    UsbOperationInternal(int p0, java.lang.String p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) { super(); }
    UsbOperationInternal(int p0, java.lang.String p1) { super(); }
    public void onOperationComplete(int p0) {}
    public void waitForOperationComplete() {}
    public int getStatus() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface UsbOperationStatus {
    }
}
