package android.service.voice;

public interface IMicrophoneHotwordDetectionVoiceInteractionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback";
    public void onDetected(android.service.voice.HotwordDetectedResult p0, android.media.AudioFormat p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException;
    public void onError() throws android.os.RemoteException;
    public void onRejected(android.service.voice.HotwordRejectedResult p0) throws android.os.RemoteException;

    public static class Default implements android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback {
        public Default() {}
        public void onDetected(android.service.voice.HotwordDetectedResult p0, android.media.AudioFormat p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException {}
        public void onError() throws android.os.RemoteException {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback {
        static final int TRANSACTION_onDetected = 1;
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onRejected = 3;
        public Stub() { super(); }
        public static android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDetected(android.service.voice.HotwordDetectedResult p0, android.media.AudioFormat p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException {}
            public void onError() throws android.os.RemoteException {}
            public void onRejected(android.service.voice.HotwordRejectedResult p0) throws android.os.RemoteException {}
        }
    }
}
