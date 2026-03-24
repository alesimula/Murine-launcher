package android.net;

public interface INetworkPolicyListener extends android.os.IInterface {
    public void onUidRulesChanged(int p0, int p1) throws android.os.RemoteException;
    public void onMeteredIfacesChanged(java.lang.String[] p0) throws android.os.RemoteException;
    public void onRestrictBackgroundChanged(boolean p0) throws android.os.RemoteException;
    public void onUidPoliciesChanged(int p0, int p1) throws android.os.RemoteException;
    public void onSubscriptionOverride(int p0, int p1, int p2, int[] p3) throws android.os.RemoteException;
    public void onSubscriptionPlansChanged(int p0, android.telephony.SubscriptionPlan[] p1) throws android.os.RemoteException;
    public void onBlockedReasonChanged(int p0, int p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.net.INetworkPolicyListener {
        public Default() {}
        public void onUidRulesChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onMeteredIfacesChanged(java.lang.String[] p0) throws android.os.RemoteException {}
        public void onRestrictBackgroundChanged(boolean p0) throws android.os.RemoteException {}
        public void onUidPoliciesChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onSubscriptionOverride(int p0, int p1, int p2, int[] p3) throws android.os.RemoteException {}
        public void onSubscriptionPlansChanged(int p0, android.telephony.SubscriptionPlan[] p1) throws android.os.RemoteException {}
        public void onBlockedReasonChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.INetworkPolicyListener {
        public static final java.lang.String DESCRIPTOR = "android.net.INetworkPolicyListener";
        static final int TRANSACTION_onUidRulesChanged = 1;
        static final int TRANSACTION_onMeteredIfacesChanged = 2;
        static final int TRANSACTION_onRestrictBackgroundChanged = 3;
        static final int TRANSACTION_onUidPoliciesChanged = 4;
        static final int TRANSACTION_onSubscriptionOverride = 5;
        static final int TRANSACTION_onSubscriptionPlansChanged = 6;
        static final int TRANSACTION_onBlockedReasonChanged = 7;
        public Stub() { super(); }
        public static android.net.INetworkPolicyListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.net.INetworkPolicyListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUidRulesChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onMeteredIfacesChanged(java.lang.String[] p0) throws android.os.RemoteException {}
            public void onRestrictBackgroundChanged(boolean p0) throws android.os.RemoteException {}
            public void onUidPoliciesChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onSubscriptionOverride(int p0, int p1, int p2, int[] p3) throws android.os.RemoteException {}
            public void onSubscriptionPlansChanged(int p0, android.telephony.SubscriptionPlan[] p1) throws android.os.RemoteException {}
            public void onBlockedReasonChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        }
    }
}
