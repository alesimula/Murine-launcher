package android.hardware.camera2.impl;

public class CameraInjectionSessionImpl extends android.hardware.camera2.CameraInjectionSession implements android.os.IBinder.DeathRecipient {
    public CameraInjectionSessionImpl(android.hardware.camera2.CameraInjectionSession.InjectionStatusCallback p0, java.util.concurrent.Executor p1) { super(); }
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public void binderDied() {}
    public android.hardware.camera2.impl.CameraInjectionSessionImpl.CameraInjectionCallback getCallback() { return null; }
    public void setRemoteInjectionSession(android.hardware.camera2.ICameraInjectionSession p0) {}
    public void onInjectionError(int p0) {}

    public class CameraInjectionCallback extends android.hardware.camera2.ICameraInjectionCallback.Stub {
        public CameraInjectionCallback(android.hardware.camera2.impl.CameraInjectionSessionImpl p0) { super(); }
        public android.os.IBinder asBinder() { return null; }
        public void onInjectionError(int p0) {}
    }
}
