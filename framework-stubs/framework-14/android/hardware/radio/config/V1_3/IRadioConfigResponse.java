package android.hardware.radio.config.V1_3;

public interface IRadioConfigResponse extends android.hardware.radio.config.V1_2.IRadioConfigResponse {
    public static final java.lang.String kInterfaceName = "android.hardware.radio.config@1.3::IRadioConfigResponse";
    public static android.hardware.radio.config.V1_3.IRadioConfigResponse asInterface(android.os.IHwBinder p0) { return null; }
    public static android.hardware.radio.config.V1_3.IRadioConfigResponse castFrom(android.os.IHwInterface p0) { return null; }
    public android.os.IHwBinder asBinder();
    public static android.hardware.radio.config.V1_3.IRadioConfigResponse getService(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
    public static android.hardware.radio.config.V1_3.IRadioConfigResponse getService(boolean p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.hardware.radio.config.V1_3.IRadioConfigResponse getService(java.lang.String p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.hardware.radio.config.V1_3.IRadioConfigResponse getService() throws android.os.RemoteException { return null; }
    public void getHalDeviceCapabilitiesResponse(android.hardware.radio.V1_6.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException;
    public java.util.ArrayList<java.lang.String> interfaceChain() throws android.os.RemoteException;
    public void debug(android.os.NativeHandle p0, java.util.ArrayList<java.lang.String> p1) throws android.os.RemoteException;
    public java.lang.String interfaceDescriptor() throws android.os.RemoteException;
    public java.util.ArrayList<byte[]> getHashChain() throws android.os.RemoteException;
    public void setHALInstrumentation() throws android.os.RemoteException;
    public boolean linkToDeath(android.os.IHwBinder.DeathRecipient p0, long p1) throws android.os.RemoteException;
    public void ping() throws android.os.RemoteException;
    public android.internal.hidl.base.V1_0.DebugInfo getDebugInfo() throws android.os.RemoteException;
    public void notifySyspropsChanged() throws android.os.RemoteException;
    public boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient p0) throws android.os.RemoteException;

    public static final class Proxy implements android.hardware.radio.config.V1_3.IRadioConfigResponse {
        public Proxy(android.os.IHwBinder p0) {}
        public android.os.IHwBinder asBinder() { return null; }
        public java.lang.String toString() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public void getSimSlotsStatusResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.config.V1_0.SimSlotStatus> p1) throws android.os.RemoteException {}
        public void setSimSlotsMappingResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getPhoneCapabilityResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.config.V1_1.PhoneCapability p1) throws android.os.RemoteException {}
        public void setPreferredDataModemResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setModemsConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getModemsConfigResponse(android.hardware.radio.V1_0.RadioResponseInfo p0, android.hardware.radio.config.V1_1.ModemsConfig p1) throws android.os.RemoteException {}
        public void getSimSlotsStatusResponse_1_2(android.hardware.radio.V1_0.RadioResponseInfo p0, java.util.ArrayList<android.hardware.radio.config.V1_2.SimSlotStatus> p1) throws android.os.RemoteException {}
        public void getHalDeviceCapabilitiesResponse(android.hardware.radio.V1_6.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
        public java.util.ArrayList<java.lang.String> interfaceChain() throws android.os.RemoteException { return null; }
        public void debug(android.os.NativeHandle p0, java.util.ArrayList<java.lang.String> p1) throws android.os.RemoteException {}
        public java.lang.String interfaceDescriptor() throws android.os.RemoteException { return null; }
        public java.util.ArrayList<byte[]> getHashChain() throws android.os.RemoteException { return null; }
        public void setHALInstrumentation() throws android.os.RemoteException {}
        public boolean linkToDeath(android.os.IHwBinder.DeathRecipient p0, long p1) throws android.os.RemoteException { return false; }
        public void ping() throws android.os.RemoteException {}
        public android.internal.hidl.base.V1_0.DebugInfo getDebugInfo() throws android.os.RemoteException { return null; }
        public void notifySyspropsChanged() throws android.os.RemoteException {}
        public boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.HwBinder implements android.hardware.radio.config.V1_3.IRadioConfigResponse {
        public Stub() { super(); }
        public android.os.IHwBinder asBinder() { return null; }
        public final java.util.ArrayList<java.lang.String> interfaceChain() { return null; }
        public void debug(android.os.NativeHandle p0, java.util.ArrayList<java.lang.String> p1) {}
        public final java.lang.String interfaceDescriptor() { return null; }
        public final java.util.ArrayList<byte[]> getHashChain() { return null; }
        public final void setHALInstrumentation() {}
        public final boolean linkToDeath(android.os.IHwBinder.DeathRecipient p0, long p1) { return false; }
        public final void ping() {}
        public final android.internal.hidl.base.V1_0.DebugInfo getDebugInfo() { return null; }
        public final void notifySyspropsChanged() {}
        public final boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient p0) { return false; }
        public android.os.IHwInterface queryLocalInterface(java.lang.String p0) { return null; }
        public void registerAsService(java.lang.String p0) throws android.os.RemoteException {}
        public java.lang.String toString() { return null; }
        public void onTransact(int p0, android.os.HwParcel p1, android.os.HwParcel p2, int p3) throws android.os.RemoteException {}
    }
}
