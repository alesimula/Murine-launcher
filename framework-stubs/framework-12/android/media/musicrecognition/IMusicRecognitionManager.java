package android.media.musicrecognition;

public interface IMusicRecognitionManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.musicrecognition.IMusicRecognitionManager";
    public void beginRecognition(android.media.musicrecognition.RecognitionRequest p0, android.os.IBinder p1) throws android.os.RemoteException;

    public static class Default implements android.media.musicrecognition.IMusicRecognitionManager {
        public Default() {}
        public void beginRecognition(android.media.musicrecognition.RecognitionRequest p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.musicrecognition.IMusicRecognitionManager {
        static final int TRANSACTION_beginRecognition = 1;
        public Stub() { super(); }
        public static android.media.musicrecognition.IMusicRecognitionManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.musicrecognition.IMusicRecognitionManager p0) { return false; }
        public static android.media.musicrecognition.IMusicRecognitionManager getDefaultImpl() { return null; }

        private static class Proxy implements android.media.musicrecognition.IMusicRecognitionManager {
            private android.os.IBinder mRemote;
            public static android.media.musicrecognition.IMusicRecognitionManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void beginRecognition(android.media.musicrecognition.RecognitionRequest p0, android.os.IBinder p1) throws android.os.RemoteException {}
        }
    }
}
