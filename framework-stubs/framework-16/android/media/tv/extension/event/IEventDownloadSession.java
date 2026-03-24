package android.media.tv.extension.event;

public interface IEventDownloadSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.event.IEventDownloadSession";
    public int isBarkerOrSequentialDownloadByServiceType(android.os.Bundle p0) throws android.os.RemoteException;
    public int isBarkerOrSequentialDownloadByServiceRecord(android.os.Bundle p0) throws android.os.RemoteException;
    public void startTuningMultiplex(android.net.Uri p0) throws android.os.RemoteException;
    public void setActiveWindowChannelInfo(android.net.Uri[] p0) throws android.os.RemoteException;
    public void cancel() throws android.os.RemoteException;
    public void release() throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.event.IEventDownloadSession {
        public Default() {}
        public int isBarkerOrSequentialDownloadByServiceType(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
        public int isBarkerOrSequentialDownloadByServiceRecord(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
        public void startTuningMultiplex(android.net.Uri p0) throws android.os.RemoteException {}
        public void setActiveWindowChannelInfo(android.net.Uri[] p0) throws android.os.RemoteException {}
        public void cancel() throws android.os.RemoteException {}
        public void release() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.event.IEventDownloadSession {
        static final int TRANSACTION_isBarkerOrSequentialDownloadByServiceType = 1;
        static final int TRANSACTION_isBarkerOrSequentialDownloadByServiceRecord = 2;
        static final int TRANSACTION_startTuningMultiplex = 3;
        static final int TRANSACTION_setActiveWindowChannelInfo = 4;
        static final int TRANSACTION_cancel = 5;
        static final int TRANSACTION_release = 6;
        public Stub() { super(); }
        public static android.media.tv.extension.event.IEventDownloadSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.event.IEventDownloadSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int isBarkerOrSequentialDownloadByServiceType(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
            public int isBarkerOrSequentialDownloadByServiceRecord(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
            public void startTuningMultiplex(android.net.Uri p0) throws android.os.RemoteException {}
            public void setActiveWindowChannelInfo(android.net.Uri[] p0) throws android.os.RemoteException {}
            public void cancel() throws android.os.RemoteException {}
            public void release() throws android.os.RemoteException {}
        }
    }
}
