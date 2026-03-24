package android.service.voice;

public interface IDetectorSessionVisualQueryDetectionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.voice.IDetectorSessionVisualQueryDetectionCallback";
    public void onAttentionGained() throws android.os.RemoteException;
    public void onAttentionLost() throws android.os.RemoteException;
    public void onQueryDetected(java.lang.String p0) throws android.os.RemoteException;
    public void onQueryFinished() throws android.os.RemoteException;
    public void onQueryRejected() throws android.os.RemoteException;

    public static class Default implements android.service.voice.IDetectorSessionVisualQueryDetectionCallback {
        public Default() {}
        public void onAttentionGained() throws android.os.RemoteException {}
        public void onAttentionLost() throws android.os.RemoteException {}
        public void onQueryDetected(java.lang.String p0) throws android.os.RemoteException {}
        public void onQueryFinished() throws android.os.RemoteException {}
        public void onQueryRejected() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.voice.IDetectorSessionVisualQueryDetectionCallback {
        static final int TRANSACTION_onAttentionGained = 1;
        static final int TRANSACTION_onAttentionLost = 2;
        static final int TRANSACTION_onQueryDetected = 3;
        static final int TRANSACTION_onQueryFinished = 4;
        static final int TRANSACTION_onQueryRejected = 5;
        public Stub() { super(); }
        public static android.service.voice.IDetectorSessionVisualQueryDetectionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.voice.IDetectorSessionVisualQueryDetectionCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAttentionGained() throws android.os.RemoteException {}
            public void onAttentionLost() throws android.os.RemoteException {}
            public void onQueryDetected(java.lang.String p0) throws android.os.RemoteException {}
            public void onQueryFinished() throws android.os.RemoteException {}
            public void onQueryRejected() throws android.os.RemoteException {}
        }
    }
}
