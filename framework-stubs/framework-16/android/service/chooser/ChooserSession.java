package android.service.chooser;

@android.annotation.FlaggedApi("android.service.chooser.interactive_chooser")
@android.annotation.SuppressLint("NotCloseable")
public final class ChooserSession {
    public static final java.lang.String EXTRA_CHOOSER_SESSION = "com.android.extra.EXTRA_CHOOSER_INTERACTIVE_CALLBACK";
    public static final int STATE_INITIALIZED = 0;
    public static final int STATE_STARTED = 1;
    public static final int STATE_CLOSED = 2;
    ChooserSession() {}
    android.os.IBinder getBinder() { return null; }
    @android.annotation.NonNull
    public android.service.chooser.ChooserSessionToken getToken() { return null; }
    public int getState() { return 0; }
    public void close() {}
    public void updateIntent(android.content.Intent p0) {}
    public void collapse() {}
    public void setTargetsEnabled(boolean p0) {}
    @android.annotation.Nullable
    public android.graphics.Rect getSize() { return null; }
    public void addStateListener(java.util.concurrent.Executor p0, android.service.chooser.ChooserSession.StateListener p1) {}
    public void removeStateListener(android.service.chooser.ChooserSession.StateListener p0) {}
    static boolean isSessionBinder(android.os.IBinder p0) { return false; }

    private static class ChooserSessionImpl extends android.service.chooser.IChooserControllerCallback.Stub {
        public void registerChooserController(android.service.chooser.IChooserController p0) {}
        public void onBoundsChanged(android.graphics.Rect p0) {}
        public void onClosed() {}
        public void close() {}
        public void collapse() {}
        public void setTargetsEnabled(boolean p0) {}
        public int getState() { return 0; }
        @android.annotation.Nullable
        public android.service.chooser.IChooserController getChooserController() { return null; }
        public void addStateListener(java.util.concurrent.Executor p0, android.service.chooser.ChooserSession.StateListener p1) {}
        public void removeStateListener(android.service.chooser.ChooserSession.StateListener p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }

    public static interface StateListener {
        public void onStateChanged(int p0);
        public void onBoundsChanged(android.graphics.Rect p0);
    }

    private static class UpdateListenerWrapper {
        public final android.service.chooser.ChooserSession.StateListener listener = null;
        public final java.util.concurrent.Executor executor = null;
        public final java.util.concurrent.atomic.AtomicBoolean isSubscribed = null;
        UpdateListenerWrapper(android.service.chooser.ChooserSession.StateListener p0, java.util.concurrent.Executor p1) {}
    }
}
