package android.os;

public class RemoteCallbackList<E extends android.os.IInterface> {
    @android.annotation.FlaggedApi("android.os.binder_frozen_state_change_callback")
    public static final int FROZEN_CALLEE_POLICY_UNSET = 0;
    @android.annotation.FlaggedApi("android.os.binder_frozen_state_change_callback")
    public static final int FROZEN_CALLEE_POLICY_ENQUEUE_ALL = 1;
    @android.annotation.FlaggedApi("android.os.binder_frozen_state_change_callback")
    public static final int FROZEN_CALLEE_POLICY_ENQUEUE_MOST_RECENT = 2;
    @android.annotation.FlaggedApi("android.os.binder_frozen_state_change_callback")
    public static final int FROZEN_CALLEE_POLICY_DROP = 3;
    android.util.ArrayMap<android.os.IBinder, android.os.RemoteCallbackList<E>.Interface> mInterfaces;
    @android.annotation.FlaggedApi("android.os.binder_frozen_state_change_callback")
    public int getFrozenCalleePolicy() { return 0; }
    @android.annotation.FlaggedApi("android.os.binder_frozen_state_change_callback")
    public int getMaxQueueSize() { return 0; }
    @android.annotation.FlaggedApi("android.os.binder_frozen_state_change_callback")
    @android.annotation.Nullable
    public java.util.concurrent.Executor getExecutor() { return null; }
    public RemoteCallbackList() {}
    public boolean register(E p0) { return false; }
    public boolean register(E p0, java.lang.Object p1) { return false; }
    public boolean unregister(E p0) { return false; }
    public void kill() {}
    public void onCallbackDied(E p0) {}
    public void onCallbackDied(E p0, java.lang.Object p1) {}
    public int beginBroadcast() { return 0; }
    public E getBroadcastItem(int p0) { return null; }
    public java.lang.Object getBroadcastCookie(int p0) { return null; }
    public void finishBroadcast() {}
    @android.annotation.FlaggedApi("android.os.binder_frozen_state_change_callback")
    public void broadcast(java.util.function.Consumer<E> p0) {}
    public <C extends java.lang.Object> void broadcastForEachCookie(java.util.function.Consumer<C> p0) {}
    public <C extends java.lang.Object> void broadcast(java.util.function.BiConsumer<E, C> p0) {}
    public int getRegisteredCallbackCount() { return 0; }
    public E getRegisteredCallbackItem(int p0) { return null; }
    public java.lang.Object getRegisteredCallbackCookie(int p0) { return null; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}

    @android.annotation.FlaggedApi("android.os.binder_frozen_state_change_callback")
    public static final class Builder<E extends android.os.IInterface> {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.os.RemoteCallbackList.Builder setMaxQueueSize(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.RemoteCallbackList.Builder setInterfaceDiedCallback(android.os.RemoteCallbackList.Builder.InterfaceDiedCallback<E> p0) { return null; }
        @android.annotation.NonNull
        public android.os.RemoteCallbackList.Builder setExecutor(java.util.concurrent.Executor p0) { return null; }
        @android.annotation.NonNull
        public android.os.RemoteCallbackList<E> build() { return null; }

        @android.annotation.FlaggedApi("android.os.binder_frozen_state_change_callback")
        public static interface InterfaceDiedCallback<E extends android.os.IInterface> {
            public void onInterfaceDied(android.os.RemoteCallbackList<E> p0, E p1, java.lang.Object p2);
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface FrozenCalleePolicy {
    }

    private final class Interface implements android.os.IBinder.DeathRecipient, android.os.IBinder.FrozenStateChangeCallback {
        final android.os.IBinder mBinder = null;
        final E mInterface = null;
        final java.lang.Object mCookie = null;
        final java.util.Queue<java.util.function.Consumer<E>> mCallbackQueue = null;
        int mCurrentState;
        Interface(E p0, java.lang.Object p1) {}
        public synchronized void onFrozenStateChanged(android.os.IBinder p0, int p1) {}
        void addCallback(java.util.function.Consumer<E> p0) {}
        void maybeSubscribeToFrozenCallback() throws android.os.RemoteException {}
        void maybeUnsubscribeFromFrozenCallback() {}
        public void binderDied() {}
    }
}
