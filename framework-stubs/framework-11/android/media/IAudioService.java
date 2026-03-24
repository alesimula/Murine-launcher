package android.media;

public interface IAudioService extends android.os.IInterface {
    public int trackPlayer(android.media.PlayerBase.PlayerIdCard p0) throws android.os.RemoteException;
    public void playerAttributes(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException;
    public void playerEvent(int p0, int p1) throws android.os.RemoteException;
    public void releasePlayer(int p0) throws android.os.RemoteException;
    public int trackRecorder(android.os.IBinder p0) throws android.os.RemoteException;
    public void recorderEvent(int p0, int p1) throws android.os.RemoteException;
    public void releaseRecorder(int p0) throws android.os.RemoteException;
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
    public int setPreferredDeviceForStrategy(int p0, android.media.AudioDeviceAttributes p1) throws android.os.RemoteException;
    public int removePreferredDeviceForStrategy(int p0) throws android.os.RemoteException;
    public android.media.AudioDeviceAttributes getPreferredDeviceForStrategy(int p0) throws android.os.RemoteException;
    public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException;
    public int setAllowedCapturePolicy(int p0) throws android.os.RemoteException;
    public int getAllowedCapturePolicy() throws android.os.RemoteException;
    public void registerStrategyPreferredDeviceDispatcher(android.media.IStrategyPreferredDeviceDispatcher p0) throws android.os.RemoteException;
    public void unregisterStrategyPreferredDeviceDispatcher(android.media.IStrategyPreferredDeviceDispatcher p0) throws android.os.RemoteException;
    public void setRttEnabled(boolean p0) throws android.os.RemoteException;
    public void setDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int getDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException;
    public void setMultiAudioFocusEnabled(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.media.IAudioService {
        public Default() {}
        public int trackPlayer(android.media.PlayerBase.PlayerIdCard p0) throws android.os.RemoteException { return 0; }
        public void playerAttributes(int p0, android.media.AudioAttributes p1) throws android.os.RemoteException {}
        public void playerEvent(int p0, int p1) throws android.os.RemoteException {}
        public void releasePlayer(int p0) throws android.os.RemoteException {}
        public int trackRecorder(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public void recorderEvent(int p0, int p1) throws android.os.RemoteException {}
        public void releaseRecorder(int p0) throws android.os.RemoteException {}
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
        public int setPreferredDeviceForStrategy(int p0, android.media.AudioDeviceAttributes p1) throws android.os.RemoteException { return 0; }
        public int removePreferredDeviceForStrategy(int p0) throws android.os.RemoteException { return 0; }
        public android.media.AudioDeviceAttributes getPreferredDeviceForStrategy(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException { return null; }
        public int setAllowedCapturePolicy(int p0) throws android.os.RemoteException { return 0; }
        public int getAllowedCapturePolicy() throws android.os.RemoteException { return 0; }
        public void registerStrategyPreferredDeviceDispatcher(android.media.IStrategyPreferredDeviceDispatcher p0) throws android.os.RemoteException {}
        public void unregisterStrategyPreferredDeviceDispatcher(android.media.IStrategyPreferredDeviceDispatcher p0) throws android.os.RemoteException {}
        public void setRttEnabled(boolean p0) throws android.os.RemoteException {}
        public void setDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public int getDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return 0; }
        public void setMultiAudioFocusEnabled(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IAudioService {
        private static final java.lang.String DESCRIPTOR = "android.media.IAudioService";
        static final int TRANSACTION_trackPlayer = 1;
        static final int TRANSACTION_playerAttributes = 2;
        static final int TRANSACTION_playerEvent = 3;
        static final int TRANSACTION_releasePlayer = 4;
        static final int TRANSACTION_trackRecorder = 5;
        static final int TRANSACTION_recorderEvent = 6;
        static final int TRANSACTION_releaseRecorder = 7;
        static final int TRANSACTION_adjustSuggestedStreamVolume = 8;
        static final int TRANSACTION_adjustStreamVolume = 9;
        static final int TRANSACTION_setStreamVolume = 10;
        static final int TRANSACTION_handleVolumeKey = 11;
        static final int TRANSACTION_isStreamMute = 12;
        static final int TRANSACTION_forceRemoteSubmixFullVolume = 13;
        static final int TRANSACTION_isMasterMute = 14;
        static final int TRANSACTION_setMasterMute = 15;
        static final int TRANSACTION_getStreamVolume = 16;
        static final int TRANSACTION_getStreamMinVolume = 17;
        static final int TRANSACTION_getStreamMaxVolume = 18;
        static final int TRANSACTION_getAudioVolumeGroups = 19;
        static final int TRANSACTION_setVolumeIndexForAttributes = 20;
        static final int TRANSACTION_getVolumeIndexForAttributes = 21;
        static final int TRANSACTION_getMaxVolumeIndexForAttributes = 22;
        static final int TRANSACTION_getMinVolumeIndexForAttributes = 23;
        static final int TRANSACTION_getLastAudibleStreamVolume = 24;
        static final int TRANSACTION_setSupportedSystemUsages = 25;
        static final int TRANSACTION_getSupportedSystemUsages = 26;
        static final int TRANSACTION_getAudioProductStrategies = 27;
        static final int TRANSACTION_isMicrophoneMuted = 28;
        static final int TRANSACTION_setMicrophoneMute = 29;
        static final int TRANSACTION_setMicrophoneMuteFromSwitch = 30;
        static final int TRANSACTION_setRingerModeExternal = 31;
        static final int TRANSACTION_setRingerModeInternal = 32;
        static final int TRANSACTION_getRingerModeExternal = 33;
        static final int TRANSACTION_getRingerModeInternal = 34;
        static final int TRANSACTION_isValidRingerMode = 35;
        static final int TRANSACTION_setVibrateSetting = 36;
        static final int TRANSACTION_getVibrateSetting = 37;
        static final int TRANSACTION_shouldVibrate = 38;
        static final int TRANSACTION_setMode = 39;
        static final int TRANSACTION_getMode = 40;
        static final int TRANSACTION_playSoundEffect = 41;
        static final int TRANSACTION_playSoundEffectVolume = 42;
        static final int TRANSACTION_loadSoundEffects = 43;
        static final int TRANSACTION_unloadSoundEffects = 44;
        static final int TRANSACTION_reloadAudioSettings = 45;
        static final int TRANSACTION_avrcpSupportsAbsoluteVolume = 46;
        static final int TRANSACTION_setSpeakerphoneOn = 47;
        static final int TRANSACTION_isSpeakerphoneOn = 48;
        static final int TRANSACTION_setBluetoothScoOn = 49;
        static final int TRANSACTION_isBluetoothScoOn = 50;
        static final int TRANSACTION_setBluetoothA2dpOn = 51;
        static final int TRANSACTION_isBluetoothA2dpOn = 52;
        static final int TRANSACTION_requestAudioFocus = 53;
        static final int TRANSACTION_abandonAudioFocus = 54;
        static final int TRANSACTION_unregisterAudioFocusClient = 55;
        static final int TRANSACTION_getCurrentAudioFocus = 56;
        static final int TRANSACTION_startBluetoothSco = 57;
        static final int TRANSACTION_startBluetoothScoVirtualCall = 58;
        static final int TRANSACTION_stopBluetoothSco = 59;
        static final int TRANSACTION_forceVolumeControlStream = 60;
        static final int TRANSACTION_setRingtonePlayer = 61;
        static final int TRANSACTION_getRingtonePlayer = 62;
        static final int TRANSACTION_getUiSoundsStreamType = 63;
        static final int TRANSACTION_setWiredDeviceConnectionState = 64;
        static final int TRANSACTION_handleBluetoothA2dpDeviceConfigChange = 65;
        static final int TRANSACTION_startWatchingRoutes = 66;
        static final int TRANSACTION_isCameraSoundForced = 67;
        static final int TRANSACTION_setVolumeController = 68;
        static final int TRANSACTION_notifyVolumeControllerVisible = 69;
        static final int TRANSACTION_isStreamAffectedByRingerMode = 70;
        static final int TRANSACTION_isStreamAffectedByMute = 71;
        static final int TRANSACTION_disableSafeMediaVolume = 72;
        static final int TRANSACTION_setHdmiSystemAudioSupported = 73;
        static final int TRANSACTION_isHdmiSystemAudioSupported = 74;
        static final int TRANSACTION_registerAudioPolicy = 75;
        static final int TRANSACTION_unregisterAudioPolicyAsync = 76;
        static final int TRANSACTION_unregisterAudioPolicy = 77;
        static final int TRANSACTION_addMixForPolicy = 78;
        static final int TRANSACTION_removeMixForPolicy = 79;
        static final int TRANSACTION_setFocusPropertiesForPolicy = 80;
        static final int TRANSACTION_setVolumePolicy = 81;
        static final int TRANSACTION_hasRegisteredDynamicPolicy = 82;
        static final int TRANSACTION_registerRecordingCallback = 83;
        static final int TRANSACTION_unregisterRecordingCallback = 84;
        static final int TRANSACTION_getActiveRecordingConfigurations = 85;
        static final int TRANSACTION_registerPlaybackCallback = 86;
        static final int TRANSACTION_unregisterPlaybackCallback = 87;
        static final int TRANSACTION_getActivePlaybackConfigurations = 88;
        static final int TRANSACTION_disableRingtoneSync = 89;
        static final int TRANSACTION_getFocusRampTimeMs = 90;
        static final int TRANSACTION_dispatchFocusChange = 91;
        static final int TRANSACTION_playerHasOpPlayAudio = 92;
        static final int TRANSACTION_setBluetoothHearingAidDeviceConnectionState = 93;
        static final int TRANSACTION_setBluetoothA2dpDeviceConnectionStateSuppressNoisyIntent = 94;
        static final int TRANSACTION_setFocusRequestResultFromExtPolicy = 95;
        static final int TRANSACTION_registerAudioServerStateDispatcher = 96;
        static final int TRANSACTION_unregisterAudioServerStateDispatcher = 97;
        static final int TRANSACTION_isAudioServerRunning = 98;
        static final int TRANSACTION_setUidDeviceAffinity = 99;
        static final int TRANSACTION_removeUidDeviceAffinity = 100;
        static final int TRANSACTION_setUserIdDeviceAffinity = 101;
        static final int TRANSACTION_removeUserIdDeviceAffinity = 102;
        static final int TRANSACTION_hasHapticChannels = 103;
        static final int TRANSACTION_isCallScreeningModeSupported = 104;
        static final int TRANSACTION_setPreferredDeviceForStrategy = 105;
        static final int TRANSACTION_removePreferredDeviceForStrategy = 106;
        static final int TRANSACTION_getPreferredDeviceForStrategy = 107;
        static final int TRANSACTION_getDevicesForAttributes = 108;
        static final int TRANSACTION_setAllowedCapturePolicy = 109;
        static final int TRANSACTION_getAllowedCapturePolicy = 110;
        static final int TRANSACTION_registerStrategyPreferredDeviceDispatcher = 111;
        static final int TRANSACTION_unregisterStrategyPreferredDeviceDispatcher = 112;
        static final int TRANSACTION_setRttEnabled = 113;
        static final int TRANSACTION_setDeviceVolumeBehavior = 114;
        static final int TRANSACTION_getDeviceVolumeBehavior = 115;
        static final int TRANSACTION_setMultiAudioFocusEnabled = 116;
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
            public void playerEvent(int p0, int p1) throws android.os.RemoteException {}
            public void releasePlayer(int p0) throws android.os.RemoteException {}
            public int trackRecorder(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public void recorderEvent(int p0, int p1) throws android.os.RemoteException {}
            public void releaseRecorder(int p0) throws android.os.RemoteException {}
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
            public int setPreferredDeviceForStrategy(int p0, android.media.AudioDeviceAttributes p1) throws android.os.RemoteException { return 0; }
            public int removePreferredDeviceForStrategy(int p0) throws android.os.RemoteException { return 0; }
            public android.media.AudioDeviceAttributes getPreferredDeviceForStrategy(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributes(android.media.AudioAttributes p0) throws android.os.RemoteException { return null; }
            public int setAllowedCapturePolicy(int p0) throws android.os.RemoteException { return 0; }
            public int getAllowedCapturePolicy() throws android.os.RemoteException { return 0; }
            public void registerStrategyPreferredDeviceDispatcher(android.media.IStrategyPreferredDeviceDispatcher p0) throws android.os.RemoteException {}
            public void unregisterStrategyPreferredDeviceDispatcher(android.media.IStrategyPreferredDeviceDispatcher p0) throws android.os.RemoteException {}
            public void setRttEnabled(boolean p0) throws android.os.RemoteException {}
            public void setDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public int getDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0) throws android.os.RemoteException { return 0; }
            public void setMultiAudioFocusEnabled(boolean p0) throws android.os.RemoteException {}
        }
    }
}
