package android.location;

abstract class AbstractListenerManager<TRequest extends java.lang.Object, TListener extends java.lang.Object> {
    private final java.lang.Object mLock = null;
    private volatile android.util.ArrayMap<java.lang.Object, android.location.AbstractListenerManager.Registration<TRequest, TListener>> mListeners;
    AbstractListenerManager() {}
    public boolean addListener(TListener p0, android.os.Handler p1) throws android.os.RemoteException { return false; }
    public boolean addListener(TListener p0, java.util.concurrent.Executor p1) throws android.os.RemoteException { return false; }
    public boolean addListener(TRequest p0, TListener p1, android.os.Handler p2) throws android.os.RemoteException { return false; }
    public boolean addListener(TRequest p0, TListener p1, java.util.concurrent.Executor p2) throws android.os.RemoteException { return false; }
    protected final boolean addInternal(TRequest p0, java.lang.Object p1, android.os.Handler p2) throws android.os.RemoteException { return false; }
    protected final boolean addInternal(TRequest p0, java.lang.Object p1, java.util.concurrent.Executor p2) throws android.os.RemoteException { return false; }
    private boolean addInternal(java.lang.Object p0, android.location.AbstractListenerManager.Registration<TRequest, TListener> p1) throws android.os.RemoteException { return false; }
    public void removeListener(java.lang.Object p0) throws android.os.RemoteException {}
    protected TListener convertKey(java.lang.Object p0) { return null; }
    protected abstract boolean registerService(TRequest p0) throws android.os.RemoteException;
    protected abstract void unregisterService() throws android.os.RemoteException;
    protected TRequest merge(java.util.List<TRequest> p0) { return null; }
    protected void execute(java.util.function.Consumer<TListener> p0) {}
    private TRequest mergeRequests() { return null; }

    private static class Registration<TRequest extends java.lang.Object, TListener extends java.lang.Object> {
        private final java.util.concurrent.Executor mExecutor = null;
        private Registration(TRequest p0, java.util.concurrent.Executor p1, TListener p2) {}
        public TRequest getRequest() { return null; }
        private void unregister() {}
        private void execute(java.util.function.Consumer<TListener> p0) {}
        private void accept(java.util.function.Consumer<TListener> p0) {}
    }
}
