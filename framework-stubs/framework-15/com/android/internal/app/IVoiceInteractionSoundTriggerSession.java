package com.android.internal.app;

public interface IVoiceInteractionSoundTriggerSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.app.IVoiceInteractionSoundTriggerSession";
    public android.hardware.soundtrigger.SoundTrigger.ModuleProperties getDspModuleProperties() throws android.os.RemoteException;
    public int startRecognition(int p0, java.lang.String p1, com.android.internal.app.IHotwordRecognitionStatusCallback p2, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p3, boolean p4) throws android.os.RemoteException;
    public int stopRecognition(int p0, com.android.internal.app.IHotwordRecognitionStatusCallback p1) throws android.os.RemoteException;
    public int setParameter(int p0, int p1, int p2) throws android.os.RemoteException;
    public int getParameter(int p0, int p1) throws android.os.RemoteException;
    public android.hardware.soundtrigger.SoundTrigger.ModelParamRange queryParameter(int p0, int p1) throws android.os.RemoteException;
    public void detach() throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IVoiceInteractionSoundTriggerSession {
        public Default() {}
        public android.hardware.soundtrigger.SoundTrigger.ModuleProperties getDspModuleProperties() throws android.os.RemoteException { return null; }
        public int startRecognition(int p0, java.lang.String p1, com.android.internal.app.IHotwordRecognitionStatusCallback p2, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p3, boolean p4) throws android.os.RemoteException { return 0; }
        public int stopRecognition(int p0, com.android.internal.app.IHotwordRecognitionStatusCallback p1) throws android.os.RemoteException { return 0; }
        public int setParameter(int p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public int getParameter(int p0, int p1) throws android.os.RemoteException { return 0; }
        public android.hardware.soundtrigger.SoundTrigger.ModelParamRange queryParameter(int p0, int p1) throws android.os.RemoteException { return null; }
        public void detach() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IVoiceInteractionSoundTriggerSession {
        static final int TRANSACTION_getDspModuleProperties = 1;
        static final int TRANSACTION_startRecognition = 2;
        static final int TRANSACTION_stopRecognition = 3;
        static final int TRANSACTION_setParameter = 4;
        static final int TRANSACTION_getParameter = 5;
        static final int TRANSACTION_queryParameter = 6;
        static final int TRANSACTION_detach = 7;
        public Stub() { super(); }
        public static com.android.internal.app.IVoiceInteractionSoundTriggerSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.app.IVoiceInteractionSoundTriggerSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.soundtrigger.SoundTrigger.ModuleProperties getDspModuleProperties() throws android.os.RemoteException { return null; }
            public int startRecognition(int p0, java.lang.String p1, com.android.internal.app.IHotwordRecognitionStatusCallback p2, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p3, boolean p4) throws android.os.RemoteException { return 0; }
            public int stopRecognition(int p0, com.android.internal.app.IHotwordRecognitionStatusCallback p1) throws android.os.RemoteException { return 0; }
            public int setParameter(int p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public int getParameter(int p0, int p1) throws android.os.RemoteException { return 0; }
            public android.hardware.soundtrigger.SoundTrigger.ModelParamRange queryParameter(int p0, int p1) throws android.os.RemoteException { return null; }
            public void detach() throws android.os.RemoteException {}
        }
    }
}
