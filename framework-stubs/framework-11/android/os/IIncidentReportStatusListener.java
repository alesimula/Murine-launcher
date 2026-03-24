package android.os;

public interface IIncidentReportStatusListener extends android.os.IInterface {
    public static final int STATUS_STARTING = 1;
    public static final int STATUS_FINISHED = 2;
    public void onReportStarted() throws android.os.RemoteException;
    public void onReportSectionStatus(int p0, int p1) throws android.os.RemoteException;
    public void onReportFinished() throws android.os.RemoteException;
    public void onReportFailed() throws android.os.RemoteException;

    public static class Default implements android.os.IIncidentReportStatusListener {
        public Default() {}
        public void onReportStarted() throws android.os.RemoteException {}
        public void onReportSectionStatus(int p0, int p1) throws android.os.RemoteException {}
        public void onReportFinished() throws android.os.RemoteException {}
        public void onReportFailed() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IIncidentReportStatusListener {
        private static final java.lang.String DESCRIPTOR = "android.os.IIncidentReportStatusListener";
        static final int TRANSACTION_onReportStarted = 1;
        static final int TRANSACTION_onReportSectionStatus = 2;
        static final int TRANSACTION_onReportFinished = 3;
        static final int TRANSACTION_onReportFailed = 4;
        public Stub() { super(); }
        public static android.os.IIncidentReportStatusListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IIncidentReportStatusListener p0) { return false; }
        public static android.os.IIncidentReportStatusListener getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IIncidentReportStatusListener {
            private android.os.IBinder mRemote;
            public static android.os.IIncidentReportStatusListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onReportStarted() throws android.os.RemoteException {}
            public void onReportSectionStatus(int p0, int p1) throws android.os.RemoteException {}
            public void onReportFinished() throws android.os.RemoteException {}
            public void onReportFailed() throws android.os.RemoteException {}
        }
    }
}
