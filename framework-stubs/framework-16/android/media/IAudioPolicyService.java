package android.media;

public interface IAudioPolicyService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IAudioPolicyService";
    public void onNewAudioModulesAvailable() throws android.os.RemoteException;
    public void setDeviceConnectionState(int p0, android.media.audio.common.AudioPort p1, android.media.audio.common.AudioFormatDescription p2, boolean p3) throws android.os.RemoteException;
    public int getDeviceConnectionState(android.media.audio.common.AudioDevice p0) throws android.os.RemoteException;
    public void handleDeviceConfigChange(android.media.audio.common.AudioDevice p0, java.lang.String p1, android.media.audio.common.AudioFormatDescription p2) throws android.os.RemoteException;
    public void setPhoneState(int p0, int p1) throws android.os.RemoteException;
    public void setForceUse(int p0, int p1) throws android.os.RemoteException;
    public int getForceUse(int p0) throws android.os.RemoteException;
    public int getOutput(int p0) throws android.os.RemoteException;
    public android.media.GetOutputForAttrResponse getOutputForAttr(android.media.audio.common.AudioAttributes p0, int p1, android.content.AttributionSourceState p2, android.media.audio.common.AudioConfig p3, int p4, int[] p5) throws android.os.RemoteException;
    public android.media.StartOutputResponse startOutput(int p0) throws android.os.RemoteException;
    public void stopOutput(int p0) throws android.os.RemoteException;
    public void releaseOutput(int p0) throws android.os.RemoteException;
    public android.media.GetInputForAttrResponse getInputForAttr(android.media.audio.common.AudioAttributes p0, int p1, int p2, int p3, android.content.AttributionSourceState p4, android.media.audio.common.AudioConfigBase p5, int p6, int p7) throws android.os.RemoteException;
    public void startInput(int p0) throws android.os.RemoteException;
    public void stopInput(int p0) throws android.os.RemoteException;
    public void releaseInput(int p0) throws android.os.RemoteException;
    public void setDeviceAbsoluteVolumeEnabled(android.media.audio.common.AudioDevice p0, boolean p1, int p2) throws android.os.RemoteException;
    public void initStreamVolume(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setStreamVolumeIndex(int p0, android.media.audio.common.AudioDeviceDescription p1, int p2, boolean p3) throws android.os.RemoteException;
    public int getStreamVolumeIndex(int p0, android.media.audio.common.AudioDeviceDescription p1) throws android.os.RemoteException;
    public void setVolumeIndexForAttributes(android.media.audio.common.AudioAttributes p0, android.media.audio.common.AudioDeviceDescription p1, int p2, boolean p3) throws android.os.RemoteException;
    public int getVolumeIndexForAttributes(android.media.audio.common.AudioAttributes p0, android.media.audio.common.AudioDeviceDescription p1) throws android.os.RemoteException;
    public int getMaxVolumeIndexForAttributes(android.media.audio.common.AudioAttributes p0) throws android.os.RemoteException;
    public int getMinVolumeIndexForAttributes(android.media.audio.common.AudioAttributes p0) throws android.os.RemoteException;
    public void setVolumeIndexForGroup(int p0, android.media.audio.common.AudioDeviceDescription p1, int p2, boolean p3) throws android.os.RemoteException;
    public int getVolumeIndexForGroup(int p0, android.media.audio.common.AudioDeviceDescription p1) throws android.os.RemoteException;
    public int getMaxVolumeIndexForGroup(int p0) throws android.os.RemoteException;
    public int getMinVolumeIndexForGroup(int p0) throws android.os.RemoteException;
    public void setMaxVolumeIndexForGroup(int p0, int p1) throws android.os.RemoteException;
    public void setMinVolumeIndexForGroup(int p0, int p1) throws android.os.RemoteException;
    public int getStrategyForStream(int p0) throws android.os.RemoteException;
    public android.media.audio.common.AudioDevice[] getDevicesForAttributes(android.media.audio.common.AudioAttributes p0, boolean p1) throws android.os.RemoteException;
    public int getOutputForEffect(android.media.EffectDescriptor p0) throws android.os.RemoteException;
    public void registerEffect(android.media.EffectDescriptor p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void unregisterEffect(int p0) throws android.os.RemoteException;
    public void setEffectEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void moveEffectsToIo(int[] p0, int p1) throws android.os.RemoteException;
    public boolean isStreamActive(int p0, int p1) throws android.os.RemoteException;
    public boolean isStreamActiveRemotely(int p0, int p1) throws android.os.RemoteException;
    public boolean isSourceActive(int p0) throws android.os.RemoteException;
    public android.media.EffectDescriptor[] queryDefaultPreProcessing(int p0, android.media.audio.common.Int p1) throws android.os.RemoteException;
    public int addSourceDefaultEffect(android.media.audio.common.AudioUuid p0, java.lang.String p1, android.media.audio.common.AudioUuid p2, int p3, int p4) throws android.os.RemoteException;
    public int addStreamDefaultEffect(android.media.audio.common.AudioUuid p0, java.lang.String p1, android.media.audio.common.AudioUuid p2, int p3, int p4) throws android.os.RemoteException;
    public void removeSourceDefaultEffect(int p0) throws android.os.RemoteException;
    public void removeStreamDefaultEffect(int p0) throws android.os.RemoteException;
    public void setSupportedSystemUsages(int[] p0) throws android.os.RemoteException;
    public void setAllowedCapturePolicy(int p0, int p1) throws android.os.RemoteException;
    public int getOffloadSupport(android.media.audio.common.AudioOffloadInfo p0) throws android.os.RemoteException;
    public boolean isDirectOutputSupported(android.media.audio.common.AudioConfigBase p0, android.media.audio.common.AudioAttributes p1) throws android.os.RemoteException;
    public int listAudioPorts(int p0, int p1, android.media.audio.common.Int p2, android.media.AudioPortFw[] p3) throws android.os.RemoteException;
    public android.media.AudioPortFw[] listDeclaredDevicePorts(int p0) throws android.os.RemoteException;
    public android.media.AudioPortFw getAudioPort(int p0) throws android.os.RemoteException;
    public int createAudioPatch(android.media.AudioPatchFw p0, int p1) throws android.os.RemoteException;
    public void releaseAudioPatch(int p0) throws android.os.RemoteException;
    public int listAudioPatches(android.media.audio.common.Int p0, android.media.AudioPatchFw[] p1) throws android.os.RemoteException;
    public void setAudioPortConfig(android.media.AudioPortConfigFw p0) throws android.os.RemoteException;
    public void registerClient(android.media.IAudioPolicyServiceClient p0) throws android.os.RemoteException;
    public void setAudioPortCallbacksEnabled(boolean p0) throws android.os.RemoteException;
    public void setAudioVolumeGroupCallbacksEnabled(boolean p0) throws android.os.RemoteException;
    public android.media.SoundTriggerSession acquireSoundTriggerSession() throws android.os.RemoteException;
    public void releaseSoundTriggerSession(int p0) throws android.os.RemoteException;
    public int getPhoneState() throws android.os.RemoteException;
    public void registerPolicyMixes(android.media.AudioMix[] p0, boolean p1) throws android.os.RemoteException;
    public java.util.List<android.media.AudioMix> getRegisteredPolicyMixes() throws android.os.RemoteException;
    public void updatePolicyMixes(android.media.AudioMixUpdate[] p0) throws android.os.RemoteException;
    public void setUidDeviceAffinities(int p0, android.media.audio.common.AudioDevice[] p1) throws android.os.RemoteException;
    public void removeUidDeviceAffinities(int p0) throws android.os.RemoteException;
    public void setUserIdDeviceAffinities(int p0, android.media.audio.common.AudioDevice[] p1) throws android.os.RemoteException;
    public void removeUserIdDeviceAffinities(int p0) throws android.os.RemoteException;
    public int startAudioSource(android.media.AudioPortConfigFw p0, android.media.audio.common.AudioAttributes p1) throws android.os.RemoteException;
    public void stopAudioSource(int p0) throws android.os.RemoteException;
    public void setMasterMono(boolean p0) throws android.os.RemoteException;
    public boolean getMasterMono() throws android.os.RemoteException;
    public float getStreamVolumeDB(int p0, int p1, android.media.audio.common.AudioDeviceDescription p2) throws android.os.RemoteException;
    public void getSurroundFormats(android.media.audio.common.Int p0, android.media.audio.common.AudioFormatDescription[] p1, boolean[] p2) throws android.os.RemoteException;
    public void getReportedSurroundFormats(android.media.audio.common.Int p0, android.media.audio.common.AudioFormatDescription[] p1) throws android.os.RemoteException;
    public android.media.audio.common.AudioFormatDescription[] getHwOffloadFormatsSupportedForBluetoothMedia(android.media.audio.common.AudioDeviceDescription p0) throws android.os.RemoteException;
    public void setSurroundFormatEnabled(android.media.audio.common.AudioFormatDescription p0, boolean p1) throws android.os.RemoteException;
    public void setAssistantServicesUids(int[] p0) throws android.os.RemoteException;
    public void setActiveAssistantServicesUids(int[] p0) throws android.os.RemoteException;
    public void setA11yServicesUids(int[] p0) throws android.os.RemoteException;
    public void setCurrentImeUid(int p0) throws android.os.RemoteException;
    public boolean isHapticPlaybackSupported() throws android.os.RemoteException;
    public boolean isUltrasoundSupported() throws android.os.RemoteException;
    public boolean isHotwordStreamSupported(boolean p0) throws android.os.RemoteException;
    public android.media.AudioProductStrategy[] listAudioProductStrategies() throws android.os.RemoteException;
    public int getProductStrategyFromAudioAttributes(android.media.audio.common.AudioAttributes p0, boolean p1) throws android.os.RemoteException;
    public android.media.AudioVolumeGroup[] listAudioVolumeGroups() throws android.os.RemoteException;
    public int getVolumeGroupFromAudioAttributes(android.media.audio.common.AudioAttributes p0, boolean p1) throws android.os.RemoteException;
    public void setRttEnabled(boolean p0) throws android.os.RemoteException;
    public boolean isCallScreenModeSupported() throws android.os.RemoteException;
    public void setDevicesRoleForStrategy(int p0, int p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException;
    public void removeDevicesRoleForStrategy(int p0, int p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException;
    public void clearDevicesRoleForStrategy(int p0, int p1) throws android.os.RemoteException;
    public android.media.audio.common.AudioDevice[] getDevicesForRoleAndStrategy(int p0, int p1) throws android.os.RemoteException;
    public void setDevicesRoleForCapturePreset(int p0, int p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException;
    public void addDevicesRoleForCapturePreset(int p0, int p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException;
    public void removeDevicesRoleForCapturePreset(int p0, int p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException;
    public void clearDevicesRoleForCapturePreset(int p0, int p1) throws android.os.RemoteException;
    public android.media.audio.common.AudioDevice[] getDevicesForRoleAndCapturePreset(int p0, int p1) throws android.os.RemoteException;
    public boolean registerSoundTriggerCaptureStateListener(android.media.ICaptureStateListener p0) throws android.os.RemoteException;
    public android.media.GetSpatializerResponse getSpatializer(android.media.INativeSpatializerCallback p0) throws android.os.RemoteException;
    public boolean canBeSpatialized(android.media.audio.common.AudioAttributes p0, android.media.audio.common.AudioConfig p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException;
    public int getDirectPlaybackSupport(android.media.audio.common.AudioAttributes p0, android.media.audio.common.AudioConfig p1) throws android.os.RemoteException;
    public android.media.audio.common.AudioProfile[] getDirectProfilesForAttributes(android.media.audio.common.AudioAttributes p0) throws android.os.RemoteException;
    public android.media.AudioMixerAttributesInternal[] getSupportedMixerAttributes(int p0) throws android.os.RemoteException;
    public void setPreferredMixerAttributes(android.media.audio.common.AudioAttributes p0, int p1, int p2, android.media.AudioMixerAttributesInternal p3) throws android.os.RemoteException;
    public android.media.AudioMixerAttributesInternal getPreferredMixerAttributes(android.media.audio.common.AudioAttributes p0, int p1) throws android.os.RemoteException;
    public void clearPreferredMixerAttributes(android.media.audio.common.AudioAttributes p0, int p1, int p2) throws android.os.RemoteException;
    public com.android.media.permission.INativePermissionController getPermissionController() throws android.os.RemoteException;
    public android.media.audio.common.AudioMMapPolicyInfo[] getMmapPolicyInfos(int p0) throws android.os.RemoteException;
    public void getMmapPolicyForDevice(int p0, android.media.audio.common.AudioMMapPolicyInfo p1) throws android.os.RemoteException;
    public void setEnableHardening(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.media.IAudioPolicyService {
        public Default() {}
        public void onNewAudioModulesAvailable() throws android.os.RemoteException {}
        public void setDeviceConnectionState(int p0, android.media.audio.common.AudioPort p1, android.media.audio.common.AudioFormatDescription p2, boolean p3) throws android.os.RemoteException {}
        public int getDeviceConnectionState(android.media.audio.common.AudioDevice p0) throws android.os.RemoteException { return 0; }
        public void handleDeviceConfigChange(android.media.audio.common.AudioDevice p0, java.lang.String p1, android.media.audio.common.AudioFormatDescription p2) throws android.os.RemoteException {}
        public void setPhoneState(int p0, int p1) throws android.os.RemoteException {}
        public void setForceUse(int p0, int p1) throws android.os.RemoteException {}
        public int getForceUse(int p0) throws android.os.RemoteException { return 0; }
        public int getOutput(int p0) throws android.os.RemoteException { return 0; }
        public android.media.GetOutputForAttrResponse getOutputForAttr(android.media.audio.common.AudioAttributes p0, int p1, android.content.AttributionSourceState p2, android.media.audio.common.AudioConfig p3, int p4, int[] p5) throws android.os.RemoteException { return null; }
        public android.media.StartOutputResponse startOutput(int p0) throws android.os.RemoteException { return null; }
        public void stopOutput(int p0) throws android.os.RemoteException {}
        public void releaseOutput(int p0) throws android.os.RemoteException {}
        public android.media.GetInputForAttrResponse getInputForAttr(android.media.audio.common.AudioAttributes p0, int p1, int p2, int p3, android.content.AttributionSourceState p4, android.media.audio.common.AudioConfigBase p5, int p6, int p7) throws android.os.RemoteException { return null; }
        public void startInput(int p0) throws android.os.RemoteException {}
        public void stopInput(int p0) throws android.os.RemoteException {}
        public void releaseInput(int p0) throws android.os.RemoteException {}
        public void setDeviceAbsoluteVolumeEnabled(android.media.audio.common.AudioDevice p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void initStreamVolume(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void setStreamVolumeIndex(int p0, android.media.audio.common.AudioDeviceDescription p1, int p2, boolean p3) throws android.os.RemoteException {}
        public int getStreamVolumeIndex(int p0, android.media.audio.common.AudioDeviceDescription p1) throws android.os.RemoteException { return 0; }
        public void setVolumeIndexForAttributes(android.media.audio.common.AudioAttributes p0, android.media.audio.common.AudioDeviceDescription p1, int p2, boolean p3) throws android.os.RemoteException {}
        public int getVolumeIndexForAttributes(android.media.audio.common.AudioAttributes p0, android.media.audio.common.AudioDeviceDescription p1) throws android.os.RemoteException { return 0; }
        public int getMaxVolumeIndexForAttributes(android.media.audio.common.AudioAttributes p0) throws android.os.RemoteException { return 0; }
        public int getMinVolumeIndexForAttributes(android.media.audio.common.AudioAttributes p0) throws android.os.RemoteException { return 0; }
        public void setVolumeIndexForGroup(int p0, android.media.audio.common.AudioDeviceDescription p1, int p2, boolean p3) throws android.os.RemoteException {}
        public int getVolumeIndexForGroup(int p0, android.media.audio.common.AudioDeviceDescription p1) throws android.os.RemoteException { return 0; }
        public int getMaxVolumeIndexForGroup(int p0) throws android.os.RemoteException { return 0; }
        public int getMinVolumeIndexForGroup(int p0) throws android.os.RemoteException { return 0; }
        public void setMaxVolumeIndexForGroup(int p0, int p1) throws android.os.RemoteException {}
        public void setMinVolumeIndexForGroup(int p0, int p1) throws android.os.RemoteException {}
        public int getStrategyForStream(int p0) throws android.os.RemoteException { return 0; }
        public android.media.audio.common.AudioDevice[] getDevicesForAttributes(android.media.audio.common.AudioAttributes p0, boolean p1) throws android.os.RemoteException { return null; }
        public int getOutputForEffect(android.media.EffectDescriptor p0) throws android.os.RemoteException { return 0; }
        public void registerEffect(android.media.EffectDescriptor p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void unregisterEffect(int p0) throws android.os.RemoteException {}
        public void setEffectEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void moveEffectsToIo(int[] p0, int p1) throws android.os.RemoteException {}
        public boolean isStreamActive(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isStreamActiveRemotely(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isSourceActive(int p0) throws android.os.RemoteException { return false; }
        public android.media.EffectDescriptor[] queryDefaultPreProcessing(int p0, android.media.audio.common.Int p1) throws android.os.RemoteException { return null; }
        public int addSourceDefaultEffect(android.media.audio.common.AudioUuid p0, java.lang.String p1, android.media.audio.common.AudioUuid p2, int p3, int p4) throws android.os.RemoteException { return 0; }
        public int addStreamDefaultEffect(android.media.audio.common.AudioUuid p0, java.lang.String p1, android.media.audio.common.AudioUuid p2, int p3, int p4) throws android.os.RemoteException { return 0; }
        public void removeSourceDefaultEffect(int p0) throws android.os.RemoteException {}
        public void removeStreamDefaultEffect(int p0) throws android.os.RemoteException {}
        public void setSupportedSystemUsages(int[] p0) throws android.os.RemoteException {}
        public void setAllowedCapturePolicy(int p0, int p1) throws android.os.RemoteException {}
        public int getOffloadSupport(android.media.audio.common.AudioOffloadInfo p0) throws android.os.RemoteException { return 0; }
        public boolean isDirectOutputSupported(android.media.audio.common.AudioConfigBase p0, android.media.audio.common.AudioAttributes p1) throws android.os.RemoteException { return false; }
        public int listAudioPorts(int p0, int p1, android.media.audio.common.Int p2, android.media.AudioPortFw[] p3) throws android.os.RemoteException { return 0; }
        public android.media.AudioPortFw[] listDeclaredDevicePorts(int p0) throws android.os.RemoteException { return null; }
        public android.media.AudioPortFw getAudioPort(int p0) throws android.os.RemoteException { return null; }
        public int createAudioPatch(android.media.AudioPatchFw p0, int p1) throws android.os.RemoteException { return 0; }
        public void releaseAudioPatch(int p0) throws android.os.RemoteException {}
        public int listAudioPatches(android.media.audio.common.Int p0, android.media.AudioPatchFw[] p1) throws android.os.RemoteException { return 0; }
        public void setAudioPortConfig(android.media.AudioPortConfigFw p0) throws android.os.RemoteException {}
        public void registerClient(android.media.IAudioPolicyServiceClient p0) throws android.os.RemoteException {}
        public void setAudioPortCallbacksEnabled(boolean p0) throws android.os.RemoteException {}
        public void setAudioVolumeGroupCallbacksEnabled(boolean p0) throws android.os.RemoteException {}
        public android.media.SoundTriggerSession acquireSoundTriggerSession() throws android.os.RemoteException { return null; }
        public void releaseSoundTriggerSession(int p0) throws android.os.RemoteException {}
        public int getPhoneState() throws android.os.RemoteException { return 0; }
        public void registerPolicyMixes(android.media.AudioMix[] p0, boolean p1) throws android.os.RemoteException {}
        public java.util.List<android.media.AudioMix> getRegisteredPolicyMixes() throws android.os.RemoteException { return null; }
        public void updatePolicyMixes(android.media.AudioMixUpdate[] p0) throws android.os.RemoteException {}
        public void setUidDeviceAffinities(int p0, android.media.audio.common.AudioDevice[] p1) throws android.os.RemoteException {}
        public void removeUidDeviceAffinities(int p0) throws android.os.RemoteException {}
        public void setUserIdDeviceAffinities(int p0, android.media.audio.common.AudioDevice[] p1) throws android.os.RemoteException {}
        public void removeUserIdDeviceAffinities(int p0) throws android.os.RemoteException {}
        public int startAudioSource(android.media.AudioPortConfigFw p0, android.media.audio.common.AudioAttributes p1) throws android.os.RemoteException { return 0; }
        public void stopAudioSource(int p0) throws android.os.RemoteException {}
        public void setMasterMono(boolean p0) throws android.os.RemoteException {}
        public boolean getMasterMono() throws android.os.RemoteException { return false; }
        public float getStreamVolumeDB(int p0, int p1, android.media.audio.common.AudioDeviceDescription p2) throws android.os.RemoteException { return 0.0f; }
        public void getSurroundFormats(android.media.audio.common.Int p0, android.media.audio.common.AudioFormatDescription[] p1, boolean[] p2) throws android.os.RemoteException {}
        public void getReportedSurroundFormats(android.media.audio.common.Int p0, android.media.audio.common.AudioFormatDescription[] p1) throws android.os.RemoteException {}
        public android.media.audio.common.AudioFormatDescription[] getHwOffloadFormatsSupportedForBluetoothMedia(android.media.audio.common.AudioDeviceDescription p0) throws android.os.RemoteException { return null; }
        public void setSurroundFormatEnabled(android.media.audio.common.AudioFormatDescription p0, boolean p1) throws android.os.RemoteException {}
        public void setAssistantServicesUids(int[] p0) throws android.os.RemoteException {}
        public void setActiveAssistantServicesUids(int[] p0) throws android.os.RemoteException {}
        public void setA11yServicesUids(int[] p0) throws android.os.RemoteException {}
        public void setCurrentImeUid(int p0) throws android.os.RemoteException {}
        public boolean isHapticPlaybackSupported() throws android.os.RemoteException { return false; }
        public boolean isUltrasoundSupported() throws android.os.RemoteException { return false; }
        public boolean isHotwordStreamSupported(boolean p0) throws android.os.RemoteException { return false; }
        public android.media.AudioProductStrategy[] listAudioProductStrategies() throws android.os.RemoteException { return null; }
        public int getProductStrategyFromAudioAttributes(android.media.audio.common.AudioAttributes p0, boolean p1) throws android.os.RemoteException { return 0; }
        public android.media.AudioVolumeGroup[] listAudioVolumeGroups() throws android.os.RemoteException { return null; }
        public int getVolumeGroupFromAudioAttributes(android.media.audio.common.AudioAttributes p0, boolean p1) throws android.os.RemoteException { return 0; }
        public void setRttEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean isCallScreenModeSupported() throws android.os.RemoteException { return false; }
        public void setDevicesRoleForStrategy(int p0, int p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException {}
        public void removeDevicesRoleForStrategy(int p0, int p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException {}
        public void clearDevicesRoleForStrategy(int p0, int p1) throws android.os.RemoteException {}
        public android.media.audio.common.AudioDevice[] getDevicesForRoleAndStrategy(int p0, int p1) throws android.os.RemoteException { return null; }
        public void setDevicesRoleForCapturePreset(int p0, int p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException {}
        public void addDevicesRoleForCapturePreset(int p0, int p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException {}
        public void removeDevicesRoleForCapturePreset(int p0, int p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException {}
        public void clearDevicesRoleForCapturePreset(int p0, int p1) throws android.os.RemoteException {}
        public android.media.audio.common.AudioDevice[] getDevicesForRoleAndCapturePreset(int p0, int p1) throws android.os.RemoteException { return null; }
        public boolean registerSoundTriggerCaptureStateListener(android.media.ICaptureStateListener p0) throws android.os.RemoteException { return false; }
        public android.media.GetSpatializerResponse getSpatializer(android.media.INativeSpatializerCallback p0) throws android.os.RemoteException { return null; }
        public boolean canBeSpatialized(android.media.audio.common.AudioAttributes p0, android.media.audio.common.AudioConfig p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException { return false; }
        public int getDirectPlaybackSupport(android.media.audio.common.AudioAttributes p0, android.media.audio.common.AudioConfig p1) throws android.os.RemoteException { return 0; }
        public android.media.audio.common.AudioProfile[] getDirectProfilesForAttributes(android.media.audio.common.AudioAttributes p0) throws android.os.RemoteException { return null; }
        public android.media.AudioMixerAttributesInternal[] getSupportedMixerAttributes(int p0) throws android.os.RemoteException { return null; }
        public void setPreferredMixerAttributes(android.media.audio.common.AudioAttributes p0, int p1, int p2, android.media.AudioMixerAttributesInternal p3) throws android.os.RemoteException {}
        public android.media.AudioMixerAttributesInternal getPreferredMixerAttributes(android.media.audio.common.AudioAttributes p0, int p1) throws android.os.RemoteException { return null; }
        public void clearPreferredMixerAttributes(android.media.audio.common.AudioAttributes p0, int p1, int p2) throws android.os.RemoteException {}
        public com.android.media.permission.INativePermissionController getPermissionController() throws android.os.RemoteException { return null; }
        public android.media.audio.common.AudioMMapPolicyInfo[] getMmapPolicyInfos(int p0) throws android.os.RemoteException { return null; }
        public void getMmapPolicyForDevice(int p0, android.media.audio.common.AudioMMapPolicyInfo p1) throws android.os.RemoteException {}
        public void setEnableHardening(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IAudioPolicyService {
        static final int TRANSACTION_onNewAudioModulesAvailable = 1;
        static final int TRANSACTION_setDeviceConnectionState = 2;
        static final int TRANSACTION_getDeviceConnectionState = 3;
        static final int TRANSACTION_handleDeviceConfigChange = 4;
        static final int TRANSACTION_setPhoneState = 5;
        static final int TRANSACTION_setForceUse = 6;
        static final int TRANSACTION_getForceUse = 7;
        static final int TRANSACTION_getOutput = 8;
        static final int TRANSACTION_getOutputForAttr = 9;
        static final int TRANSACTION_startOutput = 10;
        static final int TRANSACTION_stopOutput = 11;
        static final int TRANSACTION_releaseOutput = 12;
        static final int TRANSACTION_getInputForAttr = 13;
        static final int TRANSACTION_startInput = 14;
        static final int TRANSACTION_stopInput = 15;
        static final int TRANSACTION_releaseInput = 16;
        static final int TRANSACTION_setDeviceAbsoluteVolumeEnabled = 17;
        static final int TRANSACTION_initStreamVolume = 18;
        static final int TRANSACTION_setStreamVolumeIndex = 19;
        static final int TRANSACTION_getStreamVolumeIndex = 20;
        static final int TRANSACTION_setVolumeIndexForAttributes = 21;
        static final int TRANSACTION_getVolumeIndexForAttributes = 22;
        static final int TRANSACTION_getMaxVolumeIndexForAttributes = 23;
        static final int TRANSACTION_getMinVolumeIndexForAttributes = 24;
        static final int TRANSACTION_setVolumeIndexForGroup = 25;
        static final int TRANSACTION_getVolumeIndexForGroup = 26;
        static final int TRANSACTION_getMaxVolumeIndexForGroup = 27;
        static final int TRANSACTION_getMinVolumeIndexForGroup = 28;
        static final int TRANSACTION_setMaxVolumeIndexForGroup = 29;
        static final int TRANSACTION_setMinVolumeIndexForGroup = 30;
        static final int TRANSACTION_getStrategyForStream = 31;
        static final int TRANSACTION_getDevicesForAttributes = 32;
        static final int TRANSACTION_getOutputForEffect = 33;
        static final int TRANSACTION_registerEffect = 34;
        static final int TRANSACTION_unregisterEffect = 35;
        static final int TRANSACTION_setEffectEnabled = 36;
        static final int TRANSACTION_moveEffectsToIo = 37;
        static final int TRANSACTION_isStreamActive = 38;
        static final int TRANSACTION_isStreamActiveRemotely = 39;
        static final int TRANSACTION_isSourceActive = 40;
        static final int TRANSACTION_queryDefaultPreProcessing = 41;
        static final int TRANSACTION_addSourceDefaultEffect = 42;
        static final int TRANSACTION_addStreamDefaultEffect = 43;
        static final int TRANSACTION_removeSourceDefaultEffect = 44;
        static final int TRANSACTION_removeStreamDefaultEffect = 45;
        static final int TRANSACTION_setSupportedSystemUsages = 46;
        static final int TRANSACTION_setAllowedCapturePolicy = 47;
        static final int TRANSACTION_getOffloadSupport = 48;
        static final int TRANSACTION_isDirectOutputSupported = 49;
        static final int TRANSACTION_listAudioPorts = 50;
        static final int TRANSACTION_listDeclaredDevicePorts = 51;
        static final int TRANSACTION_getAudioPort = 52;
        static final int TRANSACTION_createAudioPatch = 53;
        static final int TRANSACTION_releaseAudioPatch = 54;
        static final int TRANSACTION_listAudioPatches = 55;
        static final int TRANSACTION_setAudioPortConfig = 56;
        static final int TRANSACTION_registerClient = 57;
        static final int TRANSACTION_setAudioPortCallbacksEnabled = 58;
        static final int TRANSACTION_setAudioVolumeGroupCallbacksEnabled = 59;
        static final int TRANSACTION_acquireSoundTriggerSession = 60;
        static final int TRANSACTION_releaseSoundTriggerSession = 61;
        static final int TRANSACTION_getPhoneState = 62;
        static final int TRANSACTION_registerPolicyMixes = 63;
        static final int TRANSACTION_getRegisteredPolicyMixes = 64;
        static final int TRANSACTION_updatePolicyMixes = 65;
        static final int TRANSACTION_setUidDeviceAffinities = 66;
        static final int TRANSACTION_removeUidDeviceAffinities = 67;
        static final int TRANSACTION_setUserIdDeviceAffinities = 68;
        static final int TRANSACTION_removeUserIdDeviceAffinities = 69;
        static final int TRANSACTION_startAudioSource = 70;
        static final int TRANSACTION_stopAudioSource = 71;
        static final int TRANSACTION_setMasterMono = 72;
        static final int TRANSACTION_getMasterMono = 73;
        static final int TRANSACTION_getStreamVolumeDB = 74;
        static final int TRANSACTION_getSurroundFormats = 75;
        static final int TRANSACTION_getReportedSurroundFormats = 76;
        static final int TRANSACTION_getHwOffloadFormatsSupportedForBluetoothMedia = 77;
        static final int TRANSACTION_setSurroundFormatEnabled = 78;
        static final int TRANSACTION_setAssistantServicesUids = 79;
        static final int TRANSACTION_setActiveAssistantServicesUids = 80;
        static final int TRANSACTION_setA11yServicesUids = 81;
        static final int TRANSACTION_setCurrentImeUid = 82;
        static final int TRANSACTION_isHapticPlaybackSupported = 83;
        static final int TRANSACTION_isUltrasoundSupported = 84;
        static final int TRANSACTION_isHotwordStreamSupported = 85;
        static final int TRANSACTION_listAudioProductStrategies = 86;
        static final int TRANSACTION_getProductStrategyFromAudioAttributes = 87;
        static final int TRANSACTION_listAudioVolumeGroups = 88;
        static final int TRANSACTION_getVolumeGroupFromAudioAttributes = 89;
        static final int TRANSACTION_setRttEnabled = 90;
        static final int TRANSACTION_isCallScreenModeSupported = 91;
        static final int TRANSACTION_setDevicesRoleForStrategy = 92;
        static final int TRANSACTION_removeDevicesRoleForStrategy = 93;
        static final int TRANSACTION_clearDevicesRoleForStrategy = 94;
        static final int TRANSACTION_getDevicesForRoleAndStrategy = 95;
        static final int TRANSACTION_setDevicesRoleForCapturePreset = 96;
        static final int TRANSACTION_addDevicesRoleForCapturePreset = 97;
        static final int TRANSACTION_removeDevicesRoleForCapturePreset = 98;
        static final int TRANSACTION_clearDevicesRoleForCapturePreset = 99;
        static final int TRANSACTION_getDevicesForRoleAndCapturePreset = 100;
        static final int TRANSACTION_registerSoundTriggerCaptureStateListener = 101;
        static final int TRANSACTION_getSpatializer = 102;
        static final int TRANSACTION_canBeSpatialized = 103;
        static final int TRANSACTION_getDirectPlaybackSupport = 104;
        static final int TRANSACTION_getDirectProfilesForAttributes = 105;
        static final int TRANSACTION_getSupportedMixerAttributes = 106;
        static final int TRANSACTION_setPreferredMixerAttributes = 107;
        static final int TRANSACTION_getPreferredMixerAttributes = 108;
        static final int TRANSACTION_clearPreferredMixerAttributes = 109;
        static final int TRANSACTION_getPermissionController = 110;
        static final int TRANSACTION_getMmapPolicyInfos = 111;
        static final int TRANSACTION_getMmapPolicyForDevice = 112;
        static final int TRANSACTION_setEnableHardening = 113;
        public Stub() { super(); }
        public static android.media.IAudioPolicyService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.IAudioPolicyService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onNewAudioModulesAvailable() throws android.os.RemoteException {}
            public void setDeviceConnectionState(int p0, android.media.audio.common.AudioPort p1, android.media.audio.common.AudioFormatDescription p2, boolean p3) throws android.os.RemoteException {}
            public int getDeviceConnectionState(android.media.audio.common.AudioDevice p0) throws android.os.RemoteException { return 0; }
            public void handleDeviceConfigChange(android.media.audio.common.AudioDevice p0, java.lang.String p1, android.media.audio.common.AudioFormatDescription p2) throws android.os.RemoteException {}
            public void setPhoneState(int p0, int p1) throws android.os.RemoteException {}
            public void setForceUse(int p0, int p1) throws android.os.RemoteException {}
            public int getForceUse(int p0) throws android.os.RemoteException { return 0; }
            public int getOutput(int p0) throws android.os.RemoteException { return 0; }
            public android.media.GetOutputForAttrResponse getOutputForAttr(android.media.audio.common.AudioAttributes p0, int p1, android.content.AttributionSourceState p2, android.media.audio.common.AudioConfig p3, int p4, int[] p5) throws android.os.RemoteException { return null; }
            public android.media.StartOutputResponse startOutput(int p0) throws android.os.RemoteException { return null; }
            public void stopOutput(int p0) throws android.os.RemoteException {}
            public void releaseOutput(int p0) throws android.os.RemoteException {}
            public android.media.GetInputForAttrResponse getInputForAttr(android.media.audio.common.AudioAttributes p0, int p1, int p2, int p3, android.content.AttributionSourceState p4, android.media.audio.common.AudioConfigBase p5, int p6, int p7) throws android.os.RemoteException { return null; }
            public void startInput(int p0) throws android.os.RemoteException {}
            public void stopInput(int p0) throws android.os.RemoteException {}
            public void releaseInput(int p0) throws android.os.RemoteException {}
            public void setDeviceAbsoluteVolumeEnabled(android.media.audio.common.AudioDevice p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void initStreamVolume(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void setStreamVolumeIndex(int p0, android.media.audio.common.AudioDeviceDescription p1, int p2, boolean p3) throws android.os.RemoteException {}
            public int getStreamVolumeIndex(int p0, android.media.audio.common.AudioDeviceDescription p1) throws android.os.RemoteException { return 0; }
            public void setVolumeIndexForAttributes(android.media.audio.common.AudioAttributes p0, android.media.audio.common.AudioDeviceDescription p1, int p2, boolean p3) throws android.os.RemoteException {}
            public int getVolumeIndexForAttributes(android.media.audio.common.AudioAttributes p0, android.media.audio.common.AudioDeviceDescription p1) throws android.os.RemoteException { return 0; }
            public int getMaxVolumeIndexForAttributes(android.media.audio.common.AudioAttributes p0) throws android.os.RemoteException { return 0; }
            public int getMinVolumeIndexForAttributes(android.media.audio.common.AudioAttributes p0) throws android.os.RemoteException { return 0; }
            public void setVolumeIndexForGroup(int p0, android.media.audio.common.AudioDeviceDescription p1, int p2, boolean p3) throws android.os.RemoteException {}
            public int getVolumeIndexForGroup(int p0, android.media.audio.common.AudioDeviceDescription p1) throws android.os.RemoteException { return 0; }
            public int getMaxVolumeIndexForGroup(int p0) throws android.os.RemoteException { return 0; }
            public int getMinVolumeIndexForGroup(int p0) throws android.os.RemoteException { return 0; }
            public void setMaxVolumeIndexForGroup(int p0, int p1) throws android.os.RemoteException {}
            public void setMinVolumeIndexForGroup(int p0, int p1) throws android.os.RemoteException {}
            public int getStrategyForStream(int p0) throws android.os.RemoteException { return 0; }
            public android.media.audio.common.AudioDevice[] getDevicesForAttributes(android.media.audio.common.AudioAttributes p0, boolean p1) throws android.os.RemoteException { return null; }
            public int getOutputForEffect(android.media.EffectDescriptor p0) throws android.os.RemoteException { return 0; }
            public void registerEffect(android.media.EffectDescriptor p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void unregisterEffect(int p0) throws android.os.RemoteException {}
            public void setEffectEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void moveEffectsToIo(int[] p0, int p1) throws android.os.RemoteException {}
            public boolean isStreamActive(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isStreamActiveRemotely(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isSourceActive(int p0) throws android.os.RemoteException { return false; }
            public android.media.EffectDescriptor[] queryDefaultPreProcessing(int p0, android.media.audio.common.Int p1) throws android.os.RemoteException { return null; }
            public int addSourceDefaultEffect(android.media.audio.common.AudioUuid p0, java.lang.String p1, android.media.audio.common.AudioUuid p2, int p3, int p4) throws android.os.RemoteException { return 0; }
            public int addStreamDefaultEffect(android.media.audio.common.AudioUuid p0, java.lang.String p1, android.media.audio.common.AudioUuid p2, int p3, int p4) throws android.os.RemoteException { return 0; }
            public void removeSourceDefaultEffect(int p0) throws android.os.RemoteException {}
            public void removeStreamDefaultEffect(int p0) throws android.os.RemoteException {}
            public void setSupportedSystemUsages(int[] p0) throws android.os.RemoteException {}
            public void setAllowedCapturePolicy(int p0, int p1) throws android.os.RemoteException {}
            public int getOffloadSupport(android.media.audio.common.AudioOffloadInfo p0) throws android.os.RemoteException { return 0; }
            public boolean isDirectOutputSupported(android.media.audio.common.AudioConfigBase p0, android.media.audio.common.AudioAttributes p1) throws android.os.RemoteException { return false; }
            public int listAudioPorts(int p0, int p1, android.media.audio.common.Int p2, android.media.AudioPortFw[] p3) throws android.os.RemoteException { return 0; }
            public android.media.AudioPortFw[] listDeclaredDevicePorts(int p0) throws android.os.RemoteException { return null; }
            public android.media.AudioPortFw getAudioPort(int p0) throws android.os.RemoteException { return null; }
            public int createAudioPatch(android.media.AudioPatchFw p0, int p1) throws android.os.RemoteException { return 0; }
            public void releaseAudioPatch(int p0) throws android.os.RemoteException {}
            public int listAudioPatches(android.media.audio.common.Int p0, android.media.AudioPatchFw[] p1) throws android.os.RemoteException { return 0; }
            public void setAudioPortConfig(android.media.AudioPortConfigFw p0) throws android.os.RemoteException {}
            public void registerClient(android.media.IAudioPolicyServiceClient p0) throws android.os.RemoteException {}
            public void setAudioPortCallbacksEnabled(boolean p0) throws android.os.RemoteException {}
            public void setAudioVolumeGroupCallbacksEnabled(boolean p0) throws android.os.RemoteException {}
            public android.media.SoundTriggerSession acquireSoundTriggerSession() throws android.os.RemoteException { return null; }
            public void releaseSoundTriggerSession(int p0) throws android.os.RemoteException {}
            public int getPhoneState() throws android.os.RemoteException { return 0; }
            public void registerPolicyMixes(android.media.AudioMix[] p0, boolean p1) throws android.os.RemoteException {}
            public java.util.List<android.media.AudioMix> getRegisteredPolicyMixes() throws android.os.RemoteException { return null; }
            public void updatePolicyMixes(android.media.AudioMixUpdate[] p0) throws android.os.RemoteException {}
            public void setUidDeviceAffinities(int p0, android.media.audio.common.AudioDevice[] p1) throws android.os.RemoteException {}
            public void removeUidDeviceAffinities(int p0) throws android.os.RemoteException {}
            public void setUserIdDeviceAffinities(int p0, android.media.audio.common.AudioDevice[] p1) throws android.os.RemoteException {}
            public void removeUserIdDeviceAffinities(int p0) throws android.os.RemoteException {}
            public int startAudioSource(android.media.AudioPortConfigFw p0, android.media.audio.common.AudioAttributes p1) throws android.os.RemoteException { return 0; }
            public void stopAudioSource(int p0) throws android.os.RemoteException {}
            public void setMasterMono(boolean p0) throws android.os.RemoteException {}
            public boolean getMasterMono() throws android.os.RemoteException { return false; }
            public float getStreamVolumeDB(int p0, int p1, android.media.audio.common.AudioDeviceDescription p2) throws android.os.RemoteException { return 0.0f; }
            public void getSurroundFormats(android.media.audio.common.Int p0, android.media.audio.common.AudioFormatDescription[] p1, boolean[] p2) throws android.os.RemoteException {}
            public void getReportedSurroundFormats(android.media.audio.common.Int p0, android.media.audio.common.AudioFormatDescription[] p1) throws android.os.RemoteException {}
            public android.media.audio.common.AudioFormatDescription[] getHwOffloadFormatsSupportedForBluetoothMedia(android.media.audio.common.AudioDeviceDescription p0) throws android.os.RemoteException { return null; }
            public void setSurroundFormatEnabled(android.media.audio.common.AudioFormatDescription p0, boolean p1) throws android.os.RemoteException {}
            public void setAssistantServicesUids(int[] p0) throws android.os.RemoteException {}
            public void setActiveAssistantServicesUids(int[] p0) throws android.os.RemoteException {}
            public void setA11yServicesUids(int[] p0) throws android.os.RemoteException {}
            public void setCurrentImeUid(int p0) throws android.os.RemoteException {}
            public boolean isHapticPlaybackSupported() throws android.os.RemoteException { return false; }
            public boolean isUltrasoundSupported() throws android.os.RemoteException { return false; }
            public boolean isHotwordStreamSupported(boolean p0) throws android.os.RemoteException { return false; }
            public android.media.AudioProductStrategy[] listAudioProductStrategies() throws android.os.RemoteException { return null; }
            public int getProductStrategyFromAudioAttributes(android.media.audio.common.AudioAttributes p0, boolean p1) throws android.os.RemoteException { return 0; }
            public android.media.AudioVolumeGroup[] listAudioVolumeGroups() throws android.os.RemoteException { return null; }
            public int getVolumeGroupFromAudioAttributes(android.media.audio.common.AudioAttributes p0, boolean p1) throws android.os.RemoteException { return 0; }
            public void setRttEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean isCallScreenModeSupported() throws android.os.RemoteException { return false; }
            public void setDevicesRoleForStrategy(int p0, int p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException {}
            public void removeDevicesRoleForStrategy(int p0, int p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException {}
            public void clearDevicesRoleForStrategy(int p0, int p1) throws android.os.RemoteException {}
            public android.media.audio.common.AudioDevice[] getDevicesForRoleAndStrategy(int p0, int p1) throws android.os.RemoteException { return null; }
            public void setDevicesRoleForCapturePreset(int p0, int p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException {}
            public void addDevicesRoleForCapturePreset(int p0, int p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException {}
            public void removeDevicesRoleForCapturePreset(int p0, int p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException {}
            public void clearDevicesRoleForCapturePreset(int p0, int p1) throws android.os.RemoteException {}
            public android.media.audio.common.AudioDevice[] getDevicesForRoleAndCapturePreset(int p0, int p1) throws android.os.RemoteException { return null; }
            public boolean registerSoundTriggerCaptureStateListener(android.media.ICaptureStateListener p0) throws android.os.RemoteException { return false; }
            public android.media.GetSpatializerResponse getSpatializer(android.media.INativeSpatializerCallback p0) throws android.os.RemoteException { return null; }
            public boolean canBeSpatialized(android.media.audio.common.AudioAttributes p0, android.media.audio.common.AudioConfig p1, android.media.audio.common.AudioDevice[] p2) throws android.os.RemoteException { return false; }
            public int getDirectPlaybackSupport(android.media.audio.common.AudioAttributes p0, android.media.audio.common.AudioConfig p1) throws android.os.RemoteException { return 0; }
            public android.media.audio.common.AudioProfile[] getDirectProfilesForAttributes(android.media.audio.common.AudioAttributes p0) throws android.os.RemoteException { return null; }
            public android.media.AudioMixerAttributesInternal[] getSupportedMixerAttributes(int p0) throws android.os.RemoteException { return null; }
            public void setPreferredMixerAttributes(android.media.audio.common.AudioAttributes p0, int p1, int p2, android.media.AudioMixerAttributesInternal p3) throws android.os.RemoteException {}
            public android.media.AudioMixerAttributesInternal getPreferredMixerAttributes(android.media.audio.common.AudioAttributes p0, int p1) throws android.os.RemoteException { return null; }
            public void clearPreferredMixerAttributes(android.media.audio.common.AudioAttributes p0, int p1, int p2) throws android.os.RemoteException {}
            public com.android.media.permission.INativePermissionController getPermissionController() throws android.os.RemoteException { return null; }
            public android.media.audio.common.AudioMMapPolicyInfo[] getMmapPolicyInfos(int p0) throws android.os.RemoteException { return null; }
            public void getMmapPolicyForDevice(int p0, android.media.audio.common.AudioMMapPolicyInfo p1) throws android.os.RemoteException {}
            public void setEnableHardening(boolean p0) throws android.os.RemoteException {}
        }
    }
}
