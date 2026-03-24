package android.media.musicrecognition;

public interface IMusicRecognitionAttributionTagCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.musicrecognition.IMusicRecognitionAttributionTagCallback";
    public void onAttributionTag(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.media.musicrecognition.IMusicRecognitionAttributionTagCallback {
        public Default() {}
        public void onAttributionTag(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.musicrecognition.IMusicRecognitionAttributionTagCallback {
        static final int TRANSACTION_onAttributionTag = 1;
        public Stub() { super(); }
        public static android.media.musicrecognition.IMusicRecognitionAttributionTagCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.musicrecognition.IMusicRecognitionAttributionTagCallback p0) { return false; }
        public static android.media.musicrecognition.IMusicRecognitionAttributionTagCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.media.musicrecognition.IMusicRecognitionAttributionTagCallback {
            private android.os.IBinder mRemote;
            public static android.media.musicrecognition.IMusicRecognitionAttributionTagCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAttributionTag(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
