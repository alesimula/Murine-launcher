package android.print;

public interface IPrintSpooler extends android.os.IInterface {
    public void removeObsoletePrintJobs() throws android.os.RemoteException;
    public void getPrintJobInfos(android.print.IPrintSpoolerCallbacks p0, android.content.ComponentName p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void getPrintJobInfo(android.print.PrintJobId p0, android.print.IPrintSpoolerCallbacks p1, int p2, int p3) throws android.os.RemoteException;
    public void createPrintJob(android.print.PrintJobInfo p0) throws android.os.RemoteException;
    public void setPrintJobState(android.print.PrintJobId p0, int p1, java.lang.String p2, android.print.IPrintSpoolerCallbacks p3, int p4) throws android.os.RemoteException;
    public void setProgress(android.print.PrintJobId p0, float p1) throws android.os.RemoteException;
    public void setStatus(android.print.PrintJobId p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public void setStatusRes(android.print.PrintJobId p0, int p1, java.lang.CharSequence p2) throws android.os.RemoteException;
    public void onCustomPrinterIconLoaded(android.print.PrinterId p0, android.graphics.drawable.Icon p1, android.print.IPrintSpoolerCallbacks p2, int p3) throws android.os.RemoteException;
    public void getCustomPrinterIcon(android.print.PrinterId p0, android.print.IPrintSpoolerCallbacks p1, int p2) throws android.os.RemoteException;
    public void clearCustomPrinterIconCache(android.print.IPrintSpoolerCallbacks p0, int p1) throws android.os.RemoteException;
    public void setPrintJobTag(android.print.PrintJobId p0, java.lang.String p1, android.print.IPrintSpoolerCallbacks p2, int p3) throws android.os.RemoteException;
    public void writePrintJobData(android.os.ParcelFileDescriptor p0, android.print.PrintJobId p1) throws android.os.RemoteException;
    public void setClient(android.print.IPrintSpoolerClient p0) throws android.os.RemoteException;
    public void setPrintJobCancelling(android.print.PrintJobId p0, boolean p1) throws android.os.RemoteException;
    public void pruneApprovedPrintServices(java.util.List<android.content.ComponentName> p0) throws android.os.RemoteException;

    public static class Default implements android.print.IPrintSpooler {
        public Default() {}
        public void removeObsoletePrintJobs() throws android.os.RemoteException {}
        public void getPrintJobInfos(android.print.IPrintSpoolerCallbacks p0, android.content.ComponentName p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void getPrintJobInfo(android.print.PrintJobId p0, android.print.IPrintSpoolerCallbacks p1, int p2, int p3) throws android.os.RemoteException {}
        public void createPrintJob(android.print.PrintJobInfo p0) throws android.os.RemoteException {}
        public void setPrintJobState(android.print.PrintJobId p0, int p1, java.lang.String p2, android.print.IPrintSpoolerCallbacks p3, int p4) throws android.os.RemoteException {}
        public void setProgress(android.print.PrintJobId p0, float p1) throws android.os.RemoteException {}
        public void setStatus(android.print.PrintJobId p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public void setStatusRes(android.print.PrintJobId p0, int p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
        public void onCustomPrinterIconLoaded(android.print.PrinterId p0, android.graphics.drawable.Icon p1, android.print.IPrintSpoolerCallbacks p2, int p3) throws android.os.RemoteException {}
        public void getCustomPrinterIcon(android.print.PrinterId p0, android.print.IPrintSpoolerCallbacks p1, int p2) throws android.os.RemoteException {}
        public void clearCustomPrinterIconCache(android.print.IPrintSpoolerCallbacks p0, int p1) throws android.os.RemoteException {}
        public void setPrintJobTag(android.print.PrintJobId p0, java.lang.String p1, android.print.IPrintSpoolerCallbacks p2, int p3) throws android.os.RemoteException {}
        public void writePrintJobData(android.os.ParcelFileDescriptor p0, android.print.PrintJobId p1) throws android.os.RemoteException {}
        public void setClient(android.print.IPrintSpoolerClient p0) throws android.os.RemoteException {}
        public void setPrintJobCancelling(android.print.PrintJobId p0, boolean p1) throws android.os.RemoteException {}
        public void pruneApprovedPrintServices(java.util.List<android.content.ComponentName> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.print.IPrintSpooler {
        private static final java.lang.String DESCRIPTOR = "android.print.IPrintSpooler";
        static final int TRANSACTION_removeObsoletePrintJobs = 1;
        static final int TRANSACTION_getPrintJobInfos = 2;
        static final int TRANSACTION_getPrintJobInfo = 3;
        static final int TRANSACTION_createPrintJob = 4;
        static final int TRANSACTION_setPrintJobState = 5;
        static final int TRANSACTION_setProgress = 6;
        static final int TRANSACTION_setStatus = 7;
        static final int TRANSACTION_setStatusRes = 8;
        static final int TRANSACTION_onCustomPrinterIconLoaded = 9;
        static final int TRANSACTION_getCustomPrinterIcon = 10;
        static final int TRANSACTION_clearCustomPrinterIconCache = 11;
        static final int TRANSACTION_setPrintJobTag = 12;
        static final int TRANSACTION_writePrintJobData = 13;
        static final int TRANSACTION_setClient = 14;
        static final int TRANSACTION_setPrintJobCancelling = 15;
        static final int TRANSACTION_pruneApprovedPrintServices = 16;
        public Stub() { super(); }
        public static android.print.IPrintSpooler asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.print.IPrintSpooler p0) { return false; }
        public static android.print.IPrintSpooler getDefaultImpl() { return null; }

        private static class Proxy implements android.print.IPrintSpooler {
            private android.os.IBinder mRemote;
            public static android.print.IPrintSpooler sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void removeObsoletePrintJobs() throws android.os.RemoteException {}
            public void getPrintJobInfos(android.print.IPrintSpoolerCallbacks p0, android.content.ComponentName p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void getPrintJobInfo(android.print.PrintJobId p0, android.print.IPrintSpoolerCallbacks p1, int p2, int p3) throws android.os.RemoteException {}
            public void createPrintJob(android.print.PrintJobInfo p0) throws android.os.RemoteException {}
            public void setPrintJobState(android.print.PrintJobId p0, int p1, java.lang.String p2, android.print.IPrintSpoolerCallbacks p3, int p4) throws android.os.RemoteException {}
            public void setProgress(android.print.PrintJobId p0, float p1) throws android.os.RemoteException {}
            public void setStatus(android.print.PrintJobId p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public void setStatusRes(android.print.PrintJobId p0, int p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
            public void onCustomPrinterIconLoaded(android.print.PrinterId p0, android.graphics.drawable.Icon p1, android.print.IPrintSpoolerCallbacks p2, int p3) throws android.os.RemoteException {}
            public void getCustomPrinterIcon(android.print.PrinterId p0, android.print.IPrintSpoolerCallbacks p1, int p2) throws android.os.RemoteException {}
            public void clearCustomPrinterIconCache(android.print.IPrintSpoolerCallbacks p0, int p1) throws android.os.RemoteException {}
            public void setPrintJobTag(android.print.PrintJobId p0, java.lang.String p1, android.print.IPrintSpoolerCallbacks p2, int p3) throws android.os.RemoteException {}
            public void writePrintJobData(android.os.ParcelFileDescriptor p0, android.print.PrintJobId p1) throws android.os.RemoteException {}
            public void setClient(android.print.IPrintSpoolerClient p0) throws android.os.RemoteException {}
            public void setPrintJobCancelling(android.print.PrintJobId p0, boolean p1) throws android.os.RemoteException {}
            public void pruneApprovedPrintServices(java.util.List<android.content.ComponentName> p0) throws android.os.RemoteException {}
        }
    }
}
