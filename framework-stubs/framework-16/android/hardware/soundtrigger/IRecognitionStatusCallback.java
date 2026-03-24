package android.hardware.soundtrigger;

public interface IRecognitionStatusCallback extends android.os.IInterface {
    public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0) throws android.os.RemoteException;
    public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) throws android.os.RemoteException;
    public void onRecognitionPaused() throws android.os.RemoteException;
    public void onRecognitionResumed() throws android.os.RemoteException;
    public void onPreempted() throws android.os.RemoteException;
    public void onModuleDied() throws android.os.RemoteException;
    public void onResumeFailed(int p0) throws android.os.RemoteException;
    public void onPauseFailed(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.soundtrigger.IRecognitionStatusCallback {
        public Default() {}
        public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0) throws android.os.RemoteException {}
        public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) throws android.os.RemoteException {}
        public void onRecognitionPaused() throws android.os.RemoteException {}
        public void onRecognitionResumed() throws android.os.RemoteException {}
        public void onPreempted() throws android.os.RemoteException {}
        public void onModuleDied() throws android.os.RemoteException {}
        public void onResumeFailed(int p0) throws android.os.RemoteException {}
        public void onPauseFailed(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.soundtrigger.IRecognitionStatusCallback {
        public static final java.lang.String DESCRIPTOR = "android.hardware.soundtrigger.IRecognitionStatusCallback";
        static final int TRANSACTION_onKeyphraseDetected = 1;
        static final int TRANSACTION_onGenericSoundTriggerDetected = 2;
        static final int TRANSACTION_onRecognitionPaused = 3;
        static final int TRANSACTION_onRecognitionResumed = 4;
        static final int TRANSACTION_onPreempted = 5;
        static final int TRANSACTION_onModuleDied = 6;
        static final int TRANSACTION_onResumeFailed = 7;
        static final int TRANSACTION_onPauseFailed = 8;
        public Stub() { super(); }
        public static android.hardware.soundtrigger.IRecognitionStatusCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.soundtrigger.IRecognitionStatusCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0) throws android.os.RemoteException {}
            public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) throws android.os.RemoteException {}
            public void onRecognitionPaused() throws android.os.RemoteException {}
            public void onRecognitionResumed() throws android.os.RemoteException {}
            public void onPreempted() throws android.os.RemoteException {}
            public void onModuleDied() throws android.os.RemoteException {}
            public void onResumeFailed(int p0) throws android.os.RemoteException {}
            public void onPauseFailed(int p0) throws android.os.RemoteException {}
        }
    }
}
