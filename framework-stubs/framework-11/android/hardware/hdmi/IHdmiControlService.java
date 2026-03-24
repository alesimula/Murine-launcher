package android.hardware.hdmi;

public interface IHdmiControlService extends android.os.IInterface {
    public int[] getSupportedTypes() throws android.os.RemoteException;
    public android.hardware.hdmi.HdmiDeviceInfo getActiveSource() throws android.os.RemoteException;
    public void oneTouchPlay(android.hardware.hdmi.IHdmiControlCallback p0) throws android.os.RemoteException;
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
    public void setHdmiCecVolumeControlEnabled(boolean p0) throws android.os.RemoteException;
    public boolean isHdmiCecVolumeControlEnabled() throws android.os.RemoteException;
    public void reportAudioStatus(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
    public void setSystemAudioModeOnForAudioOnlySource() throws android.os.RemoteException;

    public static class Default implements android.hardware.hdmi.IHdmiControlService {
        public Default() {}
        public int[] getSupportedTypes() throws android.os.RemoteException { return null; }
        public android.hardware.hdmi.HdmiDeviceInfo getActiveSource() throws android.os.RemoteException { return null; }
        public void oneTouchPlay(android.hardware.hdmi.IHdmiControlCallback p0) throws android.os.RemoteException {}
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
        public void setHdmiCecVolumeControlEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean isHdmiCecVolumeControlEnabled() throws android.os.RemoteException { return false; }
        public void reportAudioStatus(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void setSystemAudioModeOnForAudioOnlySource() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.hdmi.IHdmiControlService {
        private static final java.lang.String DESCRIPTOR = "android.hardware.hdmi.IHdmiControlService";
        static final int TRANSACTION_getSupportedTypes = 1;
        static final int TRANSACTION_getActiveSource = 2;
        static final int TRANSACTION_oneTouchPlay = 3;
        static final int TRANSACTION_queryDisplayStatus = 4;
        static final int TRANSACTION_addHdmiControlStatusChangeListener = 5;
        static final int TRANSACTION_removeHdmiControlStatusChangeListener = 6;
        static final int TRANSACTION_addHdmiCecVolumeControlFeatureListener = 7;
        static final int TRANSACTION_removeHdmiCecVolumeControlFeatureListener = 8;
        static final int TRANSACTION_addHotplugEventListener = 9;
        static final int TRANSACTION_removeHotplugEventListener = 10;
        static final int TRANSACTION_addDeviceEventListener = 11;
        static final int TRANSACTION_deviceSelect = 12;
        static final int TRANSACTION_portSelect = 13;
        static final int TRANSACTION_sendKeyEvent = 14;
        static final int TRANSACTION_sendVolumeKeyEvent = 15;
        static final int TRANSACTION_getPortInfo = 16;
        static final int TRANSACTION_canChangeSystemAudioMode = 17;
        static final int TRANSACTION_getSystemAudioMode = 18;
        static final int TRANSACTION_getPhysicalAddress = 19;
        static final int TRANSACTION_setSystemAudioMode = 20;
        static final int TRANSACTION_addSystemAudioModeChangeListener = 21;
        static final int TRANSACTION_removeSystemAudioModeChangeListener = 22;
        static final int TRANSACTION_setArcMode = 23;
        static final int TRANSACTION_setProhibitMode = 24;
        static final int TRANSACTION_setSystemAudioVolume = 25;
        static final int TRANSACTION_setSystemAudioMute = 26;
        static final int TRANSACTION_setInputChangeListener = 27;
        static final int TRANSACTION_getInputDevices = 28;
        static final int TRANSACTION_getDeviceList = 29;
        static final int TRANSACTION_powerOffRemoteDevice = 30;
        static final int TRANSACTION_powerOnRemoteDevice = 31;
        static final int TRANSACTION_askRemoteDeviceToBecomeActiveSource = 32;
        static final int TRANSACTION_sendVendorCommand = 33;
        static final int TRANSACTION_addVendorCommandListener = 34;
        static final int TRANSACTION_sendStandby = 35;
        static final int TRANSACTION_setHdmiRecordListener = 36;
        static final int TRANSACTION_startOneTouchRecord = 37;
        static final int TRANSACTION_stopOneTouchRecord = 38;
        static final int TRANSACTION_startTimerRecording = 39;
        static final int TRANSACTION_clearTimerRecording = 40;
        static final int TRANSACTION_sendMhlVendorCommand = 41;
        static final int TRANSACTION_addHdmiMhlVendorCommandListener = 42;
        static final int TRANSACTION_setStandbyMode = 43;
        static final int TRANSACTION_setHdmiCecVolumeControlEnabled = 44;
        static final int TRANSACTION_isHdmiCecVolumeControlEnabled = 45;
        static final int TRANSACTION_reportAudioStatus = 46;
        static final int TRANSACTION_setSystemAudioModeOnForAudioOnlySource = 47;
        public Stub() { super(); }
        public static android.hardware.hdmi.IHdmiControlService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.hdmi.IHdmiControlService p0) { return false; }
        public static android.hardware.hdmi.IHdmiControlService getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.hdmi.IHdmiControlService {
            private android.os.IBinder mRemote;
            public static android.hardware.hdmi.IHdmiControlService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int[] getSupportedTypes() throws android.os.RemoteException { return null; }
            public android.hardware.hdmi.HdmiDeviceInfo getActiveSource() throws android.os.RemoteException { return null; }
            public void oneTouchPlay(android.hardware.hdmi.IHdmiControlCallback p0) throws android.os.RemoteException {}
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
            public void setHdmiCecVolumeControlEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean isHdmiCecVolumeControlEnabled() throws android.os.RemoteException { return false; }
            public void reportAudioStatus(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
            public void setSystemAudioModeOnForAudioOnlySource() throws android.os.RemoteException {}
        }
    }
}
