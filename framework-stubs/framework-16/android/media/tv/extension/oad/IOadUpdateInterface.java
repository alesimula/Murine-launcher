package android.media.tv.extension.oad;

public interface IOadUpdateInterface extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.oad.IOadUpdateInterface";
    public void setOadStatus(boolean p0) throws android.os.RemoteException;
    public boolean getOadStatus() throws android.os.RemoteException;
    public void startScan() throws android.os.RemoteException;
    public void stopScan() throws android.os.RemoteException;
    public void startDetect() throws android.os.RemoteException;
    public void stopDetect() throws android.os.RemoteException;
    public void startDownload() throws android.os.RemoteException;
    public void stopDownload() throws android.os.RemoteException;
    public int getSoftwareVersion() throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.oad.IOadUpdateInterface {
        public Default() {}
        public void setOadStatus(boolean p0) throws android.os.RemoteException {}
        public boolean getOadStatus() throws android.os.RemoteException { return false; }
        public void startScan() throws android.os.RemoteException {}
        public void stopScan() throws android.os.RemoteException {}
        public void startDetect() throws android.os.RemoteException {}
        public void stopDetect() throws android.os.RemoteException {}
        public void startDownload() throws android.os.RemoteException {}
        public void stopDownload() throws android.os.RemoteException {}
        public int getSoftwareVersion() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.oad.IOadUpdateInterface {
        static final int TRANSACTION_setOadStatus = 1;
        static final int TRANSACTION_getOadStatus = 2;
        static final int TRANSACTION_startScan = 3;
        static final int TRANSACTION_stopScan = 4;
        static final int TRANSACTION_startDetect = 5;
        static final int TRANSACTION_stopDetect = 6;
        static final int TRANSACTION_startDownload = 7;
        static final int TRANSACTION_stopDownload = 8;
        static final int TRANSACTION_getSoftwareVersion = 9;
        public Stub() { super(); }
        public static android.media.tv.extension.oad.IOadUpdateInterface asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.oad.IOadUpdateInterface {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setOadStatus(boolean p0) throws android.os.RemoteException {}
            public boolean getOadStatus() throws android.os.RemoteException { return false; }
            public void startScan() throws android.os.RemoteException {}
            public void stopScan() throws android.os.RemoteException {}
            public void startDetect() throws android.os.RemoteException {}
            public void stopDetect() throws android.os.RemoteException {}
            public void startDownload() throws android.os.RemoteException {}
            public void stopDownload() throws android.os.RemoteException {}
            public int getSoftwareVersion() throws android.os.RemoteException { return 0; }
        }
    }
}
