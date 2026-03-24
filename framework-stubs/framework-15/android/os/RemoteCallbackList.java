package android.os;

public class RemoteCallbackList<E extends android.os.IInterface> {
    android.util.ArrayMap<android.os.IBinder, android.os.RemoteCallbackList<E>.Callback> mCallbacks;
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
    public void broadcast(java.util.function.Consumer<E> p0) {}
    public <C extends java.lang.Object> void broadcastForEachCookie(java.util.function.Consumer<C> p0) {}
    public <C extends java.lang.Object> void broadcast(java.util.function.BiConsumer<E, C> p0) {}
    public int getRegisteredCallbackCount() { return 0; }
    public E getRegisteredCallbackItem(int p0) { return null; }
    public java.lang.Object getRegisteredCallbackCookie(int p0) { return null; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}

    private final class Callback implements android.os.IBinder.DeathRecipient {
        final E mCallback = null;
        final java.lang.Object mCookie = null;
        Callback(E p0, java.lang.Object p1) {}
        public void binderDied() {}
    }
}
