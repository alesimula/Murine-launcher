package android.service.voice;

public interface IHotwordDetectionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.voice.IHotwordDetectionService";
    public void detectFromDspSource(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.media.AudioFormat p1, long p2, android.service.voice.IDspHotwordDetectionCallback p3) throws android.os.RemoteException;
    public void detectFromMicrophoneSource(android.os.ParcelFileDescriptor p0, int p1, android.media.AudioFormat p2, android.os.PersistableBundle p3, android.service.voice.IDspHotwordDetectionCallback p4) throws android.os.RemoteException;
    public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.IRemoteCallback p2) throws android.os.RemoteException;
    public void updateAudioFlinger(android.os.IBinder p0) throws android.os.RemoteException;
    public void updateContentCaptureManager(android.view.contentcapture.IContentCaptureManager p0, android.content.ContentCaptureOptions p1) throws android.os.RemoteException;
    public void ping(android.os.IRemoteCallback p0) throws android.os.RemoteException;
    public void stopDetection() throws android.os.RemoteException;

    public static class Default implements android.service.voice.IHotwordDetectionService {
        public Default() {}
        public void detectFromDspSource(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.media.AudioFormat p1, long p2, android.service.voice.IDspHotwordDetectionCallback p3) throws android.os.RemoteException {}
        public void detectFromMicrophoneSource(android.os.ParcelFileDescriptor p0, int p1, android.media.AudioFormat p2, android.os.PersistableBundle p3, android.service.voice.IDspHotwordDetectionCallback p4) throws android.os.RemoteException {}
        public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.IRemoteCallback p2) throws android.os.RemoteException {}
        public void updateAudioFlinger(android.os.IBinder p0) throws android.os.RemoteException {}
        public void updateContentCaptureManager(android.view.contentcapture.IContentCaptureManager p0, android.content.ContentCaptureOptions p1) throws android.os.RemoteException {}
        public void ping(android.os.IRemoteCallback p0) throws android.os.RemoteException {}
        public void stopDetection() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.voice.IHotwordDetectionService {
        static final int TRANSACTION_detectFromDspSource = 1;
        static final int TRANSACTION_detectFromMicrophoneSource = 2;
        static final int TRANSACTION_updateState = 3;
        static final int TRANSACTION_updateAudioFlinger = 4;
        static final int TRANSACTION_updateContentCaptureManager = 5;
        static final int TRANSACTION_ping = 6;
        static final int TRANSACTION_stopDetection = 7;
        public Stub() { super(); }
        public static android.service.voice.IHotwordDetectionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.voice.IHotwordDetectionService p0) { return false; }
        public static android.service.voice.IHotwordDetectionService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.voice.IHotwordDetectionService {
            private android.os.IBinder mRemote;
            public static android.service.voice.IHotwordDetectionService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void detectFromDspSource(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.media.AudioFormat p1, long p2, android.service.voice.IDspHotwordDetectionCallback p3) throws android.os.RemoteException {}
            public void detectFromMicrophoneSource(android.os.ParcelFileDescriptor p0, int p1, android.media.AudioFormat p2, android.os.PersistableBundle p3, android.service.voice.IDspHotwordDetectionCallback p4) throws android.os.RemoteException {}
            public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.IRemoteCallback p2) throws android.os.RemoteException {}
            public void updateAudioFlinger(android.os.IBinder p0) throws android.os.RemoteException {}
            public void updateContentCaptureManager(android.view.contentcapture.IContentCaptureManager p0, android.content.ContentCaptureOptions p1) throws android.os.RemoteException {}
            public void ping(android.os.IRemoteCallback p0) throws android.os.RemoteException {}
            public void stopDetection() throws android.os.RemoteException {}
        }
    }
}
