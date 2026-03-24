package android.inputmethodservice;

final class MultiClientInputMethodServiceDelegateImpl {
    private static final java.lang.String TAG = "MultiClientInputMethodServiceDelegateImpl";
    private final java.lang.Object mLock = null;
    private int mInitializationPhase;
    private final com.android.internal.inputmethod.MultiClientInputMethodPrivilegedOperations mPrivOps = null;
    private final android.inputmethodservice.MultiClientInputMethodServiceDelegate.ServiceCallback mServiceCallback = null;
    private final android.content.Context mContext = null;
    MultiClientInputMethodServiceDelegateImpl(android.content.Context p0, android.inputmethodservice.MultiClientInputMethodServiceDelegate.ServiceCallback p1) {}
    void onDestroy() {}
    android.os.IBinder onBind(android.content.Intent p0) { return null; }
    boolean onUnbind(android.content.Intent p0) { return false; }
    android.os.IBinder createInputMethodWindowToken(int p0) { return null; }
    void acceptClient(int p0, android.inputmethodservice.MultiClientInputMethodServiceDelegate.ClientCallback p1, android.view.KeyEvent.DispatcherState p2, android.os.Looper p3) {}
    void reportImeWindowTarget(int p0, int p1, android.os.IBinder p2) {}
    boolean isUidAllowedOnDisplay(int p0, int p1) { return false; }
    void setActive(int p0, boolean p1) {}

    private static final class ServiceImpl extends com.android.internal.inputmethod.IMultiClientInputMethod.Stub {
        private final java.lang.ref.WeakReference<android.inputmethodservice.MultiClientInputMethodServiceDelegateImpl> mImpl = null;
        ServiceImpl(android.inputmethodservice.MultiClientInputMethodServiceDelegateImpl p0) { super(); }
        public void initialize(com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations p0) {}
        public void addClient(int p0, int p1, int p2, int p3) {}
        public void removeClient(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface InitializationPhase {
        public static final int INSTANTIATED = 1;
        public static final int ON_BIND_CALLED = 2;
        public static final int INITIALIZE_CALLED = 3;
        public static final int ON_UNBIND_CALLED = 4;
        public static final int ON_DESTROY_CALLED = 5;
    }
}
