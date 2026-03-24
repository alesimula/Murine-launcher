package android.media.musicrecognition;

public interface IMusicRecognitionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.musicrecognition.IMusicRecognitionService";
    public void onAudioStreamStarted(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.media.musicrecognition.IMusicRecognitionServiceCallback p2) throws android.os.RemoteException;
    public void getAttributionTag(android.media.musicrecognition.IMusicRecognitionAttributionTagCallback p0) throws android.os.RemoteException;

    public static class Default implements android.media.musicrecognition.IMusicRecognitionService {
        public Default() {}
        public void onAudioStreamStarted(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.media.musicrecognition.IMusicRecognitionServiceCallback p2) throws android.os.RemoteException {}
        public void getAttributionTag(android.media.musicrecognition.IMusicRecognitionAttributionTagCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.musicrecognition.IMusicRecognitionService {
        static final int TRANSACTION_onAudioStreamStarted = 1;
        static final int TRANSACTION_getAttributionTag = 2;
        public Stub() { super(); }
        public static android.media.musicrecognition.IMusicRecognitionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.musicrecognition.IMusicRecognitionService p0) { return false; }
        public static android.media.musicrecognition.IMusicRecognitionService getDefaultImpl() { return null; }

        private static class Proxy implements android.media.musicrecognition.IMusicRecognitionService {
            private android.os.IBinder mRemote;
            public static android.media.musicrecognition.IMusicRecognitionService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAudioStreamStarted(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.media.musicrecognition.IMusicRecognitionServiceCallback p2) throws android.os.RemoteException {}
            public void getAttributionTag(android.media.musicrecognition.IMusicRecognitionAttributionTagCallback p0) throws android.os.RemoteException {}
        }
    }
}
