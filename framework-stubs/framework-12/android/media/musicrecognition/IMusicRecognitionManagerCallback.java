package android.media.musicrecognition;

public interface IMusicRecognitionManagerCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.musicrecognition.IMusicRecognitionManagerCallback";
    public void onRecognitionSucceeded(android.media.MediaMetadata p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void onRecognitionFailed(int p0) throws android.os.RemoteException;
    public void onAudioStreamClosed() throws android.os.RemoteException;

    public static class Default implements android.media.musicrecognition.IMusicRecognitionManagerCallback {
        public Default() {}
        public void onRecognitionSucceeded(android.media.MediaMetadata p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void onRecognitionFailed(int p0) throws android.os.RemoteException {}
        public void onAudioStreamClosed() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.musicrecognition.IMusicRecognitionManagerCallback {
        static final int TRANSACTION_onRecognitionSucceeded = 1;
        static final int TRANSACTION_onRecognitionFailed = 2;
        static final int TRANSACTION_onAudioStreamClosed = 3;
        public Stub() { super(); }
        public static android.media.musicrecognition.IMusicRecognitionManagerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.musicrecognition.IMusicRecognitionManagerCallback p0) { return false; }
        public static android.media.musicrecognition.IMusicRecognitionManagerCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.media.musicrecognition.IMusicRecognitionManagerCallback {
            private android.os.IBinder mRemote;
            public static android.media.musicrecognition.IMusicRecognitionManagerCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRecognitionSucceeded(android.media.MediaMetadata p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void onRecognitionFailed(int p0) throws android.os.RemoteException {}
            public void onAudioStreamClosed() throws android.os.RemoteException {}
        }
    }
}
