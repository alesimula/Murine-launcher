package android.app;

public interface IApplicationStartInfoCompleteListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IApplicationStartInfoCompleteListener";
    public void onApplicationStartInfoComplete(android.app.ApplicationStartInfo p0) throws android.os.RemoteException;

    public static class Default implements android.app.IApplicationStartInfoCompleteListener {
        public Default() {}
        public void onApplicationStartInfoComplete(android.app.ApplicationStartInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IApplicationStartInfoCompleteListener {
        static final int TRANSACTION_onApplicationStartInfoComplete = 1;
        public Stub() { super(); }
        public static android.app.IApplicationStartInfoCompleteListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.IApplicationStartInfoCompleteListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onApplicationStartInfoComplete(android.app.ApplicationStartInfo p0) throws android.os.RemoteException {}
        }
    }
}
