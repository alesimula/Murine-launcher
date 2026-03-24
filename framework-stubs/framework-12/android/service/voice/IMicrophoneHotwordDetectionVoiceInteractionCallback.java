package android.service.voice;

public interface IMicrophoneHotwordDetectionVoiceInteractionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback";
    public void onDetected(android.service.voice.HotwordDetectedResult p0, android.media.AudioFormat p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException;

    public static class Default implements android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback {
        public Default() {}
        public void onDetected(android.service.voice.HotwordDetectedResult p0, android.media.AudioFormat p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback {
        static final int TRANSACTION_onDetected = 1;
        public Stub() { super(); }
        public static android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback p0) { return false; }
        public static android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback {
            private android.os.IBinder mRemote;
            public static android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDetected(android.service.voice.HotwordDetectedResult p0, android.media.AudioFormat p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException {}
        }
    }
}
