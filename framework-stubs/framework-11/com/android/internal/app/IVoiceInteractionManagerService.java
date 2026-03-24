package com.android.internal.app;

public interface IVoiceInteractionManagerService extends android.os.IInterface {
    public void showSession(android.os.Bundle p0, int p1) throws android.os.RemoteException;
    public boolean deliverNewSession(android.os.IBinder p0, android.service.voice.IVoiceInteractionSession p1, com.android.internal.app.IVoiceInteractor p2) throws android.os.RemoteException;
    public boolean showSessionFromSession(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public boolean hideSessionFromSession(android.os.IBinder p0) throws android.os.RemoteException;
    public int startVoiceActivity(android.os.IBinder p0, android.content.Intent p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public int startAssistantActivity(android.os.IBinder p0, android.content.Intent p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void setKeepAwake(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void closeSystemDialogs(android.os.IBinder p0) throws android.os.RemoteException;
    public void finish(android.os.IBinder p0) throws android.os.RemoteException;
    public void setDisabledShowContext(int p0) throws android.os.RemoteException;
    public int getDisabledShowContext() throws android.os.RemoteException;
    public int getUserDisabledShowContext() throws android.os.RemoteException;
    public android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel getKeyphraseSoundModel(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int updateKeyphraseSoundModel(android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel p0) throws android.os.RemoteException;
    public int deleteKeyphraseSoundModel(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.hardware.soundtrigger.SoundTrigger.ModuleProperties getDspModuleProperties() throws android.os.RemoteException;
    public boolean isEnrolledForKeyphrase(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.hardware.soundtrigger.KeyphraseMetadata getEnrolledKeyphraseMetadata(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int startRecognition(int p0, java.lang.String p1, android.hardware.soundtrigger.IRecognitionStatusCallback p2, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p3) throws android.os.RemoteException;
    public int stopRecognition(int p0, android.hardware.soundtrigger.IRecognitionStatusCallback p1) throws android.os.RemoteException;
    public int setParameter(int p0, int p1, int p2) throws android.os.RemoteException;
    public int getParameter(int p0, int p1) throws android.os.RemoteException;
    public android.hardware.soundtrigger.SoundTrigger.ModelParamRange queryParameter(int p0, int p1) throws android.os.RemoteException;
    public android.content.ComponentName getActiveServiceComponentName() throws android.os.RemoteException;
    public boolean showSessionForActiveService(android.os.Bundle p0, int p1, com.android.internal.app.IVoiceInteractionSessionShowCallback p2, android.os.IBinder p3) throws android.os.RemoteException;
    public void hideCurrentSession() throws android.os.RemoteException;
    public void launchVoiceAssistFromKeyguard() throws android.os.RemoteException;
    public boolean isSessionRunning() throws android.os.RemoteException;
    public boolean activeServiceSupportsAssist() throws android.os.RemoteException;
    public boolean activeServiceSupportsLaunchFromKeyguard() throws android.os.RemoteException;
    public void onLockscreenShown() throws android.os.RemoteException;
    public void registerVoiceInteractionSessionListener(com.android.internal.app.IVoiceInteractionSessionListener p0) throws android.os.RemoteException;
    public void getActiveServiceSupportedActions(java.util.List<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) throws android.os.RemoteException;
    public void setUiHints(android.os.Bundle p0) throws android.os.RemoteException;
    public void requestDirectActions(android.os.IBinder p0, int p1, android.os.IBinder p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) throws android.os.RemoteException;
    public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3, android.os.IBinder p4, android.os.RemoteCallback p5, android.os.RemoteCallback p6) throws android.os.RemoteException;
    public void setDisabled(boolean p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IVoiceInteractionManagerService {
        public Default() {}
        public void showSession(android.os.Bundle p0, int p1) throws android.os.RemoteException {}
        public boolean deliverNewSession(android.os.IBinder p0, android.service.voice.IVoiceInteractionSession p1, com.android.internal.app.IVoiceInteractor p2) throws android.os.RemoteException { return false; }
        public boolean showSessionFromSession(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException { return false; }
        public boolean hideSessionFromSession(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public int startVoiceActivity(android.os.IBinder p0, android.content.Intent p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public int startAssistantActivity(android.os.IBinder p0, android.content.Intent p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public void setKeepAwake(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void closeSystemDialogs(android.os.IBinder p0) throws android.os.RemoteException {}
        public void finish(android.os.IBinder p0) throws android.os.RemoteException {}
        public void setDisabledShowContext(int p0) throws android.os.RemoteException {}
        public int getDisabledShowContext() throws android.os.RemoteException { return 0; }
        public int getUserDisabledShowContext() throws android.os.RemoteException { return 0; }
        public android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel getKeyphraseSoundModel(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int updateKeyphraseSoundModel(android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel p0) throws android.os.RemoteException { return 0; }
        public int deleteKeyphraseSoundModel(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public android.hardware.soundtrigger.SoundTrigger.ModuleProperties getDspModuleProperties() throws android.os.RemoteException { return null; }
        public boolean isEnrolledForKeyphrase(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public android.hardware.soundtrigger.KeyphraseMetadata getEnrolledKeyphraseMetadata(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int startRecognition(int p0, java.lang.String p1, android.hardware.soundtrigger.IRecognitionStatusCallback p2, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p3) throws android.os.RemoteException { return 0; }
        public int stopRecognition(int p0, android.hardware.soundtrigger.IRecognitionStatusCallback p1) throws android.os.RemoteException { return 0; }
        public int setParameter(int p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public int getParameter(int p0, int p1) throws android.os.RemoteException { return 0; }
        public android.hardware.soundtrigger.SoundTrigger.ModelParamRange queryParameter(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getActiveServiceComponentName() throws android.os.RemoteException { return null; }
        public boolean showSessionForActiveService(android.os.Bundle p0, int p1, com.android.internal.app.IVoiceInteractionSessionShowCallback p2, android.os.IBinder p3) throws android.os.RemoteException { return false; }
        public void hideCurrentSession() throws android.os.RemoteException {}
        public void launchVoiceAssistFromKeyguard() throws android.os.RemoteException {}
        public boolean isSessionRunning() throws android.os.RemoteException { return false; }
        public boolean activeServiceSupportsAssist() throws android.os.RemoteException { return false; }
        public boolean activeServiceSupportsLaunchFromKeyguard() throws android.os.RemoteException { return false; }
        public void onLockscreenShown() throws android.os.RemoteException {}
        public void registerVoiceInteractionSessionListener(com.android.internal.app.IVoiceInteractionSessionListener p0) throws android.os.RemoteException {}
        public void getActiveServiceSupportedActions(java.util.List<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) throws android.os.RemoteException {}
        public void setUiHints(android.os.Bundle p0) throws android.os.RemoteException {}
        public void requestDirectActions(android.os.IBinder p0, int p1, android.os.IBinder p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
        public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3, android.os.IBinder p4, android.os.RemoteCallback p5, android.os.RemoteCallback p6) throws android.os.RemoteException {}
        public void setDisabled(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IVoiceInteractionManagerService {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IVoiceInteractionManagerService";
        static final int TRANSACTION_showSession = 1;
        static final int TRANSACTION_deliverNewSession = 2;
        static final int TRANSACTION_showSessionFromSession = 3;
        static final int TRANSACTION_hideSessionFromSession = 4;
        static final int TRANSACTION_startVoiceActivity = 5;
        static final int TRANSACTION_startAssistantActivity = 6;
        static final int TRANSACTION_setKeepAwake = 7;
        static final int TRANSACTION_closeSystemDialogs = 8;
        static final int TRANSACTION_finish = 9;
        static final int TRANSACTION_setDisabledShowContext = 10;
        static final int TRANSACTION_getDisabledShowContext = 11;
        static final int TRANSACTION_getUserDisabledShowContext = 12;
        static final int TRANSACTION_getKeyphraseSoundModel = 13;
        static final int TRANSACTION_updateKeyphraseSoundModel = 14;
        static final int TRANSACTION_deleteKeyphraseSoundModel = 15;
        static final int TRANSACTION_getDspModuleProperties = 16;
        static final int TRANSACTION_isEnrolledForKeyphrase = 17;
        static final int TRANSACTION_getEnrolledKeyphraseMetadata = 18;
        static final int TRANSACTION_startRecognition = 19;
        static final int TRANSACTION_stopRecognition = 20;
        static final int TRANSACTION_setParameter = 21;
        static final int TRANSACTION_getParameter = 22;
        static final int TRANSACTION_queryParameter = 23;
        static final int TRANSACTION_getActiveServiceComponentName = 24;
        static final int TRANSACTION_showSessionForActiveService = 25;
        static final int TRANSACTION_hideCurrentSession = 26;
        static final int TRANSACTION_launchVoiceAssistFromKeyguard = 27;
        static final int TRANSACTION_isSessionRunning = 28;
        static final int TRANSACTION_activeServiceSupportsAssist = 29;
        static final int TRANSACTION_activeServiceSupportsLaunchFromKeyguard = 30;
        static final int TRANSACTION_onLockscreenShown = 31;
        static final int TRANSACTION_registerVoiceInteractionSessionListener = 32;
        static final int TRANSACTION_getActiveServiceSupportedActions = 33;
        static final int TRANSACTION_setUiHints = 34;
        static final int TRANSACTION_requestDirectActions = 35;
        static final int TRANSACTION_performDirectAction = 36;
        static final int TRANSACTION_setDisabled = 37;
        public Stub() { super(); }
        public static com.android.internal.app.IVoiceInteractionManagerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.app.IVoiceInteractionManagerService p0) { return false; }
        public static com.android.internal.app.IVoiceInteractionManagerService getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.app.IVoiceInteractionManagerService {
            private android.os.IBinder mRemote;
            public static com.android.internal.app.IVoiceInteractionManagerService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void showSession(android.os.Bundle p0, int p1) throws android.os.RemoteException {}
            public boolean deliverNewSession(android.os.IBinder p0, android.service.voice.IVoiceInteractionSession p1, com.android.internal.app.IVoiceInteractor p2) throws android.os.RemoteException { return false; }
            public boolean showSessionFromSession(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException { return false; }
            public boolean hideSessionFromSession(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public int startVoiceActivity(android.os.IBinder p0, android.content.Intent p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public int startAssistantActivity(android.os.IBinder p0, android.content.Intent p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public void setKeepAwake(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void closeSystemDialogs(android.os.IBinder p0) throws android.os.RemoteException {}
            public void finish(android.os.IBinder p0) throws android.os.RemoteException {}
            public void setDisabledShowContext(int p0) throws android.os.RemoteException {}
            public int getDisabledShowContext() throws android.os.RemoteException { return 0; }
            public int getUserDisabledShowContext() throws android.os.RemoteException { return 0; }
            public android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel getKeyphraseSoundModel(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int updateKeyphraseSoundModel(android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel p0) throws android.os.RemoteException { return 0; }
            public int deleteKeyphraseSoundModel(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public android.hardware.soundtrigger.SoundTrigger.ModuleProperties getDspModuleProperties() throws android.os.RemoteException { return null; }
            public boolean isEnrolledForKeyphrase(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public android.hardware.soundtrigger.KeyphraseMetadata getEnrolledKeyphraseMetadata(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int startRecognition(int p0, java.lang.String p1, android.hardware.soundtrigger.IRecognitionStatusCallback p2, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p3) throws android.os.RemoteException { return 0; }
            public int stopRecognition(int p0, android.hardware.soundtrigger.IRecognitionStatusCallback p1) throws android.os.RemoteException { return 0; }
            public int setParameter(int p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public int getParameter(int p0, int p1) throws android.os.RemoteException { return 0; }
            public android.hardware.soundtrigger.SoundTrigger.ModelParamRange queryParameter(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getActiveServiceComponentName() throws android.os.RemoteException { return null; }
            public boolean showSessionForActiveService(android.os.Bundle p0, int p1, com.android.internal.app.IVoiceInteractionSessionShowCallback p2, android.os.IBinder p3) throws android.os.RemoteException { return false; }
            public void hideCurrentSession() throws android.os.RemoteException {}
            public void launchVoiceAssistFromKeyguard() throws android.os.RemoteException {}
            public boolean isSessionRunning() throws android.os.RemoteException { return false; }
            public boolean activeServiceSupportsAssist() throws android.os.RemoteException { return false; }
            public boolean activeServiceSupportsLaunchFromKeyguard() throws android.os.RemoteException { return false; }
            public void onLockscreenShown() throws android.os.RemoteException {}
            public void registerVoiceInteractionSessionListener(com.android.internal.app.IVoiceInteractionSessionListener p0) throws android.os.RemoteException {}
            public void getActiveServiceSupportedActions(java.util.List<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) throws android.os.RemoteException {}
            public void setUiHints(android.os.Bundle p0) throws android.os.RemoteException {}
            public void requestDirectActions(android.os.IBinder p0, int p1, android.os.IBinder p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
            public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3, android.os.IBinder p4, android.os.RemoteCallback p5, android.os.RemoteCallback p6) throws android.os.RemoteException {}
            public void setDisabled(boolean p0) throws android.os.RemoteException {}
        }
    }
}
