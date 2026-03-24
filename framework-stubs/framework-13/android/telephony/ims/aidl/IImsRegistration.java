package android.telephony.ims.aidl;

public interface IImsRegistration extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsRegistration";
    public int getRegistrationTechnology() throws android.os.RemoteException;
    public void addRegistrationCallback(android.telephony.ims.aidl.IImsRegistrationCallback p0) throws android.os.RemoteException;
    public void removeRegistrationCallback(android.telephony.ims.aidl.IImsRegistrationCallback p0) throws android.os.RemoteException;
    public void triggerFullNetworkRegistration(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void triggerUpdateSipDelegateRegistration() throws android.os.RemoteException;
    public void triggerSipDelegateDeregistration() throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsRegistration {
        public Default() {}
        public int getRegistrationTechnology() throws android.os.RemoteException { return 0; }
        public void addRegistrationCallback(android.telephony.ims.aidl.IImsRegistrationCallback p0) throws android.os.RemoteException {}
        public void removeRegistrationCallback(android.telephony.ims.aidl.IImsRegistrationCallback p0) throws android.os.RemoteException {}
        public void triggerFullNetworkRegistration(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void triggerUpdateSipDelegateRegistration() throws android.os.RemoteException {}
        public void triggerSipDelegateDeregistration() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsRegistration {
        static final int TRANSACTION_getRegistrationTechnology = 1;
        static final int TRANSACTION_addRegistrationCallback = 2;
        static final int TRANSACTION_removeRegistrationCallback = 3;
        static final int TRANSACTION_triggerFullNetworkRegistration = 4;
        static final int TRANSACTION_triggerUpdateSipDelegateRegistration = 5;
        static final int TRANSACTION_triggerSipDelegateDeregistration = 6;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsRegistration asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.ims.aidl.IImsRegistration {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getRegistrationTechnology() throws android.os.RemoteException { return 0; }
            public void addRegistrationCallback(android.telephony.ims.aidl.IImsRegistrationCallback p0) throws android.os.RemoteException {}
            public void removeRegistrationCallback(android.telephony.ims.aidl.IImsRegistrationCallback p0) throws android.os.RemoteException {}
            public void triggerFullNetworkRegistration(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void triggerUpdateSipDelegateRegistration() throws android.os.RemoteException {}
            public void triggerSipDelegateDeregistration() throws android.os.RemoteException {}
        }
    }
}
