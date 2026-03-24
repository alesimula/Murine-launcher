package com.android.internal.telephony;

public class RadioConfigProxy {
    public RadioConfigProxy(com.android.internal.telephony.RadioConfig p0, com.android.internal.telephony.HalVersion p1) {}
    public void setHidl(com.android.internal.telephony.HalVersion p0, android.hardware.radio.config.V1_0.IRadioConfig p1) {}
    public android.hardware.radio.config.V1_0.IRadioConfig getHidl10() { return null; }
    public android.hardware.radio.config.V1_1.IRadioConfig getHidl11() { return null; }
    public android.hardware.radio.config.V1_3.IRadioConfig getHidl13() { return null; }
    public void setAidl(com.android.internal.telephony.HalVersion p0, android.hardware.radio.config.IRadioConfig p1) {}
    public android.hardware.radio.config.IRadioConfig getAidl() { return null; }
    public void clear() {}
    public void linkToDeath(long p0) throws android.os.RemoteException {}
    public boolean isEmpty() { return false; }
    public boolean isAidl() { return false; }
    public com.android.internal.telephony.HalVersion getVersion() { return null; }
    public void setResponseFunctions(com.android.internal.telephony.RadioConfig p0) throws android.os.RemoteException {}
    public java.util.Set<java.lang.String> getFullCapabilitySet() { return null; }
    public void getSimSlotStatus(int p0) throws android.os.RemoteException {}
    public void setPreferredDataModem(int p0, int p1) throws android.os.RemoteException {}
    public void getPhoneCapability(int p0) throws android.os.RemoteException {}
    public void setSimSlotsMapping(int p0, java.util.List<android.telephony.UiccSlotMapping> p1) throws android.os.RemoteException {}
    public void setNumOfLiveModems(int p0, int p1) throws android.os.RemoteException {}
    public void getHalDeviceCapabilities(int p0) throws android.os.RemoteException {}
    public java.lang.String toString() { return null; }

    private static class RadioConfigAidlServiceDeathRecipient implements android.os.IBinder.DeathRecipient {
        RadioConfigAidlServiceDeathRecipient(com.android.internal.telephony.RadioConfig p0) {}
        public void setService(android.os.IBinder p0) {}
        public void linkToDeath(int p0) throws android.os.RemoteException {}
        public void clear() {}
        public synchronized void unlinkToDeath() {}
        public void binderDied() {}
    }

    private static class RadioConfigHidlServiceDeathRecipient implements android.os.IHwBinder.DeathRecipient {
        RadioConfigHidlServiceDeathRecipient(com.android.internal.telephony.RadioConfig p0) {}
        public void setService(android.hardware.radio.config.V1_0.IRadioConfig p0) {}
        public void linkToDeath(long p0) throws android.os.RemoteException {}
        public void clear() {}
        public void serviceDied(long p0) {}
    }
}
