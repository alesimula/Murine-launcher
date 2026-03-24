package com.android.internal.app;

public interface ISoundTriggerSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.app.ISoundTriggerSession";
    public android.hardware.soundtrigger.SoundTrigger.GenericSoundModel getSoundModel(android.os.ParcelUuid p0) throws android.os.RemoteException;
    public void updateSoundModel(android.hardware.soundtrigger.SoundTrigger.GenericSoundModel p0) throws android.os.RemoteException;
    public void deleteSoundModel(android.os.ParcelUuid p0) throws android.os.RemoteException;
    public int startRecognition(android.os.ParcelUuid p0, android.hardware.soundtrigger.IRecognitionStatusCallback p1, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p2, boolean p3) throws android.os.RemoteException;
    public int stopRecognition(android.os.ParcelUuid p0, android.hardware.soundtrigger.IRecognitionStatusCallback p1) throws android.os.RemoteException;
    public int loadGenericSoundModel(android.hardware.soundtrigger.SoundTrigger.GenericSoundModel p0) throws android.os.RemoteException;
    public int loadKeyphraseSoundModel(android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel p0) throws android.os.RemoteException;
    public int startRecognitionForService(android.os.ParcelUuid p0, android.os.Bundle p1, android.content.ComponentName p2, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p3) throws android.os.RemoteException;
    public int stopRecognitionForService(android.os.ParcelUuid p0) throws android.os.RemoteException;
    public int unloadSoundModel(android.os.ParcelUuid p0) throws android.os.RemoteException;
    public boolean isRecognitionActive(android.os.ParcelUuid p0) throws android.os.RemoteException;
    public int getModelState(android.os.ParcelUuid p0) throws android.os.RemoteException;
    public android.hardware.soundtrigger.SoundTrigger.ModuleProperties getModuleProperties() throws android.os.RemoteException;
    public int setParameter(android.os.ParcelUuid p0, int p1, int p2) throws android.os.RemoteException;
    public int getParameter(android.os.ParcelUuid p0, int p1) throws android.os.RemoteException;
    public android.hardware.soundtrigger.SoundTrigger.ModelParamRange queryParameter(android.os.ParcelUuid p0, int p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.ISoundTriggerSession {
        public Default() {}
        public android.hardware.soundtrigger.SoundTrigger.GenericSoundModel getSoundModel(android.os.ParcelUuid p0) throws android.os.RemoteException { return null; }
        public void updateSoundModel(android.hardware.soundtrigger.SoundTrigger.GenericSoundModel p0) throws android.os.RemoteException {}
        public void deleteSoundModel(android.os.ParcelUuid p0) throws android.os.RemoteException {}
        public int startRecognition(android.os.ParcelUuid p0, android.hardware.soundtrigger.IRecognitionStatusCallback p1, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p2, boolean p3) throws android.os.RemoteException { return 0; }
        public int stopRecognition(android.os.ParcelUuid p0, android.hardware.soundtrigger.IRecognitionStatusCallback p1) throws android.os.RemoteException { return 0; }
        public int loadGenericSoundModel(android.hardware.soundtrigger.SoundTrigger.GenericSoundModel p0) throws android.os.RemoteException { return 0; }
        public int loadKeyphraseSoundModel(android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel p0) throws android.os.RemoteException { return 0; }
        public int startRecognitionForService(android.os.ParcelUuid p0, android.os.Bundle p1, android.content.ComponentName p2, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p3) throws android.os.RemoteException { return 0; }
        public int stopRecognitionForService(android.os.ParcelUuid p0) throws android.os.RemoteException { return 0; }
        public int unloadSoundModel(android.os.ParcelUuid p0) throws android.os.RemoteException { return 0; }
        public boolean isRecognitionActive(android.os.ParcelUuid p0) throws android.os.RemoteException { return false; }
        public int getModelState(android.os.ParcelUuid p0) throws android.os.RemoteException { return 0; }
        public android.hardware.soundtrigger.SoundTrigger.ModuleProperties getModuleProperties() throws android.os.RemoteException { return null; }
        public int setParameter(android.os.ParcelUuid p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public int getParameter(android.os.ParcelUuid p0, int p1) throws android.os.RemoteException { return 0; }
        public android.hardware.soundtrigger.SoundTrigger.ModelParamRange queryParameter(android.os.ParcelUuid p0, int p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.ISoundTriggerSession {
        static final int TRANSACTION_getSoundModel = 1;
        static final int TRANSACTION_updateSoundModel = 2;
        static final int TRANSACTION_deleteSoundModel = 3;
        static final int TRANSACTION_startRecognition = 4;
        static final int TRANSACTION_stopRecognition = 5;
        static final int TRANSACTION_loadGenericSoundModel = 6;
        static final int TRANSACTION_loadKeyphraseSoundModel = 7;
        static final int TRANSACTION_startRecognitionForService = 8;
        static final int TRANSACTION_stopRecognitionForService = 9;
        static final int TRANSACTION_unloadSoundModel = 10;
        static final int TRANSACTION_isRecognitionActive = 11;
        static final int TRANSACTION_getModelState = 12;
        static final int TRANSACTION_getModuleProperties = 13;
        static final int TRANSACTION_setParameter = 14;
        static final int TRANSACTION_getParameter = 15;
        static final int TRANSACTION_queryParameter = 16;
        public Stub() { super(); }
        public static com.android.internal.app.ISoundTriggerSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.app.ISoundTriggerSession p0) { return false; }
        public static com.android.internal.app.ISoundTriggerSession getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.app.ISoundTriggerSession {
            private android.os.IBinder mRemote;
            public static com.android.internal.app.ISoundTriggerSession sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.soundtrigger.SoundTrigger.GenericSoundModel getSoundModel(android.os.ParcelUuid p0) throws android.os.RemoteException { return null; }
            public void updateSoundModel(android.hardware.soundtrigger.SoundTrigger.GenericSoundModel p0) throws android.os.RemoteException {}
            public void deleteSoundModel(android.os.ParcelUuid p0) throws android.os.RemoteException {}
            public int startRecognition(android.os.ParcelUuid p0, android.hardware.soundtrigger.IRecognitionStatusCallback p1, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p2, boolean p3) throws android.os.RemoteException { return 0; }
            public int stopRecognition(android.os.ParcelUuid p0, android.hardware.soundtrigger.IRecognitionStatusCallback p1) throws android.os.RemoteException { return 0; }
            public int loadGenericSoundModel(android.hardware.soundtrigger.SoundTrigger.GenericSoundModel p0) throws android.os.RemoteException { return 0; }
            public int loadKeyphraseSoundModel(android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel p0) throws android.os.RemoteException { return 0; }
            public int startRecognitionForService(android.os.ParcelUuid p0, android.os.Bundle p1, android.content.ComponentName p2, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p3) throws android.os.RemoteException { return 0; }
            public int stopRecognitionForService(android.os.ParcelUuid p0) throws android.os.RemoteException { return 0; }
            public int unloadSoundModel(android.os.ParcelUuid p0) throws android.os.RemoteException { return 0; }
            public boolean isRecognitionActive(android.os.ParcelUuid p0) throws android.os.RemoteException { return false; }
            public int getModelState(android.os.ParcelUuid p0) throws android.os.RemoteException { return 0; }
            public android.hardware.soundtrigger.SoundTrigger.ModuleProperties getModuleProperties() throws android.os.RemoteException { return null; }
            public int setParameter(android.os.ParcelUuid p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public int getParameter(android.os.ParcelUuid p0, int p1) throws android.os.RemoteException { return 0; }
            public android.hardware.soundtrigger.SoundTrigger.ModelParamRange queryParameter(android.os.ParcelUuid p0, int p1) throws android.os.RemoteException { return null; }
        }
    }
}
