package android.location;

abstract class LocalListenerHelper<TListener extends java.lang.Object> {
    private final java.util.HashMap<TListener, android.os.Handler> mListeners = null;
    private final java.lang.String mTag = null;
    private final android.content.Context mContext = null;
    protected LocalListenerHelper(android.content.Context p0, java.lang.String p1) {}
    public boolean add(TListener p0, android.os.Handler p1) { return false; }
    public void remove(TListener p0) {}
    protected abstract boolean registerWithServer() throws android.os.RemoteException;
    protected abstract void unregisterFromServer() throws android.os.RemoteException;
    protected android.content.Context getContext() { return null; }
    private void executeOperation(android.location.LocalListenerHelper.ListenerOperation<TListener> p0, TListener p1) {}
    protected void foreach(android.location.LocalListenerHelper.ListenerOperation<TListener> p0) {}

    protected static interface ListenerOperation<TListener extends java.lang.Object> {
        public void execute(TListener p0) throws android.os.RemoteException;
    }
}
