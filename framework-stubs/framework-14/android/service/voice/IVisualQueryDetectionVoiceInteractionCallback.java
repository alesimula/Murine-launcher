package android.service.voice;

public interface IVisualQueryDetectionVoiceInteractionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.voice.IVisualQueryDetectionVoiceInteractionCallback";
    public void onQueryDetected(java.lang.String p0) throws android.os.RemoteException;
    public void onQueryFinished() throws android.os.RemoteException;
    public void onQueryRejected() throws android.os.RemoteException;
    public void onVisualQueryDetectionServiceFailure(android.service.voice.VisualQueryDetectionServiceFailure p0) throws android.os.RemoteException;

    public static class Default implements android.service.voice.IVisualQueryDetectionVoiceInteractionCallback {
        public Default() {}
        public void onQueryDetected(java.lang.String p0) throws android.os.RemoteException {}
        public void onQueryFinished() throws android.os.RemoteException {}
        public void onQueryRejected() throws android.os.RemoteException {}
        public void onVisualQueryDetectionServiceFailure(android.service.voice.VisualQueryDetectionServiceFailure p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.voice.IVisualQueryDetectionVoiceInteractionCallback {
        static final int TRANSACTION_onQueryDetected = 1;
        static final int TRANSACTION_onQueryFinished = 2;
        static final int TRANSACTION_onQueryRejected = 3;
        static final int TRANSACTION_onVisualQueryDetectionServiceFailure = 4;
        public Stub() { super(); }
        public static android.service.voice.IVisualQueryDetectionVoiceInteractionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.voice.IVisualQueryDetectionVoiceInteractionCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onQueryDetected(java.lang.String p0) throws android.os.RemoteException {}
            public void onQueryFinished() throws android.os.RemoteException {}
            public void onQueryRejected() throws android.os.RemoteException {}
            public void onVisualQueryDetectionServiceFailure(android.service.voice.VisualQueryDetectionServiceFailure p0) throws android.os.RemoteException {}
        }
    }
}
