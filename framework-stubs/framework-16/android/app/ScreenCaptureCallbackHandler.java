package android.app;

public class ScreenCaptureCallbackHandler {
    public ScreenCaptureCallbackHandler(android.os.IBinder p0) {}
    public void registerScreenCaptureCallback(java.util.concurrent.Executor p0, android.app.Activity.ScreenCaptureCallback p1) {}
    public void unregisterScreenCaptureCallback(android.app.Activity.ScreenCaptureCallback p0) {}

    private static class ScreenCaptureObserver extends android.app.IScreenCaptureObserver.Stub {
        android.util.ArrayMap<android.app.Activity.ScreenCaptureCallback, android.app.ScreenCaptureCallbackHandler.ScreenCaptureRegistration> mRegistrations;
        ScreenCaptureObserver(android.util.ArrayMap<android.app.Activity.ScreenCaptureCallback, android.app.ScreenCaptureCallbackHandler.ScreenCaptureRegistration> p0) { super(); }
        public void onScreenCaptured() {}
    }

    private static class ScreenCaptureRegistration {
        java.util.concurrent.Executor mExecutor;
        android.app.Activity.ScreenCaptureCallback mCallback;
        ScreenCaptureRegistration(java.util.concurrent.Executor p0, android.app.Activity.ScreenCaptureCallback p1) {}
    }
}
