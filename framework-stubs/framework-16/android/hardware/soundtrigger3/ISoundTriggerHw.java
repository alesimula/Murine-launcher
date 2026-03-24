package android.hardware.soundtrigger3;

public interface ISoundTriggerHw extends android.os.IInterface {
    public static final int VERSION = 3;
    public static final java.lang.String HASH = "f2ec48a74490bf9d5675f48cb89ecdb3e5cd9c35";
    public static final java.lang.String DESCRIPTOR = null;
    public android.media.soundtrigger.Properties getProperties() throws android.os.RemoteException;
    public void registerGlobalCallback(android.hardware.soundtrigger3.ISoundTriggerHwGlobalCallback p0) throws android.os.RemoteException;
    public int loadSoundModel(android.media.soundtrigger.SoundModel p0, android.hardware.soundtrigger3.ISoundTriggerHwCallback p1) throws android.os.RemoteException;
    public int loadPhraseSoundModel(android.media.soundtrigger.PhraseSoundModel p0, android.hardware.soundtrigger3.ISoundTriggerHwCallback p1) throws android.os.RemoteException;
    public void unloadSoundModel(int p0) throws android.os.RemoteException;
    public void startRecognition(int p0, int p1, int p2, android.media.soundtrigger.RecognitionConfig p3) throws android.os.RemoteException;
    public void stopRecognition(int p0) throws android.os.RemoteException;
    public void forceRecognitionEvent(int p0) throws android.os.RemoteException;
    public android.media.soundtrigger.ModelParameterRange queryParameter(int p0, int p1) throws android.os.RemoteException;
    public int getParameter(int p0, int p1) throws android.os.RemoteException;
    public void setParameter(int p0, int p1, int p2) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.soundtrigger3.ISoundTriggerHw {
        public Default() {}
        public android.media.soundtrigger.Properties getProperties() throws android.os.RemoteException { return null; }
        public void registerGlobalCallback(android.hardware.soundtrigger3.ISoundTriggerHwGlobalCallback p0) throws android.os.RemoteException {}
        public int loadSoundModel(android.media.soundtrigger.SoundModel p0, android.hardware.soundtrigger3.ISoundTriggerHwCallback p1) throws android.os.RemoteException { return 0; }
        public int loadPhraseSoundModel(android.media.soundtrigger.PhraseSoundModel p0, android.hardware.soundtrigger3.ISoundTriggerHwCallback p1) throws android.os.RemoteException { return 0; }
        public void unloadSoundModel(int p0) throws android.os.RemoteException {}
        public void startRecognition(int p0, int p1, int p2, android.media.soundtrigger.RecognitionConfig p3) throws android.os.RemoteException {}
        public void stopRecognition(int p0) throws android.os.RemoteException {}
        public void forceRecognitionEvent(int p0) throws android.os.RemoteException {}
        public android.media.soundtrigger.ModelParameterRange queryParameter(int p0, int p1) throws android.os.RemoteException { return null; }
        public int getParameter(int p0, int p1) throws android.os.RemoteException { return 0; }
        public void setParameter(int p0, int p1, int p2) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.soundtrigger3.ISoundTriggerHw {
        static final int TRANSACTION_getProperties = 1;
        static final int TRANSACTION_registerGlobalCallback = 2;
        static final int TRANSACTION_loadSoundModel = 3;
        static final int TRANSACTION_loadPhraseSoundModel = 4;
        static final int TRANSACTION_unloadSoundModel = 5;
        static final int TRANSACTION_startRecognition = 6;
        static final int TRANSACTION_stopRecognition = 7;
        static final int TRANSACTION_forceRecognitionEvent = 8;
        static final int TRANSACTION_queryParameter = 9;
        static final int TRANSACTION_getParameter = 10;
        static final int TRANSACTION_setParameter = 11;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.soundtrigger3.ISoundTriggerHw asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.soundtrigger3.ISoundTriggerHw {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.media.soundtrigger.Properties getProperties() throws android.os.RemoteException { return null; }
            public void registerGlobalCallback(android.hardware.soundtrigger3.ISoundTriggerHwGlobalCallback p0) throws android.os.RemoteException {}
            public int loadSoundModel(android.media.soundtrigger.SoundModel p0, android.hardware.soundtrigger3.ISoundTriggerHwCallback p1) throws android.os.RemoteException { return 0; }
            public int loadPhraseSoundModel(android.media.soundtrigger.PhraseSoundModel p0, android.hardware.soundtrigger3.ISoundTriggerHwCallback p1) throws android.os.RemoteException { return 0; }
            public void unloadSoundModel(int p0) throws android.os.RemoteException {}
            public void startRecognition(int p0, int p1, int p2, android.media.soundtrigger.RecognitionConfig p3) throws android.os.RemoteException {}
            public void stopRecognition(int p0) throws android.os.RemoteException {}
            public void forceRecognitionEvent(int p0) throws android.os.RemoteException {}
            public android.media.soundtrigger.ModelParameterRange queryParameter(int p0, int p1) throws android.os.RemoteException { return null; }
            public int getParameter(int p0, int p1) throws android.os.RemoteException { return 0; }
            public void setParameter(int p0, int p1, int p2) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
