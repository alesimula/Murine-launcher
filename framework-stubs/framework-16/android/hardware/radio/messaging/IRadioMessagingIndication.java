package android.hardware.radio.messaging;

public interface IRadioMessagingIndication extends android.os.IInterface {
    public static final int VERSION = 4;
    public static final java.lang.String HASH = "b28416394e6595c08e97c0473855eb05eed1baed";
    public static final java.lang.String DESCRIPTOR = null;
    @java.lang.Deprecated
    public void cdmaNewSms(int p0, android.hardware.radio.messaging.CdmaSmsMessage p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void cdmaRuimSmsStorageFull(int p0) throws android.os.RemoteException;
    public void newBroadcastSms(int p0, byte[] p1) throws android.os.RemoteException;
    public void newSms(int p0, byte[] p1) throws android.os.RemoteException;
    public void newSmsOnSim(int p0, int p1) throws android.os.RemoteException;
    public void newSmsStatusReport(int p0, byte[] p1) throws android.os.RemoteException;
    public void simSmsStorageFull(int p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.messaging.IRadioMessagingIndication {
        public Default() {}
        public void cdmaNewSms(int p0, android.hardware.radio.messaging.CdmaSmsMessage p1) throws android.os.RemoteException {}
        public void cdmaRuimSmsStorageFull(int p0) throws android.os.RemoteException {}
        public void newBroadcastSms(int p0, byte[] p1) throws android.os.RemoteException {}
        public void newSms(int p0, byte[] p1) throws android.os.RemoteException {}
        public void newSmsOnSim(int p0, int p1) throws android.os.RemoteException {}
        public void newSmsStatusReport(int p0, byte[] p1) throws android.os.RemoteException {}
        public void simSmsStorageFull(int p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.messaging.IRadioMessagingIndication {
        static final int TRANSACTION_cdmaNewSms = 1;
        static final int TRANSACTION_cdmaRuimSmsStorageFull = 2;
        static final int TRANSACTION_newBroadcastSms = 3;
        static final int TRANSACTION_newSms = 4;
        static final int TRANSACTION_newSmsOnSim = 5;
        static final int TRANSACTION_newSmsStatusReport = 6;
        static final int TRANSACTION_simSmsStorageFull = 7;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.messaging.IRadioMessagingIndication asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.messaging.IRadioMessagingIndication {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void cdmaNewSms(int p0, android.hardware.radio.messaging.CdmaSmsMessage p1) throws android.os.RemoteException {}
            public void cdmaRuimSmsStorageFull(int p0) throws android.os.RemoteException {}
            public void newBroadcastSms(int p0, byte[] p1) throws android.os.RemoteException {}
            public void newSms(int p0, byte[] p1) throws android.os.RemoteException {}
            public void newSmsOnSim(int p0, int p1) throws android.os.RemoteException {}
            public void newSmsStatusReport(int p0, byte[] p1) throws android.os.RemoteException {}
            public void simSmsStorageFull(int p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
