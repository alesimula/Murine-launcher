package android.os;

public interface IIncidentManager extends android.os.IInterface {
    public void reportIncident(android.os.IncidentReportArgs p0) throws android.os.RemoteException;
    public void reportIncidentToStream(android.os.IncidentReportArgs p0, android.os.IIncidentReportStatusListener p1, java.io.FileDescriptor p2) throws android.os.RemoteException;
    public void reportIncidentToDumpstate(java.io.FileDescriptor p0, android.os.IIncidentReportStatusListener p1) throws android.os.RemoteException;
    public void registerSection(int p0, java.lang.String p1, android.os.IIncidentDumpCallback p2) throws android.os.RemoteException;
    public void unregisterSection(int p0) throws android.os.RemoteException;
    public void systemRunning() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getIncidentReportList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.os.IncidentManager.IncidentReport getIncidentReport(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void deleteIncidentReports(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void deleteAllIncidentReports(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.os.IIncidentManager {
        public Default() {}
        public void reportIncident(android.os.IncidentReportArgs p0) throws android.os.RemoteException {}
        public void reportIncidentToStream(android.os.IncidentReportArgs p0, android.os.IIncidentReportStatusListener p1, java.io.FileDescriptor p2) throws android.os.RemoteException {}
        public void reportIncidentToDumpstate(java.io.FileDescriptor p0, android.os.IIncidentReportStatusListener p1) throws android.os.RemoteException {}
        public void registerSection(int p0, java.lang.String p1, android.os.IIncidentDumpCallback p2) throws android.os.RemoteException {}
        public void unregisterSection(int p0) throws android.os.RemoteException {}
        public void systemRunning() throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getIncidentReportList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.os.IncidentManager.IncidentReport getIncidentReport(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void deleteIncidentReports(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void deleteAllIncidentReports(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IIncidentManager {
        public static final java.lang.String DESCRIPTOR = "android.os.IIncidentManager";
        static final int TRANSACTION_reportIncident = 1;
        static final int TRANSACTION_reportIncidentToStream = 2;
        static final int TRANSACTION_reportIncidentToDumpstate = 3;
        static final int TRANSACTION_registerSection = 4;
        static final int TRANSACTION_unregisterSection = 5;
        static final int TRANSACTION_systemRunning = 6;
        static final int TRANSACTION_getIncidentReportList = 7;
        static final int TRANSACTION_getIncidentReport = 8;
        static final int TRANSACTION_deleteIncidentReports = 9;
        static final int TRANSACTION_deleteAllIncidentReports = 10;
        public Stub() { super(); }
        public static android.os.IIncidentManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IIncidentManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void reportIncident(android.os.IncidentReportArgs p0) throws android.os.RemoteException {}
            public void reportIncidentToStream(android.os.IncidentReportArgs p0, android.os.IIncidentReportStatusListener p1, java.io.FileDescriptor p2) throws android.os.RemoteException {}
            public void reportIncidentToDumpstate(java.io.FileDescriptor p0, android.os.IIncidentReportStatusListener p1) throws android.os.RemoteException {}
            public void registerSection(int p0, java.lang.String p1, android.os.IIncidentDumpCallback p2) throws android.os.RemoteException {}
            public void unregisterSection(int p0) throws android.os.RemoteException {}
            public void systemRunning() throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getIncidentReportList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.os.IncidentManager.IncidentReport getIncidentReport(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void deleteIncidentReports(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void deleteAllIncidentReports(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
