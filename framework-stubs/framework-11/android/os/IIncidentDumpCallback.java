package android.os;

public interface IIncidentDumpCallback extends android.os.IInterface {
    public void onDumpSection(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;

    public static class Default implements android.os.IIncidentDumpCallback {
        public Default() {}
        public void onDumpSection(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IIncidentDumpCallback {
        private static final java.lang.String DESCRIPTOR = "android.os.IIncidentDumpCallback";
        static final int TRANSACTION_onDumpSection = 1;
        public Stub() { super(); }
        public static android.os.IIncidentDumpCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IIncidentDumpCallback p0) { return false; }
        public static android.os.IIncidentDumpCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IIncidentDumpCallback {
            private android.os.IBinder mRemote;
            public static android.os.IIncidentDumpCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDumpSection(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        }
    }
}
