package com.android.internal.app;

public interface IHotwordRecognitionStatusCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.app.IHotwordRecognitionStatusCallback";
    public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.service.voice.HotwordDetectedResult p1) throws android.os.RemoteException;
    public void onKeyphraseDetectedFromExternalSource(android.service.voice.HotwordDetectedResult p0) throws android.os.RemoteException;
    public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) throws android.os.RemoteException;
    public void onRejected(android.service.voice.HotwordRejectedResult p0) throws android.os.RemoteException;
    public void onHotwordDetectionServiceFailure(android.service.voice.HotwordDetectionServiceFailure p0) throws android.os.RemoteException;
    public void onVisualQueryDetectionServiceFailure(android.service.voice.VisualQueryDetectionServiceFailure p0) throws android.os.RemoteException;
    public void onSoundTriggerFailure(android.service.voice.SoundTriggerFailure p0) throws android.os.RemoteException;
    public void onUnknownFailure(java.lang.String p0) throws android.os.RemoteException;
    public void onRecognitionPaused() throws android.os.RemoteException;
    public void onRecognitionResumed() throws android.os.RemoteException;
    public void onStatusReported(int p0) throws android.os.RemoteException;
    public void onProcessRestarted() throws android.os.RemoteException;
    public void onOpenFile(java.lang.String p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IHotwordRecognitionStatusCallback {
        public Default() {}
        public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.service.voice.HotwordDetectedResult p1) throws android.os.RemoteException {}
        public void onKeyphraseDetectedFromExternalSource(android.service.voice.HotwordDetectedResult p0) throws android.os.RemoteException {}
        public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) throws android.os.RemoteException {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) throws android.os.RemoteException {}
        public void onHotwordDetectionServiceFailure(android.service.voice.HotwordDetectionServiceFailure p0) throws android.os.RemoteException {}
        public void onVisualQueryDetectionServiceFailure(android.service.voice.VisualQueryDetectionServiceFailure p0) throws android.os.RemoteException {}
        public void onSoundTriggerFailure(android.service.voice.SoundTriggerFailure p0) throws android.os.RemoteException {}
        public void onUnknownFailure(java.lang.String p0) throws android.os.RemoteException {}
        public void onRecognitionPaused() throws android.os.RemoteException {}
        public void onRecognitionResumed() throws android.os.RemoteException {}
        public void onStatusReported(int p0) throws android.os.RemoteException {}
        public void onProcessRestarted() throws android.os.RemoteException {}
        public void onOpenFile(java.lang.String p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IHotwordRecognitionStatusCallback {
        static final int TRANSACTION_onKeyphraseDetected = 1;
        static final int TRANSACTION_onKeyphraseDetectedFromExternalSource = 2;
        static final int TRANSACTION_onGenericSoundTriggerDetected = 3;
        static final int TRANSACTION_onRejected = 4;
        static final int TRANSACTION_onHotwordDetectionServiceFailure = 5;
        static final int TRANSACTION_onVisualQueryDetectionServiceFailure = 6;
        static final int TRANSACTION_onSoundTriggerFailure = 7;
        static final int TRANSACTION_onUnknownFailure = 8;
        static final int TRANSACTION_onRecognitionPaused = 9;
        static final int TRANSACTION_onRecognitionResumed = 10;
        static final int TRANSACTION_onStatusReported = 11;
        static final int TRANSACTION_onProcessRestarted = 12;
        static final int TRANSACTION_onOpenFile = 13;
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
            public void onKeyphraseDetectedFromExternalSource(android.service.voice.HotwordDetectedResult p0) throws android.os.RemoteException {}
            public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) throws android.os.RemoteException {}
            public void onRejected(android.service.voice.HotwordRejectedResult p0) throws android.os.RemoteException {}
            public void onHotwordDetectionServiceFailure(android.service.voice.HotwordDetectionServiceFailure p0) throws android.os.RemoteException {}
            public void onVisualQueryDetectionServiceFailure(android.service.voice.VisualQueryDetectionServiceFailure p0) throws android.os.RemoteException {}
            public void onSoundTriggerFailure(android.service.voice.SoundTriggerFailure p0) throws android.os.RemoteException {}
            public void onUnknownFailure(java.lang.String p0) throws android.os.RemoteException {}
            public void onRecognitionPaused() throws android.os.RemoteException {}
            public void onRecognitionResumed() throws android.os.RemoteException {}
            public void onStatusReported(int p0) throws android.os.RemoteException {}
            public void onProcessRestarted() throws android.os.RemoteException {}
            public void onOpenFile(java.lang.String p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
        }
    }
}
