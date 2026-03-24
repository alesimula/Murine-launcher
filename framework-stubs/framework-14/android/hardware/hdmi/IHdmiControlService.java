package android.hardware.hdmi;

public interface IHdmiControlService extends android.os.IInterface {
    public int[] getSupportedTypes() throws android.os.RemoteException;
    public android.hardware.hdmi.HdmiDeviceInfo getActiveSource() throws android.os.RemoteException;
    public void oneTouchPlay(android.hardware.hdmi.IHdmiControlCallback p0) throws android.os.RemoteException;
    public void toggleAndFollowTvPower() throws android.os.RemoteException;
    public boolean shouldHandleTvPowerKey() throws android.os.RemoteException;
    public void queryDisplayStatus(android.hardware.hdmi.IHdmiControlCallback p0) throws android.os.RemoteException;
    public void addHdmiControlStatusChangeListener(android.hardware.hdmi.IHdmiControlStatusChangeListener p0) throws android.os.RemoteException;
    public void removeHdmiControlStatusChangeListener(android.hardware.hdmi.IHdmiControlStatusChangeListener p0) throws android.os.RemoteException;
    public void addHdmiCecVolumeControlFeatureListener(android.hardware.hdmi.IHdmiCecVolumeControlFeatureListener p0) throws android.os.RemoteException;
    public void removeHdmiCecVolumeControlFeatureListener(android.hardware.hdmi.IHdmiCecVolumeControlFeatureListener p0) throws android.os.RemoteException;
    public void addHotplugEventListener(android.hardware.hdmi.IHdmiHotplugEventListener p0) throws android.os.RemoteException;
    public void removeHotplugEventListener(android.hardware.hdmi.IHdmiHotplugEventListener p0) throws android.os.RemoteException;
    public void addDeviceEventListener(android.hardware.hdmi.IHdmiDeviceEventListener p0) throws android.os.RemoteException;
    public void deviceSelect(int p0, android.hardware.hdmi.IHdmiControlCallback p1) throws android.os.RemoteException;
    public void portSelect(int p0, android.hardware.hdmi.IHdmiControlCallback p1) throws android.os.RemoteException;
    public void sendKeyEvent(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void sendVolumeKeyEvent(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public java.util.List<android.hardware.hdmi.HdmiPortInfo> getPortInfo() throws android.os.RemoteException;
    public boolean canChangeSystemAudioMode() throws android.os.RemoteException;
    public boolean getSystemAudioMode() throws android.os.RemoteException;
    public int getPhysicalAddress() throws android.os.RemoteException;
    public void setSystemAudioMode(boolean p0, android.hardware.hdmi.IHdmiControlCallback p1) throws android.os.RemoteException;
    public void addSystemAudioModeChangeListener(android.hardware.hdmi.IHdmiSystemAudioModeChangeListener p0) throws android.os.RemoteException;
    public void removeSystemAudioModeChangeListener(android.hardware.hdmi.IHdmiSystemAudioModeChangeListener p0) throws android.os.RemoteException;
    public void setArcMode(boolean p0) throws android.os.RemoteException;
    public void setProhibitMode(boolean p0) throws android.os.RemoteException;
    public void setSystemAudioVolume(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setSystemAudioMute(boolean p0) throws android.os.RemoteException;
    public void setInputChangeListener(android.hardware.hdmi.IHdmiInputChangeListener p0) throws android.os.RemoteException;
    public java.util.List<android.hardware.hdmi.HdmiDeviceInfo> getInputDevices() throws android.os.RemoteException;
    public java.util.List<android.hardware.hdmi.HdmiDeviceInfo> getDeviceList() throws android.os.RemoteException;
    public void powerOffRemoteDevice(int p0, int p1) throws android.os.RemoteException;
    public void powerOnRemoteDevice(int p0, int p1) throws android.os.RemoteException;
    public void askRemoteDeviceToBecomeActiveSource(int p0) throws android.os.RemoteException;
    public void sendVendorCommand(int p0, int p1, byte[] p2, boolean p3) throws android.os.RemoteException;
    public void addVendorCommandListener(android.hardware.hdmi.IHdmiVendorCommandListener p0, int p1) throws android.os.RemoteException;
    public void sendStandby(int p0, int p1) throws android.os.RemoteException;
    public void setHdmiRecordListener(android.hardware.hdmi.IHdmiRecordListener p0) throws android.os.RemoteException;
    public void startOneTouchRecord(int p0, byte[] p1) throws android.os.RemoteException;
    public void stopOneTouchRecord(int p0) throws android.os.RemoteException;
    public void startTimerRecording(int p0, int p1, byte[] p2) throws android.os.RemoteException;
    public void clearTimerRecording(int p0, int p1, byte[] p2) throws android.os.RemoteException;
    public void sendMhlVendorCommand(int p0, int p1, int p2, byte[] p3) throws android.os.RemoteException;
    public void addHdmiMhlVendorCommandListener(android.hardware.hdmi.IHdmiMhlVendorCommandListener p0) throws android.os.RemoteException;
    public void setStandbyMode(boolean p0) throws android.os.RemoteException;
    public void reportAudioStatus(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
    public void setSystemAudioModeOnForAudioOnlySource() throws android.os.RemoteException;
    public boolean setMessageHistorySize(int p0) throws android.os.RemoteException;
    public int getMessageHistorySize() throws android.os.RemoteException;
    public void addCecSettingChangeListener(java.lang.String p0, android.hardware.hdmi.IHdmiCecSettingChangeListener p1) throws android.os.RemoteException;
    public void removeCecSettingChangeListener(java.lang.String p0, android.hardware.hdmi.IHdmiCecSettingChangeListener p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getUserCecSettings() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllowedCecSettingStringValues(java.lang.String p0) throws android.os.RemoteException;
    public int[] getAllowedCecSettingIntValues(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getCecSettingStringValue(java.lang.String p0) throws android.os.RemoteException;
    public void setCecSettingStringValue(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int getCecSettingIntValue(java.lang.String p0) throws android.os.RemoteException;
    public void setCecSettingIntValue(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.hdmi.IHdmiControlService {
        public Default() {}
        public int[] getSupportedTypes() throws android.os.RemoteException { return null; }
        public android.hardware.hdmi.HdmiDeviceInfo getActiveSource() throws android.os.RemoteException { return null; }
        public void oneTouchPlay(android.hardware.hdmi.IHdmiControlCallback p0) throws android.os.RemoteException {}
        public void toggleAndFollowTvPower() throws android.os.RemoteException {}
        public boolean shouldHandleTvPowerKey() throws android.os.RemoteException { return false; }
        public void queryDisplayStatus(android.hardware.hdmi.IHdmiControlCallback p0) throws android.os.RemoteException {}
        public void addHdmiControlStatusChangeListener(android.hardware.hdmi.IHdmiControlStatusChangeListener p0) throws android.os.RemoteException {}
        public void removeHdmiControlStatusChangeListener(android.hardware.hdmi.IHdmiControlStatusChangeListener p0) throws android.os.RemoteException {}
        public void addHdmiCecVolumeControlFeatureListener(android.hardware.hdmi.IHdmiCecVolumeControlFeatureListener p0) throws android.os.RemoteException {}
        public void removeHdmiCecVolumeControlFeatureListener(android.hardware.hdmi.IHdmiCecVolumeControlFeatureListener p0) throws android.os.RemoteException {}
        public void addHotplugEventListener(android.hardware.hdmi.IHdmiHotplugEventListener p0) throws android.os.RemoteException {}
        public void removeHotplugEventListener(android.hardware.hdmi.IHdmiHotplugEventListener p0) throws android.os.RemoteException {}
        public void addDeviceEventListener(android.hardware.hdmi.IHdmiDeviceEventListener p0) throws android.os.RemoteException {}
        public void deviceSelect(int p0, android.hardware.hdmi.IHdmiControlCallback p1) throws android.os.RemoteException {}
        public void portSelect(int p0, android.hardware.hdmi.IHdmiControlCallback p1) throws android.os.RemoteException {}
        public void sendKeyEvent(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void sendVolumeKeyEvent(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public java.util.List<android.hardware.hdmi.HdmiPortInfo> getPortInfo() throws android.os.RemoteException { return null; }
        public boolean canChangeSystemAudioMode() throws android.os.RemoteException { return false; }
        public boolean getSystemAudioMode() throws android.os.RemoteException { return false; }
        public int getPhysicalAddress() throws android.os.RemoteException { return 0; }
        public void setSystemAudioMode(boolean p0, android.hardware.hdmi.IHdmiControlCallback p1) throws android.os.RemoteException {}
        public void addSystemAudioModeChangeListener(android.hardware.hdmi.IHdmiSystemAudioModeChangeListener p0) throws android.os.RemoteException {}
        public void removeSystemAudioModeChangeListener(android.hardware.hdmi.IHdmiSystemAudioModeChangeListener p0) throws android.os.RemoteException {}
        public void setArcMode(boolean p0) throws android.os.RemoteException {}
        public void setProhibitMode(boolean p0) throws android.os.RemoteException {}
        public void setSystemAudioVolume(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void setSystemAudioMute(boolean p0) throws android.os.RemoteException {}
        public void setInputChangeListener(android.hardware.hdmi.IHdmiInputChangeListener p0) throws android.os.RemoteException {}
        public java.util.List<android.hardware.hdmi.HdmiDeviceInfo> getInputDevices() throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.hdmi.HdmiDeviceInfo> getDeviceList() throws android.os.RemoteException { return null; }
        public void powerOffRemoteDevice(int p0, int p1) throws android.os.RemoteException {}
        public void powerOnRemoteDevice(int p0, int p1) throws android.os.RemoteException {}
        public void askRemoteDeviceToBecomeActiveSource(int p0) throws android.os.RemoteException {}
        public void sendVendorCommand(int p0, int p1, byte[] p2, boolean p3) throws android.os.RemoteException {}
        public void addVendorCommandListener(android.hardware.hdmi.IHdmiVendorCommandListener p0, int p1) throws android.os.RemoteException {}
        public void sendStandby(int p0, int p1) throws android.os.RemoteException {}
        public void setHdmiRecordListener(android.hardware.hdmi.IHdmiRecordListener p0) throws android.os.RemoteException {}
        public void startOneTouchRecord(int p0, byte[] p1) throws android.os.RemoteException {}
        public void stopOneTouchRecord(int p0) throws android.os.RemoteException {}
        public void startTimerRecording(int p0, int p1, byte[] p2) throws android.os.RemoteException {}
        public void clearTimerRecording(int p0, int p1, byte[] p2) throws android.os.RemoteException {}
        public void sendMhlVendorCommand(int p0, int p1, int p2, byte[] p3) throws android.os.RemoteException {}
        public void addHdmiMhlVendorCommandListener(android.hardware.hdmi.IHdmiMhlVendorCommandListener p0) throws android.os.RemoteException {}
        public void setStandbyMode(boolean p0) throws android.os.RemoteException {}
        public void reportAudioStatus(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void setSystemAudioModeOnForAudioOnlySource() throws android.os.RemoteException {}
        public boolean setMessageHistorySize(int p0) throws android.os.RemoteException { return false; }
        public int getMessageHistorySize() throws android.os.RemoteException { return 0; }
        public void addCecSettingChangeListener(java.lang.String p0, android.hardware.hdmi.IHdmiCecSettingChangeListener p1) throws android.os.RemoteException {}
        public void removeCecSettingChangeListener(java.lang.String p0, android.hardware.hdmi.IHdmiCecSettingChangeListener p1) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getUserCecSettings() throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getAllowedCecSettingStringValues(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int[] getAllowedCecSettingIntValues(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getCecSettingStringValue(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void setCecSettingStringValue(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public int getCecSettingIntValue(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void setCecSettingIntValue(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.hdmi.IHdmiControlService {
        public static final java.lang.String DESCRIPTOR = "android.hardware.hdmi.IHdmiControlService";
        static final int TRANSACTION_getSupportedTypes = 1;
        static final int TRANSACTION_getActiveSource = 2;
        static final int TRANSACTION_oneTouchPlay = 3;
        static final int TRANSACTION_toggleAndFollowTvPower = 4;
        static final int TRANSACTION_shouldHandleTvPowerKey = 5;
        static final int TRANSACTION_queryDisplayStatus = 6;
        static final int TRANSACTION_addHdmiControlStatusChangeListener = 7;
        static final int TRANSACTION_removeHdmiControlStatusChangeListener = 8;
        static final int TRANSACTION_addHdmiCecVolumeControlFeatureListener = 9;
        static final int TRANSACTION_removeHdmiCecVolumeControlFeatureListener = 10;
        static final int TRANSACTION_addHotplugEventListener = 11;
        static final int TRANSACTION_removeHotplugEventListener = 12;
        static final int TRANSACTION_addDeviceEventListener = 13;
        static final int TRANSACTION_deviceSelect = 14;
        static final int TRANSACTION_portSelect = 15;
        static final int TRANSACTION_sendKeyEvent = 16;
        static final int TRANSACTION_sendVolumeKeyEvent = 17;
        static final int TRANSACTION_getPortInfo = 18;
        static final int TRANSACTION_canChangeSystemAudioMode = 19;
        static final int TRANSACTION_getSystemAudioMode = 20;
        static final int TRANSACTION_getPhysicalAddress = 21;
        static final int TRANSACTION_setSystemAudioMode = 22;
        static final int TRANSACTION_addSystemAudioModeChangeListener = 23;
        static final int TRANSACTION_removeSystemAudioModeChangeListener = 24;
        static final int TRANSACTION_setArcMode = 25;
        static final int TRANSACTION_setProhibitMode = 26;
        static final int TRANSACTION_setSystemAudioVolume = 27;
        static final int TRANSACTION_setSystemAudioMute = 28;
        static final int TRANSACTION_setInputChangeListener = 29;
        static final int TRANSACTION_getInputDevices = 30;
        static final int TRANSACTION_getDeviceList = 31;
        static final int TRANSACTION_powerOffRemoteDevice = 32;
        static final int TRANSACTION_powerOnRemoteDevice = 33;
        static final int TRANSACTION_askRemoteDeviceToBecomeActiveSource = 34;
        static final int TRANSACTION_sendVendorCommand = 35;
        static final int TRANSACTION_addVendorCommandListener = 36;
        static final int TRANSACTION_sendStandby = 37;
        static final int TRANSACTION_setHdmiRecordListener = 38;
        static final int TRANSACTION_startOneTouchRecord = 39;
        static final int TRANSACTION_stopOneTouchRecord = 40;
        static final int TRANSACTION_startTimerRecording = 41;
        static final int TRANSACTION_clearTimerRecording = 42;
        static final int TRANSACTION_sendMhlVendorCommand = 43;
        static final int TRANSACTION_addHdmiMhlVendorCommandListener = 44;
        static final int TRANSACTION_setStandbyMode = 45;
        static final int TRANSACTION_reportAudioStatus = 46;
        static final int TRANSACTION_setSystemAudioModeOnForAudioOnlySource = 47;
        static final int TRANSACTION_setMessageHistorySize = 48;
        static final int TRANSACTION_getMessageHistorySize = 49;
        static final int TRANSACTION_addCecSettingChangeListener = 50;
        static final int TRANSACTION_removeCecSettingChangeListener = 51;
        static final int TRANSACTION_getUserCecSettings = 52;
        static final int TRANSACTION_getAllowedCecSettingStringValues = 53;
        static final int TRANSACTION_getAllowedCecSettingIntValues = 54;
        static final int TRANSACTION_getCecSettingStringValue = 55;
        static final int TRANSACTION_setCecSettingStringValue = 56;
        static final int TRANSACTION_getCecSettingIntValue = 57;
        static final int TRANSACTION_setCecSettingIntValue = 58;
        public Stub() { super(); }
        public static android.hardware.hdmi.IHdmiControlService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.hdmi.IHdmiControlService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int[] getSupportedTypes() throws android.os.RemoteException { return null; }
            public android.hardware.hdmi.HdmiDeviceInfo getActiveSource() throws android.os.RemoteException { return null; }
            public void oneTouchPlay(android.hardware.hdmi.IHdmiControlCallback p0) throws android.os.RemoteException {}
            public void toggleAndFollowTvPower() throws android.os.RemoteException {}
            public boolean shouldHandleTvPowerKey() throws android.os.RemoteException { return false; }
            public void queryDisplayStatus(android.hardware.hdmi.IHdmiControlCallback p0) throws android.os.RemoteException {}
            public void addHdmiControlStatusChangeListener(android.hardware.hdmi.IHdmiControlStatusChangeListener p0) throws android.os.RemoteException {}
            public void removeHdmiControlStatusChangeListener(android.hardware.hdmi.IHdmiControlStatusChangeListener p0) throws android.os.RemoteException {}
            public void addHdmiCecVolumeControlFeatureListener(android.hardware.hdmi.IHdmiCecVolumeControlFeatureListener p0) throws android.os.RemoteException {}
            public void removeHdmiCecVolumeControlFeatureListener(android.hardware.hdmi.IHdmiCecVolumeControlFeatureListener p0) throws android.os.RemoteException {}
            public void addHotplugEventListener(android.hardware.hdmi.IHdmiHotplugEventListener p0) throws android.os.RemoteException {}
            public void removeHotplugEventListener(android.hardware.hdmi.IHdmiHotplugEventListener p0) throws android.os.RemoteException {}
            public void addDeviceEventListener(android.hardware.hdmi.IHdmiDeviceEventListener p0) throws android.os.RemoteException {}
            public void deviceSelect(int p0, android.hardware.hdmi.IHdmiControlCallback p1) throws android.os.RemoteException {}
            public void portSelect(int p0, android.hardware.hdmi.IHdmiControlCallback p1) throws android.os.RemoteException {}
            public void sendKeyEvent(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void sendVolumeKeyEvent(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public java.util.List<android.hardware.hdmi.HdmiPortInfo> getPortInfo() throws android.os.RemoteException { return null; }
            public boolean canChangeSystemAudioMode() throws android.os.RemoteException { return false; }
            public boolean getSystemAudioMode() throws android.os.RemoteException { return false; }
            public int getPhysicalAddress() throws android.os.RemoteException { return 0; }
            public void setSystemAudioMode(boolean p0, android.hardware.hdmi.IHdmiControlCallback p1) throws android.os.RemoteException {}
            public void addSystemAudioModeChangeListener(android.hardware.hdmi.IHdmiSystemAudioModeChangeListener p0) throws android.os.RemoteException {}
            public void removeSystemAudioModeChangeListener(android.hardware.hdmi.IHdmiSystemAudioModeChangeListener p0) throws android.os.RemoteException {}
            public void setArcMode(boolean p0) throws android.os.RemoteException {}
            public void setProhibitMode(boolean p0) throws android.os.RemoteException {}
            public void setSystemAudioVolume(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void setSystemAudioMute(boolean p0) throws android.os.RemoteException {}
            public void setInputChangeListener(android.hardware.hdmi.IHdmiInputChangeListener p0) throws android.os.RemoteException {}
            public java.util.List<android.hardware.hdmi.HdmiDeviceInfo> getInputDevices() throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.hdmi.HdmiDeviceInfo> getDeviceList() throws android.os.RemoteException { return null; }
            public void powerOffRemoteDevice(int p0, int p1) throws android.os.RemoteException {}
            public void powerOnRemoteDevice(int p0, int p1) throws android.os.RemoteException {}
            public void askRemoteDeviceToBecomeActiveSource(int p0) throws android.os.RemoteException {}
            public void sendVendorCommand(int p0, int p1, byte[] p2, boolean p3) throws android.os.RemoteException {}
            public void addVendorCommandListener(android.hardware.hdmi.IHdmiVendorCommandListener p0, int p1) throws android.os.RemoteException {}
            public void sendStandby(int p0, int p1) throws android.os.RemoteException {}
            public void setHdmiRecordListener(android.hardware.hdmi.IHdmiRecordListener p0) throws android.os.RemoteException {}
            public void startOneTouchRecord(int p0, byte[] p1) throws android.os.RemoteException {}
            public void stopOneTouchRecord(int p0) throws android.os.RemoteException {}
            public void startTimerRecording(int p0, int p1, byte[] p2) throws android.os.RemoteException {}
            public void clearTimerRecording(int p0, int p1, byte[] p2) throws android.os.RemoteException {}
            public void sendMhlVendorCommand(int p0, int p1, int p2, byte[] p3) throws android.os.RemoteException {}
            public void addHdmiMhlVendorCommandListener(android.hardware.hdmi.IHdmiMhlVendorCommandListener p0) throws android.os.RemoteException {}
            public void setStandbyMode(boolean p0) throws android.os.RemoteException {}
            public void reportAudioStatus(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
            public void setSystemAudioModeOnForAudioOnlySource() throws android.os.RemoteException {}
            public boolean setMessageHistorySize(int p0) throws android.os.RemoteException { return false; }
            public int getMessageHistorySize() throws android.os.RemoteException { return 0; }
            public void addCecSettingChangeListener(java.lang.String p0, android.hardware.hdmi.IHdmiCecSettingChangeListener p1) throws android.os.RemoteException {}
            public void removeCecSettingChangeListener(java.lang.String p0, android.hardware.hdmi.IHdmiCecSettingChangeListener p1) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getUserCecSettings() throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getAllowedCecSettingStringValues(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int[] getAllowedCecSettingIntValues(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getCecSettingStringValue(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void setCecSettingStringValue(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public int getCecSettingIntValue(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void setCecSettingIntValue(java.lang.String p0, int p1) throws android.os.RemoteException {}
        }
    }
}
