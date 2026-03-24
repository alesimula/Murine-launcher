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
    public void adjustSuggestedStreamVolume(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void adjustStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void setStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void handleVolumeKey(android.view.KeyEvent p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean isStreamMute(int p0) throws android.os.RemoteException;
    public void forceRemoteSubmixFullVolume(boolean p0, android.os.IBinder p1) throws android.os.RemoteException;
    public boolean isMasterMute() throws android.os.RemoteException;
    public void setMasterMute(boolean p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public int getStreamVolume(int p0) throws android.os.RemoteException;
    public int getStreamMinVolume(int p0) throws android.os.RemoteException;
    public int getStreamMaxVolume(int p0) throws android.os.RemoteException;
    public java.util.List<android.media.audiopolicy.AudioVolumeGroup> getAudioVolumeGroups() throws android.os.RemoteException;
    public void setVolumeIndexForAttributes(android.media.AudioAttributes p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public int getVolumeIndexForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException;
    public int getMaxVolumeIndexForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException;
    public int getMinVolumeIndexForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException;
    public int getLastAudibleStreamVolume(int p0) throws android.os.RemoteException;
    public void setSupportedSystemUsages(int[] p0) throws android.os.RemoteException;
    public int[] getSupportedSystemUsages() throws android.os.RemoteException;
    public java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategies() throws android.os.RemoteException;
    public boolean isMicrophoneMuted() throws android.os.RemoteException;
    public void setMicrophoneMute(boolean p0, java.lang.String p1, int p2) throws android.os.RemoteException;
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
    public void playSoundEffect(int p0) throws android.os.RemoteException;
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
    public void avrcpSupportsAbsoluteVolume(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setSpeakerphoneOn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public boolean isSpeakerphoneOn() throws android.os.RemoteException;
    public void setBluetoothScoOn(boolean p0) throws android.os.RemoteException;
    public boolean isBluetoothScoOn() throws android.os.RemoteException;
    public void setBluetoothA2dpOn(boolean p0) throws android.os.RemoteException;
    public boolean isBluetoothA2dpOn() throws android.os.RemoteException;
    public int requestAudioFocus(android.media.AudioAttributes p0, int p1, android.os.IBinder p2, android.media.IAudioFocusDispatcher p3, java.lang.String p4, java.lang.String p5, int p6, android.media.audiopolicy.IAudioPolicyCallback p7, int p8) throws android.os.RemoteException;
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
    public void setWiredDeviceConnectionState(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void handleBluetoothA2dpDeviceConfigChange(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
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
    public void disableRingtoneSync(int p0) throws android.os.RemoteException;
    public int getFocusRampTimeMs(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException;
    public int dispatchFocusChange(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException;
    public void playerHasOpPlayAudio(int p0, boolean p1) throws android.os.RemoteException;
    public void setBluetoothHearingAidDeviceConnectionState(android.bluetooth.BluetoothDevice p0, int p1, boolean p2, int p3) throws android.os.RemoteException;
    public void setBluetoothA2dpDeviceConnectionStateSuppressNoisyIntent(android.bluetooth.BluetoothDevice p0, int p1, int p2, boolean p3, int p4) throws android.os.RemoteException;
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
    public int getDevicesForStream(int p0) throws android.os.RemoteException;
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
    public int requestAudioFocusForTest(android.media.AudioAttributes p0, int p1, android.os.IBinder p2, android.media.IAudioFocusDispatcher p3, java.lang.String p4, java.lang.String p5, int p6, int p7) throws android.os.RemoteException;
    public int abandonAudioFocusForTest(android.media.IAudioFocusDispatcher p0, java.lang.String p1, android.media.AudioAttributes p2, java.lang.String p3) throws android.os.RemoteException;
    public long getFadeOutDurationOnFocusLossMillis(android.media.AudioAttributes p0) throws android.os.RemoteException;
    public void registerModeDispatcher(android.media.IAudioModeDispatcher p0) throws android.os.RemoteException;
    public void unregisterModeDispatcher(android.media.IAudioModeDispatcher p0) throws android.os.RemoteException;

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
        public void adjustSuggestedStreamVolume(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void adjustStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void handleVolumeKey(android.view.KeyEvent p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public boolean isStreamMute(int p0) throws android.os.RemoteException { return false; }
        public void forceRemoteSubmixFullVolume(boolean p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public boolean isMasterMute() throws android.os.RemoteException { return false; }
        public void setMasterMute(boolean p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public int getStreamVolume(int p0) throws android.os.RemoteException { return 0; }
        public int getStreamMinVolume(int p0) throws android.os.RemoteException { return 0; }
        public int getStreamMaxVolume(int p0) throws android.os.RemoteException { return 0; }
        public java.util.List<android.media.audiopolicy.AudioVolumeGroup> getAudioVolumeGroups() throws android.os.RemoteException { return null; }
        public void setVolumeIndexForAttributes(android.media.AudioAttributes p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public int getVolumeIndexForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException { return 0; }
        public int getMaxVolumeIndexForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException { return 0; }
        public int getMinVolumeIndexForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException { return 0; }
        public int getLastAudibleStreamVolume(int p0) throws android.os.RemoteException { return 0; }
        public void setSupportedSystemUsages(int[] p0) throws android.os.RemoteException {}
        public int[] getSupportedSystemUsages() throws android.os.RemoteException { return null; }
        public java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategies() throws android.os.RemoteException { return null; }
        public boolean isMicrophoneMuted() throws android.os.RemoteException { return false; }
        public void setMicrophoneMute(boolean p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
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
        public void playSoundEffect(int p0) throws android.os.RemoteException {}
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
        public void avrcpSupportsAbsoluteVolume(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void setSpeakerphoneOn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public boolean isSpeakerphoneOn() throws android.os.RemoteException { return false; }
        public void setBluetoothScoOn(boolean p0) throws android.os.RemoteException {}
        public boolean isBluetoothScoOn() throws android.os.RemoteException { return false; }
        public void setBluetoothA2dpOn(boolean p0) throws android.os.RemoteException {}
        public boolean isBluetoothA2dpOn() throws android.os.RemoteException { return false; }
        public int requestAudioFocus(android.media.AudioAttributes p0, int p1, android.os.IBinder p2, android.media.IAudioFocusDispatcher p3, java.lang.String p4, java.lang.String p5, int p6, android.media.audiopolicy.IAudioPolicyCallback p7, int p8) throws android.os.RemoteException { return 0; }
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
        public void setWiredDeviceConnectionState(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void handleBluetoothA2dpDeviceConfigChange(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException {}
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
        public void disableRingtoneSync(int p0) throws android.os.RemoteException {}
        public int getFocusRampTimeMs(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException { return 0; }
        public int dispatchFocusChange(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException { return 0; }
        public void playerHasOpPlayAudio(int p0, boolean p1) throws android.os.RemoteException {}
        public void setBluetoothHearingAidDeviceConnectionState(android.bluetooth.BluetoothDevice p0, int p1, boolean p2, int p3) throws android.os.RemoteException {}
        public void setBluetoothA2dpDeviceConnectionStateSuppressNoisyIntent(android.bluetooth.BluetoothDevice p0, int p1, int p2, boolean p3, int p4) throws android.os.RemoteException {}
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
        public int getDevicesForStream(int p0) throws android.os.RemoteException { return 0; }
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
        public int requestAudioFocusForTest(android.media.AudioAttributes p0, int p1, android.os.IBinder p2, android.media.IAudioFocusDispatcher p3, java.lang.String p4, java.lang.String p5, int p6, int p7) throws android.os.RemoteException { return 0; }
        public int abandonAudioFocusForTest(android.media.IAudioFocusDispatcher p0, java.lang.String p1, android.media.AudioAttributes p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public long getFadeOutDurationOnFocusLossMillis(android.media.AudioAttributes p0) throws android.os.RemoteException { return 0L; }
        public void registerModeDispatcher(android.media.IAudioModeDispatcher p0) throws android.os.RemoteException {}
        public void unregisterModeDispatcher(android.media.IAudioModeDispatcher p0) throws android.os.RemoteException {}
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
        static final int TRANSACTION_adjustSuggestedStreamVolume = 9;
        static final int TRANSACTION_adjustStreamVolume = 10;
        static final int TRANSACTION_setStreamVolume = 11;
        static final int TRANSACTION_handleVolumeKey = 12;
        static final int TRANSACTION_isStreamMute = 13;
        static final int TRANSACTION_forceRemoteSubmixFullVolume = 14;
        static final int TRANSACTION_isMasterMute = 15;
        static final int TRANSACTION_setMasterMute = 16;
        static final int TRANSACTION_getStreamVolume = 17;
        static final int TRANSACTION_getStreamMinVolume = 18;
        static final int TRANSACTION_getStreamMaxVolume = 19;
        static final int TRANSACTION_getAudioVolumeGroups = 20;
        static final int TRANSACTION_setVolumeIndexForAttributes = 21;
        static final int TRANSACTION_getVolumeIndexForAttributes = 22;
        static final int TRANSACTION_getMaxVolumeIndexForAttributes = 23;
        static final int TRANSACTION_getMinVolumeIndexForAttributes = 24;
        static final int TRANSACTION_getLastAudibleStreamVolume = 25;
        static final int TRANSACTION_setSupportedSystemUsages = 26;
        static final int TRANSACTION_getSupportedSystemUsages = 27;
        static final int TRANSACTION_getAudioProductStrategies = 28;
        static final int TRANSACTION_isMicrophoneMuted = 29;
        static final int TRANSACTION_setMicrophoneMute = 30;
        static final int TRANSACTION_setMicrophoneMuteFromSwitch = 31;
        static final int TRANSACTION_setRingerModeExternal = 32;
        static final int TRANSACTION_setRingerModeInternal = 33;
        static final int TRANSACTION_getRingerModeExternal = 34;
        static final int TRANSACTION_getRingerModeInternal = 35;
        static final int TRANSACTION_isValidRingerMode = 36;
        static final int TRANSACTION_setVibrateSetting = 37;
        static final int TRANSACTION_getVibrateSetting = 38;
        static final int TRANSACTION_shouldVibrate = 39;
        static final int TRANSACTION_setMode = 40;
        static final int TRANSACTION_getMode = 41;
        static final int TRANSACTION_playSoundEffect = 42;
        static final int TRANSACTION_playSoundEffectVolume = 43;
        static final int TRANSACTION_loadSoundEffects = 44;
        static final int TRANSACTION_unloadSoundEffects = 45;
        static final int TRANSACTION_reloadAudioSettings = 46;
        static final int TRANSACTION_getSurroundFormats = 47;
        static final int TRANSACTION_getReportedSurroundFormats = 48;
        static final int TRANSACTION_setSurroundFormatEnabled = 49;
        static final int TRANSACTION_isSurroundFormatEnabled = 50;
        static final int TRANSACTION_setEncodedSurroundMode = 51;
        static final int TRANSACTION_getEncodedSurroundMode = 52;
        static final int TRANSACTION_avrcpSupportsAbsoluteVolume = 53;
        static final int TRANSACTION_setSpeakerphoneOn = 54;
        static final int TRANSACTION_isSpeakerphoneOn = 55;
        static final int TRANSACTION_setBluetoothScoOn = 56;
        static final int TRANSACTION_isBluetoothScoOn = 57;
        static final int TRANSACTION_setBluetoothA2dpOn = 58;
        static final int TRANSACTION_isBluetoothA2dpOn = 59;
        static final int TRANSACTION_requestAudioFocus = 60;
        static final int TRANSACTION_abandonAudioFocus = 61;
        static final int TRANSACTION_unregisterAudioFocusClient = 62;
        static final int TRANSACTION_getCurrentAudioFocus = 63;
        static final int TRANSACTION_startBluetoothSco = 64;
        static final int TRANSACTION_startBluetoothScoVirtualCall = 65;
        static final int TRANSACTION_stopBluetoothSco = 66;
        static final int TRANSACTION_forceVolumeControlStream = 67;
        static final int TRANSACTION_setRingtonePlayer = 68;
        static final int TRANSACTION_getRingtonePlayer = 69;
        static final int TRANSACTION_getUiSoundsStreamType = 70;
        static final int TRANSACTION_setWiredDeviceConnectionState = 71;
        static final int TRANSACTION_handleBluetoothA2dpDeviceConfigChange = 72;
        static final int TRANSACTION_startWatchingRoutes = 73;
        static final int TRANSACTION_isCameraSoundForced = 74;
        static final int TRANSACTION_setVolumeController = 75;
        static final int TRANSACTION_notifyVolumeControllerVisible = 76;
        static final int TRANSACTION_isStreamAffectedByRingerMode = 77;
        static final int TRANSACTION_isStreamAffectedByMute = 78;
        static final int TRANSACTION_disableSafeMediaVolume = 79;
        static final int TRANSACTION_setHdmiSystemAudioSupported = 80;
        static final int TRANSACTION_isHdmiSystemAudioSupported = 81;
        static final int TRANSACTION_registerAudioPolicy = 82;
        static final int TRANSACTION_unregisterAudioPolicyAsync = 83;
        static final int TRANSACTION_unregisterAudioPolicy = 84;
        static final int TRANSACTION_addMixForPolicy = 85;
        static final int TRANSACTION_removeMixForPolicy = 86;
        static final int TRANSACTION_setFocusPropertiesForPolicy = 87;
        static final int TRANSACTION_setVolumePolicy = 88;
        static final int TRANSACTION_hasRegisteredDynamicPolicy = 89;
        static final int TRANSACTION_registerRecordingCallback = 90;
        static final int TRANSACTION_unregisterRecordingCallback = 91;
        static final int TRANSACTION_getActiveRecordingConfigurations = 92;
        static final int TRANSACTION_registerPlaybackCallback = 93;
        static final int TRANSACTION_unregisterPlaybackCallback = 94;
        static final int TRANSACTION_getActivePlaybackConfigurations = 95;
        static final int TRANSACTION_disableRingtoneSync = 96;
        static final int TRANSACTION_getFocusRampTimeMs = 97;
        static final int TRANSACTION_dispatchFocusChange = 98;
        static final int TRANSACTION_playerHasOpPlayAudio = 99;
        static final int TRANSACTION_setBluetoothHearingAidDeviceConnectionState = 100;
        static final int TRANSACTION_setBluetoothA2dpDeviceConnectionStateSuppressNoisyIntent = 101;
        static final int TRANSACTION_setFocusRequestResultFromExtPolicy = 102;
        static final int TRANSACTION_registerAudioServerStateDispatcher = 103;
        static final int TRANSACTION_unregisterAudioServerStateDispatcher = 104;
        static final int TRANSACTION_isAudioServerRunning = 105;
        static final int TRANSACTION_setUidDeviceAffinity = 106;
        static final int TRANSACTION_removeUidDeviceAffinity = 107;
        static final int TRANSACTION_setUserIdDeviceAffinity = 108;
        static final int TRANSACTION_removeUserIdDeviceAffinity = 109;
        static final int TRANSACTION_hasHapticChannels = 110;
        static final int TRANSACTION_isCallScreeningModeSupported = 111;
        static final int TRANSACTION_setPreferredDevicesForStrategy = 112;
        static final int TRANSACTION_removePreferredDevicesForStrategy = 113;
        static final int TRANSACTION_getPreferredDevicesForStrategy = 114;
        static final int TRANSACTION_getDevicesForAttributes = 115;
        static final int TRANSACTION_setAllowedCapturePolicy = 116;
        static final int TRANSACTION_getAllowedCapturePolicy = 117;
        static final int TRANSACTION_registerStrategyPreferredDevicesDispatcher = 118;
        static final int TRANSACTION_unregisterStrategyPreferredDevicesDispatcher = 119;
        static final int TRANSACTION_setRttEnabled = 120;
        static final int TRANSACTION_setDeviceVolumeBehavior = 121;
        static final int TRANSACTION_getDeviceVolumeBehavior = 122;
        static final int TRANSACTION_setMultiAudioFocusEnabled = 123;
        static final int TRANSACTION_setPreferredDevicesForCapturePreset = 124;
        static final int TRANSACTION_clearPreferredDevicesForCapturePreset = 125;
        static final int TRANSACTION_getPreferredDevicesForCapturePreset = 126;
        static final int TRANSACTION_registerCapturePresetDevicesRoleDispatcher = 127;
        static final int TRANSACTION_unregisterCapturePresetDevicesRoleDispatcher = 128;
        static final int TRANSACTION_adjustStreamVolumeForUid = 129;
        static final int TRANSACTION_adjustSuggestedStreamVolumeForUid = 130;
        static final int TRANSACTION_setStreamVolumeForUid = 131;
        static final int TRANSACTION_isMusicActive = 132;
        static final int TRANSACTION_getDevicesForStream = 133;
        static final int TRANSACTION_getAvailableCommunicationDeviceIds = 134;
        static final int TRANSACTION_setCommunicationDevice = 135;
        static final int TRANSACTION_getCommunicationDevice = 136;
        static final int TRANSACTION_registerCommunicationDeviceDispatcher = 137;
        static final int TRANSACTION_unregisterCommunicationDeviceDispatcher = 138;
        static final int TRANSACTION_areNavigationRepeatSoundEffectsEnabled = 139;
        static final int TRANSACTION_setNavigationRepeatSoundEffectsEnabled = 140;
        static final int TRANSACTION_isHomeSoundEffectEnabled = 141;
        static final int TRANSACTION_setHomeSoundEffectEnabled = 142;
        static final int TRANSACTION_setAdditionalOutputDeviceDelay = 143;
        static final int TRANSACTION_getAdditionalOutputDeviceDelay = 144;
        static final int TRANSACTION_getMaxAdditionalOutputDeviceDelay = 145;
        static final int TRANSACTION_requestAudioFocusForTest = 146;
        static final int TRANSACTION_abandonAudioFocusForTest = 147;
        static final int TRANSACTION_getFadeOutDurationOnFocusLossMillis = 148;
        static final int TRANSACTION_registerModeDispatcher = 149;
        static final int TRANSACTION_unregisterModeDispatcher = 150;
        public Stub() { super(); }
        public static android.media.IAudioService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IAudioService p0) { return false; }
        public static android.media.IAudioService getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IAudioService {
            private android.os.IBinder mRemote;
            public static android.media.IAudioService sDefaultImpl;
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
            public void adjustSuggestedStreamVolume(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void adjustStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void setStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void handleVolumeKey(android.view.KeyEvent p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public boolean isStreamMute(int p0) throws android.os.RemoteException { return false; }
            public void forceRemoteSubmixFullVolume(boolean p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public boolean isMasterMute() throws android.os.RemoteException { return false; }
            public void setMasterMute(boolean p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public int getStreamVolume(int p0) throws android.os.RemoteException { return 0; }
            public int getStreamMinVolume(int p0) throws android.os.RemoteException { return 0; }
            public int getStreamMaxVolume(int p0) throws android.os.RemoteException { return 0; }
            public java.util.List<android.media.audiopolicy.AudioVolumeGroup> getAudioVolumeGroups() throws android.os.RemoteException { return null; }
            public void setVolumeIndexForAttributes(android.media.AudioAttributes p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public int getVolumeIndexForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException { return 0; }
            public int getMaxVolumeIndexForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException { return 0; }
            public int getMinVolumeIndexForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException { return 0; }
            public int getLastAudibleStreamVolume(int p0) throws android.os.RemoteException { return 0; }
            public void setSupportedSystemUsages(int[] p0) throws android.os.RemoteException {}
            public int[] getSupportedSystemUsages() throws android.os.RemoteException { return null; }
            public java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategies() throws android.os.RemoteException { return null; }
            public boolean isMicrophoneMuted() throws android.os.RemoteException { return false; }
            public void setMicrophoneMute(boolean p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
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
            public void playSoundEffect(int p0) throws android.os.RemoteException {}
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
            public void avrcpSupportsAbsoluteVolume(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void setSpeakerphoneOn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public boolean isSpeakerphoneOn() throws android.os.RemoteException { return false; }
            public void setBluetoothScoOn(boolean p0) throws android.os.RemoteException {}
            public boolean isBluetoothScoOn() throws android.os.RemoteException { return false; }
            public void setBluetoothA2dpOn(boolean p0) throws android.os.RemoteException {}
            public boolean isBluetoothA2dpOn() throws android.os.RemoteException { return false; }
            public int requestAudioFocus(android.media.AudioAttributes p0, int p1, android.os.IBinder p2, android.media.IAudioFocusDispatcher p3, java.lang.String p4, java.lang.String p5, int p6, android.media.audiopolicy.IAudioPolicyCallback p7, int p8) throws android.os.RemoteException { return 0; }
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
            public void setWiredDeviceConnectionState(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void handleBluetoothA2dpDeviceConfigChange(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException {}
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
            public void disableRingtoneSync(int p0) throws android.os.RemoteException {}
            public int getFocusRampTimeMs(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException { return 0; }
            public int dispatchFocusChange(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException { return 0; }
            public void playerHasOpPlayAudio(int p0, boolean p1) throws android.os.RemoteException {}
            public void setBluetoothHearingAidDeviceConnectionState(android.bluetooth.BluetoothDevice p0, int p1, boolean p2, int p3) throws android.os.RemoteException {}
            public void setBluetoothA2dpDeviceConnectionStateSuppressNoisyIntent(android.bluetooth.BluetoothDevice p0, int p1, int p2, boolean p3, int p4) throws android.os.RemoteException {}
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
            public int getDevicesForStream(int p0) throws android.os.RemoteException { return 0; }
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
            public int requestAudioFocusForTest(android.media.AudioAttributes p0, int p1, android.os.IBinder p2, android.media.IAudioFocusDispatcher p3, java.lang.String p4, java.lang.String p5, int p6, int p7) throws android.os.RemoteException { return 0; }
            public int abandonAudioFocusForTest(android.media.IAudioFocusDispatcher p0, java.lang.String p1, android.media.AudioAttributes p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public long getFadeOutDurationOnFocusLossMillis(android.media.AudioAttributes p0) throws android.os.RemoteException { return 0L; }
            public void registerModeDispatcher(android.media.IAudioModeDispatcher p0) throws android.os.RemoteException {}
            public void unregisterModeDispatcher(android.media.IAudioModeDispatcher p0) throws android.os.RemoteException {}
        }
    }
}
