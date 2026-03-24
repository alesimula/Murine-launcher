package android.media.soundtrigger_middleware;

public interface ISoundTriggerModule extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.soundtrigger_middleware.ISoundTriggerModule";
    public int loadModel(android.media.soundtrigger.SoundModel p0) throws android.os.RemoteException;
    public int loadPhraseModel(android.media.soundtrigger.PhraseSoundModel p0) throws android.os.RemoteException;
    public void unloadModel(int p0) throws android.os.RemoteException;
    public android.os.IBinder startRecognition(int p0, android.media.soundtrigger.RecognitionConfig p1) throws android.os.RemoteException;
    public void stopRecognition(int p0) throws android.os.RemoteException;
    public void forceRecognitionEvent(int p0) throws android.os.RemoteException;
    public void setModelParameter(int p0, int p1, int p2) throws android.os.RemoteException;
    public int getModelParameter(int p0, int p1) throws android.os.RemoteException;
    public android.media.soundtrigger.ModelParameterRange queryModelParameterSupport(int p0, int p1) throws android.os.RemoteException;
    public void detach() throws android.os.RemoteException;

    public static class Default implements android.media.soundtrigger_middleware.ISoundTriggerModule {
        public Default() {}
        public int loadModel(android.media.soundtrigger.SoundModel p0) throws android.os.RemoteException { return 0; }
        public int loadPhraseModel(android.media.soundtrigger.PhraseSoundModel p0) throws android.os.RemoteException { return 0; }
        public void unloadModel(int p0) throws android.os.RemoteException {}
        public android.os.IBinder startRecognition(int p0, android.media.soundtrigger.RecognitionConfig p1) throws android.os.RemoteException { return null; }
        public void stopRecognition(int p0) throws android.os.RemoteException {}
        public void forceRecognitionEvent(int p0) throws android.os.RemoteException {}
        public void setModelParameter(int p0, int p1, int p2) throws android.os.RemoteException {}
        public int getModelParameter(int p0, int p1) throws android.os.RemoteException { return 0; }
        public android.media.soundtrigger.ModelParameterRange queryModelParameterSupport(int p0, int p1) throws android.os.RemoteException { return null; }
        public void detach() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.soundtrigger_middleware.ISoundTriggerModule {
        static final int TRANSACTION_loadModel = 1;
        static final int TRANSACTION_loadPhraseModel = 2;
        static final int TRANSACTION_unloadModel = 3;
        static final int TRANSACTION_startRecognition = 4;
        static final int TRANSACTION_stopRecognition = 5;
        static final int TRANSACTION_forceRecognitionEvent = 6;
        static final int TRANSACTION_setModelParameter = 7;
        static final int TRANSACTION_getModelParameter = 8;
        static final int TRANSACTION_queryModelParameterSupport = 9;
        static final int TRANSACTION_detach = 10;
        public Stub() { super(); }
        public static android.media.soundtrigger_middleware.ISoundTriggerModule asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.soundtrigger_middleware.ISoundTriggerModule {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int loadModel(android.media.soundtrigger.SoundModel p0) throws android.os.RemoteException { return 0; }
            public int loadPhraseModel(android.media.soundtrigger.PhraseSoundModel p0) throws android.os.RemoteException { return 0; }
            public void unloadModel(int p0) throws android.os.RemoteException {}
            public android.os.IBinder startRecognition(int p0, android.media.soundtrigger.RecognitionConfig p1) throws android.os.RemoteException { return null; }
            public void stopRecognition(int p0) throws android.os.RemoteException {}
            public void forceRecognitionEvent(int p0) throws android.os.RemoteException {}
            public void setModelParameter(int p0, int p1, int p2) throws android.os.RemoteException {}
            public int getModelParameter(int p0, int p1) throws android.os.RemoteException { return 0; }
            public android.media.soundtrigger.ModelParameterRange queryModelParameterSupport(int p0, int p1) throws android.os.RemoteException { return null; }
            public void detach() throws android.os.RemoteException {}
        }
    }
}
