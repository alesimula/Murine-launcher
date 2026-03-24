package com.android.internal.listeners;

public abstract class ListenerTransportManager<TTransport extends com.android.internal.listeners.ListenerTransport<?>> {
    protected ListenerTransportManager(boolean p0) {}
    public final void addListener(java.lang.Object p0, TTransport p1) {}
    public final void removeListener(java.lang.Object p0) {}
    protected abstract void registerTransport(TTransport p0) throws android.os.RemoteException;
    protected void registerTransport(TTransport p0, TTransport p1) throws android.os.RemoteException {}
    protected abstract void unregisterTransport(TTransport p0) throws android.os.RemoteException;
}
