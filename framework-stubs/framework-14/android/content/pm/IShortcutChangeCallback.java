package android.content.pm;

public interface IShortcutChangeCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.content.pm.IShortcutChangeCallback";
    public void onShortcutsAddedOrUpdated(java.lang.String p0, java.util.List<android.content.pm.ShortcutInfo> p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void onShortcutsRemoved(java.lang.String p0, java.util.List<android.content.pm.ShortcutInfo> p1, android.os.UserHandle p2) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IShortcutChangeCallback {
        public Default() {}
        public void onShortcutsAddedOrUpdated(java.lang.String p0, java.util.List<android.content.pm.ShortcutInfo> p1, android.os.UserHandle p2) throws android.os.RemoteException {}
        public void onShortcutsRemoved(java.lang.String p0, java.util.List<android.content.pm.ShortcutInfo> p1, android.os.UserHandle p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IShortcutChangeCallback {
        static final int TRANSACTION_onShortcutsAddedOrUpdated = 1;
        static final int TRANSACTION_onShortcutsRemoved = 2;
        public Stub() { super(); }
        public static android.content.pm.IShortcutChangeCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.content.pm.IShortcutChangeCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onShortcutsAddedOrUpdated(java.lang.String p0, java.util.List<android.content.pm.ShortcutInfo> p1, android.os.UserHandle p2) throws android.os.RemoteException {}
            public void onShortcutsRemoved(java.lang.String p0, java.util.List<android.content.pm.ShortcutInfo> p1, android.os.UserHandle p2) throws android.os.RemoteException {}
        }
    }
}
