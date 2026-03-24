package android.telephony.mbms.vendor;

public interface IMbmsStreamingService extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public int initialize(android.telephony.mbms.IMbmsStreamingSessionCallback p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int requestUpdateStreamingServices(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int startStreaming(int p0, java.lang.String p1, android.telephony.mbms.IStreamingServiceCallback p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.net.Uri getPlaybackUri(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void stopStreaming(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void dispose(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.telephony.mbms.vendor.IMbmsStreamingService {
        private static final java.lang.String DESCRIPTOR = "android.telephony.mbms.vendor.IMbmsStreamingService";
        static final int TRANSACTION_initialize = 1;
        static final int TRANSACTION_requestUpdateStreamingServices = 2;
        static final int TRANSACTION_startStreaming = 3;
        static final int TRANSACTION_getPlaybackUri = 4;
        static final int TRANSACTION_stopStreaming = 5;
        static final int TRANSACTION_dispose = 6;
        public Stub() { super(); }
        public static android.telephony.mbms.vendor.IMbmsStreamingService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.mbms.vendor.IMbmsStreamingService p0) { return false; }
        public static android.telephony.mbms.vendor.IMbmsStreamingService getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.mbms.vendor.IMbmsStreamingService {
            private android.os.IBinder mRemote;
            public static android.telephony.mbms.vendor.IMbmsStreamingService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int initialize(android.telephony.mbms.IMbmsStreamingSessionCallback p0, int p1) throws android.os.RemoteException { return 0; }
            public int requestUpdateStreamingServices(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return 0; }
            public int startStreaming(int p0, java.lang.String p1, android.telephony.mbms.IStreamingServiceCallback p2) throws android.os.RemoteException { return 0; }
            public android.net.Uri getPlaybackUri(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void stopStreaming(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void dispose(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.telephony.mbms.vendor.IMbmsStreamingService {
        public Default() {}
        public int initialize(android.telephony.mbms.IMbmsStreamingSessionCallback p0, int p1) throws android.os.RemoteException { return 0; }
        public int requestUpdateStreamingServices(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return 0; }
        public int startStreaming(int p0, java.lang.String p1, android.telephony.mbms.IStreamingServiceCallback p2) throws android.os.RemoteException { return 0; }
        public android.net.Uri getPlaybackUri(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void stopStreaming(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void dispose(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
