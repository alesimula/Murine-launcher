package android.hardware.hdmi;

public interface IHdmiControlService extends android.os.IInterface {
    public int[] getSupportedTypes() throws android.os.RemoteException;
    public android.hardware.hdmi.HdmiDeviceInfo getActiveSource() throws android.os.RemoteException;
    public void oneTouchPlay(android.hardware.hdmi.IHdmiControlCallback p0) throws android.os.RemoteException;
    public void queryDisplayStatus(android.hardware.hdmi.IHdmiControlCallback p0) throws android.os.RemoteException;
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

    public static abstract class Stub extends android.os.Binder implements android.hardware.hdmi.IHdmiControlService {
        private static final java.lang.String DESCRIPTOR = "android.hardware.hdmi.IHdmiControlService";
        static final int TRANSACTION_getSupportedTypes = 1;
        static final int TRANSACTION_getActiveSource = 2;
        static final int TRANSACTION_oneTouchPlay = 3;
        static final int TRANSACTION_queryDisplayStatus = 4;
        static final int TRANSACTION_addHotplugEventListener = 5;
        static final int TRANSACTION_removeHotplugEventListener = 6;
        static final int TRANSACTION_addDeviceEventListener = 7;
        static final int TRANSACTION_deviceSelect = 8;
        static final int TRANSACTION_portSelect = 9;
        static final int TRANSACTION_sendKeyEvent = 10;
        static final int TRANSACTION_sendVolumeKeyEvent = 11;
        static final int TRANSACTION_getPortInfo = 12;
        static final int TRANSACTION_canChangeSystemAudioMode = 13;
        static final int TRANSACTION_getSystemAudioMode = 14;
        static final int TRANSACTION_getPhysicalAddress = 15;
        static final int TRANSACTION_setSystemAudioMode = 16;
        static final int TRANSACTION_addSystemAudioModeChangeListener = 17;
        static final int TRANSACTION_removeSystemAudioModeChangeListener = 18;
        static final int TRANSACTION_setArcMode = 19;
        static final int TRANSACTION_setProhibitMode = 20;
        static final int TRANSACTION_setSystemAudioVolume = 21;
        static final int TRANSACTION_setSystemAudioMute = 22;
        static final int TRANSACTION_setInputChangeListener = 23;
        static final int TRANSACTION_getInputDevices = 24;
        static final int TRANSACTION_getDeviceList = 25;
        static final int TRANSACTION_powerOffRemoteDevice = 26;
        static final int TRANSACTION_powerOnRemoteDevice = 27;
        static final int TRANSACTION_askRemoteDeviceToBecomeActiveSource = 28;
        static final int TRANSACTION_sendVendorCommand = 29;
        static final int TRANSACTION_addVendorCommandListener = 30;
        static final int TRANSACTION_sendStandby = 31;
        static final int TRANSACTION_setHdmiRecordListener = 32;
        static final int TRANSACTION_startOneTouchRecord = 33;
        static final int TRANSACTION_stopOneTouchRecord = 34;
        static final int TRANSACTION_startTimerRecording = 35;
        static final int TRANSACTION_clearTimerRecording = 36;
        static final int TRANSACTION_sendMhlVendorCommand = 37;
        static final int TRANSACTION_addHdmiMhlVendorCommandListener = 38;
        static final int TRANSACTION_setStandbyMode = 39;
        static final int TRANSACTION_reportAudioStatus = 40;
        static final int TRANSACTION_setSystemAudioModeOnForAudioOnlySource = 41;
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
        }
    }

    public static class Default implements android.hardware.hdmi.IHdmiControlService {
        public Default() {}
        public int[] getSupportedTypes() throws android.os.RemoteException { return null; }
        public android.hardware.hdmi.HdmiDeviceInfo getActiveSource() throws android.os.RemoteException { return null; }
        public void oneTouchPlay(android.hardware.hdmi.IHdmiControlCallback p0) throws android.os.RemoteException {}
        public void queryDisplayStatus(android.hardware.hdmi.IHdmiControlCallback p0) throws android.os.RemoteException {}
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
        public android.os.IBinder asBinder() { return null; }
    }
}
