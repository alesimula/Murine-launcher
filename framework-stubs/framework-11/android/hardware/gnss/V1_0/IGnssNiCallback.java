package android.hardware.gnss.V1_0;

public interface IGnssNiCallback extends android.internal.hidl.base.V1_0.IBase {
    public static final java.lang.String kInterfaceName = "android.hardware.gnss@1.0::IGnssNiCallback";
    public static android.hardware.gnss.V1_0.IGnssNiCallback asInterface(android.os.IHwBinder p0) { return null; }
    public static android.hardware.gnss.V1_0.IGnssNiCallback castFrom(android.os.IHwInterface p0) { return null; }
    public android.os.IHwBinder asBinder();
    public static android.hardware.gnss.V1_0.IGnssNiCallback getService(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
    public static android.hardware.gnss.V1_0.IGnssNiCallback getService(boolean p0) throws android.os.RemoteException { return null; }
    public static android.hardware.gnss.V1_0.IGnssNiCallback getService(java.lang.String p0) throws android.os.RemoteException { return null; }
    public static android.hardware.gnss.V1_0.IGnssNiCallback getService() throws android.os.RemoteException { return null; }
    public void niNotifyCb(android.hardware.gnss.V1_0.IGnssNiCallback.GnssNiNotification p0) throws android.os.RemoteException;
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

    public static final class GnssNiEncodingType {
        public static final int ENC_NONE = 0;
        public static final int ENC_SUPL_GSM_DEFAULT = 1;
        public static final int ENC_SUPL_UTF8 = 2;
        public static final int ENC_SUPL_UCS2 = 3;
        public static final int ENC_UNKNOWN = -1;
        public GnssNiEncodingType() {}
        public static final java.lang.String toString(int p0) { return null; }
        public static final java.lang.String dumpBitfield(int p0) { return null; }
    }

    public static final class GnssNiNotification {
        public int notificationId;
        public byte niType;
        public int notifyFlags;
        public int timeoutSec;
        public byte defaultResponse;
        public java.lang.String requestorId;
        public java.lang.String notificationMessage;
        public int requestorIdEncoding;
        public int notificationIdEncoding;
        public GnssNiNotification() {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
        public final void readFromParcel(android.os.HwParcel p0) {}
        public static final java.util.ArrayList<android.hardware.gnss.V1_0.IGnssNiCallback.GnssNiNotification> readVectorFromParcel(android.os.HwParcel p0) { return null; }
        public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
        public final void writeToParcel(android.os.HwParcel p0) {}
        public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.gnss.V1_0.IGnssNiCallback.GnssNiNotification> p1) {}
        public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
    }

    public static final class GnssNiNotifyFlags {
        public static final int NEED_NOTIFY = 1;
        public static final int NEED_VERIFY = 2;
        public static final int PRIVACY_OVERRIDE = 4;
        public GnssNiNotifyFlags() {}
        public static final java.lang.String toString(int p0) { return null; }
        public static final java.lang.String dumpBitfield(int p0) { return null; }
    }

    public static final class GnssNiType {
        public static final byte VOICE = 1;
        public static final byte UMTS_SUPL = 2;
        public static final byte UMTS_CTRL_PLANE = 3;
        public static final byte EMERGENCY_SUPL = 4;
        public GnssNiType() {}
        public static final java.lang.String toString(byte p0) { return null; }
        public static final java.lang.String dumpBitfield(byte p0) { return null; }
    }

    public static final class GnssUserResponseType {
        public static final byte RESPONSE_ACCEPT = 1;
        public static final byte RESPONSE_DENY = 2;
        public static final byte RESPONSE_NORESP = 3;
        public GnssUserResponseType() {}
        public static final java.lang.String toString(byte p0) { return null; }
        public static final java.lang.String dumpBitfield(byte p0) { return null; }
    }

    public static final class Proxy implements android.hardware.gnss.V1_0.IGnssNiCallback {
        private android.os.IHwBinder mRemote;
        public Proxy(android.os.IHwBinder p0) {}
        public android.os.IHwBinder asBinder() { return null; }
        public java.lang.String toString() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public void niNotifyCb(android.hardware.gnss.V1_0.IGnssNiCallback.GnssNiNotification p0) throws android.os.RemoteException {}
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

    public static abstract class Stub extends android.os.HwBinder implements android.hardware.gnss.V1_0.IGnssNiCallback {
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
