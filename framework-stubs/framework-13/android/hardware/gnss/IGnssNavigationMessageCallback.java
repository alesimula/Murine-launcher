package android.hardware.gnss;

public interface IGnssNavigationMessageCallback extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final java.lang.String DESCRIPTOR = null;
    public void gnssNavigationMessageCb(android.hardware.gnss.IGnssNavigationMessageCallback.GnssNavigationMessage p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.gnss.IGnssNavigationMessageCallback {
        public Default() {}
        public void gnssNavigationMessageCb(android.hardware.gnss.IGnssNavigationMessageCallback.GnssNavigationMessage p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static class GnssNavigationMessage implements android.os.Parcelable {
        public int svid;
        public int type;
        public int status;
        public int messageId;
        public int submessageId;
        public byte[] data;
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IGnssNavigationMessageCallback.GnssNavigationMessage> CREATOR = null;
        public static final int STATUS_PARITY_PASSED = 1;
        public static final int STATUS_PARITY_REBUILT = 2;
        public static final int STATUS_UNKNOWN = 0;
        public GnssNavigationMessage() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }

        public static @interface GnssNavigationMessageType {
            public static final int UNKNOWN = 0;
            public static final int GPS_L1CA = 257;
            public static final int GPS_L2CNAV = 258;
            public static final int GPS_L5CNAV = 259;
            public static final int SBS = 513;
            public static final int GPS_CNAV2 = 260;
            public static final int GLO_L1CA = 769;
            public static final int QZS_L1CA = 1025;
            public static final int BDS_D1 = 1281;
            public static final int BDS_D2 = 1282;
            public static final int BDS_CNAV1 = 1283;
            public static final int BDS_CNAV2 = 1284;
            public static final int GAL_I = 1537;
            public static final int GAL_F = 1538;
            public static final int IRN_L5CA = 1793;
        }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnssNavigationMessageCallback {
        static final int TRANSACTION_gnssNavigationMessageCb = 1;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.gnss.IGnssNavigationMessageCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.gnss.IGnssNavigationMessageCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void gnssNavigationMessageCb(android.hardware.gnss.IGnssNavigationMessageCallback.GnssNavigationMessage p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
