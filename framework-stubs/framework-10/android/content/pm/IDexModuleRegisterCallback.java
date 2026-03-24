package android.content.pm;

public interface IDexModuleRegisterCallback extends android.os.IInterface {
    public void onDexModuleRegistered(java.lang.String p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IDexModuleRegisterCallback {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.IDexModuleRegisterCallback";
        static final int TRANSACTION_onDexModuleRegistered = 1;
        public Stub() { super(); }
        public static android.content.pm.IDexModuleRegisterCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IDexModuleRegisterCallback p0) { return false; }
        public static android.content.pm.IDexModuleRegisterCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IDexModuleRegisterCallback {
            private android.os.IBinder mRemote;
            public static android.content.pm.IDexModuleRegisterCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDexModuleRegistered(java.lang.String p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.content.pm.IDexModuleRegisterCallback {
        public Default() {}
        public void onDexModuleRegistered(java.lang.String p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
