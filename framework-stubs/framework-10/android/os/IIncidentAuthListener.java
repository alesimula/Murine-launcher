package android.os;

public interface IIncidentAuthListener extends android.os.IInterface {
    public void onReportApproved() throws android.os.RemoteException;
    public void onReportDenied() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.IIncidentAuthListener {
        private static final java.lang.String DESCRIPTOR = "android.os.IIncidentAuthListener";
        static final int TRANSACTION_onReportApproved = 1;
        static final int TRANSACTION_onReportDenied = 2;
        public Stub() { super(); }
        public static android.os.IIncidentAuthListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IIncidentAuthListener p0) { return false; }
        public static android.os.IIncidentAuthListener getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IIncidentAuthListener {
            private android.os.IBinder mRemote;
            public static android.os.IIncidentAuthListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onReportApproved() throws android.os.RemoteException {}
            public void onReportDenied() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.os.IIncidentAuthListener {
        public Default() {}
        public void onReportApproved() throws android.os.RemoteException {}
        public void onReportDenied() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
