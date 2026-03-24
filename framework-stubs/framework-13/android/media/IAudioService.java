package android.media;

public interface IAudioService extends android.os.IInterface {
    public int trackPlayer(android.media.PlayerBase.PlayerIdCard p0) throws android.os.RemoteException;
    public void playerAttributes(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException;
    public void playerEvent(int p0, int p1, int p2) throws android.os.RemoteException;
    public void releasePlayer(int p0) throws android.os.RemoteException;
    public int trackRecorder(android.os.IBinder p0) throws android.os.RemoteException;
    public void recorderEvent(int p0, int p1) throws android.os.RemoteException;
    public void releaseRecorder(int p0) throws android.os.RemoteException;
    public void playerSessionId(int p0, int p1) throws android.os.RemoteException;
    public void adjustStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void adjustStreamVolumeWithAttribution(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void setStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void setStreamVolumeWithAttribution(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void setDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException;
    public android.media.VolumeInfo getDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException;
    public void handleVolumeKey(android.view.KeyEvent p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean isStreamMute(int p0) throws android.os.RemoteException;
    public void forceRemoteSubmixFullVolume(boolean p0, android.os.IBinder p1) throws android.os.RemoteException;
    public boolean isMasterMute() throws android.os.RemoteException;
    public void setMasterMute(boolean p0, int p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    public int getStreamVolume(int p0) throws android.os.RemoteException;
    public int getStreamMinVolume(int p0) throws android.os.RemoteException;
    public int getStreamMaxVolume(int p0) throws android.os.RemoteException;
    public java.util.List<android.media.audiopolicy.AudioVolumeGroup> getAudioVolumeGroups() throws android.os.RemoteException;
    public void setVolumeGroupVolumeIndex(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public int getVolumeGroupVolumeIndex(int p0) throws android.os.RemoteException;
    public int getVolumeGroupMaxVolumeIndex(int p0) throws android.os.RemoteException;
    public int getVolumeGroupMinVolumeIndex(int p0) throws android.os.RemoteException;
    public int getLastAudibleVolumeGroupVolume(int p0) throws android.os.RemoteException;
    public boolean isVolumeGroupMuted(int p0) throws android.os.RemoteException;
    public void adjustVolumeGroupVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public int getLastAudibleStreamVolume(int p0) throws android.os.RemoteException;
    public void setSupportedSystemUsages(int[] p0) throws android.os.RemoteException;
    public int[] getSupportedSystemUsages() throws android.os.RemoteException;
    public java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategies() throws android.os.RemoteException;
    public boolean isMicrophoneMuted() throws android.os.RemoteException;
    public boolean isUltrasoundSupported() throws android.os.RemoteException;
    public void setMicrophoneMute(boolean p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void setMicrophoneMuteFromSwitch(boolean p0) throws android.os.RemoteException;
    public void setRingerModeExternal(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setRingerModeInternal(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getRingerModeExternal() throws android.os.RemoteException;
    public int getRingerModeInternal() throws android.os.RemoteException;
    public boolean isValidRingerMode(int p0) throws android.os.RemoteException;
    public void setVibrateSetting(int p0, int p1) throws android.os.RemoteException;
    public int getVibrateSetting(int p0) throws android.os.RemoteException;
    public boolean shouldVibrate(int p0) throws android.os.RemoteException;
    public void setMode(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException;
    public int getMode() throws android.os.RemoteException;
    public void playSoundEffect(int p0, int p1) throws android.os.RemoteException;
    public void playSoundEffectVolume(int p0, float p1) throws android.os.RemoteException;
    public boolean loadSoundEffects() throws android.os.RemoteException;
    public void unloadSoundEffects() throws android.os.RemoteException;
    public void reloadAudioSettings() throws android.os.RemoteException;
    public java.util.Map getSurroundFormats() throws android.os.RemoteException;
    public java.util.List getReportedSurroundFormats() throws android.os.RemoteException;
    public boolean setSurroundFormatEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isSurroundFormatEnabled(int p0) throws android.os.RemoteException;
    public boolean setEncodedSurroundMode(int p0) throws android.os.RemoteException;
    public int getEncodedSurroundMode(int p0) throws android.os.RemoteException;
    public void setSpeakerphoneOn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public boolean isSpeakerphoneOn() throws android.os.RemoteException;
    public void setBluetoothScoOn(boolean p0) throws android.os.RemoteException;
    public boolean isBluetoothScoOn() throws android.os.RemoteException;
    public void setBluetoothA2dpOn(boolean p0) throws android.os.RemoteException;
    public boolean isBluetoothA2dpOn() throws android.os.RemoteException;
    public int requestAudioFocus(android.media.AudioAttributes p0, int p1, android.os.IBinder p2, android.media.IAudioFocusDispatcher p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, int p7, android.media.audiopolicy.IAudioPolicyCallback p8, int p9) throws android.os.RemoteException;
    public int abandonAudioFocus(android.media.IAudioFocusDispatcher p0, java.lang.String p1, android.media.AudioAttributes p2, java.lang.String p3) throws android.os.RemoteException;
    public void unregisterAudioFocusClient(java.lang.String p0) throws android.os.RemoteException;
    public int getCurrentAudioFocus() throws android.os.RemoteException;
    public void startBluetoothSco(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void startBluetoothScoVirtualCall(android.os.IBinder p0) throws android.os.RemoteException;
    public void stopBluetoothSco(android.os.IBinder p0) throws android.os.RemoteException;
    public void forceVolumeControlStream(int p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void setRingtonePlayer(android.media.IRingtonePlayer p0) throws android.os.RemoteException;
    public android.media.IRingtonePlayer getRingtonePlayer() throws android.os.RemoteException;
    public int getUiSoundsStreamType() throws android.os.RemoteException;
    public void setWiredDeviceConnectionState(android.media.AudioDeviceAttributes p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.media.AudioRoutesInfo startWatchingRoutes(android.media.IAudioRoutesObserver p0) throws android.os.RemoteException;
    public boolean isCameraSoundForced() throws android.os.RemoteException;
    public void setVolumeController(android.media.IVolumeController p0) throws android.os.RemoteException;
    public void notifyVolumeControllerVisible(android.media.IVolumeController p0, boolean p1) throws android.os.RemoteException;
    public boolean isStreamAffectedByRingerMode(int p0) throws android.os.RemoteException;
    public boolean isStreamAffectedByMute(int p0) throws android.os.RemoteException;
    public void disableSafeMediaVolume(java.lang.String p0) throws android.os.RemoteException;
    public int setHdmiSystemAudioSupported(boolean p0) throws android.os.RemoteException;
    public boolean isHdmiSystemAudioSupported() throws android.os.RemoteException;
    public java.lang.String registerAudioPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1, boolean p2, boolean p3, boolean p4, boolean p5, android.media.projection.IMediaProjection p6) throws android.os.RemoteException;
    public void unregisterAudioPolicyAsync(android.media.audiopolicy.IAudioPolicyCallback p0) throws android.os.RemoteException;
    public void unregisterAudioPolicy(android.media.audiopolicy.IAudioPolicyCallback p0) throws android.os.RemoteException;
    public int addMixForPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException;
    public int removeMixForPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException;
    public int setFocusPropertiesForPolicy(int p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException;
    public void setVolumePolicy(android.media.VolumePolicy p0) throws android.os.RemoteException;
    public boolean hasRegisteredDynamicPolicy() throws android.os.RemoteException;
    public void registerRecordingCallback(android.media.IRecordingConfigDispatcher p0) throws android.os.RemoteException;
    public void unregisterRecordingCallback(android.media.IRecordingConfigDispatcher p0) throws android.os.RemoteException;
    public java.util.List<android.media.AudioRecordingConfiguration> getActiveRecordingConfigurations() throws android.os.RemoteException;
    public void registerPlaybackCallback(android.media.IPlaybackConfigDispatcher p0) throws android.os.RemoteException;
    public void unregisterPlaybackCallback(android.media.IPlaybackConfigDispatcher p0) throws android.os.RemoteException;
    public java.util.List<android.media.AudioPlaybackConfiguration> getActivePlaybackConfigurations() throws android.os.RemoteException;
    public int getFocusRampTimeMs(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException;
    public int dispatchFocusChange(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException;
    public void playerHasOpPlayAudio(int p0, boolean p1) throws android.os.RemoteException;
    public void handleBluetoothActiveDeviceChanged(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothDevice p1, android.media.BluetoothProfileConnectionInfo p2) throws android.os.RemoteException;
    public void setFocusRequestResultFromExtPolicy(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException;
    public void registerAudioServerStateDispatcher(android.media.IAudioServerStateDispatcher p0) throws android.os.RemoteException;
    public void unregisterAudioServerStateDispatcher(android.media.IAudioServerStateDispatcher p0) throws android.os.RemoteException;
    public boolean isAudioServerRunning() throws android.os.RemoteException;
    public int setUidDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1, int[] p2, java.lang.String[] p3) throws android.os.RemoteException;
    public int removeUidDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1) throws android.os.RemoteException;
    public int setUserIdDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1, int[] p2, java.lang.String[] p3) throws android.os.RemoteException;
    public int removeUserIdDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1) throws android.os.RemoteException;
    public boolean hasHapticChannels(android.net.Uri p0) throws android.os.RemoteException;
    public boolean isCallScreeningModeSupported() throws android.os.RemoteException;
    public int setPreferredDevicesForStrategy(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) throws android.os.RemoteException;
    public int removePreferredDevicesForStrategy(int p0) throws android.os.RemoteException;
    public java.util.List<android.media.AudioDeviceAttributes> getPreferredDevicesForStrategy(int p0) throws android.os.RemoteException;
    public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException;
    public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributesUnprotected(android.media.AudioAttributes p0) throws android.os.RemoteException;
    public int setAllowedCapturePolicy(int p0) throws android.os.RemoteException;
    public int getAllowedCapturePolicy() throws android.os.RemoteException;
    public void registerStrategyPreferredDevicesDispatcher(android.media.IStrategyPreferredDevicesDispatcher p0) throws android.os.RemoteException;
    public void unregisterStrategyPreferredDevicesDispatcher(android.media.IStrategyPreferredDevicesDispatcher p0) throws android.os.RemoteException;
    public void setRttEnabled(boolean p0) throws android.os.RemoteException;
    public void setDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int getDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    public void setMultiAudioFocusEnabled(boolean p0) throws android.os.RemoteException;
    public int setPreferredDevicesForCapturePreset(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) throws android.os.RemoteException;
    public int clearPreferredDevicesForCapturePreset(int p0) throws android.os.RemoteException;
    public java.util.List<android.media.AudioDeviceAttributes> getPreferredDevicesForCapturePreset(int p0) throws android.os.RemoteException;
    public void registerCapturePresetDevicesRoleDispatcher(android.media.ICapturePresetDevicesRoleDispatcher p0) throws android.os.RemoteException;
    public void unregisterCapturePresetDevicesRoleDispatcher(android.media.ICapturePresetDevicesRoleDispatcher p0) throws android.os.RemoteException;
    public void adjustStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, android.os.UserHandle p6, int p7) throws android.os.RemoteException;
    public void adjustSuggestedStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, android.os.UserHandle p6, int p7) throws android.os.RemoteException;
    public void setStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, android.os.UserHandle p6, int p7) throws android.os.RemoteException;
    public boolean isMusicActive(boolean p0) throws android.os.RemoteException;
    public int getDeviceMaskForStream(int p0) throws android.os.RemoteException;
    public int[] getAvailableCommunicationDeviceIds() throws android.os.RemoteException;
    public boolean setCommunicationDevice(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public int getCommunicationDevice() throws android.os.RemoteException;
    public void registerCommunicationDeviceDispatcher(android.media.ICommunicationDeviceDispatcher p0) throws android.os.RemoteException;
    public void unregisterCommunicationDeviceDispatcher(android.media.ICommunicationDeviceDispatcher p0) throws android.os.RemoteException;
    public boolean areNavigationRepeatSoundEffectsEnabled() throws android.os.RemoteException;
    public void setNavigationRepeatSoundEffectsEnabled(boolean p0) throws android.os.RemoteException;
    public boolean isHomeSoundEffectEnabled() throws android.os.RemoteException;
    public void setHomeSoundEffectEnabled(boolean p0) throws android.os.RemoteException;
    public boolean setAdditionalOutputDeviceDelay(android.media.AudioDeviceAttributes p0, long p1) throws android.os.RemoteException;
    public long getAdditionalOutputDeviceDelay(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    public long getMaxAdditionalOutputDeviceDelay(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    public int requestAudioFocusForTest(android.media.AudioAttributes p0, int p1, android.os.IBinder p2, android.media.IAudioFocusDispatcher p3, java.lang.String p4, java.lang.String p5, int p6, int p7, int p8) throws android.os.RemoteException;
    public int abandonAudioFocusForTest(android.media.IAudioFocusDispatcher p0, java.lang.String p1, android.media.AudioAttributes p2, java.lang.String p3) throws android.os.RemoteException;
    public long getFadeOutDurationOnFocusLossMillis(android.media.AudioAttributes p0) throws android.os.RemoteException;
    public void registerModeDispatcher(android.media.IAudioModeDispatcher p0) throws android.os.RemoteException;
    public void unregisterModeDispatcher(android.media.IAudioModeDispatcher p0) throws android.os.RemoteException;
    public int getSpatializerImmersiveAudioLevel() throws android.os.RemoteException;
    public boolean isSpatializerEnabled() throws android.os.RemoteException;
    public boolean isSpatializerAvailable() throws android.os.RemoteException;
    public boolean isSpatializerAvailableForDevice(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    public boolean hasHeadTracker(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    public void setHeadTrackerEnabled(boolean p0, android.media.AudioDeviceAttributes p1) throws android.os.RemoteException;
    public boolean isHeadTrackerEnabled(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    public boolean isHeadTrackerAvailable() throws android.os.RemoteException;
    public void registerSpatializerHeadTrackerAvailableCallback(android.media.ISpatializerHeadTrackerAvailableCallback p0, boolean p1) throws android.os.RemoteException;
    public void setSpatializerEnabled(boolean p0) throws android.os.RemoteException;
    public boolean canBeSpatialized(android.media.AudioAttributes p0, android.media.AudioFormat p1) throws android.os.RemoteException;
    public void registerSpatializerCallback(android.media.ISpatializerCallback p0) throws android.os.RemoteException;
    public void unregisterSpatializerCallback(android.media.ISpatializerCallback p0) throws android.os.RemoteException;
    public void registerSpatializerHeadTrackingCallback(android.media.ISpatializerHeadTrackingModeCallback p0) throws android.os.RemoteException;
    public void unregisterSpatializerHeadTrackingCallback(android.media.ISpatializerHeadTrackingModeCallback p0) throws android.os.RemoteException;
    public void registerHeadToSoundstagePoseCallback(android.media.ISpatializerHeadToSoundStagePoseCallback p0) throws android.os.RemoteException;
    public void unregisterHeadToSoundstagePoseCallback(android.media.ISpatializerHeadToSoundStagePoseCallback p0) throws android.os.RemoteException;
    public java.util.List<android.media.AudioDeviceAttributes> getSpatializerCompatibleAudioDevices() throws android.os.RemoteException;
    public void addSpatializerCompatibleAudioDevice(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    public void removeSpatializerCompatibleAudioDevice(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    public void setDesiredHeadTrackingMode(int p0) throws android.os.RemoteException;
    public int getDesiredHeadTrackingMode() throws android.os.RemoteException;
    public int[] getSupportedHeadTrackingModes() throws android.os.RemoteException;
    public int getActualHeadTrackingMode() throws android.os.RemoteException;
    public void setSpatializerGlobalTransform(float[] p0) throws android.os.RemoteException;
    public void recenterHeadTracker() throws android.os.RemoteException;
    public void setSpatializerParameter(int p0, byte[] p1) throws android.os.RemoteException;
    public void getSpatializerParameter(int p0, byte[] p1) throws android.os.RemoteException;
    public int getSpatializerOutput() throws android.os.RemoteException;
    public void registerSpatializerOutputCallback(android.media.ISpatializerOutputCallback p0) throws android.os.RemoteException;
    public void unregisterSpatializerOutputCallback(android.media.ISpatializerOutputCallback p0) throws android.os.RemoteException;
    public boolean isVolumeFixed() throws android.os.RemoteException;
    public android.media.VolumeInfo getDefaultVolumeInfo() throws android.os.RemoteException;
    public boolean isPstnCallAudioInterceptable() throws android.os.RemoteException;
    public void muteAwaitConnection(int[] p0, android.media.AudioDeviceAttributes p1, long p2) throws android.os.RemoteException;
    public void cancelMuteAwaitConnection(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    public android.media.AudioDeviceAttributes getMutingExpectedDevice() throws android.os.RemoteException;
    public void registerMuteAwaitConnectionDispatcher(android.media.IMuteAwaitConnectionCallback p0, boolean p1) throws android.os.RemoteException;
    public void setTestDeviceConnectionState(android.media.AudioDeviceAttributes p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.QUERY_AUDIO_STATE"})
    public void registerDeviceVolumeBehaviorDispatcher(boolean p0, android.media.IDeviceVolumeBehaviorDispatcher p1) throws android.os.RemoteException;
    public java.util.List<android.media.AudioFocusInfo> getFocusStack() throws android.os.RemoteException;
    public boolean sendFocusLoss(android.media.AudioFocusInfo p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void addAssistantServicesUids(int[] p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void removeAssistantServicesUids(int[] p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setActiveAssistantServiceUids(int[] p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int[] getAssistantServicesUids() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int[] getActiveAssistantServiceUids() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void registerDeviceVolumeDispatcherForAbsoluteVolume(boolean p0, android.media.IAudioDeviceVolumeDispatcher p1, java.lang.String p2, android.media.AudioDeviceAttributes p3, java.util.List<android.media.VolumeInfo> p4, boolean p5) throws android.os.RemoteException;
    public java.lang.String getHalVersion() throws android.os.RemoteException;

    public static class Default implements android.media.IAudioService {
        public Default() {}
        public int trackPlayer(android.media.PlayerBase.PlayerIdCard p0) throws android.os.RemoteException { return 0; }
        public void playerAttributes(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException {}
        public void playerEvent(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void releasePlayer(int p0) throws android.os.RemoteException {}
        public int trackRecorder(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public void recorderEvent(int p0, int p1) throws android.os.RemoteException {}
        public void releaseRecorder(int p0) throws android.os.RemoteException {}
        public void playerSessionId(int p0, int p1) throws android.os.RemoteException {}
        public void adjustStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void adjustStreamVolumeWithAttribution(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void setStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setStreamVolumeWithAttribution(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void setDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.media.VolumeInfo getDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void handleVolumeKey(android.view.KeyEvent p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public boolean isStreamMute(int p0) throws android.os.RemoteException { return false; }
        public void forceRemoteSubmixFullVolume(boolean p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public boolean isMasterMute() throws android.os.RemoteException { return false; }
        public void setMasterMute(boolean p0, int p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
        public int getStreamVolume(int p0) throws android.os.RemoteException { return 0; }
        public int getStreamMinVolume(int p0) throws android.os.RemoteException { return 0; }
        public int getStreamMaxVolume(int p0) throws android.os.RemoteException { return 0; }
        public java.util.List<android.media.audiopolicy.AudioVolumeGroup> getAudioVolumeGroups() throws android.os.RemoteException { return null; }
        public void setVolumeGroupVolumeIndex(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public int getVolumeGroupVolumeIndex(int p0) throws android.os.RemoteException { return 0; }
        public int getVolumeGroupMaxVolumeIndex(int p0) throws android.os.RemoteException { return 0; }
        public int getVolumeGroupMinVolumeIndex(int p0) throws android.os.RemoteException { return 0; }
        public int getLastAudibleVolumeGroupVolume(int p0) throws android.os.RemoteException { return 0; }
        public boolean isVolumeGroupMuted(int p0) throws android.os.RemoteException { return false; }
        public void adjustVolumeGroupVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public int getLastAudibleStreamVolume(int p0) throws android.os.RemoteException { return 0; }
        public void setSupportedSystemUsages(int[] p0) throws android.os.RemoteException {}
        public int[] getSupportedSystemUsages() throws android.os.RemoteException { return null; }
        public java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategies() throws android.os.RemoteException { return null; }
        public boolean isMicrophoneMuted() throws android.os.RemoteException { return false; }
        public boolean isUltrasoundSupported() throws android.os.RemoteException { return false; }
        public void setMicrophoneMute(boolean p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setMicrophoneMuteFromSwitch(boolean p0) throws android.os.RemoteException {}
        public void setRingerModeExternal(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setRingerModeInternal(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public int getRingerModeExternal() throws android.os.RemoteException { return 0; }
        public int getRingerModeInternal() throws android.os.RemoteException { return 0; }
        public boolean isValidRingerMode(int p0) throws android.os.RemoteException { return false; }
        public void setVibrateSetting(int p0, int p1) throws android.os.RemoteException {}
        public int getVibrateSetting(int p0) throws android.os.RemoteException { return 0; }
        public boolean shouldVibrate(int p0) throws android.os.RemoteException { return false; }
        public void setMode(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException {}
        public int getMode() throws android.os.RemoteException { return 0; }
        public void playSoundEffect(int p0, int p1) throws android.os.RemoteException {}
        public void playSoundEffectVolume(int p0, float p1) throws android.os.RemoteException {}
        public boolean loadSoundEffects() throws android.os.RemoteException { return false; }
        public void unloadSoundEffects() throws android.os.RemoteException {}
        public void reloadAudioSettings() throws android.os.RemoteException {}
        public java.util.Map getSurroundFormats() throws android.os.RemoteException { return null; }
        public java.util.List getReportedSurroundFormats() throws android.os.RemoteException { return null; }
        public boolean setSurroundFormatEnabled(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean isSurroundFormatEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean setEncodedSurroundMode(int p0) throws android.os.RemoteException { return false; }
        public int getEncodedSurroundMode(int p0) throws android.os.RemoteException { return 0; }
        public void setSpeakerphoneOn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public boolean isSpeakerphoneOn() throws android.os.RemoteException { return false; }
        public void setBluetoothScoOn(boolean p0) throws android.os.RemoteException {}
        public boolean isBluetoothScoOn() throws android.os.RemoteException { return false; }
        public void setBluetoothA2dpOn(boolean p0) throws android.os.RemoteException {}
        public boolean isBluetoothA2dpOn() throws android.os.RemoteException { return false; }
        public int requestAudioFocus(android.media.AudioAttributes p0, int p1, android.os.IBinder p2, android.media.IAudioFocusDispatcher p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, int p7, android.media.audiopolicy.IAudioPolicyCallback p8, int p9) throws android.os.RemoteException { return 0; }
        public int abandonAudioFocus(android.media.IAudioFocusDispatcher p0, java.lang.String p1, android.media.AudioAttributes p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public void unregisterAudioFocusClient(java.lang.String p0) throws android.os.RemoteException {}
        public int getCurrentAudioFocus() throws android.os.RemoteException { return 0; }
        public void startBluetoothSco(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void startBluetoothScoVirtualCall(android.os.IBinder p0) throws android.os.RemoteException {}
        public void stopBluetoothSco(android.os.IBinder p0) throws android.os.RemoteException {}
        public void forceVolumeControlStream(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void setRingtonePlayer(android.media.IRingtonePlayer p0) throws android.os.RemoteException {}
        public android.media.IRingtonePlayer getRingtonePlayer() throws android.os.RemoteException { return null; }
        public int getUiSoundsStreamType() throws android.os.RemoteException { return 0; }
        public void setWiredDeviceConnectionState(android.media.AudioDeviceAttributes p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.media.AudioRoutesInfo startWatchingRoutes(android.media.IAudioRoutesObserver p0) throws android.os.RemoteException { return null; }
        public boolean isCameraSoundForced() throws android.os.RemoteException { return false; }
        public void setVolumeController(android.media.IVolumeController p0) throws android.os.RemoteException {}
        public void notifyVolumeControllerVisible(android.media.IVolumeController p0, boolean p1) throws android.os.RemoteException {}
        public boolean isStreamAffectedByRingerMode(int p0) throws android.os.RemoteException { return false; }
        public boolean isStreamAffectedByMute(int p0) throws android.os.RemoteException { return false; }
        public void disableSafeMediaVolume(java.lang.String p0) throws android.os.RemoteException {}
        public int setHdmiSystemAudioSupported(boolean p0) throws android.os.RemoteException { return 0; }
        public boolean isHdmiSystemAudioSupported() throws android.os.RemoteException { return false; }
        public java.lang.String registerAudioPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1, boolean p2, boolean p3, boolean p4, boolean p5, android.media.projection.IMediaProjection p6) throws android.os.RemoteException { return null; }
        public void unregisterAudioPolicyAsync(android.media.audiopolicy.IAudioPolicyCallback p0) throws android.os.RemoteException {}
        public void unregisterAudioPolicy(android.media.audiopolicy.IAudioPolicyCallback p0) throws android.os.RemoteException {}
        public int addMixForPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return 0; }
        public int removeMixForPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return 0; }
        public int setFocusPropertiesForPolicy(int p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return 0; }
        public void setVolumePolicy(android.media.VolumePolicy p0) throws android.os.RemoteException {}
        public boolean hasRegisteredDynamicPolicy() throws android.os.RemoteException { return false; }
        public void registerRecordingCallback(android.media.IRecordingConfigDispatcher p0) throws android.os.RemoteException {}
        public void unregisterRecordingCallback(android.media.IRecordingConfigDispatcher p0) throws android.os.RemoteException {}
        public java.util.List<android.media.AudioRecordingConfiguration> getActiveRecordingConfigurations() throws android.os.RemoteException { return null; }
        public void registerPlaybackCallback(android.media.IPlaybackConfigDispatcher p0) throws android.os.RemoteException {}
        public void unregisterPlaybackCallback(android.media.IPlaybackConfigDispatcher p0) throws android.os.RemoteException {}
        public java.util.List<android.media.AudioPlaybackConfiguration> getActivePlaybackConfigurations() throws android.os.RemoteException { return null; }
        public int getFocusRampTimeMs(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException { return 0; }
        public int dispatchFocusChange(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException { return 0; }
        public void playerHasOpPlayAudio(int p0, boolean p1) throws android.os.RemoteException {}
        public void handleBluetoothActiveDeviceChanged(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothDevice p1, android.media.BluetoothProfileConnectionInfo p2) throws android.os.RemoteException {}
        public void setFocusRequestResultFromExtPolicy(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException {}
        public void registerAudioServerStateDispatcher(android.media.IAudioServerStateDispatcher p0) throws android.os.RemoteException {}
        public void unregisterAudioServerStateDispatcher(android.media.IAudioServerStateDispatcher p0) throws android.os.RemoteException {}
        public boolean isAudioServerRunning() throws android.os.RemoteException { return false; }
        public int setUidDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1, int[] p2, java.lang.String[] p3) throws android.os.RemoteException { return 0; }
        public int removeUidDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1) throws android.os.RemoteException { return 0; }
        public int setUserIdDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1, int[] p2, java.lang.String[] p3) throws android.os.RemoteException { return 0; }
        public int removeUserIdDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1) throws android.os.RemoteException { return 0; }
        public boolean hasHapticChannels(android.net.Uri p0) throws android.os.RemoteException { return false; }
        public boolean isCallScreeningModeSupported() throws android.os.RemoteException { return false; }
        public int setPreferredDevicesForStrategy(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) throws android.os.RemoteException { return 0; }
        public int removePreferredDevicesForStrategy(int p0) throws android.os.RemoteException { return 0; }
        public java.util.List<android.media.AudioDeviceAttributes> getPreferredDevicesForStrategy(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributesUnprotected(android.media.AudioAttributes p0) throws android.os.RemoteException { return null; }
        public int setAllowedCapturePolicy(int p0) throws android.os.RemoteException { return 0; }
        public int getAllowedCapturePolicy() throws android.os.RemoteException { return 0; }
        public void registerStrategyPreferredDevicesDispatcher(android.media.IStrategyPreferredDevicesDispatcher p0) throws android.os.RemoteException {}
        public void unregisterStrategyPreferredDevicesDispatcher(android.media.IStrategyPreferredDevicesDispatcher p0) throws android.os.RemoteException {}
        public void setRttEnabled(boolean p0) throws android.os.RemoteException {}
        public void setDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public int getDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return 0; }
        public void setMultiAudioFocusEnabled(boolean p0) throws android.os.RemoteException {}
        public int setPreferredDevicesForCapturePreset(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) throws android.os.RemoteException { return 0; }
        public int clearPreferredDevicesForCapturePreset(int p0) throws android.os.RemoteException { return 0; }
        public java.util.List<android.media.AudioDeviceAttributes> getPreferredDevicesForCapturePreset(int p0) throws android.os.RemoteException { return null; }
        public void registerCapturePresetDevicesRoleDispatcher(android.media.ICapturePresetDevicesRoleDispatcher p0) throws android.os.RemoteException {}
        public void unregisterCapturePresetDevicesRoleDispatcher(android.media.ICapturePresetDevicesRoleDispatcher p0) throws android.os.RemoteException {}
        public void adjustStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, android.os.UserHandle p6, int p7) throws android.os.RemoteException {}
        public void adjustSuggestedStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, android.os.UserHandle p6, int p7) throws android.os.RemoteException {}
        public void setStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, android.os.UserHandle p6, int p7) throws android.os.RemoteException {}
        public boolean isMusicActive(boolean p0) throws android.os.RemoteException { return false; }
        public int getDeviceMaskForStream(int p0) throws android.os.RemoteException { return 0; }
        public int[] getAvailableCommunicationDeviceIds() throws android.os.RemoteException { return null; }
        public boolean setCommunicationDevice(android.os.IBinder p0, int p1) throws android.os.RemoteException { return false; }
        public int getCommunicationDevice() throws android.os.RemoteException { return 0; }
        public void registerCommunicationDeviceDispatcher(android.media.ICommunicationDeviceDispatcher p0) throws android.os.RemoteException {}
        public void unregisterCommunicationDeviceDispatcher(android.media.ICommunicationDeviceDispatcher p0) throws android.os.RemoteException {}
        public boolean areNavigationRepeatSoundEffectsEnabled() throws android.os.RemoteException { return false; }
        public void setNavigationRepeatSoundEffectsEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean isHomeSoundEffectEnabled() throws android.os.RemoteException { return false; }
        public void setHomeSoundEffectEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean setAdditionalOutputDeviceDelay(android.media.AudioDeviceAttributes p0, long p1) throws android.os.RemoteException { return false; }
        public long getAdditionalOutputDeviceDelay(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return 0L; }
        public long getMaxAdditionalOutputDeviceDelay(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return 0L; }
        public int requestAudioFocusForTest(android.media.AudioAttributes p0, int p1, android.os.IBinder p2, android.media.IAudioFocusDispatcher p3, java.lang.String p4, java.lang.String p5, int p6, int p7, int p8) throws android.os.RemoteException { return 0; }
        public int abandonAudioFocusForTest(android.media.IAudioFocusDispatcher p0, java.lang.String p1, android.media.AudioAttributes p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public long getFadeOutDurationOnFocusLossMillis(android.media.AudioAttributes p0) throws android.os.RemoteException { return 0L; }
        public void registerModeDispatcher(android.media.IAudioModeDispatcher p0) throws android.os.RemoteException {}
        public void unregisterModeDispatcher(android.media.IAudioModeDispatcher p0) throws android.os.RemoteException {}
        public int getSpatializerImmersiveAudioLevel() throws android.os.RemoteException { return 0; }
        public boolean isSpatializerEnabled() throws android.os.RemoteException { return false; }
        public boolean isSpatializerAvailable() throws android.os.RemoteException { return false; }
        public boolean isSpatializerAvailableForDevice(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return false; }
        public boolean hasHeadTracker(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return false; }
        public void setHeadTrackerEnabled(boolean p0, android.media.AudioDeviceAttributes p1) throws android.os.RemoteException {}
        public boolean isHeadTrackerEnabled(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return false; }
        public boolean isHeadTrackerAvailable() throws android.os.RemoteException { return false; }
        public void registerSpatializerHeadTrackerAvailableCallback(android.media.ISpatializerHeadTrackerAvailableCallback p0, boolean p1) throws android.os.RemoteException {}
        public void setSpatializerEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean canBeSpatialized(android.media.AudioAttributes p0, android.media.AudioFormat p1) throws android.os.RemoteException { return false; }
        public void registerSpatializerCallback(android.media.ISpatializerCallback p0) throws android.os.RemoteException {}
        public void unregisterSpatializerCallback(android.media.ISpatializerCallback p0) throws android.os.RemoteException {}
        public void registerSpatializerHeadTrackingCallback(android.media.ISpatializerHeadTrackingModeCallback p0) throws android.os.RemoteException {}
        public void unregisterSpatializerHeadTrackingCallback(android.media.ISpatializerHeadTrackingModeCallback p0) throws android.os.RemoteException {}
        public void registerHeadToSoundstagePoseCallback(android.media.ISpatializerHeadToSoundStagePoseCallback p0) throws android.os.RemoteException {}
        public void unregisterHeadToSoundstagePoseCallback(android.media.ISpatializerHeadToSoundStagePoseCallback p0) throws android.os.RemoteException {}
        public java.util.List<android.media.AudioDeviceAttributes> getSpatializerCompatibleAudioDevices() throws android.os.RemoteException { return null; }
        public void addSpatializerCompatibleAudioDevice(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException {}
        public void removeSpatializerCompatibleAudioDevice(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException {}
        public void setDesiredHeadTrackingMode(int p0) throws android.os.RemoteException {}
        public int getDesiredHeadTrackingMode() throws android.os.RemoteException { return 0; }
        public int[] getSupportedHeadTrackingModes() throws android.os.RemoteException { return null; }
        public int getActualHeadTrackingMode() throws android.os.RemoteException { return 0; }
        public void setSpatializerGlobalTransform(float[] p0) throws android.os.RemoteException {}
        public void recenterHeadTracker() throws android.os.RemoteException {}
        public void setSpatializerParameter(int p0, byte[] p1) throws android.os.RemoteException {}
        public void getSpatializerParameter(int p0, byte[] p1) throws android.os.RemoteException {}
        public int getSpatializerOutput() throws android.os.RemoteException { return 0; }
        public void registerSpatializerOutputCallback(android.media.ISpatializerOutputCallback p0) throws android.os.RemoteException {}
        public void unregisterSpatializerOutputCallback(android.media.ISpatializerOutputCallback p0) throws android.os.RemoteException {}
        public boolean isVolumeFixed() throws android.os.RemoteException { return false; }
        public android.media.VolumeInfo getDefaultVolumeInfo() throws android.os.RemoteException { return null; }
        public boolean isPstnCallAudioInterceptable() throws android.os.RemoteException { return false; }
        public void muteAwaitConnection(int[] p0, android.media.AudioDeviceAttributes p1, long p2) throws android.os.RemoteException {}
        public void cancelMuteAwaitConnection(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException {}
        public android.media.AudioDeviceAttributes getMutingExpectedDevice() throws android.os.RemoteException { return null; }
        public void registerMuteAwaitConnectionDispatcher(android.media.IMuteAwaitConnectionCallback p0, boolean p1) throws android.os.RemoteException {}
        public void setTestDeviceConnectionState(android.media.AudioDeviceAttributes p0, boolean p1) throws android.os.RemoteException {}
        public void registerDeviceVolumeBehaviorDispatcher(boolean p0, android.media.IDeviceVolumeBehaviorDispatcher p1) throws android.os.RemoteException {}
        public java.util.List<android.media.AudioFocusInfo> getFocusStack() throws android.os.RemoteException { return null; }
        public boolean sendFocusLoss(android.media.AudioFocusInfo p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return false; }
        public void addAssistantServicesUids(int[] p0) throws android.os.RemoteException {}
        public void removeAssistantServicesUids(int[] p0) throws android.os.RemoteException {}
        public void setActiveAssistantServiceUids(int[] p0) throws android.os.RemoteException {}
        public int[] getAssistantServicesUids() throws android.os.RemoteException { return null; }
        public int[] getActiveAssistantServiceUids() throws android.os.RemoteException { return null; }
        public void registerDeviceVolumeDispatcherForAbsoluteVolume(boolean p0, android.media.IAudioDeviceVolumeDispatcher p1, java.lang.String p2, android.media.AudioDeviceAttributes p3, java.util.List<android.media.VolumeInfo> p4, boolean p5) throws android.os.RemoteException {}
        public java.lang.String getHalVersion() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IAudioService {
        public static final java.lang.String DESCRIPTOR = "android.media.IAudioService";
        static final int TRANSACTION_trackPlayer = 1;
        static final int TRANSACTION_playerAttributes = 2;
        static final int TRANSACTION_playerEvent = 3;
        static final int TRANSACTION_releasePlayer = 4;
        static final int TRANSACTION_trackRecorder = 5;
        static final int TRANSACTION_recorderEvent = 6;
        static final int TRANSACTION_releaseRecorder = 7;
        static final int TRANSACTION_playerSessionId = 8;
        static final int TRANSACTION_adjustStreamVolume = 9;
        static final int TRANSACTION_adjustStreamVolumeWithAttribution = 10;
        static final int TRANSACTION_setStreamVolume = 11;
        static final int TRANSACTION_setStreamVolumeWithAttribution = 12;
        static final int TRANSACTION_setDeviceVolume = 13;
        static final int TRANSACTION_getDeviceVolume = 14;
        static final int TRANSACTION_handleVolumeKey = 15;
        static final int TRANSACTION_isStreamMute = 16;
        static final int TRANSACTION_forceRemoteSubmixFullVolume = 17;
        static final int TRANSACTION_isMasterMute = 18;
        static final int TRANSACTION_setMasterMute = 19;
        static final int TRANSACTION_getStreamVolume = 20;
        static final int TRANSACTION_getStreamMinVolume = 21;
        static final int TRANSACTION_getStreamMaxVolume = 22;
        static final int TRANSACTION_getAudioVolumeGroups = 23;
        static final int TRANSACTION_setVolumeGroupVolumeIndex = 24;
        static final int TRANSACTION_getVolumeGroupVolumeIndex = 25;
        static final int TRANSACTION_getVolumeGroupMaxVolumeIndex = 26;
        static final int TRANSACTION_getVolumeGroupMinVolumeIndex = 27;
        static final int TRANSACTION_getLastAudibleVolumeGroupVolume = 28;
        static final int TRANSACTION_isVolumeGroupMuted = 29;
        static final int TRANSACTION_adjustVolumeGroupVolume = 30;
        static final int TRANSACTION_getLastAudibleStreamVolume = 31;
        static final int TRANSACTION_setSupportedSystemUsages = 32;
        static final int TRANSACTION_getSupportedSystemUsages = 33;
        static final int TRANSACTION_getAudioProductStrategies = 34;
        static final int TRANSACTION_isMicrophoneMuted = 35;
        static final int TRANSACTION_isUltrasoundSupported = 36;
        static final int TRANSACTION_setMicrophoneMute = 37;
        static final int TRANSACTION_setMicrophoneMuteFromSwitch = 38;
        static final int TRANSACTION_setRingerModeExternal = 39;
        static final int TRANSACTION_setRingerModeInternal = 40;
        static final int TRANSACTION_getRingerModeExternal = 41;
        static final int TRANSACTION_getRingerModeInternal = 42;
        static final int TRANSACTION_isValidRingerMode = 43;
        static final int TRANSACTION_setVibrateSetting = 44;
        static final int TRANSACTION_getVibrateSetting = 45;
        static final int TRANSACTION_shouldVibrate = 46;
        static final int TRANSACTION_setMode = 47;
        static final int TRANSACTION_getMode = 48;
        static final int TRANSACTION_playSoundEffect = 49;
        static final int TRANSACTION_playSoundEffectVolume = 50;
        static final int TRANSACTION_loadSoundEffects = 51;
        static final int TRANSACTION_unloadSoundEffects = 52;
        static final int TRANSACTION_reloadAudioSettings = 53;
        static final int TRANSACTION_getSurroundFormats = 54;
        static final int TRANSACTION_getReportedSurroundFormats = 55;
        static final int TRANSACTION_setSurroundFormatEnabled = 56;
        static final int TRANSACTION_isSurroundFormatEnabled = 57;
        static final int TRANSACTION_setEncodedSurroundMode = 58;
        static final int TRANSACTION_getEncodedSurroundMode = 59;
        static final int TRANSACTION_setSpeakerphoneOn = 60;
        static final int TRANSACTION_isSpeakerphoneOn = 61;
        static final int TRANSACTION_setBluetoothScoOn = 62;
        static final int TRANSACTION_isBluetoothScoOn = 63;
        static final int TRANSACTION_setBluetoothA2dpOn = 64;
        static final int TRANSACTION_isBluetoothA2dpOn = 65;
        static final int TRANSACTION_requestAudioFocus = 66;
        static final int TRANSACTION_abandonAudioFocus = 67;
        static final int TRANSACTION_unregisterAudioFocusClient = 68;
        static final int TRANSACTION_getCurrentAudioFocus = 69;
        static final int TRANSACTION_startBluetoothSco = 70;
        static final int TRANSACTION_startBluetoothScoVirtualCall = 71;
        static final int TRANSACTION_stopBluetoothSco = 72;
        static final int TRANSACTION_forceVolumeControlStream = 73;
        static final int TRANSACTION_setRingtonePlayer = 74;
        static final int TRANSACTION_getRingtonePlayer = 75;
        static final int TRANSACTION_getUiSoundsStreamType = 76;
        static final int TRANSACTION_setWiredDeviceConnectionState = 77;
        static final int TRANSACTION_startWatchingRoutes = 78;
        static final int TRANSACTION_isCameraSoundForced = 79;
        static final int TRANSACTION_setVolumeController = 80;
        static final int TRANSACTION_notifyVolumeControllerVisible = 81;
        static final int TRANSACTION_isStreamAffectedByRingerMode = 82;
        static final int TRANSACTION_isStreamAffectedByMute = 83;
        static final int TRANSACTION_disableSafeMediaVolume = 84;
        static final int TRANSACTION_setHdmiSystemAudioSupported = 85;
        static final int TRANSACTION_isHdmiSystemAudioSupported = 86;
        static final int TRANSACTION_registerAudioPolicy = 87;
        static final int TRANSACTION_unregisterAudioPolicyAsync = 88;
        static final int TRANSACTION_unregisterAudioPolicy = 89;
        static final int TRANSACTION_addMixForPolicy = 90;
        static final int TRANSACTION_removeMixForPolicy = 91;
        static final int TRANSACTION_setFocusPropertiesForPolicy = 92;
        static final int TRANSACTION_setVolumePolicy = 93;
        static final int TRANSACTION_hasRegisteredDynamicPolicy = 94;
        static final int TRANSACTION_registerRecordingCallback = 95;
        static final int TRANSACTION_unregisterRecordingCallback = 96;
        static final int TRANSACTION_getActiveRecordingConfigurations = 97;
        static final int TRANSACTION_registerPlaybackCallback = 98;
        static final int TRANSACTION_unregisterPlaybackCallback = 99;
        static final int TRANSACTION_getActivePlaybackConfigurations = 100;
        static final int TRANSACTION_getFocusRampTimeMs = 101;
        static final int TRANSACTION_dispatchFocusChange = 102;
        static final int TRANSACTION_playerHasOpPlayAudio = 103;
        static final int TRANSACTION_handleBluetoothActiveDeviceChanged = 104;
        static final int TRANSACTION_setFocusRequestResultFromExtPolicy = 105;
        static final int TRANSACTION_registerAudioServerStateDispatcher = 106;
        static final int TRANSACTION_unregisterAudioServerStateDispatcher = 107;
        static final int TRANSACTION_isAudioServerRunning = 108;
        static final int TRANSACTION_setUidDeviceAffinity = 109;
        static final int TRANSACTION_removeUidDeviceAffinity = 110;
        static final int TRANSACTION_setUserIdDeviceAffinity = 111;
        static final int TRANSACTION_removeUserIdDeviceAffinity = 112;
        static final int TRANSACTION_hasHapticChannels = 113;
        static final int TRANSACTION_isCallScreeningModeSupported = 114;
        static final int TRANSACTION_setPreferredDevicesForStrategy = 115;
        static final int TRANSACTION_removePreferredDevicesForStrategy = 116;
        static final int TRANSACTION_getPreferredDevicesForStrategy = 117;
        static final int TRANSACTION_getDevicesForAttributes = 118;
        static final int TRANSACTION_getDevicesForAttributesUnprotected = 119;
        static final int TRANSACTION_setAllowedCapturePolicy = 120;
        static final int TRANSACTION_getAllowedCapturePolicy = 121;
        static final int TRANSACTION_registerStrategyPreferredDevicesDispatcher = 122;
        static final int TRANSACTION_unregisterStrategyPreferredDevicesDispatcher = 123;
        static final int TRANSACTION_setRttEnabled = 124;
        static final int TRANSACTION_setDeviceVolumeBehavior = 125;
        static final int TRANSACTION_getDeviceVolumeBehavior = 126;
        static final int TRANSACTION_setMultiAudioFocusEnabled = 127;
        static final int TRANSACTION_setPreferredDevicesForCapturePreset = 128;
        static final int TRANSACTION_clearPreferredDevicesForCapturePreset = 129;
        static final int TRANSACTION_getPreferredDevicesForCapturePreset = 130;
        static final int TRANSACTION_registerCapturePresetDevicesRoleDispatcher = 131;
        static final int TRANSACTION_unregisterCapturePresetDevicesRoleDispatcher = 132;
        static final int TRANSACTION_adjustStreamVolumeForUid = 133;
        static final int TRANSACTION_adjustSuggestedStreamVolumeForUid = 134;
        static final int TRANSACTION_setStreamVolumeForUid = 135;
        static final int TRANSACTION_isMusicActive = 136;
        static final int TRANSACTION_getDeviceMaskForStream = 137;
        static final int TRANSACTION_getAvailableCommunicationDeviceIds = 138;
        static final int TRANSACTION_setCommunicationDevice = 139;
        static final int TRANSACTION_getCommunicationDevice = 140;
        static final int TRANSACTION_registerCommunicationDeviceDispatcher = 141;
        static final int TRANSACTION_unregisterCommunicationDeviceDispatcher = 142;
        static final int TRANSACTION_areNavigationRepeatSoundEffectsEnabled = 143;
        static final int TRANSACTION_setNavigationRepeatSoundEffectsEnabled = 144;
        static final int TRANSACTION_isHomeSoundEffectEnabled = 145;
        static final int TRANSACTION_setHomeSoundEffectEnabled = 146;
        static final int TRANSACTION_setAdditionalOutputDeviceDelay = 147;
        static final int TRANSACTION_getAdditionalOutputDeviceDelay = 148;
        static final int TRANSACTION_getMaxAdditionalOutputDeviceDelay = 149;
        static final int TRANSACTION_requestAudioFocusForTest = 150;
        static final int TRANSACTION_abandonAudioFocusForTest = 151;
        static final int TRANSACTION_getFadeOutDurationOnFocusLossMillis = 152;
        static final int TRANSACTION_registerModeDispatcher = 153;
        static final int TRANSACTION_unregisterModeDispatcher = 154;
        static final int TRANSACTION_getSpatializerImmersiveAudioLevel = 155;
        static final int TRANSACTION_isSpatializerEnabled = 156;
        static final int TRANSACTION_isSpatializerAvailable = 157;
        static final int TRANSACTION_isSpatializerAvailableForDevice = 158;
        static final int TRANSACTION_hasHeadTracker = 159;
        static final int TRANSACTION_setHeadTrackerEnabled = 160;
        static final int TRANSACTION_isHeadTrackerEnabled = 161;
        static final int TRANSACTION_isHeadTrackerAvailable = 162;
        static final int TRANSACTION_registerSpatializerHeadTrackerAvailableCallback = 163;
        static final int TRANSACTION_setSpatializerEnabled = 164;
        static final int TRANSACTION_canBeSpatialized = 165;
        static final int TRANSACTION_registerSpatializerCallback = 166;
        static final int TRANSACTION_unregisterSpatializerCallback = 167;
        static final int TRANSACTION_registerSpatializerHeadTrackingCallback = 168;
        static final int TRANSACTION_unregisterSpatializerHeadTrackingCallback = 169;
        static final int TRANSACTION_registerHeadToSoundstagePoseCallback = 170;
        static final int TRANSACTION_unregisterHeadToSoundstagePoseCallback = 171;
        static final int TRANSACTION_getSpatializerCompatibleAudioDevices = 172;
        static final int TRANSACTION_addSpatializerCompatibleAudioDevice = 173;
        static final int TRANSACTION_removeSpatializerCompatibleAudioDevice = 174;
        static final int TRANSACTION_setDesiredHeadTrackingMode = 175;
        static final int TRANSACTION_getDesiredHeadTrackingMode = 176;
        static final int TRANSACTION_getSupportedHeadTrackingModes = 177;
        static final int TRANSACTION_getActualHeadTrackingMode = 178;
        static final int TRANSACTION_setSpatializerGlobalTransform = 179;
        static final int TRANSACTION_recenterHeadTracker = 180;
        static final int TRANSACTION_setSpatializerParameter = 181;
        static final int TRANSACTION_getSpatializerParameter = 182;
        static final int TRANSACTION_getSpatializerOutput = 183;
        static final int TRANSACTION_registerSpatializerOutputCallback = 184;
        static final int TRANSACTION_unregisterSpatializerOutputCallback = 185;
        static final int TRANSACTION_isVolumeFixed = 186;
        static final int TRANSACTION_getDefaultVolumeInfo = 187;
        static final int TRANSACTION_isPstnCallAudioInterceptable = 188;
        static final int TRANSACTION_muteAwaitConnection = 189;
        static final int TRANSACTION_cancelMuteAwaitConnection = 190;
        static final int TRANSACTION_getMutingExpectedDevice = 191;
        static final int TRANSACTION_registerMuteAwaitConnectionDispatcher = 192;
        static final int TRANSACTION_setTestDeviceConnectionState = 193;
        static final int TRANSACTION_registerDeviceVolumeBehaviorDispatcher = 194;
        static final int TRANSACTION_getFocusStack = 195;
        static final int TRANSACTION_sendFocusLoss = 196;
        static final int TRANSACTION_addAssistantServicesUids = 197;
        static final int TRANSACTION_removeAssistantServicesUids = 198;
        static final int TRANSACTION_setActiveAssistantServiceUids = 199;
        static final int TRANSACTION_getAssistantServicesUids = 200;
        static final int TRANSACTION_getActiveAssistantServiceUids = 201;
        static final int TRANSACTION_registerDeviceVolumeDispatcherForAbsoluteVolume = 202;
        static final int TRANSACTION_getHalVersion = 203;
        public Stub() { super(); }
        public static android.media.IAudioService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.IAudioService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int trackPlayer(android.media.PlayerBase.PlayerIdCard p0) throws android.os.RemoteException { return 0; }
            public void playerAttributes(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException {}
            public void playerEvent(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void releasePlayer(int p0) throws android.os.RemoteException {}
            public int trackRecorder(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public void recorderEvent(int p0, int p1) throws android.os.RemoteException {}
            public void releaseRecorder(int p0) throws android.os.RemoteException {}
            public void playerSessionId(int p0, int p1) throws android.os.RemoteException {}
            public void adjustStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void adjustStreamVolumeWithAttribution(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void setStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void setStreamVolumeWithAttribution(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void setDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException {}
            public android.media.VolumeInfo getDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void handleVolumeKey(android.view.KeyEvent p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public boolean isStreamMute(int p0) throws android.os.RemoteException { return false; }
            public void forceRemoteSubmixFullVolume(boolean p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public boolean isMasterMute() throws android.os.RemoteException { return false; }
            public void setMasterMute(boolean p0, int p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
            public int getStreamVolume(int p0) throws android.os.RemoteException { return 0; }
            public int getStreamMinVolume(int p0) throws android.os.RemoteException { return 0; }
            public int getStreamMaxVolume(int p0) throws android.os.RemoteException { return 0; }
            public java.util.List<android.media.audiopolicy.AudioVolumeGroup> getAudioVolumeGroups() throws android.os.RemoteException { return null; }
            public void setVolumeGroupVolumeIndex(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public int getVolumeGroupVolumeIndex(int p0) throws android.os.RemoteException { return 0; }
            public int getVolumeGroupMaxVolumeIndex(int p0) throws android.os.RemoteException { return 0; }
            public int getVolumeGroupMinVolumeIndex(int p0) throws android.os.RemoteException { return 0; }
            public int getLastAudibleVolumeGroupVolume(int p0) throws android.os.RemoteException { return 0; }
            public boolean isVolumeGroupMuted(int p0) throws android.os.RemoteException { return false; }
            public void adjustVolumeGroupVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public int getLastAudibleStreamVolume(int p0) throws android.os.RemoteException { return 0; }
            public void setSupportedSystemUsages(int[] p0) throws android.os.RemoteException {}
            public int[] getSupportedSystemUsages() throws android.os.RemoteException { return null; }
            public java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategies() throws android.os.RemoteException { return null; }
            public boolean isMicrophoneMuted() throws android.os.RemoteException { return false; }
            public boolean isUltrasoundSupported() throws android.os.RemoteException { return false; }
            public void setMicrophoneMute(boolean p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void setMicrophoneMuteFromSwitch(boolean p0) throws android.os.RemoteException {}
            public void setRingerModeExternal(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setRingerModeInternal(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public int getRingerModeExternal() throws android.os.RemoteException { return 0; }
            public int getRingerModeInternal() throws android.os.RemoteException { return 0; }
            public boolean isValidRingerMode(int p0) throws android.os.RemoteException { return false; }
            public void setVibrateSetting(int p0, int p1) throws android.os.RemoteException {}
            public int getVibrateSetting(int p0) throws android.os.RemoteException { return 0; }
            public boolean shouldVibrate(int p0) throws android.os.RemoteException { return false; }
            public void setMode(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException {}
            public int getMode() throws android.os.RemoteException { return 0; }
            public void playSoundEffect(int p0, int p1) throws android.os.RemoteException {}
            public void playSoundEffectVolume(int p0, float p1) throws android.os.RemoteException {}
            public boolean loadSoundEffects() throws android.os.RemoteException { return false; }
            public void unloadSoundEffects() throws android.os.RemoteException {}
            public void reloadAudioSettings() throws android.os.RemoteException {}
            public java.util.Map getSurroundFormats() throws android.os.RemoteException { return null; }
            public java.util.List getReportedSurroundFormats() throws android.os.RemoteException { return null; }
            public boolean setSurroundFormatEnabled(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean isSurroundFormatEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean setEncodedSurroundMode(int p0) throws android.os.RemoteException { return false; }
            public int getEncodedSurroundMode(int p0) throws android.os.RemoteException { return 0; }
            public void setSpeakerphoneOn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public boolean isSpeakerphoneOn() throws android.os.RemoteException { return false; }
            public void setBluetoothScoOn(boolean p0) throws android.os.RemoteException {}
            public boolean isBluetoothScoOn() throws android.os.RemoteException { return false; }
            public void setBluetoothA2dpOn(boolean p0) throws android.os.RemoteException {}
            public boolean isBluetoothA2dpOn() throws android.os.RemoteException { return false; }
            public int requestAudioFocus(android.media.AudioAttributes p0, int p1, android.os.IBinder p2, android.media.IAudioFocusDispatcher p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, int p7, android.media.audiopolicy.IAudioPolicyCallback p8, int p9) throws android.os.RemoteException { return 0; }
            public int abandonAudioFocus(android.media.IAudioFocusDispatcher p0, java.lang.String p1, android.media.AudioAttributes p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public void unregisterAudioFocusClient(java.lang.String p0) throws android.os.RemoteException {}
            public int getCurrentAudioFocus() throws android.os.RemoteException { return 0; }
            public void startBluetoothSco(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void startBluetoothScoVirtualCall(android.os.IBinder p0) throws android.os.RemoteException {}
            public void stopBluetoothSco(android.os.IBinder p0) throws android.os.RemoteException {}
            public void forceVolumeControlStream(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void setRingtonePlayer(android.media.IRingtonePlayer p0) throws android.os.RemoteException {}
            public android.media.IRingtonePlayer getRingtonePlayer() throws android.os.RemoteException { return null; }
            public int getUiSoundsStreamType() throws android.os.RemoteException { return 0; }
            public void setWiredDeviceConnectionState(android.media.AudioDeviceAttributes p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public android.media.AudioRoutesInfo startWatchingRoutes(android.media.IAudioRoutesObserver p0) throws android.os.RemoteException { return null; }
            public boolean isCameraSoundForced() throws android.os.RemoteException { return false; }
            public void setVolumeController(android.media.IVolumeController p0) throws android.os.RemoteException {}
            public void notifyVolumeControllerVisible(android.media.IVolumeController p0, boolean p1) throws android.os.RemoteException {}
            public boolean isStreamAffectedByRingerMode(int p0) throws android.os.RemoteException { return false; }
            public boolean isStreamAffectedByMute(int p0) throws android.os.RemoteException { return false; }
            public void disableSafeMediaVolume(java.lang.String p0) throws android.os.RemoteException {}
            public int setHdmiSystemAudioSupported(boolean p0) throws android.os.RemoteException { return 0; }
            public boolean isHdmiSystemAudioSupported() throws android.os.RemoteException { return false; }
            public java.lang.String registerAudioPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1, boolean p2, boolean p3, boolean p4, boolean p5, android.media.projection.IMediaProjection p6) throws android.os.RemoteException { return null; }
            public void unregisterAudioPolicyAsync(android.media.audiopolicy.IAudioPolicyCallback p0) throws android.os.RemoteException {}
            public void unregisterAudioPolicy(android.media.audiopolicy.IAudioPolicyCallback p0) throws android.os.RemoteException {}
            public int addMixForPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return 0; }
            public int removeMixForPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return 0; }
            public int setFocusPropertiesForPolicy(int p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return 0; }
            public void setVolumePolicy(android.media.VolumePolicy p0) throws android.os.RemoteException {}
            public boolean hasRegisteredDynamicPolicy() throws android.os.RemoteException { return false; }
            public void registerRecordingCallback(android.media.IRecordingConfigDispatcher p0) throws android.os.RemoteException {}
            public void unregisterRecordingCallback(android.media.IRecordingConfigDispatcher p0) throws android.os.RemoteException {}
            public java.util.List<android.media.AudioRecordingConfiguration> getActiveRecordingConfigurations() throws android.os.RemoteException { return null; }
            public void registerPlaybackCallback(android.media.IPlaybackConfigDispatcher p0) throws android.os.RemoteException {}
            public void unregisterPlaybackCallback(android.media.IPlaybackConfigDispatcher p0) throws android.os.RemoteException {}
            public java.util.List<android.media.AudioPlaybackConfiguration> getActivePlaybackConfigurations() throws android.os.RemoteException { return null; }
            public int getFocusRampTimeMs(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException { return 0; }
            public int dispatchFocusChange(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException { return 0; }
            public void playerHasOpPlayAudio(int p0, boolean p1) throws android.os.RemoteException {}
            public void handleBluetoothActiveDeviceChanged(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothDevice p1, android.media.BluetoothProfileConnectionInfo p2) throws android.os.RemoteException {}
            public void setFocusRequestResultFromExtPolicy(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException {}
            public void registerAudioServerStateDispatcher(android.media.IAudioServerStateDispatcher p0) throws android.os.RemoteException {}
            public void unregisterAudioServerStateDispatcher(android.media.IAudioServerStateDispatcher p0) throws android.os.RemoteException {}
            public boolean isAudioServerRunning() throws android.os.RemoteException { return false; }
            public int setUidDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1, int[] p2, java.lang.String[] p3) throws android.os.RemoteException { return 0; }
            public int removeUidDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1) throws android.os.RemoteException { return 0; }
            public int setUserIdDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1, int[] p2, java.lang.String[] p3) throws android.os.RemoteException { return 0; }
            public int removeUserIdDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1) throws android.os.RemoteException { return 0; }
            public boolean hasHapticChannels(android.net.Uri p0) throws android.os.RemoteException { return false; }
            public boolean isCallScreeningModeSupported() throws android.os.RemoteException { return false; }
            public int setPreferredDevicesForStrategy(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) throws android.os.RemoteException { return 0; }
            public int removePreferredDevicesForStrategy(int p0) throws android.os.RemoteException { return 0; }
            public java.util.List<android.media.AudioDeviceAttributes> getPreferredDevicesForStrategy(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributesUnprotected(android.media.AudioAttributes p0) throws android.os.RemoteException { return null; }
            public int setAllowedCapturePolicy(int p0) throws android.os.RemoteException { return 0; }
            public int getAllowedCapturePolicy() throws android.os.RemoteException { return 0; }
            public void registerStrategyPreferredDevicesDispatcher(android.media.IStrategyPreferredDevicesDispatcher p0) throws android.os.RemoteException {}
            public void unregisterStrategyPreferredDevicesDispatcher(android.media.IStrategyPreferredDevicesDispatcher p0) throws android.os.RemoteException {}
            public void setRttEnabled(boolean p0) throws android.os.RemoteException {}
            public void setDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public int getDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return 0; }
            public void setMultiAudioFocusEnabled(boolean p0) throws android.os.RemoteException {}
            public int setPreferredDevicesForCapturePreset(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) throws android.os.RemoteException { return 0; }
            public int clearPreferredDevicesForCapturePreset(int p0) throws android.os.RemoteException { return 0; }
            public java.util.List<android.media.AudioDeviceAttributes> getPreferredDevicesForCapturePreset(int p0) throws android.os.RemoteException { return null; }
            public void registerCapturePresetDevicesRoleDispatcher(android.media.ICapturePresetDevicesRoleDispatcher p0) throws android.os.RemoteException {}
            public void unregisterCapturePresetDevicesRoleDispatcher(android.media.ICapturePresetDevicesRoleDispatcher p0) throws android.os.RemoteException {}
            public void adjustStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, android.os.UserHandle p6, int p7) throws android.os.RemoteException {}
            public void adjustSuggestedStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, android.os.UserHandle p6, int p7) throws android.os.RemoteException {}
            public void setStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, android.os.UserHandle p6, int p7) throws android.os.RemoteException {}
            public boolean isMusicActive(boolean p0) throws android.os.RemoteException { return false; }
            public int getDeviceMaskForStream(int p0) throws android.os.RemoteException { return 0; }
            public int[] getAvailableCommunicationDeviceIds() throws android.os.RemoteException { return null; }
            public boolean setCommunicationDevice(android.os.IBinder p0, int p1) throws android.os.RemoteException { return false; }
            public int getCommunicationDevice() throws android.os.RemoteException { return 0; }
            public void registerCommunicationDeviceDispatcher(android.media.ICommunicationDeviceDispatcher p0) throws android.os.RemoteException {}
            public void unregisterCommunicationDeviceDispatcher(android.media.ICommunicationDeviceDispatcher p0) throws android.os.RemoteException {}
            public boolean areNavigationRepeatSoundEffectsEnabled() throws android.os.RemoteException { return false; }
            public void setNavigationRepeatSoundEffectsEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean isHomeSoundEffectEnabled() throws android.os.RemoteException { return false; }
            public void setHomeSoundEffectEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean setAdditionalOutputDeviceDelay(android.media.AudioDeviceAttributes p0, long p1) throws android.os.RemoteException { return false; }
            public long getAdditionalOutputDeviceDelay(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return 0L; }
            public long getMaxAdditionalOutputDeviceDelay(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return 0L; }
            public int requestAudioFocusForTest(android.media.AudioAttributes p0, int p1, android.os.IBinder p2, android.media.IAudioFocusDispatcher p3, java.lang.String p4, java.lang.String p5, int p6, int p7, int p8) throws android.os.RemoteException { return 0; }
            public int abandonAudioFocusForTest(android.media.IAudioFocusDispatcher p0, java.lang.String p1, android.media.AudioAttributes p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public long getFadeOutDurationOnFocusLossMillis(android.media.AudioAttributes p0) throws android.os.RemoteException { return 0L; }
            public void registerModeDispatcher(android.media.IAudioModeDispatcher p0) throws android.os.RemoteException {}
            public void unregisterModeDispatcher(android.media.IAudioModeDispatcher p0) throws android.os.RemoteException {}
            public int getSpatializerImmersiveAudioLevel() throws android.os.RemoteException { return 0; }
            public boolean isSpatializerEnabled() throws android.os.RemoteException { return false; }
            public boolean isSpatializerAvailable() throws android.os.RemoteException { return false; }
            public boolean isSpatializerAvailableForDevice(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return false; }
            public boolean hasHeadTracker(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return false; }
            public void setHeadTrackerEnabled(boolean p0, android.media.AudioDeviceAttributes p1) throws android.os.RemoteException {}
            public boolean isHeadTrackerEnabled(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return false; }
            public boolean isHeadTrackerAvailable() throws android.os.RemoteException { return false; }
            public void registerSpatializerHeadTrackerAvailableCallback(android.media.ISpatializerHeadTrackerAvailableCallback p0, boolean p1) throws android.os.RemoteException {}
            public void setSpatializerEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean canBeSpatialized(android.media.AudioAttributes p0, android.media.AudioFormat p1) throws android.os.RemoteException { return false; }
            public void registerSpatializerCallback(android.media.ISpatializerCallback p0) throws android.os.RemoteException {}
            public void unregisterSpatializerCallback(android.media.ISpatializerCallback p0) throws android.os.RemoteException {}
            public void registerSpatializerHeadTrackingCallback(android.media.ISpatializerHeadTrackingModeCallback p0) throws android.os.RemoteException {}
            public void unregisterSpatializerHeadTrackingCallback(android.media.ISpatializerHeadTrackingModeCallback p0) throws android.os.RemoteException {}
            public void registerHeadToSoundstagePoseCallback(android.media.ISpatializerHeadToSoundStagePoseCallback p0) throws android.os.RemoteException {}
            public void unregisterHeadToSoundstagePoseCallback(android.media.ISpatializerHeadToSoundStagePoseCallback p0) throws android.os.RemoteException {}
            public java.util.List<android.media.AudioDeviceAttributes> getSpatializerCompatibleAudioDevices() throws android.os.RemoteException { return null; }
            public void addSpatializerCompatibleAudioDevice(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException {}
            public void removeSpatializerCompatibleAudioDevice(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException {}
            public void setDesiredHeadTrackingMode(int p0) throws android.os.RemoteException {}
            public int getDesiredHeadTrackingMode() throws android.os.RemoteException { return 0; }
            public int[] getSupportedHeadTrackingModes() throws android.os.RemoteException { return null; }
            public int getActualHeadTrackingMode() throws android.os.RemoteException { return 0; }
            public void setSpatializerGlobalTransform(float[] p0) throws android.os.RemoteException {}
            public void recenterHeadTracker() throws android.os.RemoteException {}
            public void setSpatializerParameter(int p0, byte[] p1) throws android.os.RemoteException {}
            public void getSpatializerParameter(int p0, byte[] p1) throws android.os.RemoteException {}
            public int getSpatializerOutput() throws android.os.RemoteException { return 0; }
            public void registerSpatializerOutputCallback(android.media.ISpatializerOutputCallback p0) throws android.os.RemoteException {}
            public void unregisterSpatializerOutputCallback(android.media.ISpatializerOutputCallback p0) throws android.os.RemoteException {}
            public boolean isVolumeFixed() throws android.os.RemoteException { return false; }
            public android.media.VolumeInfo getDefaultVolumeInfo() throws android.os.RemoteException { return null; }
            public boolean isPstnCallAudioInterceptable() throws android.os.RemoteException { return false; }
            public void muteAwaitConnection(int[] p0, android.media.AudioDeviceAttributes p1, long p2) throws android.os.RemoteException {}
            public void cancelMuteAwaitConnection(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException {}
            public android.media.AudioDeviceAttributes getMutingExpectedDevice() throws android.os.RemoteException { return null; }
            public void registerMuteAwaitConnectionDispatcher(android.media.IMuteAwaitConnectionCallback p0, boolean p1) throws android.os.RemoteException {}
            public void setTestDeviceConnectionState(android.media.AudioDeviceAttributes p0, boolean p1) throws android.os.RemoteException {}
            public void registerDeviceVolumeBehaviorDispatcher(boolean p0, android.media.IDeviceVolumeBehaviorDispatcher p1) throws android.os.RemoteException {}
            public java.util.List<android.media.AudioFocusInfo> getFocusStack() throws android.os.RemoteException { return null; }
            public boolean sendFocusLoss(android.media.AudioFocusInfo p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return false; }
            public void addAssistantServicesUids(int[] p0) throws android.os.RemoteException {}
            public void removeAssistantServicesUids(int[] p0) throws android.os.RemoteException {}
            public void setActiveAssistantServiceUids(int[] p0) throws android.os.RemoteException {}
            public int[] getAssistantServicesUids() throws android.os.RemoteException { return null; }
            public int[] getActiveAssistantServiceUids() throws android.os.RemoteException { return null; }
            public void registerDeviceVolumeDispatcherForAbsoluteVolume(boolean p0, android.media.IAudioDeviceVolumeDispatcher p1, java.lang.String p2, android.media.AudioDeviceAttributes p3, java.util.List<android.media.VolumeInfo> p4, boolean p5) throws android.os.RemoteException {}
            public java.lang.String getHalVersion() throws android.os.RemoteException { return null; }
        }
    }
}
