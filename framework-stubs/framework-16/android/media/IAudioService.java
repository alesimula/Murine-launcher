package android.media;

public interface IAudioService extends android.os.IInterface {
    public android.media.IAudioManagerNative getNativeInterface() throws android.os.RemoteException;
    public int trackPlayer(android.media.PlayerBase.PlayerIdCard p0) throws android.os.RemoteException;
    public void playerAttributes(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException;
    public void playerEvent(int p0, int p1, int[] p2) throws android.os.RemoteException;
    public void releasePlayer(int p0) throws android.os.RemoteException;
    public int trackRecorder(android.os.IBinder p0) throws android.os.RemoteException;
    public void recorderEvent(int p0, int p1) throws android.os.RemoteException;
    public void releaseRecorder(int p0) throws android.os.RemoteException;
    public void playerSessionId(int p0, int p1) throws android.os.RemoteException;
    public void portEvent(int p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException;
    public void permissionUpdateBarrier() throws android.os.RemoteException;
    public void adjustStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void adjustStreamVolumeWithAttribution(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void setStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void setStreamVolumeWithAttribution(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED"})
    public void setDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED"})
    public void setVolumeForDevice(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED"})
    public void adjustVolumeForDevice(android.media.VolumeInfo p0, int p1, android.media.AudioDeviceAttributes p2, java.lang.String p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void notifyAbsoluteVolumeChanged(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED"})
    public android.media.VolumeInfo getDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException;
    public void handleVolumeKey(android.view.KeyEvent p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean isStreamMute(int p0) throws android.os.RemoteException;
    public void forceRemoteSubmixFullVolume(boolean p0, android.os.IBinder p1) throws android.os.RemoteException;
    public boolean isMasterMute() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setMasterMute(boolean p0, int p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    public int getStreamVolume(int p0) throws android.os.RemoteException;
    public int getStreamMinVolume(int p0) throws android.os.RemoteException;
    public int getStreamMaxVolume(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED", "android.permission.MODIFY_AUDIO_ROUTING"})
    public java.util.List<android.media.audiopolicy.AudioVolumeGroup> getAudioVolumeGroups() throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED", "android.permission.MODIFY_AUDIO_ROUTING"})
    public void setVolumeGroupVolumeIndex(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED", "android.permission.MODIFY_AUDIO_ROUTING"})
    public int getVolumeGroupVolumeIndex(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED", "android.permission.MODIFY_AUDIO_ROUTING"})
    public int getVolumeGroupMaxVolumeIndex(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED", "android.permission.MODIFY_AUDIO_ROUTING"})
    public int getVolumeGroupMinVolumeIndex(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.QUERY_AUDIO_STATE")
    public int getLastAudibleVolumeForVolumeGroup(int p0) throws android.os.RemoteException;
    public boolean isVolumeGroupMuted(int p0) throws android.os.RemoteException;
    public void adjustVolumeGroupVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.QUERY_AUDIO_STATE")
    public int getLastAudibleStreamVolume(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setSupportedSystemUsages(int[] p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int[] getSupportedSystemUsages() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategies() throws android.os.RemoteException;
    public boolean isMicrophoneMuted() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_ULTRASOUND")
    public boolean isUltrasoundSupported() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CAPTURE_AUDIO_HOTWORD")
    public boolean isHotwordStreamSupported(boolean p0) throws android.os.RemoteException;
    public void setMicrophoneMute(boolean p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public void setInputGainIndex(android.media.AudioDeviceAttributes p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public int getInputGainIndex(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public int getMaxInputGainIndex() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public int getMinInputGainIndex() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public boolean isInputGainFixed(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
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
    @android.annotation.EnforcePermission("android.permission.WRITE_SETTINGS")
    public boolean setEncodedSurroundMode(int p0) throws android.os.RemoteException;
    public int getEncodedSurroundMode(int p0) throws android.os.RemoteException;
    public void setSpeakerphoneOn(android.os.IBinder p0, boolean p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    public boolean isSpeakerphoneOn() throws android.os.RemoteException;
    public void setBluetoothScoOn(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.BLUETOOTH_STACK")
    public void setA2dpSuspended(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.BLUETOOTH_STACK")
    public void setLeAudioSuspended(boolean p0) throws android.os.RemoteException;
    public boolean isBluetoothScoOn() throws android.os.RemoteException;
    public void setBluetoothA2dpOn(boolean p0) throws android.os.RemoteException;
    public boolean isBluetoothA2dpOn() throws android.os.RemoteException;
    public int requestAudioFocus(android.media.AudioAttributes p0, int p1, android.os.IBinder p2, android.media.IAudioFocusDispatcher p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, int p7, android.media.audiopolicy.IAudioPolicyCallback p8, int p9) throws android.os.RemoteException;
    public int abandonAudioFocus(android.media.IAudioFocusDispatcher p0, java.lang.String p1, android.media.AudioAttributes p2, java.lang.String p3) throws android.os.RemoteException;
    public void unregisterAudioFocusClient(java.lang.String p0) throws android.os.RemoteException;
    public int getCurrentAudioFocus() throws android.os.RemoteException;
    public void startBluetoothSco(android.os.IBinder p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    public void startBluetoothScoVirtualCall(android.os.IBinder p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    public void stopBluetoothSco(android.os.IBinder p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    public void forceVolumeControlStream(int p0, android.os.IBinder p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.REMOTE_AUDIO_PLAYBACK")
    public void setRingtonePlayer(android.media.IRingtonePlayer p0) throws android.os.RemoteException;
    public android.media.IRingtonePlayer getRingtonePlayer() throws android.os.RemoteException;
    public int getUiSoundsStreamType() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public java.util.List getIndependentStreamTypes() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public int getStreamTypeAlias(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public boolean isVolumeControlUsingVolumeGroups() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public void registerStreamAliasingDispatcher(android.media.IStreamAliasingDispatcher p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public void setNotifAliasRingForTest(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setWiredDeviceConnectionState(android.media.AudioDeviceAttributes p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.media.AudioRoutesInfo startWatchingRoutes(android.media.IAudioRoutesObserver p0) throws android.os.RemoteException;
    public boolean isCameraSoundForced() throws android.os.RemoteException;
    public void setVolumeController(android.media.IVolumeController p0) throws android.os.RemoteException;
    public android.media.IVolumeController getVolumeController() throws android.os.RemoteException;
    public void notifyVolumeControllerVisible(android.media.IVolumeController p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public void setVolumeControllerLongPressTimeoutEnabled(boolean p0) throws android.os.RemoteException;
    public boolean isStreamAffectedByRingerMode(int p0) throws android.os.RemoteException;
    public boolean isStreamAffectedByMute(int p0) throws android.os.RemoteException;
    public boolean isStreamMutableByUi(int p0) throws android.os.RemoteException;
    public void disableSafeMediaVolume(java.lang.String p0) throws android.os.RemoteException;
    public void lowerVolumeToRs1(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public float getOutputRs2UpperBound() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public void setOutputRs2UpperBound(float p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public float getCsd() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public void setCsd(float p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public void forceUseFrameworkMel(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public void forceComputeCsdOnAllDevices(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public boolean isCsdEnabled() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public boolean isCsdAsAFeatureAvailable() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public boolean isCsdAsAFeatureEnabled() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public void setCsdAsAFeatureEnabled(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public boolean setBluetoothAudioDeviceCategory(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public int getBluetoothAudioDeviceCategory(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public boolean isBluetoothAudioDeviceCategoryFixed(java.lang.String p0) throws android.os.RemoteException;
    public int setHdmiSystemAudioSupported(boolean p0) throws android.os.RemoteException;
    public boolean isHdmiSystemAudioSupported() throws android.os.RemoteException;
    public java.lang.String registerAudioPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1, boolean p2, boolean p3, boolean p4, boolean p5, android.media.projection.IMediaProjection p6, android.content.AttributionSource p7) throws android.os.RemoteException;
    public void unregisterAudioPolicyAsync(android.media.audiopolicy.IAudioPolicyCallback p0) throws android.os.RemoteException;
    public java.util.List<android.media.audiopolicy.AudioMix> getRegisteredPolicyMixes() throws android.os.RemoteException;
    public void unregisterAudioPolicy(android.media.audiopolicy.IAudioPolicyCallback p0) throws android.os.RemoteException;
    public int addMixForPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException;
    public int removeMixForPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int updateMixingRulesForPolicy(android.media.audiopolicy.AudioMix[] p0, android.media.audiopolicy.AudioMixingRule[] p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException;
    public int setFocusPropertiesForPolicy(int p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException;
    public void setVolumePolicy(android.media.VolumePolicy p0) throws android.os.RemoteException;
    public android.media.VolumePolicy getVolumePolicy() throws android.os.RemoteException;
    public boolean hasRegisteredDynamicPolicy() throws android.os.RemoteException;
    public void registerRecordingCallback(android.media.IRecordingConfigDispatcher p0) throws android.os.RemoteException;
    public void unregisterRecordingCallback(android.media.IRecordingConfigDispatcher p0) throws android.os.RemoteException;
    public java.util.List<android.media.AudioRecordingConfiguration> getActiveRecordingConfigurations() throws android.os.RemoteException;
    public void registerPlaybackCallback(android.media.IPlaybackConfigDispatcher p0) throws android.os.RemoteException;
    public void unregisterPlaybackCallback(android.media.IPlaybackConfigDispatcher p0) throws android.os.RemoteException;
    public java.util.List<android.media.AudioPlaybackConfiguration> getActivePlaybackConfigurations() throws android.os.RemoteException;
    public int getFocusRampTimeMs(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException;
    public int dispatchFocusChange(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public int dispatchFocusChangeWithFade(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2, java.util.List<android.media.AudioFocusInfo> p3, android.media.FadeManagerConfiguration p4) throws android.os.RemoteException;
    public void playerHasOpPlayAudio(int p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.BLUETOOTH_STACK")
    public void handleBluetoothActiveDeviceChanged(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothDevice p1, android.media.BluetoothProfileConnectionInfo p2) throws android.os.RemoteException;
    public void setFocusRequestResultFromExtPolicy(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException;
    public void registerAudioServerStateDispatcher(android.media.IAudioServerStateDispatcher p0) throws android.os.RemoteException;
    public void unregisterAudioServerStateDispatcher(android.media.IAudioServerStateDispatcher p0) throws android.os.RemoteException;
    public boolean isAudioServerRunning() throws android.os.RemoteException;
    public void registerAudioVolumeCallback(android.media.audiopolicy.IAudioVolumeChangeDispatcher p0) throws android.os.RemoteException;
    public void unregisterAudioVolumeCallback(android.media.audiopolicy.IAudioVolumeChangeDispatcher p0) throws android.os.RemoteException;
    public int setUidDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1, int[] p2, java.lang.String[] p3) throws android.os.RemoteException;
    public int removeUidDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1) throws android.os.RemoteException;
    public int setUserIdDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1, int[] p2, java.lang.String[] p3) throws android.os.RemoteException;
    public int removeUserIdDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1) throws android.os.RemoteException;
    public boolean hasHapticChannels(android.net.Uri p0) throws android.os.RemoteException;
    public boolean isCallScreeningModeSupported() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int setPreferredDevicesForStrategy(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int removePreferredDevicesForStrategy(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public java.util.List<android.media.AudioDeviceAttributes> getPreferredDevicesForStrategy(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int setDeviceAsNonDefaultForStrategy(int p0, android.media.AudioDeviceAttributes p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int removeDeviceAsNonDefaultForStrategy(int p0, android.media.AudioDeviceAttributes p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public java.util.List<android.media.AudioDeviceAttributes> getNonDefaultDevicesForStrategy(int p0) throws android.os.RemoteException;
    public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException;
    public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributesUnprotected(android.media.AudioAttributes p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.QUERY_AUDIO_STATE"})
    public void addOnDevicesForAttributesChangedListener(android.media.AudioAttributes p0, android.media.IDevicesForAttributesCallback p1) throws android.os.RemoteException;
    public void removeOnDevicesForAttributesChangedListener(android.media.IDevicesForAttributesCallback p0) throws android.os.RemoteException;
    public int setAllowedCapturePolicy(int p0) throws android.os.RemoteException;
    public int getAllowedCapturePolicy() throws android.os.RemoteException;
    public void registerStrategyPreferredDevicesDispatcher(android.media.IStrategyPreferredDevicesDispatcher p0) throws android.os.RemoteException;
    public void unregisterStrategyPreferredDevicesDispatcher(android.media.IStrategyPreferredDevicesDispatcher p0) throws android.os.RemoteException;
    public void registerStrategyNonDefaultDevicesDispatcher(android.media.IStrategyNonDefaultDevicesDispatcher p0) throws android.os.RemoteException;
    public void unregisterStrategyNonDefaultDevicesDispatcher(android.media.IStrategyNonDefaultDevicesDispatcher p0) throws android.os.RemoteException;
    public void setRttEnabled(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED"})
    public void setDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.QUERY_AUDIO_STATE", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED"})
    public int getDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setMultiAudioFocusEnabled(boolean p0) throws android.os.RemoteException;
    public int setPreferredDevicesForCapturePreset(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int clearPreferredDevicesForCapturePreset(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public java.util.List<android.media.AudioDeviceAttributes> getPreferredDevicesForCapturePreset(int p0) throws android.os.RemoteException;
    public void registerCapturePresetDevicesRoleDispatcher(android.media.ICapturePresetDevicesRoleDispatcher p0) throws android.os.RemoteException;
    public void unregisterCapturePresetDevicesRoleDispatcher(android.media.ICapturePresetDevicesRoleDispatcher p0) throws android.os.RemoteException;
    public void adjustStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, android.os.UserHandle p6, int p7) throws android.os.RemoteException;
    public void adjustSuggestedStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, android.os.UserHandle p6, int p7) throws android.os.RemoteException;
    public void setStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, android.os.UserHandle p6, int p7) throws android.os.RemoteException;
    public void adjustVolume(int p0, int p1) throws android.os.RemoteException;
    public void adjustSuggestedStreamVolume(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isMusicActive(boolean p0) throws android.os.RemoteException;
    public int getDeviceMaskForStream(int p0) throws android.os.RemoteException;
    public int[] getAvailableCommunicationDeviceIds() throws android.os.RemoteException;
    public boolean setCommunicationDevice(android.os.IBinder p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
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
    @android.annotation.EnforcePermission("android.permission.QUERY_AUDIO_STATE")
    public java.util.List getFocusDuckedUidsForTest() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.QUERY_AUDIO_STATE")
    public long getFocusFadeOutDurationForTest() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.QUERY_AUDIO_STATE")
    public long getFocusUnmuteDelayAfterFadeOutForTest() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public boolean enterAudioFocusFreezeForTest(android.os.IBinder p0, int[] p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public boolean exitAudioFocusFreezeForTest(android.os.IBinder p0) throws android.os.RemoteException;
    public void registerModeDispatcher(android.media.IAudioModeDispatcher p0) throws android.os.RemoteException;
    public void unregisterModeDispatcher(android.media.IAudioModeDispatcher p0) throws android.os.RemoteException;
    public int getSpatializerImmersiveAudioLevel() throws android.os.RemoteException;
    public boolean isSpatializerEnabled() throws android.os.RemoteException;
    public boolean isSpatializerAvailable() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public boolean isSpatializerAvailableForDevice(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public boolean hasHeadTracker(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void setHeadTrackerEnabled(boolean p0, android.media.AudioDeviceAttributes p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public boolean isHeadTrackerEnabled(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    public boolean isHeadTrackerAvailable() throws android.os.RemoteException;
    public void registerSpatializerHeadTrackerAvailableCallback(android.media.ISpatializerHeadTrackerAvailableCallback p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void setSpatializerEnabled(boolean p0) throws android.os.RemoteException;
    public boolean canBeSpatialized(android.media.AudioAttributes p0, android.media.AudioFormat p1) throws android.os.RemoteException;
    public java.util.List getSpatializedChannelMasks() throws android.os.RemoteException;
    public void registerSpatializerCallback(android.media.ISpatializerCallback p0) throws android.os.RemoteException;
    public void unregisterSpatializerCallback(android.media.ISpatializerCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void registerSpatializerHeadTrackingCallback(android.media.ISpatializerHeadTrackingModeCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void unregisterSpatializerHeadTrackingCallback(android.media.ISpatializerHeadTrackingModeCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void registerHeadToSoundstagePoseCallback(android.media.ISpatializerHeadToSoundStagePoseCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void unregisterHeadToSoundstagePoseCallback(android.media.ISpatializerHeadToSoundStagePoseCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public java.util.List<android.media.AudioDeviceAttributes> getSpatializerCompatibleAudioDevices() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void addSpatializerCompatibleAudioDevice(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void removeSpatializerCompatibleAudioDevice(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void setDesiredHeadTrackingMode(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public int getDesiredHeadTrackingMode() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public int[] getSupportedHeadTrackingModes() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public int getActualHeadTrackingMode() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void setSpatializerGlobalTransform(float[] p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void recenterHeadTracker() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void setSpatializerParameter(int p0, byte[] p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void getSpatializerParameter(int p0, byte[] p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public int getSpatializerOutput() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void registerSpatializerOutputCallback(android.media.ISpatializerOutputCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void unregisterSpatializerOutputCallback(android.media.ISpatializerOutputCallback p0) throws android.os.RemoteException;
    public boolean isVolumeFixed() throws android.os.RemoteException;
    public android.media.VolumeInfo getDefaultVolumeInfo() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CALL_AUDIO_INTERCEPTION")
    public boolean isPstnCallAudioInterceptable() throws android.os.RemoteException;
    public void muteAwaitConnection(int[] p0, android.media.AudioDeviceAttributes p1, long p2) throws android.os.RemoteException;
    public void cancelMuteAwaitConnection(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public android.media.AudioDeviceAttributes getMutingExpectedDevice() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void registerMuteAwaitConnectionDispatcher(android.media.IMuteAwaitConnectionCallback p0, boolean p1) throws android.os.RemoteException;
    public void setTestDeviceConnectionState(android.media.AudioDeviceAttributes p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.QUERY_AUDIO_STATE"})
    public void registerDeviceVolumeBehaviorDispatcher(boolean p0, android.media.IDeviceVolumeBehaviorDispatcher p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public java.util.List<android.media.AudioFocusInfo> getFocusStack() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void sendFocusLossAndUpdate(android.media.AudioFocusInfo p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public boolean sendFocusLoss(android.media.AudioFocusInfo p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void addAssistantServicesUids(int[] p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void removeAssistantServicesUids(int[] p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setActiveAssistantServiceUids(int[] p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int[] getAssistantServicesUids() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int[] getActiveAssistantServiceUids() throws android.os.RemoteException;
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void registerDeviceVolumeDispatcherForAbsoluteVolume(boolean p0, android.media.IAudioDeviceVolumeDispatcher p1, java.lang.String p2, android.media.AudioDeviceAttributes p3, java.util.List<android.media.VolumeInfo> p4, boolean p5, int p6) throws android.os.RemoteException;
    public android.media.AudioHalVersionInfo getHalVersion() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS")
    public int setPreferredMixerAttributes(android.media.AudioAttributes p0, int p1, android.media.AudioMixerAttributes p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS")
    public int clearPreferredMixerAttributes(android.media.AudioAttributes p0, int p1) throws android.os.RemoteException;
    public void registerPreferredMixerAttributesDispatcher(android.media.IPreferredMixerAttributesDispatcher p0) throws android.os.RemoteException;
    public void unregisterPreferredMixerAttributesDispatcher(android.media.IPreferredMixerAttributesDispatcher p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public boolean supportsBluetoothVariableLatency() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setBluetoothVariableLatencyEnabled(boolean p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_ROUTING")
    public boolean isBluetoothVariableLatencyEnabled() throws android.os.RemoteException;
    public void registerLoudnessCodecUpdatesDispatcher(android.media.ILoudnessCodecUpdatesDispatcher p0) throws android.os.RemoteException;
    public void unregisterLoudnessCodecUpdatesDispatcher(android.media.ILoudnessCodecUpdatesDispatcher p0) throws android.os.RemoteException;
    public void startLoudnessCodecUpdates(int p0) throws android.os.RemoteException;
    public void stopLoudnessCodecUpdates(int p0) throws android.os.RemoteException;
    public void addLoudnessCodecInfo(int p0, int p1, android.media.LoudnessCodecInfo p2) throws android.os.RemoteException;
    public void removeLoudnessCodecInfo(int p0, android.media.LoudnessCodecInfo p1) throws android.os.RemoteException;
    public android.os.PersistableBundle getLoudnessParams(android.media.LoudnessCodecInfo p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public int setFadeManagerConfigurationForFocusLoss(android.media.FadeManagerConfiguration p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public int clearFadeManagerConfigurationForFocusLoss() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public android.media.FadeManagerConfiguration getFadeManagerConfigurationForFocusLoss() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.QUERY_AUDIO_STATE")
    @android.annotation.EnforcePermission("android.permission.QUERY_AUDIO_STATE")
    public boolean shouldNotificationSoundPlay(android.media.AudioAttributes p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    @android.annotation.EnforcePermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public void setEnableHardening(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.media.IAudioService {
        public Default() {}
        public android.media.IAudioManagerNative getNativeInterface() throws android.os.RemoteException { return null; }
        public int trackPlayer(android.media.PlayerBase.PlayerIdCard p0) throws android.os.RemoteException { return 0; }
        public void playerAttributes(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException {}
        public void playerEvent(int p0, int p1, int[] p2) throws android.os.RemoteException {}
        public void releasePlayer(int p0) throws android.os.RemoteException {}
        public int trackRecorder(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public void recorderEvent(int p0, int p1) throws android.os.RemoteException {}
        public void releaseRecorder(int p0) throws android.os.RemoteException {}
        public void playerSessionId(int p0, int p1) throws android.os.RemoteException {}
        public void portEvent(int p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
        public void permissionUpdateBarrier() throws android.os.RemoteException {}
        public void adjustStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void adjustStreamVolumeWithAttribution(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void setStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setStreamVolumeWithAttribution(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void setDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setVolumeForDevice(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException {}
        public void adjustVolumeForDevice(android.media.VolumeInfo p0, int p1, android.media.AudioDeviceAttributes p2, java.lang.String p3) throws android.os.RemoteException {}
        public void notifyAbsoluteVolumeChanged(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException {}
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
        public int getLastAudibleVolumeForVolumeGroup(int p0) throws android.os.RemoteException { return 0; }
        public boolean isVolumeGroupMuted(int p0) throws android.os.RemoteException { return false; }
        public void adjustVolumeGroupVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public int getLastAudibleStreamVolume(int p0) throws android.os.RemoteException { return 0; }
        public void setSupportedSystemUsages(int[] p0) throws android.os.RemoteException {}
        public int[] getSupportedSystemUsages() throws android.os.RemoteException { return null; }
        public java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategies() throws android.os.RemoteException { return null; }
        public boolean isMicrophoneMuted() throws android.os.RemoteException { return false; }
        public boolean isUltrasoundSupported() throws android.os.RemoteException { return false; }
        public boolean isHotwordStreamSupported(boolean p0) throws android.os.RemoteException { return false; }
        public void setMicrophoneMute(boolean p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setInputGainIndex(android.media.AudioDeviceAttributes p0, int p1) throws android.os.RemoteException {}
        public int getInputGainIndex(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return 0; }
        public int getMaxInputGainIndex() throws android.os.RemoteException { return 0; }
        public int getMinInputGainIndex() throws android.os.RemoteException { return 0; }
        public boolean isInputGainFixed(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return false; }
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
        public void setSpeakerphoneOn(android.os.IBinder p0, boolean p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public boolean isSpeakerphoneOn() throws android.os.RemoteException { return false; }
        public void setBluetoothScoOn(boolean p0) throws android.os.RemoteException {}
        public void setA2dpSuspended(boolean p0) throws android.os.RemoteException {}
        public void setLeAudioSuspended(boolean p0) throws android.os.RemoteException {}
        public boolean isBluetoothScoOn() throws android.os.RemoteException { return false; }
        public void setBluetoothA2dpOn(boolean p0) throws android.os.RemoteException {}
        public boolean isBluetoothA2dpOn() throws android.os.RemoteException { return false; }
        public int requestAudioFocus(android.media.AudioAttributes p0, int p1, android.os.IBinder p2, android.media.IAudioFocusDispatcher p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, int p7, android.media.audiopolicy.IAudioPolicyCallback p8, int p9) throws android.os.RemoteException { return 0; }
        public int abandonAudioFocus(android.media.IAudioFocusDispatcher p0, java.lang.String p1, android.media.AudioAttributes p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public void unregisterAudioFocusClient(java.lang.String p0) throws android.os.RemoteException {}
        public int getCurrentAudioFocus() throws android.os.RemoteException { return 0; }
        public void startBluetoothSco(android.os.IBinder p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void startBluetoothScoVirtualCall(android.os.IBinder p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public void stopBluetoothSco(android.os.IBinder p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public void forceVolumeControlStream(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void setRingtonePlayer(android.media.IRingtonePlayer p0) throws android.os.RemoteException {}
        public android.media.IRingtonePlayer getRingtonePlayer() throws android.os.RemoteException { return null; }
        public int getUiSoundsStreamType() throws android.os.RemoteException { return 0; }
        public java.util.List getIndependentStreamTypes() throws android.os.RemoteException { return null; }
        public int getStreamTypeAlias(int p0) throws android.os.RemoteException { return 0; }
        public boolean isVolumeControlUsingVolumeGroups() throws android.os.RemoteException { return false; }
        public void registerStreamAliasingDispatcher(android.media.IStreamAliasingDispatcher p0, boolean p1) throws android.os.RemoteException {}
        public void setNotifAliasRingForTest(boolean p0) throws android.os.RemoteException {}
        public void setWiredDeviceConnectionState(android.media.AudioDeviceAttributes p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.media.AudioRoutesInfo startWatchingRoutes(android.media.IAudioRoutesObserver p0) throws android.os.RemoteException { return null; }
        public boolean isCameraSoundForced() throws android.os.RemoteException { return false; }
        public void setVolumeController(android.media.IVolumeController p0) throws android.os.RemoteException {}
        public android.media.IVolumeController getVolumeController() throws android.os.RemoteException { return null; }
        public void notifyVolumeControllerVisible(android.media.IVolumeController p0, boolean p1) throws android.os.RemoteException {}
        public void setVolumeControllerLongPressTimeoutEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean isStreamAffectedByRingerMode(int p0) throws android.os.RemoteException { return false; }
        public boolean isStreamAffectedByMute(int p0) throws android.os.RemoteException { return false; }
        public boolean isStreamMutableByUi(int p0) throws android.os.RemoteException { return false; }
        public void disableSafeMediaVolume(java.lang.String p0) throws android.os.RemoteException {}
        public void lowerVolumeToRs1(java.lang.String p0) throws android.os.RemoteException {}
        public float getOutputRs2UpperBound() throws android.os.RemoteException { return 0.0f; }
        public void setOutputRs2UpperBound(float p0) throws android.os.RemoteException {}
        public float getCsd() throws android.os.RemoteException { return 0.0f; }
        public void setCsd(float p0) throws android.os.RemoteException {}
        public void forceUseFrameworkMel(boolean p0) throws android.os.RemoteException {}
        public void forceComputeCsdOnAllDevices(boolean p0) throws android.os.RemoteException {}
        public boolean isCsdEnabled() throws android.os.RemoteException { return false; }
        public boolean isCsdAsAFeatureAvailable() throws android.os.RemoteException { return false; }
        public boolean isCsdAsAFeatureEnabled() throws android.os.RemoteException { return false; }
        public void setCsdAsAFeatureEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean setBluetoothAudioDeviceCategory(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public int getBluetoothAudioDeviceCategory(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public boolean isBluetoothAudioDeviceCategoryFixed(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int setHdmiSystemAudioSupported(boolean p0) throws android.os.RemoteException { return 0; }
        public boolean isHdmiSystemAudioSupported() throws android.os.RemoteException { return false; }
        public java.lang.String registerAudioPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1, boolean p2, boolean p3, boolean p4, boolean p5, android.media.projection.IMediaProjection p6, android.content.AttributionSource p7) throws android.os.RemoteException { return null; }
        public void unregisterAudioPolicyAsync(android.media.audiopolicy.IAudioPolicyCallback p0) throws android.os.RemoteException {}
        public java.util.List<android.media.audiopolicy.AudioMix> getRegisteredPolicyMixes() throws android.os.RemoteException { return null; }
        public void unregisterAudioPolicy(android.media.audiopolicy.IAudioPolicyCallback p0) throws android.os.RemoteException {}
        public int addMixForPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return 0; }
        public int removeMixForPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return 0; }
        public int updateMixingRulesForPolicy(android.media.audiopolicy.AudioMix[] p0, android.media.audiopolicy.AudioMixingRule[] p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException { return 0; }
        public int setFocusPropertiesForPolicy(int p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return 0; }
        public void setVolumePolicy(android.media.VolumePolicy p0) throws android.os.RemoteException {}
        public android.media.VolumePolicy getVolumePolicy() throws android.os.RemoteException { return null; }
        public boolean hasRegisteredDynamicPolicy() throws android.os.RemoteException { return false; }
        public void registerRecordingCallback(android.media.IRecordingConfigDispatcher p0) throws android.os.RemoteException {}
        public void unregisterRecordingCallback(android.media.IRecordingConfigDispatcher p0) throws android.os.RemoteException {}
        public java.util.List<android.media.AudioRecordingConfiguration> getActiveRecordingConfigurations() throws android.os.RemoteException { return null; }
        public void registerPlaybackCallback(android.media.IPlaybackConfigDispatcher p0) throws android.os.RemoteException {}
        public void unregisterPlaybackCallback(android.media.IPlaybackConfigDispatcher p0) throws android.os.RemoteException {}
        public java.util.List<android.media.AudioPlaybackConfiguration> getActivePlaybackConfigurations() throws android.os.RemoteException { return null; }
        public int getFocusRampTimeMs(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException { return 0; }
        public int dispatchFocusChange(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException { return 0; }
        public int dispatchFocusChangeWithFade(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2, java.util.List<android.media.AudioFocusInfo> p3, android.media.FadeManagerConfiguration p4) throws android.os.RemoteException { return 0; }
        public void playerHasOpPlayAudio(int p0, boolean p1) throws android.os.RemoteException {}
        public void handleBluetoothActiveDeviceChanged(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothDevice p1, android.media.BluetoothProfileConnectionInfo p2) throws android.os.RemoteException {}
        public void setFocusRequestResultFromExtPolicy(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException {}
        public void registerAudioServerStateDispatcher(android.media.IAudioServerStateDispatcher p0) throws android.os.RemoteException {}
        public void unregisterAudioServerStateDispatcher(android.media.IAudioServerStateDispatcher p0) throws android.os.RemoteException {}
        public boolean isAudioServerRunning() throws android.os.RemoteException { return false; }
        public void registerAudioVolumeCallback(android.media.audiopolicy.IAudioVolumeChangeDispatcher p0) throws android.os.RemoteException {}
        public void unregisterAudioVolumeCallback(android.media.audiopolicy.IAudioVolumeChangeDispatcher p0) throws android.os.RemoteException {}
        public int setUidDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1, int[] p2, java.lang.String[] p3) throws android.os.RemoteException { return 0; }
        public int removeUidDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1) throws android.os.RemoteException { return 0; }
        public int setUserIdDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1, int[] p2, java.lang.String[] p3) throws android.os.RemoteException { return 0; }
        public int removeUserIdDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1) throws android.os.RemoteException { return 0; }
        public boolean hasHapticChannels(android.net.Uri p0) throws android.os.RemoteException { return false; }
        public boolean isCallScreeningModeSupported() throws android.os.RemoteException { return false; }
        public int setPreferredDevicesForStrategy(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) throws android.os.RemoteException { return 0; }
        public int removePreferredDevicesForStrategy(int p0) throws android.os.RemoteException { return 0; }
        public java.util.List<android.media.AudioDeviceAttributes> getPreferredDevicesForStrategy(int p0) throws android.os.RemoteException { return null; }
        public int setDeviceAsNonDefaultForStrategy(int p0, android.media.AudioDeviceAttributes p1) throws android.os.RemoteException { return 0; }
        public int removeDeviceAsNonDefaultForStrategy(int p0, android.media.AudioDeviceAttributes p1) throws android.os.RemoteException { return 0; }
        public java.util.List<android.media.AudioDeviceAttributes> getNonDefaultDevicesForStrategy(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributesUnprotected(android.media.AudioAttributes p0) throws android.os.RemoteException { return null; }
        public void addOnDevicesForAttributesChangedListener(android.media.AudioAttributes p0, android.media.IDevicesForAttributesCallback p1) throws android.os.RemoteException {}
        public void removeOnDevicesForAttributesChangedListener(android.media.IDevicesForAttributesCallback p0) throws android.os.RemoteException {}
        public int setAllowedCapturePolicy(int p0) throws android.os.RemoteException { return 0; }
        public int getAllowedCapturePolicy() throws android.os.RemoteException { return 0; }
        public void registerStrategyPreferredDevicesDispatcher(android.media.IStrategyPreferredDevicesDispatcher p0) throws android.os.RemoteException {}
        public void unregisterStrategyPreferredDevicesDispatcher(android.media.IStrategyPreferredDevicesDispatcher p0) throws android.os.RemoteException {}
        public void registerStrategyNonDefaultDevicesDispatcher(android.media.IStrategyNonDefaultDevicesDispatcher p0) throws android.os.RemoteException {}
        public void unregisterStrategyNonDefaultDevicesDispatcher(android.media.IStrategyNonDefaultDevicesDispatcher p0) throws android.os.RemoteException {}
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
        public void adjustVolume(int p0, int p1) throws android.os.RemoteException {}
        public void adjustSuggestedStreamVolume(int p0, int p1, int p2) throws android.os.RemoteException {}
        public boolean isMusicActive(boolean p0) throws android.os.RemoteException { return false; }
        public int getDeviceMaskForStream(int p0) throws android.os.RemoteException { return 0; }
        public int[] getAvailableCommunicationDeviceIds() throws android.os.RemoteException { return null; }
        public boolean setCommunicationDevice(android.os.IBinder p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
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
        public java.util.List getFocusDuckedUidsForTest() throws android.os.RemoteException { return null; }
        public long getFocusFadeOutDurationForTest() throws android.os.RemoteException { return 0L; }
        public long getFocusUnmuteDelayAfterFadeOutForTest() throws android.os.RemoteException { return 0L; }
        public boolean enterAudioFocusFreezeForTest(android.os.IBinder p0, int[] p1) throws android.os.RemoteException { return false; }
        public boolean exitAudioFocusFreezeForTest(android.os.IBinder p0) throws android.os.RemoteException { return false; }
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
        public java.util.List getSpatializedChannelMasks() throws android.os.RemoteException { return null; }
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
        public void sendFocusLossAndUpdate(android.media.AudioFocusInfo p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException {}
        public boolean sendFocusLoss(android.media.AudioFocusInfo p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return false; }
        public void addAssistantServicesUids(int[] p0) throws android.os.RemoteException {}
        public void removeAssistantServicesUids(int[] p0) throws android.os.RemoteException {}
        public void setActiveAssistantServiceUids(int[] p0) throws android.os.RemoteException {}
        public int[] getAssistantServicesUids() throws android.os.RemoteException { return null; }
        public int[] getActiveAssistantServiceUids() throws android.os.RemoteException { return null; }
        public void registerDeviceVolumeDispatcherForAbsoluteVolume(boolean p0, android.media.IAudioDeviceVolumeDispatcher p1, java.lang.String p2, android.media.AudioDeviceAttributes p3, java.util.List<android.media.VolumeInfo> p4, boolean p5, int p6) throws android.os.RemoteException {}
        public android.media.AudioHalVersionInfo getHalVersion() throws android.os.RemoteException { return null; }
        public int setPreferredMixerAttributes(android.media.AudioAttributes p0, int p1, android.media.AudioMixerAttributes p2) throws android.os.RemoteException { return 0; }
        public int clearPreferredMixerAttributes(android.media.AudioAttributes p0, int p1) throws android.os.RemoteException { return 0; }
        public void registerPreferredMixerAttributesDispatcher(android.media.IPreferredMixerAttributesDispatcher p0) throws android.os.RemoteException {}
        public void unregisterPreferredMixerAttributesDispatcher(android.media.IPreferredMixerAttributesDispatcher p0) throws android.os.RemoteException {}
        public boolean supportsBluetoothVariableLatency() throws android.os.RemoteException { return false; }
        public void setBluetoothVariableLatencyEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean isBluetoothVariableLatencyEnabled() throws android.os.RemoteException { return false; }
        public void registerLoudnessCodecUpdatesDispatcher(android.media.ILoudnessCodecUpdatesDispatcher p0) throws android.os.RemoteException {}
        public void unregisterLoudnessCodecUpdatesDispatcher(android.media.ILoudnessCodecUpdatesDispatcher p0) throws android.os.RemoteException {}
        public void startLoudnessCodecUpdates(int p0) throws android.os.RemoteException {}
        public void stopLoudnessCodecUpdates(int p0) throws android.os.RemoteException {}
        public void addLoudnessCodecInfo(int p0, int p1, android.media.LoudnessCodecInfo p2) throws android.os.RemoteException {}
        public void removeLoudnessCodecInfo(int p0, android.media.LoudnessCodecInfo p1) throws android.os.RemoteException {}
        public android.os.PersistableBundle getLoudnessParams(android.media.LoudnessCodecInfo p0) throws android.os.RemoteException { return null; }
        public int setFadeManagerConfigurationForFocusLoss(android.media.FadeManagerConfiguration p0) throws android.os.RemoteException { return 0; }
        public int clearFadeManagerConfigurationForFocusLoss() throws android.os.RemoteException { return 0; }
        public android.media.FadeManagerConfiguration getFadeManagerConfigurationForFocusLoss() throws android.os.RemoteException { return null; }
        public boolean shouldNotificationSoundPlay(android.media.AudioAttributes p0) throws android.os.RemoteException { return false; }
        public void setEnableHardening(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IAudioService {
        public static final java.lang.String DESCRIPTOR = "android.media.IAudioService";
        static final int TRANSACTION_getNativeInterface = 1;
        static final int TRANSACTION_trackPlayer = 2;
        static final int TRANSACTION_playerAttributes = 3;
        static final int TRANSACTION_playerEvent = 4;
        static final int TRANSACTION_releasePlayer = 5;
        static final int TRANSACTION_trackRecorder = 6;
        static final int TRANSACTION_recorderEvent = 7;
        static final int TRANSACTION_releaseRecorder = 8;
        static final int TRANSACTION_playerSessionId = 9;
        static final int TRANSACTION_portEvent = 10;
        static final int TRANSACTION_permissionUpdateBarrier = 11;
        static final int TRANSACTION_adjustStreamVolume = 12;
        static final int TRANSACTION_adjustStreamVolumeWithAttribution = 13;
        static final int TRANSACTION_setStreamVolume = 14;
        static final int TRANSACTION_setStreamVolumeWithAttribution = 15;
        static final int TRANSACTION_setDeviceVolume = 16;
        static final java.lang.String[] PERMISSIONS_setDeviceVolume = null;
        static final int TRANSACTION_setVolumeForDevice = 17;
        static final java.lang.String[] PERMISSIONS_setVolumeForDevice = null;
        static final int TRANSACTION_adjustVolumeForDevice = 18;
        static final java.lang.String[] PERMISSIONS_adjustVolumeForDevice = null;
        static final int TRANSACTION_notifyAbsoluteVolumeChanged = 19;
        static final java.lang.String[] PERMISSIONS_notifyAbsoluteVolumeChanged = null;
        static final int TRANSACTION_getDeviceVolume = 20;
        static final java.lang.String[] PERMISSIONS_getDeviceVolume = null;
        static final int TRANSACTION_handleVolumeKey = 21;
        static final int TRANSACTION_isStreamMute = 22;
        static final int TRANSACTION_forceRemoteSubmixFullVolume = 23;
        static final int TRANSACTION_isMasterMute = 24;
        static final int TRANSACTION_setMasterMute = 25;
        static final int TRANSACTION_getStreamVolume = 26;
        static final int TRANSACTION_getStreamMinVolume = 27;
        static final int TRANSACTION_getStreamMaxVolume = 28;
        static final int TRANSACTION_getAudioVolumeGroups = 29;
        static final java.lang.String[] PERMISSIONS_getAudioVolumeGroups = null;
        static final int TRANSACTION_setVolumeGroupVolumeIndex = 30;
        static final java.lang.String[] PERMISSIONS_setVolumeGroupVolumeIndex = null;
        static final int TRANSACTION_getVolumeGroupVolumeIndex = 31;
        static final java.lang.String[] PERMISSIONS_getVolumeGroupVolumeIndex = null;
        static final int TRANSACTION_getVolumeGroupMaxVolumeIndex = 32;
        static final java.lang.String[] PERMISSIONS_getVolumeGroupMaxVolumeIndex = null;
        static final int TRANSACTION_getVolumeGroupMinVolumeIndex = 33;
        static final java.lang.String[] PERMISSIONS_getVolumeGroupMinVolumeIndex = null;
        static final int TRANSACTION_getLastAudibleVolumeForVolumeGroup = 34;
        static final int TRANSACTION_isVolumeGroupMuted = 35;
        static final int TRANSACTION_adjustVolumeGroupVolume = 36;
        static final int TRANSACTION_getLastAudibleStreamVolume = 37;
        static final int TRANSACTION_setSupportedSystemUsages = 38;
        static final int TRANSACTION_getSupportedSystemUsages = 39;
        static final int TRANSACTION_getAudioProductStrategies = 40;
        static final int TRANSACTION_isMicrophoneMuted = 41;
        static final int TRANSACTION_isUltrasoundSupported = 42;
        static final int TRANSACTION_isHotwordStreamSupported = 43;
        static final int TRANSACTION_setMicrophoneMute = 44;
        static final int TRANSACTION_setInputGainIndex = 45;
        static final int TRANSACTION_getInputGainIndex = 46;
        static final int TRANSACTION_getMaxInputGainIndex = 47;
        static final int TRANSACTION_getMinInputGainIndex = 48;
        static final int TRANSACTION_isInputGainFixed = 49;
        static final int TRANSACTION_setMicrophoneMuteFromSwitch = 50;
        static final int TRANSACTION_setRingerModeExternal = 51;
        static final int TRANSACTION_setRingerModeInternal = 52;
        static final int TRANSACTION_getRingerModeExternal = 53;
        static final int TRANSACTION_getRingerModeInternal = 54;
        static final int TRANSACTION_isValidRingerMode = 55;
        static final int TRANSACTION_setVibrateSetting = 56;
        static final int TRANSACTION_getVibrateSetting = 57;
        static final int TRANSACTION_shouldVibrate = 58;
        static final int TRANSACTION_setMode = 59;
        static final int TRANSACTION_getMode = 60;
        static final int TRANSACTION_playSoundEffect = 61;
        static final int TRANSACTION_playSoundEffectVolume = 62;
        static final int TRANSACTION_loadSoundEffects = 63;
        static final int TRANSACTION_unloadSoundEffects = 64;
        static final int TRANSACTION_reloadAudioSettings = 65;
        static final int TRANSACTION_getSurroundFormats = 66;
        static final int TRANSACTION_getReportedSurroundFormats = 67;
        static final int TRANSACTION_setSurroundFormatEnabled = 68;
        static final int TRANSACTION_isSurroundFormatEnabled = 69;
        static final int TRANSACTION_setEncodedSurroundMode = 70;
        static final int TRANSACTION_getEncodedSurroundMode = 71;
        static final int TRANSACTION_setSpeakerphoneOn = 72;
        static final int TRANSACTION_isSpeakerphoneOn = 73;
        static final int TRANSACTION_setBluetoothScoOn = 74;
        static final int TRANSACTION_setA2dpSuspended = 75;
        static final int TRANSACTION_setLeAudioSuspended = 76;
        static final int TRANSACTION_isBluetoothScoOn = 77;
        static final int TRANSACTION_setBluetoothA2dpOn = 78;
        static final int TRANSACTION_isBluetoothA2dpOn = 79;
        static final int TRANSACTION_requestAudioFocus = 80;
        static final int TRANSACTION_abandonAudioFocus = 81;
        static final int TRANSACTION_unregisterAudioFocusClient = 82;
        static final int TRANSACTION_getCurrentAudioFocus = 83;
        static final int TRANSACTION_startBluetoothSco = 84;
        static final int TRANSACTION_startBluetoothScoVirtualCall = 85;
        static final int TRANSACTION_stopBluetoothSco = 86;
        static final int TRANSACTION_forceVolumeControlStream = 87;
        static final int TRANSACTION_setRingtonePlayer = 88;
        static final int TRANSACTION_getRingtonePlayer = 89;
        static final int TRANSACTION_getUiSoundsStreamType = 90;
        static final int TRANSACTION_getIndependentStreamTypes = 91;
        static final int TRANSACTION_getStreamTypeAlias = 92;
        static final int TRANSACTION_isVolumeControlUsingVolumeGroups = 93;
        static final int TRANSACTION_registerStreamAliasingDispatcher = 94;
        static final int TRANSACTION_setNotifAliasRingForTest = 95;
        static final int TRANSACTION_setWiredDeviceConnectionState = 96;
        static final int TRANSACTION_startWatchingRoutes = 97;
        static final int TRANSACTION_isCameraSoundForced = 98;
        static final int TRANSACTION_setVolumeController = 99;
        static final int TRANSACTION_getVolumeController = 100;
        static final int TRANSACTION_notifyVolumeControllerVisible = 101;
        static final int TRANSACTION_setVolumeControllerLongPressTimeoutEnabled = 102;
        static final int TRANSACTION_isStreamAffectedByRingerMode = 103;
        static final int TRANSACTION_isStreamAffectedByMute = 104;
        static final int TRANSACTION_isStreamMutableByUi = 105;
        static final int TRANSACTION_disableSafeMediaVolume = 106;
        static final int TRANSACTION_lowerVolumeToRs1 = 107;
        static final int TRANSACTION_getOutputRs2UpperBound = 108;
        static final int TRANSACTION_setOutputRs2UpperBound = 109;
        static final int TRANSACTION_getCsd = 110;
        static final int TRANSACTION_setCsd = 111;
        static final int TRANSACTION_forceUseFrameworkMel = 112;
        static final int TRANSACTION_forceComputeCsdOnAllDevices = 113;
        static final int TRANSACTION_isCsdEnabled = 114;
        static final int TRANSACTION_isCsdAsAFeatureAvailable = 115;
        static final int TRANSACTION_isCsdAsAFeatureEnabled = 116;
        static final int TRANSACTION_setCsdAsAFeatureEnabled = 117;
        static final int TRANSACTION_setBluetoothAudioDeviceCategory = 118;
        static final int TRANSACTION_getBluetoothAudioDeviceCategory = 119;
        static final int TRANSACTION_isBluetoothAudioDeviceCategoryFixed = 120;
        static final int TRANSACTION_setHdmiSystemAudioSupported = 121;
        static final int TRANSACTION_isHdmiSystemAudioSupported = 122;
        static final int TRANSACTION_registerAudioPolicy = 123;
        static final int TRANSACTION_unregisterAudioPolicyAsync = 124;
        static final int TRANSACTION_getRegisteredPolicyMixes = 125;
        static final int TRANSACTION_unregisterAudioPolicy = 126;
        static final int TRANSACTION_addMixForPolicy = 127;
        static final int TRANSACTION_removeMixForPolicy = 128;
        static final int TRANSACTION_updateMixingRulesForPolicy = 129;
        static final int TRANSACTION_setFocusPropertiesForPolicy = 130;
        static final int TRANSACTION_setVolumePolicy = 131;
        static final int TRANSACTION_getVolumePolicy = 132;
        static final int TRANSACTION_hasRegisteredDynamicPolicy = 133;
        static final int TRANSACTION_registerRecordingCallback = 134;
        static final int TRANSACTION_unregisterRecordingCallback = 135;
        static final int TRANSACTION_getActiveRecordingConfigurations = 136;
        static final int TRANSACTION_registerPlaybackCallback = 137;
        static final int TRANSACTION_unregisterPlaybackCallback = 138;
        static final int TRANSACTION_getActivePlaybackConfigurations = 139;
        static final int TRANSACTION_getFocusRampTimeMs = 140;
        static final int TRANSACTION_dispatchFocusChange = 141;
        static final int TRANSACTION_dispatchFocusChangeWithFade = 142;
        static final int TRANSACTION_playerHasOpPlayAudio = 143;
        static final int TRANSACTION_handleBluetoothActiveDeviceChanged = 144;
        static final int TRANSACTION_setFocusRequestResultFromExtPolicy = 145;
        static final int TRANSACTION_registerAudioServerStateDispatcher = 146;
        static final int TRANSACTION_unregisterAudioServerStateDispatcher = 147;
        static final int TRANSACTION_isAudioServerRunning = 148;
        static final int TRANSACTION_registerAudioVolumeCallback = 149;
        static final int TRANSACTION_unregisterAudioVolumeCallback = 150;
        static final int TRANSACTION_setUidDeviceAffinity = 151;
        static final int TRANSACTION_removeUidDeviceAffinity = 152;
        static final int TRANSACTION_setUserIdDeviceAffinity = 153;
        static final int TRANSACTION_removeUserIdDeviceAffinity = 154;
        static final int TRANSACTION_hasHapticChannels = 155;
        static final int TRANSACTION_isCallScreeningModeSupported = 156;
        static final int TRANSACTION_setPreferredDevicesForStrategy = 157;
        static final int TRANSACTION_removePreferredDevicesForStrategy = 158;
        static final int TRANSACTION_getPreferredDevicesForStrategy = 159;
        static final int TRANSACTION_setDeviceAsNonDefaultForStrategy = 160;
        static final int TRANSACTION_removeDeviceAsNonDefaultForStrategy = 161;
        static final int TRANSACTION_getNonDefaultDevicesForStrategy = 162;
        static final int TRANSACTION_getDevicesForAttributes = 163;
        static final int TRANSACTION_getDevicesForAttributesUnprotected = 164;
        static final int TRANSACTION_addOnDevicesForAttributesChangedListener = 165;
        static final java.lang.String[] PERMISSIONS_addOnDevicesForAttributesChangedListener = null;
        static final int TRANSACTION_removeOnDevicesForAttributesChangedListener = 166;
        static final int TRANSACTION_setAllowedCapturePolicy = 167;
        static final int TRANSACTION_getAllowedCapturePolicy = 168;
        static final int TRANSACTION_registerStrategyPreferredDevicesDispatcher = 169;
        static final int TRANSACTION_unregisterStrategyPreferredDevicesDispatcher = 170;
        static final int TRANSACTION_registerStrategyNonDefaultDevicesDispatcher = 171;
        static final int TRANSACTION_unregisterStrategyNonDefaultDevicesDispatcher = 172;
        static final int TRANSACTION_setRttEnabled = 173;
        static final int TRANSACTION_setDeviceVolumeBehavior = 174;
        static final java.lang.String[] PERMISSIONS_setDeviceVolumeBehavior = null;
        static final int TRANSACTION_getDeviceVolumeBehavior = 175;
        static final java.lang.String[] PERMISSIONS_getDeviceVolumeBehavior = null;
        static final int TRANSACTION_setMultiAudioFocusEnabled = 176;
        static final int TRANSACTION_setPreferredDevicesForCapturePreset = 177;
        static final int TRANSACTION_clearPreferredDevicesForCapturePreset = 178;
        static final int TRANSACTION_getPreferredDevicesForCapturePreset = 179;
        static final int TRANSACTION_registerCapturePresetDevicesRoleDispatcher = 180;
        static final int TRANSACTION_unregisterCapturePresetDevicesRoleDispatcher = 181;
        static final int TRANSACTION_adjustStreamVolumeForUid = 182;
        static final int TRANSACTION_adjustSuggestedStreamVolumeForUid = 183;
        static final int TRANSACTION_setStreamVolumeForUid = 184;
        static final int TRANSACTION_adjustVolume = 185;
        static final int TRANSACTION_adjustSuggestedStreamVolume = 186;
        static final int TRANSACTION_isMusicActive = 187;
        static final int TRANSACTION_getDeviceMaskForStream = 188;
        static final int TRANSACTION_getAvailableCommunicationDeviceIds = 189;
        static final int TRANSACTION_setCommunicationDevice = 190;
        static final int TRANSACTION_getCommunicationDevice = 191;
        static final int TRANSACTION_registerCommunicationDeviceDispatcher = 192;
        static final int TRANSACTION_unregisterCommunicationDeviceDispatcher = 193;
        static final int TRANSACTION_areNavigationRepeatSoundEffectsEnabled = 194;
        static final int TRANSACTION_setNavigationRepeatSoundEffectsEnabled = 195;
        static final int TRANSACTION_isHomeSoundEffectEnabled = 196;
        static final int TRANSACTION_setHomeSoundEffectEnabled = 197;
        static final int TRANSACTION_setAdditionalOutputDeviceDelay = 198;
        static final int TRANSACTION_getAdditionalOutputDeviceDelay = 199;
        static final int TRANSACTION_getMaxAdditionalOutputDeviceDelay = 200;
        static final int TRANSACTION_requestAudioFocusForTest = 201;
        static final int TRANSACTION_abandonAudioFocusForTest = 202;
        static final int TRANSACTION_getFadeOutDurationOnFocusLossMillis = 203;
        static final int TRANSACTION_getFocusDuckedUidsForTest = 204;
        static final int TRANSACTION_getFocusFadeOutDurationForTest = 205;
        static final int TRANSACTION_getFocusUnmuteDelayAfterFadeOutForTest = 206;
        static final int TRANSACTION_enterAudioFocusFreezeForTest = 207;
        static final int TRANSACTION_exitAudioFocusFreezeForTest = 208;
        static final int TRANSACTION_registerModeDispatcher = 209;
        static final int TRANSACTION_unregisterModeDispatcher = 210;
        static final int TRANSACTION_getSpatializerImmersiveAudioLevel = 211;
        static final int TRANSACTION_isSpatializerEnabled = 212;
        static final int TRANSACTION_isSpatializerAvailable = 213;
        static final int TRANSACTION_isSpatializerAvailableForDevice = 214;
        static final int TRANSACTION_hasHeadTracker = 215;
        static final int TRANSACTION_setHeadTrackerEnabled = 216;
        static final int TRANSACTION_isHeadTrackerEnabled = 217;
        static final int TRANSACTION_isHeadTrackerAvailable = 218;
        static final int TRANSACTION_registerSpatializerHeadTrackerAvailableCallback = 219;
        static final int TRANSACTION_setSpatializerEnabled = 220;
        static final int TRANSACTION_canBeSpatialized = 221;
        static final int TRANSACTION_getSpatializedChannelMasks = 222;
        static final int TRANSACTION_registerSpatializerCallback = 223;
        static final int TRANSACTION_unregisterSpatializerCallback = 224;
        static final int TRANSACTION_registerSpatializerHeadTrackingCallback = 225;
        static final int TRANSACTION_unregisterSpatializerHeadTrackingCallback = 226;
        static final int TRANSACTION_registerHeadToSoundstagePoseCallback = 227;
        static final int TRANSACTION_unregisterHeadToSoundstagePoseCallback = 228;
        static final int TRANSACTION_getSpatializerCompatibleAudioDevices = 229;
        static final int TRANSACTION_addSpatializerCompatibleAudioDevice = 230;
        static final int TRANSACTION_removeSpatializerCompatibleAudioDevice = 231;
        static final int TRANSACTION_setDesiredHeadTrackingMode = 232;
        static final int TRANSACTION_getDesiredHeadTrackingMode = 233;
        static final int TRANSACTION_getSupportedHeadTrackingModes = 234;
        static final int TRANSACTION_getActualHeadTrackingMode = 235;
        static final int TRANSACTION_setSpatializerGlobalTransform = 236;
        static final int TRANSACTION_recenterHeadTracker = 237;
        static final int TRANSACTION_setSpatializerParameter = 238;
        static final int TRANSACTION_getSpatializerParameter = 239;
        static final int TRANSACTION_getSpatializerOutput = 240;
        static final int TRANSACTION_registerSpatializerOutputCallback = 241;
        static final int TRANSACTION_unregisterSpatializerOutputCallback = 242;
        static final int TRANSACTION_isVolumeFixed = 243;
        static final int TRANSACTION_getDefaultVolumeInfo = 244;
        static final int TRANSACTION_isPstnCallAudioInterceptable = 245;
        static final int TRANSACTION_muteAwaitConnection = 246;
        static final int TRANSACTION_cancelMuteAwaitConnection = 247;
        static final int TRANSACTION_getMutingExpectedDevice = 248;
        static final int TRANSACTION_registerMuteAwaitConnectionDispatcher = 249;
        static final int TRANSACTION_setTestDeviceConnectionState = 250;
        static final int TRANSACTION_registerDeviceVolumeBehaviorDispatcher = 251;
        static final int TRANSACTION_getFocusStack = 252;
        static final int TRANSACTION_sendFocusLossAndUpdate = 253;
        static final int TRANSACTION_sendFocusLoss = 254;
        static final int TRANSACTION_addAssistantServicesUids = 255;
        static final int TRANSACTION_removeAssistantServicesUids = 256;
        static final int TRANSACTION_setActiveAssistantServiceUids = 257;
        static final int TRANSACTION_getAssistantServicesUids = 258;
        static final int TRANSACTION_getActiveAssistantServiceUids = 259;
        static final int TRANSACTION_registerDeviceVolumeDispatcherForAbsoluteVolume = 260;
        static final int TRANSACTION_getHalVersion = 261;
        static final int TRANSACTION_setPreferredMixerAttributes = 262;
        static final int TRANSACTION_clearPreferredMixerAttributes = 263;
        static final int TRANSACTION_registerPreferredMixerAttributesDispatcher = 264;
        static final int TRANSACTION_unregisterPreferredMixerAttributesDispatcher = 265;
        static final int TRANSACTION_supportsBluetoothVariableLatency = 266;
        static final int TRANSACTION_setBluetoothVariableLatencyEnabled = 267;
        static final int TRANSACTION_isBluetoothVariableLatencyEnabled = 268;
        static final int TRANSACTION_registerLoudnessCodecUpdatesDispatcher = 269;
        static final int TRANSACTION_unregisterLoudnessCodecUpdatesDispatcher = 270;
        static final int TRANSACTION_startLoudnessCodecUpdates = 271;
        static final int TRANSACTION_stopLoudnessCodecUpdates = 272;
        static final int TRANSACTION_addLoudnessCodecInfo = 273;
        static final int TRANSACTION_removeLoudnessCodecInfo = 274;
        static final int TRANSACTION_getLoudnessParams = 275;
        static final int TRANSACTION_setFadeManagerConfigurationForFocusLoss = 276;
        static final int TRANSACTION_clearFadeManagerConfigurationForFocusLoss = 277;
        static final int TRANSACTION_getFadeManagerConfigurationForFocusLoss = 278;
        static final int TRANSACTION_shouldNotificationSoundPlay = 279;
        static final int TRANSACTION_setEnableHardening = 280;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.media.IAudioService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setDeviceVolume_enforcePermission() throws java.lang.SecurityException {}
        protected void setVolumeForDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void adjustVolumeForDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyAbsoluteVolumeChanged_enforcePermission() throws java.lang.SecurityException {}
        protected void getDeviceVolume_enforcePermission() throws java.lang.SecurityException {}
        protected void setMasterMute_enforcePermission() throws java.lang.SecurityException {}
        protected void getAudioVolumeGroups_enforcePermission() throws java.lang.SecurityException {}
        protected void setVolumeGroupVolumeIndex_enforcePermission() throws java.lang.SecurityException {}
        protected void getVolumeGroupVolumeIndex_enforcePermission() throws java.lang.SecurityException {}
        protected void getVolumeGroupMaxVolumeIndex_enforcePermission() throws java.lang.SecurityException {}
        protected void getVolumeGroupMinVolumeIndex_enforcePermission() throws java.lang.SecurityException {}
        protected void getLastAudibleVolumeForVolumeGroup_enforcePermission() throws java.lang.SecurityException {}
        protected void getLastAudibleStreamVolume_enforcePermission() throws java.lang.SecurityException {}
        protected void setSupportedSystemUsages_enforcePermission() throws java.lang.SecurityException {}
        protected void getSupportedSystemUsages_enforcePermission() throws java.lang.SecurityException {}
        protected void getAudioProductStrategies_enforcePermission() throws java.lang.SecurityException {}
        protected void isUltrasoundSupported_enforcePermission() throws java.lang.SecurityException {}
        protected void isHotwordStreamSupported_enforcePermission() throws java.lang.SecurityException {}
        protected void setInputGainIndex_enforcePermission() throws java.lang.SecurityException {}
        protected void getInputGainIndex_enforcePermission() throws java.lang.SecurityException {}
        protected void getMaxInputGainIndex_enforcePermission() throws java.lang.SecurityException {}
        protected void getMinInputGainIndex_enforcePermission() throws java.lang.SecurityException {}
        protected void isInputGainFixed_enforcePermission() throws java.lang.SecurityException {}
        protected void setEncodedSurroundMode_enforcePermission() throws java.lang.SecurityException {}
        protected void setA2dpSuspended_enforcePermission() throws java.lang.SecurityException {}
        protected void setLeAudioSuspended_enforcePermission() throws java.lang.SecurityException {}
        protected void setRingtonePlayer_enforcePermission() throws java.lang.SecurityException {}
        protected void getIndependentStreamTypes_enforcePermission() throws java.lang.SecurityException {}
        protected void getStreamTypeAlias_enforcePermission() throws java.lang.SecurityException {}
        protected void isVolumeControlUsingVolumeGroups_enforcePermission() throws java.lang.SecurityException {}
        protected void registerStreamAliasingDispatcher_enforcePermission() throws java.lang.SecurityException {}
        protected void setNotifAliasRingForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void setWiredDeviceConnectionState_enforcePermission() throws java.lang.SecurityException {}
        protected void setVolumeControllerLongPressTimeoutEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void getOutputRs2UpperBound_enforcePermission() throws java.lang.SecurityException {}
        protected void setOutputRs2UpperBound_enforcePermission() throws java.lang.SecurityException {}
        protected void getCsd_enforcePermission() throws java.lang.SecurityException {}
        protected void setCsd_enforcePermission() throws java.lang.SecurityException {}
        protected void forceUseFrameworkMel_enforcePermission() throws java.lang.SecurityException {}
        protected void forceComputeCsdOnAllDevices_enforcePermission() throws java.lang.SecurityException {}
        protected void isCsdEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void isCsdAsAFeatureAvailable_enforcePermission() throws java.lang.SecurityException {}
        protected void isCsdAsAFeatureEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void setCsdAsAFeatureEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void setBluetoothAudioDeviceCategory_enforcePermission() throws java.lang.SecurityException {}
        protected void getBluetoothAudioDeviceCategory_enforcePermission() throws java.lang.SecurityException {}
        protected void isBluetoothAudioDeviceCategoryFixed_enforcePermission() throws java.lang.SecurityException {}
        protected void updateMixingRulesForPolicy_enforcePermission() throws java.lang.SecurityException {}
        protected void dispatchFocusChangeWithFade_enforcePermission() throws java.lang.SecurityException {}
        protected void handleBluetoothActiveDeviceChanged_enforcePermission() throws java.lang.SecurityException {}
        protected void setPreferredDevicesForStrategy_enforcePermission() throws java.lang.SecurityException {}
        protected void removePreferredDevicesForStrategy_enforcePermission() throws java.lang.SecurityException {}
        protected void getPreferredDevicesForStrategy_enforcePermission() throws java.lang.SecurityException {}
        protected void setDeviceAsNonDefaultForStrategy_enforcePermission() throws java.lang.SecurityException {}
        protected void removeDeviceAsNonDefaultForStrategy_enforcePermission() throws java.lang.SecurityException {}
        protected void getNonDefaultDevicesForStrategy_enforcePermission() throws java.lang.SecurityException {}
        protected void addOnDevicesForAttributesChangedListener_enforcePermission() throws java.lang.SecurityException {}
        protected void setDeviceVolumeBehavior_enforcePermission() throws java.lang.SecurityException {}
        protected void getDeviceVolumeBehavior_enforcePermission() throws java.lang.SecurityException {}
        protected void setMultiAudioFocusEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void clearPreferredDevicesForCapturePreset_enforcePermission() throws java.lang.SecurityException {}
        protected void getPreferredDevicesForCapturePreset_enforcePermission() throws java.lang.SecurityException {}
        protected void getFocusDuckedUidsForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void getFocusFadeOutDurationForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void getFocusUnmuteDelayAfterFadeOutForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void enterAudioFocusFreezeForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void exitAudioFocusFreezeForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void isSpatializerAvailableForDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void hasHeadTracker_enforcePermission() throws java.lang.SecurityException {}
        protected void setHeadTrackerEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void isHeadTrackerEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void setSpatializerEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void registerSpatializerHeadTrackingCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterSpatializerHeadTrackingCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void registerHeadToSoundstagePoseCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterHeadToSoundstagePoseCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void getSpatializerCompatibleAudioDevices_enforcePermission() throws java.lang.SecurityException {}
        protected void addSpatializerCompatibleAudioDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void removeSpatializerCompatibleAudioDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void setDesiredHeadTrackingMode_enforcePermission() throws java.lang.SecurityException {}
        protected void getDesiredHeadTrackingMode_enforcePermission() throws java.lang.SecurityException {}
        protected void getSupportedHeadTrackingModes_enforcePermission() throws java.lang.SecurityException {}
        protected void getActualHeadTrackingMode_enforcePermission() throws java.lang.SecurityException {}
        protected void setSpatializerGlobalTransform_enforcePermission() throws java.lang.SecurityException {}
        protected void recenterHeadTracker_enforcePermission() throws java.lang.SecurityException {}
        protected void setSpatializerParameter_enforcePermission() throws java.lang.SecurityException {}
        protected void getSpatializerParameter_enforcePermission() throws java.lang.SecurityException {}
        protected void getSpatializerOutput_enforcePermission() throws java.lang.SecurityException {}
        protected void registerSpatializerOutputCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterSpatializerOutputCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void isPstnCallAudioInterceptable_enforcePermission() throws java.lang.SecurityException {}
        protected void getMutingExpectedDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void registerMuteAwaitConnectionDispatcher_enforcePermission() throws java.lang.SecurityException {}
        protected void getFocusStack_enforcePermission() throws java.lang.SecurityException {}
        protected void sendFocusLossAndUpdate_enforcePermission() throws java.lang.SecurityException {}
        protected void sendFocusLoss_enforcePermission() throws java.lang.SecurityException {}
        protected void addAssistantServicesUids_enforcePermission() throws java.lang.SecurityException {}
        protected void removeAssistantServicesUids_enforcePermission() throws java.lang.SecurityException {}
        protected void setActiveAssistantServiceUids_enforcePermission() throws java.lang.SecurityException {}
        protected void getAssistantServicesUids_enforcePermission() throws java.lang.SecurityException {}
        protected void getActiveAssistantServiceUids_enforcePermission() throws java.lang.SecurityException {}
        protected void supportsBluetoothVariableLatency_enforcePermission() throws java.lang.SecurityException {}
        protected void setBluetoothVariableLatencyEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void isBluetoothVariableLatencyEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void setFadeManagerConfigurationForFocusLoss_enforcePermission() throws java.lang.SecurityException {}
        protected void clearFadeManagerConfigurationForFocusLoss_enforcePermission() throws java.lang.SecurityException {}
        protected void getFadeManagerConfigurationForFocusLoss_enforcePermission() throws java.lang.SecurityException {}
        protected void shouldNotificationSoundPlay_enforcePermission() throws java.lang.SecurityException {}
        protected void setEnableHardening_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.IAudioService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.media.IAudioManagerNative getNativeInterface() throws android.os.RemoteException { return null; }
            public int trackPlayer(android.media.PlayerBase.PlayerIdCard p0) throws android.os.RemoteException { return 0; }
            public void playerAttributes(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException {}
            public void playerEvent(int p0, int p1, int[] p2) throws android.os.RemoteException {}
            public void releasePlayer(int p0) throws android.os.RemoteException {}
            public int trackRecorder(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public void recorderEvent(int p0, int p1) throws android.os.RemoteException {}
            public void releaseRecorder(int p0) throws android.os.RemoteException {}
            public void playerSessionId(int p0, int p1) throws android.os.RemoteException {}
            public void portEvent(int p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
            public void permissionUpdateBarrier() throws android.os.RemoteException {}
            public void adjustStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void adjustStreamVolumeWithAttribution(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void setStreamVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void setStreamVolumeWithAttribution(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void setDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setVolumeForDevice(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException {}
            public void adjustVolumeForDevice(android.media.VolumeInfo p0, int p1, android.media.AudioDeviceAttributes p2, java.lang.String p3) throws android.os.RemoteException {}
            public void notifyAbsoluteVolumeChanged(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1, java.lang.String p2) throws android.os.RemoteException {}
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
            public int getLastAudibleVolumeForVolumeGroup(int p0) throws android.os.RemoteException { return 0; }
            public boolean isVolumeGroupMuted(int p0) throws android.os.RemoteException { return false; }
            public void adjustVolumeGroupVolume(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public int getLastAudibleStreamVolume(int p0) throws android.os.RemoteException { return 0; }
            public void setSupportedSystemUsages(int[] p0) throws android.os.RemoteException {}
            public int[] getSupportedSystemUsages() throws android.os.RemoteException { return null; }
            public java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategies() throws android.os.RemoteException { return null; }
            public boolean isMicrophoneMuted() throws android.os.RemoteException { return false; }
            public boolean isUltrasoundSupported() throws android.os.RemoteException { return false; }
            public boolean isHotwordStreamSupported(boolean p0) throws android.os.RemoteException { return false; }
            public void setMicrophoneMute(boolean p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void setInputGainIndex(android.media.AudioDeviceAttributes p0, int p1) throws android.os.RemoteException {}
            public int getInputGainIndex(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return 0; }
            public int getMaxInputGainIndex() throws android.os.RemoteException { return 0; }
            public int getMinInputGainIndex() throws android.os.RemoteException { return 0; }
            public boolean isInputGainFixed(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return false; }
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
            public void setSpeakerphoneOn(android.os.IBinder p0, boolean p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public boolean isSpeakerphoneOn() throws android.os.RemoteException { return false; }
            public void setBluetoothScoOn(boolean p0) throws android.os.RemoteException {}
            public void setA2dpSuspended(boolean p0) throws android.os.RemoteException {}
            public void setLeAudioSuspended(boolean p0) throws android.os.RemoteException {}
            public boolean isBluetoothScoOn() throws android.os.RemoteException { return false; }
            public void setBluetoothA2dpOn(boolean p0) throws android.os.RemoteException {}
            public boolean isBluetoothA2dpOn() throws android.os.RemoteException { return false; }
            public int requestAudioFocus(android.media.AudioAttributes p0, int p1, android.os.IBinder p2, android.media.IAudioFocusDispatcher p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, int p7, android.media.audiopolicy.IAudioPolicyCallback p8, int p9) throws android.os.RemoteException { return 0; }
            public int abandonAudioFocus(android.media.IAudioFocusDispatcher p0, java.lang.String p1, android.media.AudioAttributes p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public void unregisterAudioFocusClient(java.lang.String p0) throws android.os.RemoteException {}
            public int getCurrentAudioFocus() throws android.os.RemoteException { return 0; }
            public void startBluetoothSco(android.os.IBinder p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void startBluetoothScoVirtualCall(android.os.IBinder p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public void stopBluetoothSco(android.os.IBinder p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public void forceVolumeControlStream(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void setRingtonePlayer(android.media.IRingtonePlayer p0) throws android.os.RemoteException {}
            public android.media.IRingtonePlayer getRingtonePlayer() throws android.os.RemoteException { return null; }
            public int getUiSoundsStreamType() throws android.os.RemoteException { return 0; }
            public java.util.List getIndependentStreamTypes() throws android.os.RemoteException { return null; }
            public int getStreamTypeAlias(int p0) throws android.os.RemoteException { return 0; }
            public boolean isVolumeControlUsingVolumeGroups() throws android.os.RemoteException { return false; }
            public void registerStreamAliasingDispatcher(android.media.IStreamAliasingDispatcher p0, boolean p1) throws android.os.RemoteException {}
            public void setNotifAliasRingForTest(boolean p0) throws android.os.RemoteException {}
            public void setWiredDeviceConnectionState(android.media.AudioDeviceAttributes p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public android.media.AudioRoutesInfo startWatchingRoutes(android.media.IAudioRoutesObserver p0) throws android.os.RemoteException { return null; }
            public boolean isCameraSoundForced() throws android.os.RemoteException { return false; }
            public void setVolumeController(android.media.IVolumeController p0) throws android.os.RemoteException {}
            public android.media.IVolumeController getVolumeController() throws android.os.RemoteException { return null; }
            public void notifyVolumeControllerVisible(android.media.IVolumeController p0, boolean p1) throws android.os.RemoteException {}
            public void setVolumeControllerLongPressTimeoutEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean isStreamAffectedByRingerMode(int p0) throws android.os.RemoteException { return false; }
            public boolean isStreamAffectedByMute(int p0) throws android.os.RemoteException { return false; }
            public boolean isStreamMutableByUi(int p0) throws android.os.RemoteException { return false; }
            public void disableSafeMediaVolume(java.lang.String p0) throws android.os.RemoteException {}
            public void lowerVolumeToRs1(java.lang.String p0) throws android.os.RemoteException {}
            public float getOutputRs2UpperBound() throws android.os.RemoteException { return 0.0f; }
            public void setOutputRs2UpperBound(float p0) throws android.os.RemoteException {}
            public float getCsd() throws android.os.RemoteException { return 0.0f; }
            public void setCsd(float p0) throws android.os.RemoteException {}
            public void forceUseFrameworkMel(boolean p0) throws android.os.RemoteException {}
            public void forceComputeCsdOnAllDevices(boolean p0) throws android.os.RemoteException {}
            public boolean isCsdEnabled() throws android.os.RemoteException { return false; }
            public boolean isCsdAsAFeatureAvailable() throws android.os.RemoteException { return false; }
            public boolean isCsdAsAFeatureEnabled() throws android.os.RemoteException { return false; }
            public void setCsdAsAFeatureEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean setBluetoothAudioDeviceCategory(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public int getBluetoothAudioDeviceCategory(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public boolean isBluetoothAudioDeviceCategoryFixed(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int setHdmiSystemAudioSupported(boolean p0) throws android.os.RemoteException { return 0; }
            public boolean isHdmiSystemAudioSupported() throws android.os.RemoteException { return false; }
            public java.lang.String registerAudioPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1, boolean p2, boolean p3, boolean p4, boolean p5, android.media.projection.IMediaProjection p6, android.content.AttributionSource p7) throws android.os.RemoteException { return null; }
            public void unregisterAudioPolicyAsync(android.media.audiopolicy.IAudioPolicyCallback p0) throws android.os.RemoteException {}
            public java.util.List<android.media.audiopolicy.AudioMix> getRegisteredPolicyMixes() throws android.os.RemoteException { return null; }
            public void unregisterAudioPolicy(android.media.audiopolicy.IAudioPolicyCallback p0) throws android.os.RemoteException {}
            public int addMixForPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return 0; }
            public int removeMixForPolicy(android.media.audiopolicy.AudioPolicyConfig p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return 0; }
            public int updateMixingRulesForPolicy(android.media.audiopolicy.AudioMix[] p0, android.media.audiopolicy.AudioMixingRule[] p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException { return 0; }
            public int setFocusPropertiesForPolicy(int p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return 0; }
            public void setVolumePolicy(android.media.VolumePolicy p0) throws android.os.RemoteException {}
            public android.media.VolumePolicy getVolumePolicy() throws android.os.RemoteException { return null; }
            public boolean hasRegisteredDynamicPolicy() throws android.os.RemoteException { return false; }
            public void registerRecordingCallback(android.media.IRecordingConfigDispatcher p0) throws android.os.RemoteException {}
            public void unregisterRecordingCallback(android.media.IRecordingConfigDispatcher p0) throws android.os.RemoteException {}
            public java.util.List<android.media.AudioRecordingConfiguration> getActiveRecordingConfigurations() throws android.os.RemoteException { return null; }
            public void registerPlaybackCallback(android.media.IPlaybackConfigDispatcher p0) throws android.os.RemoteException {}
            public void unregisterPlaybackCallback(android.media.IPlaybackConfigDispatcher p0) throws android.os.RemoteException {}
            public java.util.List<android.media.AudioPlaybackConfiguration> getActivePlaybackConfigurations() throws android.os.RemoteException { return null; }
            public int getFocusRampTimeMs(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException { return 0; }
            public int dispatchFocusChange(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException { return 0; }
            public int dispatchFocusChangeWithFade(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2, java.util.List<android.media.AudioFocusInfo> p3, android.media.FadeManagerConfiguration p4) throws android.os.RemoteException { return 0; }
            public void playerHasOpPlayAudio(int p0, boolean p1) throws android.os.RemoteException {}
            public void handleBluetoothActiveDeviceChanged(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothDevice p1, android.media.BluetoothProfileConnectionInfo p2) throws android.os.RemoteException {}
            public void setFocusRequestResultFromExtPolicy(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.IAudioPolicyCallback p2) throws android.os.RemoteException {}
            public void registerAudioServerStateDispatcher(android.media.IAudioServerStateDispatcher p0) throws android.os.RemoteException {}
            public void unregisterAudioServerStateDispatcher(android.media.IAudioServerStateDispatcher p0) throws android.os.RemoteException {}
            public boolean isAudioServerRunning() throws android.os.RemoteException { return false; }
            public void registerAudioVolumeCallback(android.media.audiopolicy.IAudioVolumeChangeDispatcher p0) throws android.os.RemoteException {}
            public void unregisterAudioVolumeCallback(android.media.audiopolicy.IAudioVolumeChangeDispatcher p0) throws android.os.RemoteException {}
            public int setUidDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1, int[] p2, java.lang.String[] p3) throws android.os.RemoteException { return 0; }
            public int removeUidDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1) throws android.os.RemoteException { return 0; }
            public int setUserIdDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1, int[] p2, java.lang.String[] p3) throws android.os.RemoteException { return 0; }
            public int removeUserIdDeviceAffinity(android.media.audiopolicy.IAudioPolicyCallback p0, int p1) throws android.os.RemoteException { return 0; }
            public boolean hasHapticChannels(android.net.Uri p0) throws android.os.RemoteException { return false; }
            public boolean isCallScreeningModeSupported() throws android.os.RemoteException { return false; }
            public int setPreferredDevicesForStrategy(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) throws android.os.RemoteException { return 0; }
            public int removePreferredDevicesForStrategy(int p0) throws android.os.RemoteException { return 0; }
            public java.util.List<android.media.AudioDeviceAttributes> getPreferredDevicesForStrategy(int p0) throws android.os.RemoteException { return null; }
            public int setDeviceAsNonDefaultForStrategy(int p0, android.media.AudioDeviceAttributes p1) throws android.os.RemoteException { return 0; }
            public int removeDeviceAsNonDefaultForStrategy(int p0, android.media.AudioDeviceAttributes p1) throws android.os.RemoteException { return 0; }
            public java.util.List<android.media.AudioDeviceAttributes> getNonDefaultDevicesForStrategy(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributesUnprotected(android.media.AudioAttributes p0) throws android.os.RemoteException { return null; }
            public void addOnDevicesForAttributesChangedListener(android.media.AudioAttributes p0, android.media.IDevicesForAttributesCallback p1) throws android.os.RemoteException {}
            public void removeOnDevicesForAttributesChangedListener(android.media.IDevicesForAttributesCallback p0) throws android.os.RemoteException {}
            public int setAllowedCapturePolicy(int p0) throws android.os.RemoteException { return 0; }
            public int getAllowedCapturePolicy() throws android.os.RemoteException { return 0; }
            public void registerStrategyPreferredDevicesDispatcher(android.media.IStrategyPreferredDevicesDispatcher p0) throws android.os.RemoteException {}
            public void unregisterStrategyPreferredDevicesDispatcher(android.media.IStrategyPreferredDevicesDispatcher p0) throws android.os.RemoteException {}
            public void registerStrategyNonDefaultDevicesDispatcher(android.media.IStrategyNonDefaultDevicesDispatcher p0) throws android.os.RemoteException {}
            public void unregisterStrategyNonDefaultDevicesDispatcher(android.media.IStrategyNonDefaultDevicesDispatcher p0) throws android.os.RemoteException {}
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
            public void adjustVolume(int p0, int p1) throws android.os.RemoteException {}
            public void adjustSuggestedStreamVolume(int p0, int p1, int p2) throws android.os.RemoteException {}
            public boolean isMusicActive(boolean p0) throws android.os.RemoteException { return false; }
            public int getDeviceMaskForStream(int p0) throws android.os.RemoteException { return 0; }
            public int[] getAvailableCommunicationDeviceIds() throws android.os.RemoteException { return null; }
            public boolean setCommunicationDevice(android.os.IBinder p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
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
            public java.util.List getFocusDuckedUidsForTest() throws android.os.RemoteException { return null; }
            public long getFocusFadeOutDurationForTest() throws android.os.RemoteException { return 0L; }
            public long getFocusUnmuteDelayAfterFadeOutForTest() throws android.os.RemoteException { return 0L; }
            public boolean enterAudioFocusFreezeForTest(android.os.IBinder p0, int[] p1) throws android.os.RemoteException { return false; }
            public boolean exitAudioFocusFreezeForTest(android.os.IBinder p0) throws android.os.RemoteException { return false; }
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
            public java.util.List getSpatializedChannelMasks() throws android.os.RemoteException { return null; }
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
            public void sendFocusLossAndUpdate(android.media.AudioFocusInfo p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException {}
            public boolean sendFocusLoss(android.media.AudioFocusInfo p0, android.media.audiopolicy.IAudioPolicyCallback p1) throws android.os.RemoteException { return false; }
            public void addAssistantServicesUids(int[] p0) throws android.os.RemoteException {}
            public void removeAssistantServicesUids(int[] p0) throws android.os.RemoteException {}
            public void setActiveAssistantServiceUids(int[] p0) throws android.os.RemoteException {}
            public int[] getAssistantServicesUids() throws android.os.RemoteException { return null; }
            public int[] getActiveAssistantServiceUids() throws android.os.RemoteException { return null; }
            public void registerDeviceVolumeDispatcherForAbsoluteVolume(boolean p0, android.media.IAudioDeviceVolumeDispatcher p1, java.lang.String p2, android.media.AudioDeviceAttributes p3, java.util.List<android.media.VolumeInfo> p4, boolean p5, int p6) throws android.os.RemoteException {}
            public android.media.AudioHalVersionInfo getHalVersion() throws android.os.RemoteException { return null; }
            public int setPreferredMixerAttributes(android.media.AudioAttributes p0, int p1, android.media.AudioMixerAttributes p2) throws android.os.RemoteException { return 0; }
            public int clearPreferredMixerAttributes(android.media.AudioAttributes p0, int p1) throws android.os.RemoteException { return 0; }
            public void registerPreferredMixerAttributesDispatcher(android.media.IPreferredMixerAttributesDispatcher p0) throws android.os.RemoteException {}
            public void unregisterPreferredMixerAttributesDispatcher(android.media.IPreferredMixerAttributesDispatcher p0) throws android.os.RemoteException {}
            public boolean supportsBluetoothVariableLatency() throws android.os.RemoteException { return false; }
            public void setBluetoothVariableLatencyEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean isBluetoothVariableLatencyEnabled() throws android.os.RemoteException { return false; }
            public void registerLoudnessCodecUpdatesDispatcher(android.media.ILoudnessCodecUpdatesDispatcher p0) throws android.os.RemoteException {}
            public void unregisterLoudnessCodecUpdatesDispatcher(android.media.ILoudnessCodecUpdatesDispatcher p0) throws android.os.RemoteException {}
            public void startLoudnessCodecUpdates(int p0) throws android.os.RemoteException {}
            public void stopLoudnessCodecUpdates(int p0) throws android.os.RemoteException {}
            public void addLoudnessCodecInfo(int p0, int p1, android.media.LoudnessCodecInfo p2) throws android.os.RemoteException {}
            public void removeLoudnessCodecInfo(int p0, android.media.LoudnessCodecInfo p1) throws android.os.RemoteException {}
            public android.os.PersistableBundle getLoudnessParams(android.media.LoudnessCodecInfo p0) throws android.os.RemoteException { return null; }
            public int setFadeManagerConfigurationForFocusLoss(android.media.FadeManagerConfiguration p0) throws android.os.RemoteException { return 0; }
            public int clearFadeManagerConfigurationForFocusLoss() throws android.os.RemoteException { return 0; }
            public android.media.FadeManagerConfiguration getFadeManagerConfigurationForFocusLoss() throws android.os.RemoteException { return null; }
            public boolean shouldNotificationSoundPlay(android.media.AudioAttributes p0) throws android.os.RemoteException { return false; }
            public void setEnableHardening(boolean p0) throws android.os.RemoteException {}
        }
    }
}
