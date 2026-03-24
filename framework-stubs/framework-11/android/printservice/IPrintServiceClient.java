package android.printservice;

public interface IPrintServiceClient extends android.os.IInterface {
    public java.util.List<android.print.PrintJobInfo> getPrintJobInfos() throws android.os.RemoteException;
    public android.print.PrintJobInfo getPrintJobInfo(android.print.PrintJobId p0) throws android.os.RemoteException;
    public boolean setPrintJobState(android.print.PrintJobId p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean setPrintJobTag(android.print.PrintJobId p0, java.lang.String p1) throws android.os.RemoteException;
    public void writePrintJobData(android.os.ParcelFileDescriptor p0, android.print.PrintJobId p1) throws android.os.RemoteException;
    public void setProgress(android.print.PrintJobId p0, float p1) throws android.os.RemoteException;
    public void setStatus(android.print.PrintJobId p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public void setStatusRes(android.print.PrintJobId p0, int p1, java.lang.CharSequence p2) throws android.os.RemoteException;
    public void onPrintersAdded(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException;
    public void onPrintersRemoved(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException;
    public void onCustomPrinterIconLoaded(android.print.PrinterId p0, android.graphics.drawable.Icon p1) throws android.os.RemoteException;

    public static class Default implements android.printservice.IPrintServiceClient {
        public Default() {}
        public java.util.List<android.print.PrintJobInfo> getPrintJobInfos() throws android.os.RemoteException { return null; }
        public android.print.PrintJobInfo getPrintJobInfo(android.print.PrintJobId p0) throws android.os.RemoteException { return null; }
        public boolean setPrintJobState(android.print.PrintJobId p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean setPrintJobTag(android.print.PrintJobId p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void writePrintJobData(android.os.ParcelFileDescriptor p0, android.print.PrintJobId p1) throws android.os.RemoteException {}
        public void setProgress(android.print.PrintJobId p0, float p1) throws android.os.RemoteException {}
        public void setStatus(android.print.PrintJobId p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public void setStatusRes(android.print.PrintJobId p0, int p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
        public void onPrintersAdded(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
        public void onPrintersRemoved(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
        public void onCustomPrinterIconLoaded(android.print.PrinterId p0, android.graphics.drawable.Icon p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.printservice.IPrintServiceClient {
        private static final java.lang.String DESCRIPTOR = "android.printservice.IPrintServiceClient";
        static final int TRANSACTION_getPrintJobInfos = 1;
        static final int TRANSACTION_getPrintJobInfo = 2;
        static final int TRANSACTION_setPrintJobState = 3;
        static final int TRANSACTION_setPrintJobTag = 4;
        static final int TRANSACTION_writePrintJobData = 5;
        static final int TRANSACTION_setProgress = 6;
        static final int TRANSACTION_setStatus = 7;
        static final int TRANSACTION_setStatusRes = 8;
        static final int TRANSACTION_onPrintersAdded = 9;
        static final int TRANSACTION_onPrintersRemoved = 10;
        static final int TRANSACTION_onCustomPrinterIconLoaded = 11;
        public Stub() { super(); }
        public static android.printservice.IPrintServiceClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.printservice.IPrintServiceClient p0) { return false; }
        public static android.printservice.IPrintServiceClient getDefaultImpl() { return null; }

        private static class Proxy implements android.printservice.IPrintServiceClient {
            private android.os.IBinder mRemote;
            public static android.printservice.IPrintServiceClient sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.print.PrintJobInfo> getPrintJobInfos() throws android.os.RemoteException { return null; }
            public android.print.PrintJobInfo getPrintJobInfo(android.print.PrintJobId p0) throws android.os.RemoteException { return null; }
            public boolean setPrintJobState(android.print.PrintJobId p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean setPrintJobTag(android.print.PrintJobId p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void writePrintJobData(android.os.ParcelFileDescriptor p0, android.print.PrintJobId p1) throws android.os.RemoteException {}
            public void setProgress(android.print.PrintJobId p0, float p1) throws android.os.RemoteException {}
            public void setStatus(android.print.PrintJobId p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public void setStatusRes(android.print.PrintJobId p0, int p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
            public void onPrintersAdded(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
            public void onPrintersRemoved(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
            public void onCustomPrinterIconLoaded(android.print.PrinterId p0, android.graphics.drawable.Icon p1) throws android.os.RemoteException {}
        }
    }
}
