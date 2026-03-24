package android.media.soundtrigger;

public interface ISoundTriggerDetectionServiceClient extends android.os.IInterface {
    public void onOpFinished(int p0) throws android.os.RemoteException;

    public static class Default implements android.media.soundtrigger.ISoundTriggerDetectionServiceClient {
        public Default() {}
        public void onOpFinished(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.soundtrigger.ISoundTriggerDetectionServiceClient {
        private static final java.lang.String DESCRIPTOR = "android.media.soundtrigger.ISoundTriggerDetectionServiceClient";
        static final int TRANSACTION_onOpFinished = 1;
        public Stub() { super(); }
        public static android.media.soundtrigger.ISoundTriggerDetectionServiceClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.soundtrigger.ISoundTriggerDetectionServiceClient p0) { return false; }
        public static android.media.soundtrigger.ISoundTriggerDetectionServiceClient getDefaultImpl() { return null; }

        private static class Proxy implements android.media.soundtrigger.ISoundTriggerDetectionServiceClient {
            private android.os.IBinder mRemote;
            public static android.media.soundtrigger.ISoundTriggerDetectionServiceClient sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onOpFinished(int p0) throws android.os.RemoteException {}
        }
    }
}
