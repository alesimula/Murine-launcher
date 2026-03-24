package android.service.voice;

public interface ISandboxedDetectionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.voice.ISandboxedDetectionService";
    public void detectFromDspSource(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.media.AudioFormat p1, long p2, android.service.voice.IDspHotwordDetectionCallback p3) throws android.os.RemoteException;
    public void detectFromMicrophoneSource(android.os.ParcelFileDescriptor p0, int p1, android.media.AudioFormat p2, android.os.PersistableBundle p3, android.service.voice.IDspHotwordDetectionCallback p4) throws android.os.RemoteException;
    public void detectWithVisualSignals(android.service.voice.IDetectorSessionVisualQueryDetectionCallback p0) throws android.os.RemoteException;
    public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.IRemoteCallback p2) throws android.os.RemoteException;
    public void updateAudioFlinger(android.os.IBinder p0) throws android.os.RemoteException;
    public void updateContentCaptureManager(android.view.contentcapture.IContentCaptureManager p0, android.content.ContentCaptureOptions p1) throws android.os.RemoteException;
    public void updateRecognitionServiceManager(android.speech.IRecognitionServiceManager p0) throws android.os.RemoteException;
    public void ping(android.service.voice.ISandboxedDetectionService.IPingMe p0) throws android.os.RemoteException;
    public void stopDetection() throws android.os.RemoteException;
    public void registerRemoteStorageService(android.service.voice.IDetectorSessionStorageService p0) throws android.os.RemoteException;

    public static class Default implements android.service.voice.ISandboxedDetectionService {
        public Default() {}
        public void detectFromDspSource(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.media.AudioFormat p1, long p2, android.service.voice.IDspHotwordDetectionCallback p3) throws android.os.RemoteException {}
        public void detectFromMicrophoneSource(android.os.ParcelFileDescriptor p0, int p1, android.media.AudioFormat p2, android.os.PersistableBundle p3, android.service.voice.IDspHotwordDetectionCallback p4) throws android.os.RemoteException {}
        public void detectWithVisualSignals(android.service.voice.IDetectorSessionVisualQueryDetectionCallback p0) throws android.os.RemoteException {}
        public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.IRemoteCallback p2) throws android.os.RemoteException {}
        public void updateAudioFlinger(android.os.IBinder p0) throws android.os.RemoteException {}
        public void updateContentCaptureManager(android.view.contentcapture.IContentCaptureManager p0, android.content.ContentCaptureOptions p1) throws android.os.RemoteException {}
        public void updateRecognitionServiceManager(android.speech.IRecognitionServiceManager p0) throws android.os.RemoteException {}
        public void ping(android.service.voice.ISandboxedDetectionService.IPingMe p0) throws android.os.RemoteException {}
        public void stopDetection() throws android.os.RemoteException {}
        public void registerRemoteStorageService(android.service.voice.IDetectorSessionStorageService p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static interface IPingMe extends android.os.IInterface {
        public static final java.lang.String DESCRIPTOR = "android.service.voice.ISandboxedDetectionService.IPingMe";
        public void onPing() throws android.os.RemoteException;

        public static class Default implements android.service.voice.ISandboxedDetectionService.IPingMe {
            public Default() {}
            public void onPing() throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
        }

        public static abstract class Stub extends android.os.Binder implements android.service.voice.ISandboxedDetectionService.IPingMe {
            static final int TRANSACTION_onPing = 1;
            public Stub() { super(); }
            public static android.service.voice.ISandboxedDetectionService.IPingMe asInterface(android.os.IBinder p0) { return null; }
            public android.os.IBinder asBinder() { return null; }
            public static java.lang.String getDefaultTransactionName(int p0) { return null; }
            public java.lang.String getTransactionName(int p0) { return null; }
            public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
            public int getMaxTransactionId() { return 0; }

            private static class Proxy implements android.service.voice.ISandboxedDetectionService.IPingMe {
                Proxy(android.os.IBinder p0) {}
                public android.os.IBinder asBinder() { return null; }
                public java.lang.String getInterfaceDescriptor() { return null; }
                public void onPing() throws android.os.RemoteException {}
            }
        }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.voice.ISandboxedDetectionService {
        static final int TRANSACTION_detectFromDspSource = 1;
        static final int TRANSACTION_detectFromMicrophoneSource = 2;
        static final int TRANSACTION_detectWithVisualSignals = 3;
        static final int TRANSACTION_updateState = 4;
        static final int TRANSACTION_updateAudioFlinger = 5;
        static final int TRANSACTION_updateContentCaptureManager = 6;
        static final int TRANSACTION_updateRecognitionServiceManager = 7;
        static final int TRANSACTION_ping = 8;
        static final int TRANSACTION_stopDetection = 9;
        static final int TRANSACTION_registerRemoteStorageService = 10;
        public Stub() { super(); }
        public static android.service.voice.ISandboxedDetectionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.voice.ISandboxedDetectionService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void detectFromDspSource(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.media.AudioFormat p1, long p2, android.service.voice.IDspHotwordDetectionCallback p3) throws android.os.RemoteException {}
            public void detectFromMicrophoneSource(android.os.ParcelFileDescriptor p0, int p1, android.media.AudioFormat p2, android.os.PersistableBundle p3, android.service.voice.IDspHotwordDetectionCallback p4) throws android.os.RemoteException {}
            public void detectWithVisualSignals(android.service.voice.IDetectorSessionVisualQueryDetectionCallback p0) throws android.os.RemoteException {}
            public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.IRemoteCallback p2) throws android.os.RemoteException {}
            public void updateAudioFlinger(android.os.IBinder p0) throws android.os.RemoteException {}
            public void updateContentCaptureManager(android.view.contentcapture.IContentCaptureManager p0, android.content.ContentCaptureOptions p1) throws android.os.RemoteException {}
            public void updateRecognitionServiceManager(android.speech.IRecognitionServiceManager p0) throws android.os.RemoteException {}
            public void ping(android.service.voice.ISandboxedDetectionService.IPingMe p0) throws android.os.RemoteException {}
            public void stopDetection() throws android.os.RemoteException {}
            public void registerRemoteStorageService(android.service.voice.IDetectorSessionStorageService p0) throws android.os.RemoteException {}
        }
    }
}
