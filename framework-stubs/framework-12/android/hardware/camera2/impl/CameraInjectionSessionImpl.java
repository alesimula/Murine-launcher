package android.hardware.camera2.impl;

public class CameraInjectionSessionImpl extends android.hardware.camera2.CameraInjectionSession implements android.os.IBinder.DeathRecipient {
    private static final java.lang.String TAG = "CameraInjectionSessionImpl";
    private final android.hardware.camera2.impl.CameraInjectionSessionImpl.CameraInjectionCallback mCallback = null;
    private final android.hardware.camera2.CameraInjectionSession.InjectionStatusCallback mInjectionStatusCallback = null;
    private final java.util.concurrent.Executor mExecutor = null;
    private final java.lang.Object mInterfaceLock = null;
    private android.hardware.camera2.ICameraInjectionSession mInjectionSession;
    public CameraInjectionSessionImpl(android.hardware.camera2.CameraInjectionSession.InjectionStatusCallback p0, java.util.concurrent.Executor p1) { super(); }
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public void binderDied() {}
    public android.hardware.camera2.impl.CameraInjectionSessionImpl.CameraInjectionCallback getCallback() { return null; }
    public void setRemoteInjectionSession(android.hardware.camera2.ICameraInjectionSession p0) {}
    public void onInjectionError(int p0) {}
    private void scheduleNotifyError(int p0) {}
    private void notifyError(int p0) {}

    public class CameraInjectionCallback extends android.hardware.camera2.ICameraInjectionCallback.Stub {
        public CameraInjectionCallback(android.hardware.camera2.impl.CameraInjectionSessionImpl p0) { super(); }
        public android.os.IBinder asBinder() { return null; }
        public void onInjectionError(int p0) {}
    }
}
