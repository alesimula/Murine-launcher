package com.android.internal.app;

public interface IHotwordRecognitionStatusCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.app.IHotwordRecognitionStatusCallback";
    public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.service.voice.HotwordDetectedResult p1) throws android.os.RemoteException;
    public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) throws android.os.RemoteException;
    public void onRejected(android.service.voice.HotwordRejectedResult p0) throws android.os.RemoteException;
    public void onError(int p0) throws android.os.RemoteException;
    public void onRecognitionPaused() throws android.os.RemoteException;
    public void onRecognitionResumed() throws android.os.RemoteException;
    public void onStatusReported(int p0) throws android.os.RemoteException;
    public void onProcessRestarted() throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IHotwordRecognitionStatusCallback {
        public Default() {}
        public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.service.voice.HotwordDetectedResult p1) throws android.os.RemoteException {}
        public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) throws android.os.RemoteException {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
        public void onRecognitionPaused() throws android.os.RemoteException {}
        public void onRecognitionResumed() throws android.os.RemoteException {}
        public void onStatusReported(int p0) throws android.os.RemoteException {}
        public void onProcessRestarted() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IHotwordRecognitionStatusCallback {
        static final int TRANSACTION_onKeyphraseDetected = 1;
        static final int TRANSACTION_onGenericSoundTriggerDetected = 2;
        static final int TRANSACTION_onRejected = 3;
        static final int TRANSACTION_onError = 4;
        static final int TRANSACTION_onRecognitionPaused = 5;
        static final int TRANSACTION_onRecognitionResumed = 6;
        static final int TRANSACTION_onStatusReported = 7;
        static final int TRANSACTION_onProcessRestarted = 8;
        public Stub() { super(); }
        public static com.android.internal.app.IHotwordRecognitionStatusCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.app.IHotwordRecognitionStatusCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.service.voice.HotwordDetectedResult p1) throws android.os.RemoteException {}
            public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) throws android.os.RemoteException {}
            public void onRejected(android.service.voice.HotwordRejectedResult p0) throws android.os.RemoteException {}
            public void onError(int p0) throws android.os.RemoteException {}
            public void onRecognitionPaused() throws android.os.RemoteException {}
            public void onRecognitionResumed() throws android.os.RemoteException {}
            public void onStatusReported(int p0) throws android.os.RemoteException {}
            public void onProcessRestarted() throws android.os.RemoteException {}
        }
    }
}
