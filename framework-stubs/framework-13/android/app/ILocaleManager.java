package android.app;

public interface ILocaleManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.ILocaleManager";
    public void setApplicationLocales(java.lang.String p0, int p1, android.os.LocaleList p2) throws android.os.RemoteException;
    public android.os.LocaleList getApplicationLocales(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.os.LocaleList getSystemLocales() throws android.os.RemoteException;

    public static class Default implements android.app.ILocaleManager {
        public Default() {}
        public void setApplicationLocales(java.lang.String p0, int p1, android.os.LocaleList p2) throws android.os.RemoteException {}
        public android.os.LocaleList getApplicationLocales(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.os.LocaleList getSystemLocales() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.ILocaleManager {
        static final int TRANSACTION_setApplicationLocales = 1;
        static final int TRANSACTION_getApplicationLocales = 2;
        static final int TRANSACTION_getSystemLocales = 3;
        public Stub() { super(); }
        public static android.app.ILocaleManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.ILocaleManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setApplicationLocales(java.lang.String p0, int p1, android.os.LocaleList p2) throws android.os.RemoteException {}
            public android.os.LocaleList getApplicationLocales(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.os.LocaleList getSystemLocales() throws android.os.RemoteException { return null; }
        }
    }
}
