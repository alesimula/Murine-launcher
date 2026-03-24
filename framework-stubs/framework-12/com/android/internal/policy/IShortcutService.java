package com.android.internal.policy;

public interface IShortcutService extends android.os.IInterface {
    public void notifyShortcutKeyPressed(long p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.policy.IShortcutService {
        public Default() {}
        public void notifyShortcutKeyPressed(long p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.policy.IShortcutService {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.policy.IShortcutService";
        static final int TRANSACTION_notifyShortcutKeyPressed = 1;
        public Stub() { super(); }
        public static com.android.internal.policy.IShortcutService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.policy.IShortcutService p0) { return false; }
        public static com.android.internal.policy.IShortcutService getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.policy.IShortcutService {
            private android.os.IBinder mRemote;
            public static com.android.internal.policy.IShortcutService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyShortcutKeyPressed(long p0) throws android.os.RemoteException {}
        }
    }
}
