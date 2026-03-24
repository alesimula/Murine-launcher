package android.media.musicrecognition;

public interface IMusicRecognitionServiceCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.musicrecognition.IMusicRecognitionServiceCallback";
    public void onRecognitionSucceeded(android.media.MediaMetadata p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void onRecognitionFailed(int p0) throws android.os.RemoteException;

    public static class Default implements android.media.musicrecognition.IMusicRecognitionServiceCallback {
        public Default() {}
        public void onRecognitionSucceeded(android.media.MediaMetadata p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void onRecognitionFailed(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.musicrecognition.IMusicRecognitionServiceCallback {
        static final int TRANSACTION_onRecognitionSucceeded = 1;
        static final int TRANSACTION_onRecognitionFailed = 2;
        public Stub() { super(); }
        public static android.media.musicrecognition.IMusicRecognitionServiceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.musicrecognition.IMusicRecognitionServiceCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRecognitionSucceeded(android.media.MediaMetadata p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void onRecognitionFailed(int p0) throws android.os.RemoteException {}
        }
    }
}
