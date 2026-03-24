package android.nfc;

public final class NfcActivityManager extends android.nfc.IAppCallback.Stub implements android.app.Application.ActivityLifecycleCallbacks {
    static final java.lang.String TAG = "NFC";
    static final java.lang.Boolean DBG = null;
    final android.nfc.NfcAdapter mAdapter = null;
    final java.util.List<android.nfc.NfcActivityManager.NfcApplicationState> mApps = null;
    final java.util.List<android.nfc.NfcActivityManager.NfcActivityState> mActivities = null;
    android.nfc.NfcActivityManager.NfcApplicationState findAppState(android.app.Application p0) { return null; }
    void registerApplication(android.app.Application p0) {}
    void unregisterApplication(android.app.Application p0) {}
    synchronized android.nfc.NfcActivityManager.NfcActivityState findActivityState(android.app.Activity p0) { return null; }
    synchronized android.nfc.NfcActivityManager.NfcActivityState getActivityState(android.app.Activity p0) { return null; }
    synchronized android.nfc.NfcActivityManager.NfcActivityState findResumedActivityState() { return null; }
    synchronized void destroyActivityState(android.app.Activity p0) {}
    public NfcActivityManager(android.nfc.NfcAdapter p0) { super(); }
    public void enableReaderMode(android.app.Activity p0, android.nfc.NfcAdapter.ReaderCallback p1, int p2, android.os.Bundle p3) {}
    public void disableReaderMode(android.app.Activity p0) {}
    public void setReaderMode(android.os.Binder p0, int p1, android.os.Bundle p2) {}
    void requestNfcServiceCallback() {}
    void verifyNfcPermission() {}
    public void onTagDiscovered(android.nfc.Tag p0) throws android.os.RemoteException {}
    public void onActivityCreated(android.app.Activity p0, android.os.Bundle p1) {}
    public void onActivityStarted(android.app.Activity p0) {}
    public void onActivityResumed(android.app.Activity p0) {}
    public void onActivityPaused(android.app.Activity p0) {}
    public void onActivityStopped(android.app.Activity p0) {}
    public void onActivitySaveInstanceState(android.app.Activity p0, android.os.Bundle p1) {}
    public void onActivityDestroyed(android.app.Activity p0) {}

    class NfcActivityState {
        boolean resumed;
        android.app.Activity activity;
        android.nfc.NfcAdapter.ReaderCallback readerCallback;
        int readerModeFlags;
        android.os.Bundle readerModeExtras;
        android.os.Binder token;
        public NfcActivityState(android.nfc.NfcActivityManager p0, android.app.Activity p1) {}
        public void destroy() {}
        public java.lang.String toString() { return null; }
    }

    class NfcApplicationState {
        int refCount;
        final android.app.Application app = null;
        public NfcApplicationState(android.nfc.NfcActivityManager p0, android.app.Application p1) {}
        public void register() {}
        public void unregister() {}
    }
}
