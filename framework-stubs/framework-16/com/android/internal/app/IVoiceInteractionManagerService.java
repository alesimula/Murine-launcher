package com.android.internal.app;

public interface IVoiceInteractionManagerService extends android.os.IInterface {
    public void showSession(android.os.Bundle p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean deliverNewSession(android.os.IBinder p0, android.service.voice.IVoiceInteractionSession p1, com.android.internal.app.IVoiceInteractor p2) throws android.os.RemoteException;
    public boolean showSessionFromSession(android.os.IBinder p0, android.os.Bundle p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean hideSessionFromSession(android.os.IBinder p0) throws android.os.RemoteException;
    public int startVoiceActivity(android.os.IBinder p0, android.content.Intent p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public int startAssistantActivity(android.os.IBinder p0, android.content.Intent p1, java.lang.String p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException;
    public void setKeepAwake(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void closeSystemDialogs(android.os.IBinder p0) throws android.os.RemoteException;
    public void finish(android.os.IBinder p0) throws android.os.RemoteException;
    public void setDisabledShowContext(int p0) throws android.os.RemoteException;
    public int getDisabledShowContext() throws android.os.RemoteException;
    public int getUserDisabledShowContext() throws android.os.RemoteException;
    public android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel getKeyphraseSoundModel(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int updateKeyphraseSoundModel(android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel p0) throws android.os.RemoteException;
    public int deleteKeyphraseSoundModel(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_VOICE_KEYPHRASES")
    @android.annotation.EnforcePermission("android.permission.MANAGE_VOICE_KEYPHRASES")
    public void setModelDatabaseForTestEnabled(boolean p0, android.os.IBinder p1) throws android.os.RemoteException;
    public boolean isEnrolledForKeyphrase(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.hardware.soundtrigger.KeyphraseMetadata getEnrolledKeyphraseMetadata(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.ComponentName getActiveServiceComponentName() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VOICE_INTERACTION_SERVICE")
    public boolean showSessionForActiveService(android.os.Bundle p0, int p1, java.lang.String p2, com.android.internal.app.IVoiceInteractionSessionShowCallback p3, android.os.IBinder p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VOICE_INTERACTION_SERVICE")
    public void hideCurrentSession() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VOICE_INTERACTION_SERVICE")
    public void launchVoiceAssistFromKeyguard() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VOICE_INTERACTION_SERVICE")
    public boolean isSessionRunning() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VOICE_INTERACTION_SERVICE")
    public boolean activeServiceSupportsAssist() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VOICE_INTERACTION_SERVICE")
    public boolean activeServiceSupportsLaunchFromKeyguard() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VOICE_INTERACTION_SERVICE")
    public void onLockscreenShown() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VOICE_INTERACTION_SERVICE")
    public void registerVoiceInteractionSessionListener(com.android.internal.app.IVoiceInteractionSessionListener p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VOICE_INTERACTION_SERVICE")
    public void getActiveServiceSupportedActions(java.util.List<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) throws android.os.RemoteException;
    public void setUiHints(android.os.Bundle p0) throws android.os.RemoteException;
    public void setInvocationEffectEnabled(boolean p0) throws android.os.RemoteException;
    public void requestDirectActions(android.os.IBinder p0, int p1, android.os.IBinder p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) throws android.os.RemoteException;
    public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3, android.os.IBinder p4, android.os.RemoteCallback p5, android.os.RemoteCallback p6) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VOICE_INTERACTION_SERVICE")
    public void setDisabled(boolean p0) throws android.os.RemoteException;
    public com.android.internal.app.IVoiceInteractionSoundTriggerSession createSoundTriggerSessionAsOriginator(android.media.permission.Identity p0, android.os.IBinder p1, android.hardware.soundtrigger.SoundTrigger.ModuleProperties p2) throws android.os.RemoteException;
    public java.util.List<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> listModuleProperties(android.media.permission.Identity p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_HOTWORD_DETECTION")
    public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.IBinder p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_HOTWORD_DETECTION")
    public void initAndVerifyDetector(android.media.permission.Identity p0, android.os.PersistableBundle p1, android.os.SharedMemory p2, android.os.IBinder p3, com.android.internal.app.IHotwordRecognitionStatusCallback p4, int p5) throws android.os.RemoteException;
    public void destroyDetector(android.os.IBinder p0) throws android.os.RemoteException;
    public void shutdownHotwordDetectionService() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VOICE_INTERACTION_SERVICE")
    public void subscribeVisualQueryRecognitionStatus(com.android.internal.app.IVisualQueryRecognitionStatusListener p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VOICE_INTERACTION_SERVICE")
    public void enableVisualQueryDetection(com.android.internal.app.IVisualQueryDetectionAttentionListener p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VOICE_INTERACTION_SERVICE")
    public void disableVisualQueryDetection() throws android.os.RemoteException;
    public void startPerceiving(android.service.voice.IVisualQueryDetectionVoiceInteractionCallback p0) throws android.os.RemoteException;
    public void stopPerceiving() throws android.os.RemoteException;
    public void startListeningFromMic(android.media.AudioFormat p0, android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback p1) throws android.os.RemoteException;
    public void stopListeningFromMic() throws android.os.RemoteException;
    public void startListeningFromExternalSource(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.os.PersistableBundle p2, android.os.IBinder p3, android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback p4) throws android.os.RemoteException;
    public void triggerHardwareRecognitionEventForTest(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, com.android.internal.app.IHotwordRecognitionStatusCallback p1) throws android.os.RemoteException;
    public void startListeningVisibleActivityChanged(android.os.IBinder p0) throws android.os.RemoteException;
    public void stopListeningVisibleActivityChanged(android.os.IBinder p0) throws android.os.RemoteException;
    public void setSessionWindowVisible(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void notifyActivityEventChanged(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public boolean getAccessibilityDetectionEnabled() throws android.os.RemoteException;
    public void registerAccessibilityDetectionSettingsListener(com.android.internal.app.IVoiceInteractionAccessibilitySettingsListener p0) throws android.os.RemoteException;
    public void unregisterAccessibilityDetectionSettingsListener(com.android.internal.app.IVoiceInteractionAccessibilitySettingsListener p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IVoiceInteractionManagerService {
        public Default() {}
        public void showSession(android.os.Bundle p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public boolean deliverNewSession(android.os.IBinder p0, android.service.voice.IVoiceInteractionSession p1, com.android.internal.app.IVoiceInteractor p2) throws android.os.RemoteException { return false; }
        public boolean showSessionFromSession(android.os.IBinder p0, android.os.Bundle p1, int p2, java.lang.String p3) throws android.os.RemoteException { return false; }
        public boolean hideSessionFromSession(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public int startVoiceActivity(android.os.IBinder p0, android.content.Intent p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public int startAssistantActivity(android.os.IBinder p0, android.content.Intent p1, java.lang.String p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException { return 0; }
        public void setKeepAwake(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void closeSystemDialogs(android.os.IBinder p0) throws android.os.RemoteException {}
        public void finish(android.os.IBinder p0) throws android.os.RemoteException {}
        public void setDisabledShowContext(int p0) throws android.os.RemoteException {}
        public int getDisabledShowContext() throws android.os.RemoteException { return 0; }
        public int getUserDisabledShowContext() throws android.os.RemoteException { return 0; }
        public android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel getKeyphraseSoundModel(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int updateKeyphraseSoundModel(android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel p0) throws android.os.RemoteException { return 0; }
        public int deleteKeyphraseSoundModel(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void setModelDatabaseForTestEnabled(boolean p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public boolean isEnrolledForKeyphrase(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public android.hardware.soundtrigger.KeyphraseMetadata getEnrolledKeyphraseMetadata(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getActiveServiceComponentName() throws android.os.RemoteException { return null; }
        public boolean showSessionForActiveService(android.os.Bundle p0, int p1, java.lang.String p2, com.android.internal.app.IVoiceInteractionSessionShowCallback p3, android.os.IBinder p4) throws android.os.RemoteException { return false; }
        public void hideCurrentSession() throws android.os.RemoteException {}
        public void launchVoiceAssistFromKeyguard() throws android.os.RemoteException {}
        public boolean isSessionRunning() throws android.os.RemoteException { return false; }
        public boolean activeServiceSupportsAssist() throws android.os.RemoteException { return false; }
        public boolean activeServiceSupportsLaunchFromKeyguard() throws android.os.RemoteException { return false; }
        public void onLockscreenShown() throws android.os.RemoteException {}
        public void registerVoiceInteractionSessionListener(com.android.internal.app.IVoiceInteractionSessionListener p0) throws android.os.RemoteException {}
        public void getActiveServiceSupportedActions(java.util.List<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) throws android.os.RemoteException {}
        public void setUiHints(android.os.Bundle p0) throws android.os.RemoteException {}
        public void setInvocationEffectEnabled(boolean p0) throws android.os.RemoteException {}
        public void requestDirectActions(android.os.IBinder p0, int p1, android.os.IBinder p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
        public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3, android.os.IBinder p4, android.os.RemoteCallback p5, android.os.RemoteCallback p6) throws android.os.RemoteException {}
        public void setDisabled(boolean p0) throws android.os.RemoteException {}
        public com.android.internal.app.IVoiceInteractionSoundTriggerSession createSoundTriggerSessionAsOriginator(android.media.permission.Identity p0, android.os.IBinder p1, android.hardware.soundtrigger.SoundTrigger.ModuleProperties p2) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> listModuleProperties(android.media.permission.Identity p0) throws android.os.RemoteException { return null; }
        public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public void initAndVerifyDetector(android.media.permission.Identity p0, android.os.PersistableBundle p1, android.os.SharedMemory p2, android.os.IBinder p3, com.android.internal.app.IHotwordRecognitionStatusCallback p4, int p5) throws android.os.RemoteException {}
        public void destroyDetector(android.os.IBinder p0) throws android.os.RemoteException {}
        public void shutdownHotwordDetectionService() throws android.os.RemoteException {}
        public void subscribeVisualQueryRecognitionStatus(com.android.internal.app.IVisualQueryRecognitionStatusListener p0) throws android.os.RemoteException {}
        public void enableVisualQueryDetection(com.android.internal.app.IVisualQueryDetectionAttentionListener p0) throws android.os.RemoteException {}
        public void disableVisualQueryDetection() throws android.os.RemoteException {}
        public void startPerceiving(android.service.voice.IVisualQueryDetectionVoiceInteractionCallback p0) throws android.os.RemoteException {}
        public void stopPerceiving() throws android.os.RemoteException {}
        public void startListeningFromMic(android.media.AudioFormat p0, android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback p1) throws android.os.RemoteException {}
        public void stopListeningFromMic() throws android.os.RemoteException {}
        public void startListeningFromExternalSource(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.os.PersistableBundle p2, android.os.IBinder p3, android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback p4) throws android.os.RemoteException {}
        public void triggerHardwareRecognitionEventForTest(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, com.android.internal.app.IHotwordRecognitionStatusCallback p1) throws android.os.RemoteException {}
        public void startListeningVisibleActivityChanged(android.os.IBinder p0) throws android.os.RemoteException {}
        public void stopListeningVisibleActivityChanged(android.os.IBinder p0) throws android.os.RemoteException {}
        public void setSessionWindowVisible(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void notifyActivityEventChanged(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public boolean getAccessibilityDetectionEnabled() throws android.os.RemoteException { return false; }
        public void registerAccessibilityDetectionSettingsListener(com.android.internal.app.IVoiceInteractionAccessibilitySettingsListener p0) throws android.os.RemoteException {}
        public void unregisterAccessibilityDetectionSettingsListener(com.android.internal.app.IVoiceInteractionAccessibilitySettingsListener p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IVoiceInteractionManagerService {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.app.IVoiceInteractionManagerService";
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
        static final int TRANSACTION_setModelDatabaseForTestEnabled = 16;
        static final int TRANSACTION_isEnrolledForKeyphrase = 17;
        static final int TRANSACTION_getEnrolledKeyphraseMetadata = 18;
        static final int TRANSACTION_getActiveServiceComponentName = 19;
        static final int TRANSACTION_showSessionForActiveService = 20;
        static final int TRANSACTION_hideCurrentSession = 21;
        static final int TRANSACTION_launchVoiceAssistFromKeyguard = 22;
        static final int TRANSACTION_isSessionRunning = 23;
        static final int TRANSACTION_activeServiceSupportsAssist = 24;
        static final int TRANSACTION_activeServiceSupportsLaunchFromKeyguard = 25;
        static final int TRANSACTION_onLockscreenShown = 26;
        static final int TRANSACTION_registerVoiceInteractionSessionListener = 27;
        static final int TRANSACTION_getActiveServiceSupportedActions = 28;
        static final int TRANSACTION_setUiHints = 29;
        static final int TRANSACTION_setInvocationEffectEnabled = 30;
        static final int TRANSACTION_requestDirectActions = 31;
        static final int TRANSACTION_performDirectAction = 32;
        static final int TRANSACTION_setDisabled = 33;
        static final int TRANSACTION_createSoundTriggerSessionAsOriginator = 34;
        static final int TRANSACTION_listModuleProperties = 35;
        static final int TRANSACTION_updateState = 36;
        static final int TRANSACTION_initAndVerifyDetector = 37;
        static final int TRANSACTION_destroyDetector = 38;
        static final int TRANSACTION_shutdownHotwordDetectionService = 39;
        static final int TRANSACTION_subscribeVisualQueryRecognitionStatus = 40;
        static final int TRANSACTION_enableVisualQueryDetection = 41;
        static final int TRANSACTION_disableVisualQueryDetection = 42;
        static final int TRANSACTION_startPerceiving = 43;
        static final int TRANSACTION_stopPerceiving = 44;
        static final int TRANSACTION_startListeningFromMic = 45;
        static final int TRANSACTION_stopListeningFromMic = 46;
        static final int TRANSACTION_startListeningFromExternalSource = 47;
        static final int TRANSACTION_triggerHardwareRecognitionEventForTest = 48;
        static final int TRANSACTION_startListeningVisibleActivityChanged = 49;
        static final int TRANSACTION_stopListeningVisibleActivityChanged = 50;
        static final int TRANSACTION_setSessionWindowVisible = 51;
        static final int TRANSACTION_notifyActivityEventChanged = 52;
        static final int TRANSACTION_getAccessibilityDetectionEnabled = 53;
        static final int TRANSACTION_registerAccessibilityDetectionSettingsListener = 54;
        static final int TRANSACTION_unregisterAccessibilityDetectionSettingsListener = 55;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static com.android.internal.app.IVoiceInteractionManagerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setModelDatabaseForTestEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void showSessionForActiveService_enforcePermission() throws java.lang.SecurityException {}
        protected void hideCurrentSession_enforcePermission() throws java.lang.SecurityException {}
        protected void launchVoiceAssistFromKeyguard_enforcePermission() throws java.lang.SecurityException {}
        protected void isSessionRunning_enforcePermission() throws java.lang.SecurityException {}
        protected void activeServiceSupportsAssist_enforcePermission() throws java.lang.SecurityException {}
        protected void activeServiceSupportsLaunchFromKeyguard_enforcePermission() throws java.lang.SecurityException {}
        protected void onLockscreenShown_enforcePermission() throws java.lang.SecurityException {}
        protected void registerVoiceInteractionSessionListener_enforcePermission() throws java.lang.SecurityException {}
        protected void getActiveServiceSupportedActions_enforcePermission() throws java.lang.SecurityException {}
        protected void setDisabled_enforcePermission() throws java.lang.SecurityException {}
        protected void updateState_enforcePermission() throws java.lang.SecurityException {}
        protected void initAndVerifyDetector_enforcePermission() throws java.lang.SecurityException {}
        protected void subscribeVisualQueryRecognitionStatus_enforcePermission() throws java.lang.SecurityException {}
        protected void enableVisualQueryDetection_enforcePermission() throws java.lang.SecurityException {}
        protected void disableVisualQueryDetection_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.app.IVoiceInteractionManagerService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void showSession(android.os.Bundle p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public boolean deliverNewSession(android.os.IBinder p0, android.service.voice.IVoiceInteractionSession p1, com.android.internal.app.IVoiceInteractor p2) throws android.os.RemoteException { return false; }
            public boolean showSessionFromSession(android.os.IBinder p0, android.os.Bundle p1, int p2, java.lang.String p3) throws android.os.RemoteException { return false; }
            public boolean hideSessionFromSession(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public int startVoiceActivity(android.os.IBinder p0, android.content.Intent p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public int startAssistantActivity(android.os.IBinder p0, android.content.Intent p1, java.lang.String p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException { return 0; }
            public void setKeepAwake(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void closeSystemDialogs(android.os.IBinder p0) throws android.os.RemoteException {}
            public void finish(android.os.IBinder p0) throws android.os.RemoteException {}
            public void setDisabledShowContext(int p0) throws android.os.RemoteException {}
            public int getDisabledShowContext() throws android.os.RemoteException { return 0; }
            public int getUserDisabledShowContext() throws android.os.RemoteException { return 0; }
            public android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel getKeyphraseSoundModel(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int updateKeyphraseSoundModel(android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel p0) throws android.os.RemoteException { return 0; }
            public int deleteKeyphraseSoundModel(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void setModelDatabaseForTestEnabled(boolean p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public boolean isEnrolledForKeyphrase(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public android.hardware.soundtrigger.KeyphraseMetadata getEnrolledKeyphraseMetadata(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getActiveServiceComponentName() throws android.os.RemoteException { return null; }
            public boolean showSessionForActiveService(android.os.Bundle p0, int p1, java.lang.String p2, com.android.internal.app.IVoiceInteractionSessionShowCallback p3, android.os.IBinder p4) throws android.os.RemoteException { return false; }
            public void hideCurrentSession() throws android.os.RemoteException {}
            public void launchVoiceAssistFromKeyguard() throws android.os.RemoteException {}
            public boolean isSessionRunning() throws android.os.RemoteException { return false; }
            public boolean activeServiceSupportsAssist() throws android.os.RemoteException { return false; }
            public boolean activeServiceSupportsLaunchFromKeyguard() throws android.os.RemoteException { return false; }
            public void onLockscreenShown() throws android.os.RemoteException {}
            public void registerVoiceInteractionSessionListener(com.android.internal.app.IVoiceInteractionSessionListener p0) throws android.os.RemoteException {}
            public void getActiveServiceSupportedActions(java.util.List<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) throws android.os.RemoteException {}
            public void setUiHints(android.os.Bundle p0) throws android.os.RemoteException {}
            public void setInvocationEffectEnabled(boolean p0) throws android.os.RemoteException {}
            public void requestDirectActions(android.os.IBinder p0, int p1, android.os.IBinder p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
            public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3, android.os.IBinder p4, android.os.RemoteCallback p5, android.os.RemoteCallback p6) throws android.os.RemoteException {}
            public void setDisabled(boolean p0) throws android.os.RemoteException {}
            public com.android.internal.app.IVoiceInteractionSoundTriggerSession createSoundTriggerSessionAsOriginator(android.media.permission.Identity p0, android.os.IBinder p1, android.hardware.soundtrigger.SoundTrigger.ModuleProperties p2) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> listModuleProperties(android.media.permission.Identity p0) throws android.os.RemoteException { return null; }
            public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public void initAndVerifyDetector(android.media.permission.Identity p0, android.os.PersistableBundle p1, android.os.SharedMemory p2, android.os.IBinder p3, com.android.internal.app.IHotwordRecognitionStatusCallback p4, int p5) throws android.os.RemoteException {}
            public void destroyDetector(android.os.IBinder p0) throws android.os.RemoteException {}
            public void shutdownHotwordDetectionService() throws android.os.RemoteException {}
            public void subscribeVisualQueryRecognitionStatus(com.android.internal.app.IVisualQueryRecognitionStatusListener p0) throws android.os.RemoteException {}
            public void enableVisualQueryDetection(com.android.internal.app.IVisualQueryDetectionAttentionListener p0) throws android.os.RemoteException {}
            public void disableVisualQueryDetection() throws android.os.RemoteException {}
            public void startPerceiving(android.service.voice.IVisualQueryDetectionVoiceInteractionCallback p0) throws android.os.RemoteException {}
            public void stopPerceiving() throws android.os.RemoteException {}
            public void startListeningFromMic(android.media.AudioFormat p0, android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback p1) throws android.os.RemoteException {}
            public void stopListeningFromMic() throws android.os.RemoteException {}
            public void startListeningFromExternalSource(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.os.PersistableBundle p2, android.os.IBinder p3, android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback p4) throws android.os.RemoteException {}
            public void triggerHardwareRecognitionEventForTest(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, com.android.internal.app.IHotwordRecognitionStatusCallback p1) throws android.os.RemoteException {}
            public void startListeningVisibleActivityChanged(android.os.IBinder p0) throws android.os.RemoteException {}
            public void stopListeningVisibleActivityChanged(android.os.IBinder p0) throws android.os.RemoteException {}
            public void setSessionWindowVisible(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void notifyActivityEventChanged(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public boolean getAccessibilityDetectionEnabled() throws android.os.RemoteException { return false; }
            public void registerAccessibilityDetectionSettingsListener(com.android.internal.app.IVoiceInteractionAccessibilitySettingsListener p0) throws android.os.RemoteException {}
            public void unregisterAccessibilityDetectionSettingsListener(com.android.internal.app.IVoiceInteractionAccessibilitySettingsListener p0) throws android.os.RemoteException {}
        }
    }
}
