package android.hardware.hdmi;

public final class HdmiControlServiceWrapper {
    public static final int DEVICE_PURE_CEC_SWITCH = 6;
    private java.util.List<android.hardware.hdmi.HdmiPortInfo> mInfoList;
    private int[] mTypes;
    private final android.hardware.hdmi.IHdmiControlService mInterface = null;
    public HdmiControlServiceWrapper() {}
    public android.hardware.hdmi.HdmiControlManager createHdmiControlManager() { return null; }
    public void setPortInfo(java.util.List<android.hardware.hdmi.HdmiPortInfo> p0) {}
    public void setDeviceTypes(int[] p0) {}
    public java.util.List<android.hardware.hdmi.HdmiPortInfo> getPortInfo() { return null; }
    public int[] getSupportedTypes() { return null; }
    public android.hardware.hdmi.HdmiDeviceInfo getActiveSource() { return null; }
    public void oneTouchPlay(android.hardware.hdmi.IHdmiControlCallback p0) {}
    public void toggleAndFollowTvPower() {}
    public boolean shouldHandleTvPowerKey() { return false; }
    public void queryDisplayStatus(android.hardware.hdmi.IHdmiControlCallback p0) {}
    public void addHdmiControlStatusChangeListener(android.hardware.hdmi.IHdmiControlStatusChangeListener p0) {}
    public void removeHdmiControlStatusChangeListener(android.hardware.hdmi.IHdmiControlStatusChangeListener p0) {}
    public void addHotplugEventListener(android.hardware.hdmi.IHdmiHotplugEventListener p0) {}
    public void removeHotplugEventListener(android.hardware.hdmi.IHdmiHotplugEventListener p0) {}
    public void addDeviceEventListener(android.hardware.hdmi.IHdmiDeviceEventListener p0) {}
    public void deviceSelect(int p0, android.hardware.hdmi.IHdmiControlCallback p1) {}
    public void portSelect(int p0, android.hardware.hdmi.IHdmiControlCallback p1) {}
    public void sendKeyEvent(int p0, int p1, boolean p2) {}
    public void sendVolumeKeyEvent(int p0, int p1, boolean p2) {}
    public boolean canChangeSystemAudioMode() { return false; }
    public boolean getSystemAudioMode() { return false; }
    public int getPhysicalAddress() { return 0; }
    public void setSystemAudioMode(boolean p0, android.hardware.hdmi.IHdmiControlCallback p1) {}
    public void addSystemAudioModeChangeListener(android.hardware.hdmi.IHdmiSystemAudioModeChangeListener p0) {}
    public void removeSystemAudioModeChangeListener(android.hardware.hdmi.IHdmiSystemAudioModeChangeListener p0) {}
    public void setArcMode(boolean p0) {}
    public void setProhibitMode(boolean p0) {}
    public void setSystemAudioVolume(int p0, int p1, int p2) {}
    public void setSystemAudioMute(boolean p0) {}
    public void setInputChangeListener(android.hardware.hdmi.IHdmiInputChangeListener p0) {}
    public java.util.List<android.hardware.hdmi.HdmiDeviceInfo> getInputDevices() { return null; }
    public java.util.List<android.hardware.hdmi.HdmiDeviceInfo> getDeviceList() { return null; }
    public void powerOffRemoteDevice(int p0, int p1) {}
    public void powerOnRemoteDevice(int p0, int p1) {}
    public void askRemoteDeviceToBecomeActiveSource(int p0) {}
    public void sendVendorCommand(int p0, int p1, byte[] p2, boolean p3) {}
    public void addVendorCommandListener(android.hardware.hdmi.IHdmiVendorCommandListener p0, int p1) {}
    public void sendStandby(int p0, int p1) {}
    public void setHdmiRecordListener(android.hardware.hdmi.IHdmiRecordListener p0) {}
    public void startOneTouchRecord(int p0, byte[] p1) {}
    public void stopOneTouchRecord(int p0) {}
    public void startTimerRecording(int p0, int p1, byte[] p2) {}
    public void clearTimerRecording(int p0, int p1, byte[] p2) {}
    public void sendMhlVendorCommand(int p0, int p1, int p2, byte[] p3) {}
    public void addHdmiMhlVendorCommandListener(android.hardware.hdmi.IHdmiMhlVendorCommandListener p0) {}
    public void setStandbyMode(boolean p0) {}
    public void setHdmiCecVolumeControlEnabled(boolean p0) {}
    public boolean isHdmiCecVolumeControlEnabled() { return false; }
    public void reportAudioStatus(int p0, int p1, int p2, boolean p3) {}
    public void setSystemAudioModeOnForAudioOnlySource() {}
    public void addHdmiCecVolumeControlFeatureListener(android.hardware.hdmi.IHdmiCecVolumeControlFeatureListener p0) {}
    public void removeHdmiCecVolumeControlFeatureListener(android.hardware.hdmi.IHdmiCecVolumeControlFeatureListener p0) {}
    public void addCecSettingChangeListener(java.lang.String p0, android.hardware.hdmi.IHdmiCecSettingChangeListener p1) {}
    public void removeCecSettingChangeListener(java.lang.String p0, android.hardware.hdmi.IHdmiCecSettingChangeListener p1) {}
    public java.util.List<java.lang.String> getUserCecSettings() { return null; }
    public java.util.List<java.lang.String> getAllowedCecSettingStringValues(java.lang.String p0) { return null; }
    public int[] getAllowedCecSettingIntValues(java.lang.String p0) { return null; }
    public java.lang.String getCecSettingStringValue(java.lang.String p0) { return null; }
    public void setCecSettingStringValue(java.lang.String p0, java.lang.String p1) {}
    public int getCecSettingIntValue(java.lang.String p0) { return 0; }
    public void setCecSettingIntValue(java.lang.String p0, int p1) {}
}
