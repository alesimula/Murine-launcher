package android.media.soundtrigger_middleware;

public interface ISoundTriggerInjection extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.soundtrigger_middleware.ISoundTriggerInjection";
    public static final java.lang.String FAKE_HAL_ARCH = "injection";
    public void registerGlobalEventInjection(android.media.soundtrigger_middleware.IInjectGlobalEvent p0) throws android.os.RemoteException;
    public void onRestarted(android.media.soundtrigger_middleware.IInjectGlobalEvent p0) throws android.os.RemoteException;
    public void onFrameworkDetached(android.media.soundtrigger_middleware.IInjectGlobalEvent p0) throws android.os.RemoteException;
    public void onClientAttached(android.os.IBinder p0, android.media.soundtrigger_middleware.IInjectGlobalEvent p1) throws android.os.RemoteException;
    public void onClientDetached(android.os.IBinder p0) throws android.os.RemoteException;
    public void onSoundModelLoaded(android.media.soundtrigger.SoundModel p0, android.media.soundtrigger.Phrase[] p1, android.media.soundtrigger_middleware.IInjectModelEvent p2, android.media.soundtrigger_middleware.IInjectGlobalEvent p3) throws android.os.RemoteException;
    public void onParamSet(int p0, int p1, android.media.soundtrigger_middleware.IInjectModelEvent p2) throws android.os.RemoteException;
    public void onRecognitionStarted(int p0, android.media.soundtrigger.RecognitionConfig p1, android.media.soundtrigger_middleware.IInjectRecognitionEvent p2, android.media.soundtrigger_middleware.IInjectModelEvent p3) throws android.os.RemoteException;
    public void onRecognitionStopped(android.media.soundtrigger_middleware.IInjectRecognitionEvent p0) throws android.os.RemoteException;
    public void onSoundModelUnloaded(android.media.soundtrigger_middleware.IInjectModelEvent p0) throws android.os.RemoteException;
    public void onPreempted() throws android.os.RemoteException;

    public static class Default implements android.media.soundtrigger_middleware.ISoundTriggerInjection {
        public Default() {}
        public void registerGlobalEventInjection(android.media.soundtrigger_middleware.IInjectGlobalEvent p0) throws android.os.RemoteException {}
        public void onRestarted(android.media.soundtrigger_middleware.IInjectGlobalEvent p0) throws android.os.RemoteException {}
        public void onFrameworkDetached(android.media.soundtrigger_middleware.IInjectGlobalEvent p0) throws android.os.RemoteException {}
        public void onClientAttached(android.os.IBinder p0, android.media.soundtrigger_middleware.IInjectGlobalEvent p1) throws android.os.RemoteException {}
        public void onClientDetached(android.os.IBinder p0) throws android.os.RemoteException {}
        public void onSoundModelLoaded(android.media.soundtrigger.SoundModel p0, android.media.soundtrigger.Phrase[] p1, android.media.soundtrigger_middleware.IInjectModelEvent p2, android.media.soundtrigger_middleware.IInjectGlobalEvent p3) throws android.os.RemoteException {}
        public void onParamSet(int p0, int p1, android.media.soundtrigger_middleware.IInjectModelEvent p2) throws android.os.RemoteException {}
        public void onRecognitionStarted(int p0, android.media.soundtrigger.RecognitionConfig p1, android.media.soundtrigger_middleware.IInjectRecognitionEvent p2, android.media.soundtrigger_middleware.IInjectModelEvent p3) throws android.os.RemoteException {}
        public void onRecognitionStopped(android.media.soundtrigger_middleware.IInjectRecognitionEvent p0) throws android.os.RemoteException {}
        public void onSoundModelUnloaded(android.media.soundtrigger_middleware.IInjectModelEvent p0) throws android.os.RemoteException {}
        public void onPreempted() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.soundtrigger_middleware.ISoundTriggerInjection {
        static final int TRANSACTION_registerGlobalEventInjection = 1;
        static final int TRANSACTION_onRestarted = 2;
        static final int TRANSACTION_onFrameworkDetached = 3;
        static final int TRANSACTION_onClientAttached = 4;
        static final int TRANSACTION_onClientDetached = 5;
        static final int TRANSACTION_onSoundModelLoaded = 6;
        static final int TRANSACTION_onParamSet = 7;
        static final int TRANSACTION_onRecognitionStarted = 8;
        static final int TRANSACTION_onRecognitionStopped = 9;
        static final int TRANSACTION_onSoundModelUnloaded = 10;
        static final int TRANSACTION_onPreempted = 11;
        public Stub() { super(); }
        public static android.media.soundtrigger_middleware.ISoundTriggerInjection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.soundtrigger_middleware.ISoundTriggerInjection {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerGlobalEventInjection(android.media.soundtrigger_middleware.IInjectGlobalEvent p0) throws android.os.RemoteException {}
            public void onRestarted(android.media.soundtrigger_middleware.IInjectGlobalEvent p0) throws android.os.RemoteException {}
            public void onFrameworkDetached(android.media.soundtrigger_middleware.IInjectGlobalEvent p0) throws android.os.RemoteException {}
            public void onClientAttached(android.os.IBinder p0, android.media.soundtrigger_middleware.IInjectGlobalEvent p1) throws android.os.RemoteException {}
            public void onClientDetached(android.os.IBinder p0) throws android.os.RemoteException {}
            public void onSoundModelLoaded(android.media.soundtrigger.SoundModel p0, android.media.soundtrigger.Phrase[] p1, android.media.soundtrigger_middleware.IInjectModelEvent p2, android.media.soundtrigger_middleware.IInjectGlobalEvent p3) throws android.os.RemoteException {}
            public void onParamSet(int p0, int p1, android.media.soundtrigger_middleware.IInjectModelEvent p2) throws android.os.RemoteException {}
            public void onRecognitionStarted(int p0, android.media.soundtrigger.RecognitionConfig p1, android.media.soundtrigger_middleware.IInjectRecognitionEvent p2, android.media.soundtrigger_middleware.IInjectModelEvent p3) throws android.os.RemoteException {}
            public void onRecognitionStopped(android.media.soundtrigger_middleware.IInjectRecognitionEvent p0) throws android.os.RemoteException {}
            public void onSoundModelUnloaded(android.media.soundtrigger_middleware.IInjectModelEvent p0) throws android.os.RemoteException {}
            public void onPreempted() throws android.os.RemoteException {}
        }
    }
}
