package android.print;

public interface IPrintSpoolerCallbacks extends android.os.IInterface {
    public void onGetPrintJobInfosResult(java.util.List<android.print.PrintJobInfo> p0, int p1) throws android.os.RemoteException;
    public void onCancelPrintJobResult(boolean p0, int p1) throws android.os.RemoteException;
    public void onSetPrintJobStateResult(boolean p0, int p1) throws android.os.RemoteException;
    public void onSetPrintJobTagResult(boolean p0, int p1) throws android.os.RemoteException;
    public void onGetPrintJobInfoResult(android.print.PrintJobInfo p0, int p1) throws android.os.RemoteException;
    public void onGetCustomPrinterIconResult(android.graphics.drawable.Icon p0, int p1) throws android.os.RemoteException;
    public void onCustomPrinterIconCached(int p0) throws android.os.RemoteException;
    public void customPrinterIconCacheCleared(int p0) throws android.os.RemoteException;

    public static class Default implements android.print.IPrintSpoolerCallbacks {
        public Default() {}
        public void onGetPrintJobInfosResult(java.util.List<android.print.PrintJobInfo> p0, int p1) throws android.os.RemoteException {}
        public void onCancelPrintJobResult(boolean p0, int p1) throws android.os.RemoteException {}
        public void onSetPrintJobStateResult(boolean p0, int p1) throws android.os.RemoteException {}
        public void onSetPrintJobTagResult(boolean p0, int p1) throws android.os.RemoteException {}
        public void onGetPrintJobInfoResult(android.print.PrintJobInfo p0, int p1) throws android.os.RemoteException {}
        public void onGetCustomPrinterIconResult(android.graphics.drawable.Icon p0, int p1) throws android.os.RemoteException {}
        public void onCustomPrinterIconCached(int p0) throws android.os.RemoteException {}
        public void customPrinterIconCacheCleared(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.print.IPrintSpoolerCallbacks {
        public static final java.lang.String DESCRIPTOR = "android.print.IPrintSpoolerCallbacks";
        static final int TRANSACTION_onGetPrintJobInfosResult = 1;
        static final int TRANSACTION_onCancelPrintJobResult = 2;
        static final int TRANSACTION_onSetPrintJobStateResult = 3;
        static final int TRANSACTION_onSetPrintJobTagResult = 4;
        static final int TRANSACTION_onGetPrintJobInfoResult = 5;
        static final int TRANSACTION_onGetCustomPrinterIconResult = 6;
        static final int TRANSACTION_onCustomPrinterIconCached = 7;
        static final int TRANSACTION_customPrinterIconCacheCleared = 8;
        public Stub() { super(); }
        public static android.print.IPrintSpoolerCallbacks asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.print.IPrintSpoolerCallbacks p0) { return false; }
        public static android.print.IPrintSpoolerCallbacks getDefaultImpl() { return null; }

        private static class Proxy implements android.print.IPrintSpoolerCallbacks {
            private android.os.IBinder mRemote;
            public static android.print.IPrintSpoolerCallbacks sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onGetPrintJobInfosResult(java.util.List<android.print.PrintJobInfo> p0, int p1) throws android.os.RemoteException {}
            public void onCancelPrintJobResult(boolean p0, int p1) throws android.os.RemoteException {}
            public void onSetPrintJobStateResult(boolean p0, int p1) throws android.os.RemoteException {}
            public void onSetPrintJobTagResult(boolean p0, int p1) throws android.os.RemoteException {}
            public void onGetPrintJobInfoResult(android.print.PrintJobInfo p0, int p1) throws android.os.RemoteException {}
            public void onGetCustomPrinterIconResult(android.graphics.drawable.Icon p0, int p1) throws android.os.RemoteException {}
            public void onCustomPrinterIconCached(int p0) throws android.os.RemoteException {}
            public void customPrinterIconCacheCleared(int p0) throws android.os.RemoteException {}
        }
    }
}
