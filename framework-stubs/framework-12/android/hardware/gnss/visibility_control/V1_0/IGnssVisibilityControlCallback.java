package android.hardware.gnss.visibility_control.V1_0;

public interface IGnssVisibilityControlCallback extends android.internal.hidl.base.V1_0.IBase {
    public static final java.lang.String kInterfaceName = "android.hardware.gnss.visibility_control@1.0::IGnssVisibilityControlCallback";
    public static android.hardware.gnss.visibility_control.V1_0.IGnssVisibilityControlCallback asInterface(android.os.IHwBinder p0) { return null; }
    public static android.hardware.gnss.visibility_control.V1_0.IGnssVisibilityControlCallback castFrom(android.os.IHwInterface p0) { return null; }
    public android.os.IHwBinder asBinder();
    public static android.hardware.gnss.visibility_control.V1_0.IGnssVisibilityControlCallback getService(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
    public static android.hardware.gnss.visibility_control.V1_0.IGnssVisibilityControlCallback getService(boolean p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.hardware.gnss.visibility_control.V1_0.IGnssVisibilityControlCallback getService(java.lang.String p0) throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static android.hardware.gnss.visibility_control.V1_0.IGnssVisibilityControlCallback getService() throws android.os.RemoteException { return null; }
    public void nfwNotifyCb(android.hardware.gnss.visibility_control.V1_0.IGnssVisibilityControlCallback.NfwNotification p0) throws android.os.RemoteException;
    public boolean isInEmergencySession() throws android.os.RemoteException;
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

    public static final class NfwNotification {
        public java.lang.String proxyAppPackageName;
        public byte protocolStack;
        public java.lang.String otherProtocolStackName;
        public byte requestor;
        public java.lang.String requestorId;
        public byte responseType;
        public boolean inEmergencyMode;
        public boolean isCachedLocation;
        public NfwNotification() {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
        public final void readFromParcel(android.os.HwParcel p0) {}
        public static final java.util.ArrayList<android.hardware.gnss.visibility_control.V1_0.IGnssVisibilityControlCallback.NfwNotification> readVectorFromParcel(android.os.HwParcel p0) { return null; }
        public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
        public final void writeToParcel(android.os.HwParcel p0) {}
        public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.gnss.visibility_control.V1_0.IGnssVisibilityControlCallback.NfwNotification> p1) {}
        public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
    }

    public static final class NfwProtocolStack {
        public static final byte CTRL_PLANE = 0;
        public static final byte SUPL = 1;
        public static final byte IMS = 10;
        public static final byte SIM = 11;
        public static final byte OTHER_PROTOCOL_STACK = 100;
        public NfwProtocolStack() {}
        public static final java.lang.String toString(byte p0) { return null; }
        public static final java.lang.String dumpBitfield(byte p0) { return null; }
    }

    public static final class NfwRequestor {
        public static final byte CARRIER = 0;
        public static final byte OEM = 10;
        public static final byte MODEM_CHIPSET_VENDOR = 11;
        public static final byte GNSS_CHIPSET_VENDOR = 12;
        public static final byte OTHER_CHIPSET_VENDOR = 13;
        public static final byte AUTOMOBILE_CLIENT = 20;
        public static final byte OTHER_REQUESTOR = 100;
        public NfwRequestor() {}
        public static final java.lang.String toString(byte p0) { return null; }
        public static final java.lang.String dumpBitfield(byte p0) { return null; }
    }

    public static final class NfwResponseType {
        public static final byte REJECTED = 0;
        public static final byte ACCEPTED_NO_LOCATION_PROVIDED = 1;
        public static final byte ACCEPTED_LOCATION_PROVIDED = 2;
        public NfwResponseType() {}
        public static final java.lang.String toString(byte p0) { return null; }
        public static final java.lang.String dumpBitfield(byte p0) { return null; }
    }

    public static final class Proxy implements android.hardware.gnss.visibility_control.V1_0.IGnssVisibilityControlCallback {
        private android.os.IHwBinder mRemote;
        public Proxy(android.os.IHwBinder p0) {}
        public android.os.IHwBinder asBinder() { return null; }
        public java.lang.String toString() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public void nfwNotifyCb(android.hardware.gnss.visibility_control.V1_0.IGnssVisibilityControlCallback.NfwNotification p0) throws android.os.RemoteException {}
        public boolean isInEmergencySession() throws android.os.RemoteException { return false; }
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

    public static abstract class Stub extends android.os.HwBinder implements android.hardware.gnss.visibility_control.V1_0.IGnssVisibilityControlCallback {
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
