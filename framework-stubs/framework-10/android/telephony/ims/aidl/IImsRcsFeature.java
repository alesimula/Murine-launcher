package android.telephony.ims.aidl;

public interface IImsRcsFeature extends android.os.IInterface {

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsRcsFeature {
        private static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsRcsFeature";
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsRcsFeature asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.IImsRcsFeature p0) { return false; }
        public static android.telephony.ims.aidl.IImsRcsFeature getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.IImsRcsFeature {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.IImsRcsFeature sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
        }
    }

    public static class Default implements android.telephony.ims.aidl.IImsRcsFeature {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
    }
}
