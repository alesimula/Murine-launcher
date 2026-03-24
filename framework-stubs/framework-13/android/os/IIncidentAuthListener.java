package android.os;

public interface IIncidentAuthListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IIncidentAuthListener";
    public void onReportApproved() throws android.os.RemoteException;
    public void onReportDenied() throws android.os.RemoteException;

    public static class Default implements android.os.IIncidentAuthListener {
        public Default() {}
        public void onReportApproved() throws android.os.RemoteException {}
        public void onReportDenied() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IIncidentAuthListener {
        static final int TRANSACTION_onReportApproved = 1;
        static final int TRANSACTION_onReportDenied = 2;
        public Stub() { super(); }
        public static android.os.IIncidentAuthListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IIncidentAuthListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onReportApproved() throws android.os.RemoteException {}
            public void onReportDenied() throws android.os.RemoteException {}
        }
    }
}
