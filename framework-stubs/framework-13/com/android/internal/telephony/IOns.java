package com.android.internal.telephony;

public interface IOns extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.IOns";
    public boolean setEnable(boolean p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isEnabled(java.lang.String p0) throws android.os.RemoteException;
    public void setPreferredDataSubscriptionId(int p0, boolean p1, com.android.internal.telephony.ISetOpportunisticDataCallback p2, java.lang.String p3) throws android.os.RemoteException;
    public int getPreferredDataSubscriptionId(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void updateAvailableNetworks(java.util.List<android.telephony.AvailableNetworkInfo> p0, com.android.internal.telephony.IUpdateAvailableNetworksCallback p1, java.lang.String p2) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.IOns {
        public Default() {}
        public boolean setEnable(boolean p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setPreferredDataSubscriptionId(int p0, boolean p1, com.android.internal.telephony.ISetOpportunisticDataCallback p2, java.lang.String p3) throws android.os.RemoteException {}
        public int getPreferredDataSubscriptionId(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void updateAvailableNetworks(java.util.List<android.telephony.AvailableNetworkInfo> p0, com.android.internal.telephony.IUpdateAvailableNetworksCallback p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.IOns {
        static final int TRANSACTION_setEnable = 1;
        static final int TRANSACTION_isEnabled = 2;
        static final int TRANSACTION_setPreferredDataSubscriptionId = 3;
        static final int TRANSACTION_getPreferredDataSubscriptionId = 4;
        static final int TRANSACTION_updateAvailableNetworks = 5;
        public Stub() { super(); }
        public static com.android.internal.telephony.IOns asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telephony.IOns {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean setEnable(boolean p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setPreferredDataSubscriptionId(int p0, boolean p1, com.android.internal.telephony.ISetOpportunisticDataCallback p2, java.lang.String p3) throws android.os.RemoteException {}
            public int getPreferredDataSubscriptionId(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void updateAvailableNetworks(java.util.List<android.telephony.AvailableNetworkInfo> p0, com.android.internal.telephony.IUpdateAvailableNetworksCallback p1, java.lang.String p2) throws android.os.RemoteException {}
        }
    }
}
