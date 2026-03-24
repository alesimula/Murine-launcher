package android.print;

public interface IPrintSpoolerClient extends android.os.IInterface {
    public void onPrintJobQueued(android.print.PrintJobInfo p0) throws android.os.RemoteException;
    public void onAllPrintJobsForServiceHandled(android.content.ComponentName p0) throws android.os.RemoteException;
    public void onAllPrintJobsHandled() throws android.os.RemoteException;
    public void onPrintJobStateChanged(android.print.PrintJobInfo p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.print.IPrintSpoolerClient {
        private static final java.lang.String DESCRIPTOR = "android.print.IPrintSpoolerClient";
        static final int TRANSACTION_onPrintJobQueued = 1;
        static final int TRANSACTION_onAllPrintJobsForServiceHandled = 2;
        static final int TRANSACTION_onAllPrintJobsHandled = 3;
        static final int TRANSACTION_onPrintJobStateChanged = 4;
        public Stub() { super(); }
        public static android.print.IPrintSpoolerClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.print.IPrintSpoolerClient p0) { return false; }
        public static android.print.IPrintSpoolerClient getDefaultImpl() { return null; }

        private static class Proxy implements android.print.IPrintSpoolerClient {
            private android.os.IBinder mRemote;
            public static android.print.IPrintSpoolerClient sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onPrintJobQueued(android.print.PrintJobInfo p0) throws android.os.RemoteException {}
            public void onAllPrintJobsForServiceHandled(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void onAllPrintJobsHandled() throws android.os.RemoteException {}
            public void onPrintJobStateChanged(android.print.PrintJobInfo p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.print.IPrintSpoolerClient {
        public Default() {}
        public void onPrintJobQueued(android.print.PrintJobInfo p0) throws android.os.RemoteException {}
        public void onAllPrintJobsForServiceHandled(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void onAllPrintJobsHandled() throws android.os.RemoteException {}
        public void onPrintJobStateChanged(android.print.PrintJobInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
