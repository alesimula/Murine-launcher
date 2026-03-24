package android.telephony.ims.aidl;

public interface IImsRcsController extends android.os.IInterface {
    public void registerImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException;
    public void unregisterImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException;
    public void getImsRcsRegistrationState(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void getImsRcsRegistrationTransportType(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void registerRcsAvailabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException;
    public void unregisterRcsAvailabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException;
    public boolean isCapable(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isAvailable(int p0, int p1) throws android.os.RemoteException;
    public void requestCapabilities(int p0, java.lang.String p1, java.lang.String p2, java.util.List<android.net.Uri> p3, android.telephony.ims.aidl.IRcsUceControllerCallback p4) throws android.os.RemoteException;
    public int getUcePublishState(int p0) throws android.os.RemoteException;
    public boolean isUceSettingEnabled(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setUceSettingEnabled(int p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsRcsController {
        public Default() {}
        public void registerImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
        public void unregisterImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
        public void getImsRcsRegistrationState(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void getImsRcsRegistrationTransportType(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void registerRcsAvailabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
        public void unregisterRcsAvailabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
        public boolean isCapable(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isAvailable(int p0, int p1) throws android.os.RemoteException { return false; }
        public void requestCapabilities(int p0, java.lang.String p1, java.lang.String p2, java.util.List<android.net.Uri> p3, android.telephony.ims.aidl.IRcsUceControllerCallback p4) throws android.os.RemoteException {}
        public int getUcePublishState(int p0) throws android.os.RemoteException { return 0; }
        public boolean isUceSettingEnabled(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void setUceSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsRcsController {
        private static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsRcsController";
        static final int TRANSACTION_registerImsRegistrationCallback = 1;
        static final int TRANSACTION_unregisterImsRegistrationCallback = 2;
        static final int TRANSACTION_getImsRcsRegistrationState = 3;
        static final int TRANSACTION_getImsRcsRegistrationTransportType = 4;
        static final int TRANSACTION_registerRcsAvailabilityCallback = 5;
        static final int TRANSACTION_unregisterRcsAvailabilityCallback = 6;
        static final int TRANSACTION_isCapable = 7;
        static final int TRANSACTION_isAvailable = 8;
        static final int TRANSACTION_requestCapabilities = 9;
        static final int TRANSACTION_getUcePublishState = 10;
        static final int TRANSACTION_isUceSettingEnabled = 11;
        static final int TRANSACTION_setUceSettingEnabled = 12;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsRcsController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.IImsRcsController p0) { return false; }
        public static android.telephony.ims.aidl.IImsRcsController getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.IImsRcsController {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.IImsRcsController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
            public void unregisterImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
            public void getImsRcsRegistrationState(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void getImsRcsRegistrationTransportType(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void registerRcsAvailabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
            public void unregisterRcsAvailabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
            public boolean isCapable(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isAvailable(int p0, int p1) throws android.os.RemoteException { return false; }
            public void requestCapabilities(int p0, java.lang.String p1, java.lang.String p2, java.util.List<android.net.Uri> p3, android.telephony.ims.aidl.IRcsUceControllerCallback p4) throws android.os.RemoteException {}
            public int getUcePublishState(int p0) throws android.os.RemoteException { return 0; }
            public boolean isUceSettingEnabled(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void setUceSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
