package com.android.internal.net;

public interface INetworkWatchlistManager extends android.os.IInterface {
    public boolean startWatchlistLogging() throws android.os.RemoteException;
    public boolean stopWatchlistLogging() throws android.os.RemoteException;
    public void reloadWatchlist() throws android.os.RemoteException;
    public void reportWatchlistIfNecessary() throws android.os.RemoteException;
    public byte[] getWatchlistConfigHash() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.net.INetworkWatchlistManager {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.net.INetworkWatchlistManager";
        static final int TRANSACTION_startWatchlistLogging = 1;
        static final int TRANSACTION_stopWatchlistLogging = 2;
        static final int TRANSACTION_reloadWatchlist = 3;
        static final int TRANSACTION_reportWatchlistIfNecessary = 4;
        static final int TRANSACTION_getWatchlistConfigHash = 5;
        public Stub() { super(); }
        public static com.android.internal.net.INetworkWatchlistManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.net.INetworkWatchlistManager p0) { return false; }
        public static com.android.internal.net.INetworkWatchlistManager getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.net.INetworkWatchlistManager {
            private android.os.IBinder mRemote;
            public static com.android.internal.net.INetworkWatchlistManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean startWatchlistLogging() throws android.os.RemoteException { return false; }
            public boolean stopWatchlistLogging() throws android.os.RemoteException { return false; }
            public void reloadWatchlist() throws android.os.RemoteException {}
            public void reportWatchlistIfNecessary() throws android.os.RemoteException {}
            public byte[] getWatchlistConfigHash() throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements com.android.internal.net.INetworkWatchlistManager {
        public Default() {}
        public boolean startWatchlistLogging() throws android.os.RemoteException { return false; }
        public boolean stopWatchlistLogging() throws android.os.RemoteException { return false; }
        public void reloadWatchlist() throws android.os.RemoteException {}
        public void reportWatchlistIfNecessary() throws android.os.RemoteException {}
        public byte[] getWatchlistConfigHash() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
