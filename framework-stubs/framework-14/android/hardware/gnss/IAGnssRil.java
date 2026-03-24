package android.hardware.gnss;

public interface IAGnssRil extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final java.lang.String DESCRIPTOR = null;
    public static final int NETWORK_CAPABILITY_NOT_METERED = 1;
    public static final int NETWORK_CAPABILITY_NOT_ROAMING = 2;
    public void setCallback(android.hardware.gnss.IAGnssRilCallback p0) throws android.os.RemoteException;
    public void setRefLocation(android.hardware.gnss.IAGnssRil.AGnssRefLocation p0) throws android.os.RemoteException;
    public void setSetId(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void updateNetworkState(android.hardware.gnss.IAGnssRil.NetworkAttributes p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class AGnssRefLocation implements android.os.Parcelable {
        public int type;
        public android.hardware.gnss.IAGnssRil.AGnssRefLocationCellID cellID;
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IAGnssRil.AGnssRefLocation> CREATOR = null;
        public AGnssRefLocation() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static class AGnssRefLocationCellID implements android.os.Parcelable {
        public int type;
        public int mcc;
        public int mnc;
        public int lac;
        public long cid;
        public int tac;
        public int pcid;
        public int arfcn;
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IAGnssRil.AGnssRefLocationCellID> CREATOR = null;
        public AGnssRefLocationCellID() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static @interface AGnssRefLocationType {
        public static final int GSM_CELLID = 1;
        public static final int UMTS_CELLID = 2;
        public static final int LTE_CELLID = 4;
        public static final int NR_CELLID = 8;
    }

    public static class Default implements android.hardware.gnss.IAGnssRil {
        public Default() {}
        public void setCallback(android.hardware.gnss.IAGnssRilCallback p0) throws android.os.RemoteException {}
        public void setRefLocation(android.hardware.gnss.IAGnssRil.AGnssRefLocation p0) throws android.os.RemoteException {}
        public void setSetId(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void updateNetworkState(android.hardware.gnss.IAGnssRil.NetworkAttributes p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static class NetworkAttributes implements android.os.Parcelable {
        public long networkHandle;
        public boolean isConnected;
        public int capabilities;
        public java.lang.String apn;
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IAGnssRil.NetworkAttributes> CREATOR = null;
        public NetworkAttributes() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static @interface SetIdType {
        public static final int NONE = 0;
        public static final int IMSI = 1;
        public static final int MSISDM = 2;
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IAGnssRil {
        static final int TRANSACTION_setCallback = 1;
        static final int TRANSACTION_setRefLocation = 2;
        static final int TRANSACTION_setSetId = 3;
        static final int TRANSACTION_updateNetworkState = 4;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.gnss.IAGnssRil asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.gnss.IAGnssRil {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setCallback(android.hardware.gnss.IAGnssRilCallback p0) throws android.os.RemoteException {}
            public void setRefLocation(android.hardware.gnss.IAGnssRil.AGnssRefLocation p0) throws android.os.RemoteException {}
            public void setSetId(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void updateNetworkState(android.hardware.gnss.IAGnssRil.NetworkAttributes p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
