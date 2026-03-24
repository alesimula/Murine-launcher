package android.hardware.radio.sim;

public interface IRadioSimIndication extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "01cea196fdf8f5e41fda8dc41125f1cc2b96f757";
    public static final java.lang.String DESCRIPTOR = null;
    public void carrierInfoForImsiEncryption(int p0) throws android.os.RemoteException;
    public void cdmaSubscriptionSourceChanged(int p0, int p1) throws android.os.RemoteException;
    public void simPhonebookChanged(int p0) throws android.os.RemoteException;
    public void simPhonebookRecordsReceived(int p0, byte p1, android.hardware.radio.sim.PhonebookRecordInfo[] p2) throws android.os.RemoteException;
    public void simRefresh(int p0, android.hardware.radio.sim.SimRefreshResult p1) throws android.os.RemoteException;
    public void simStatusChanged(int p0) throws android.os.RemoteException;
    public void stkEventNotify(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void stkProactiveCommand(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void stkSessionEnd(int p0) throws android.os.RemoteException;
    public void subscriptionStatusChanged(int p0, boolean p1) throws android.os.RemoteException;
    public void uiccApplicationsEnablementChanged(int p0, boolean p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.sim.IRadioSimIndication {
        public Default() {}
        public void carrierInfoForImsiEncryption(int p0) throws android.os.RemoteException {}
        public void cdmaSubscriptionSourceChanged(int p0, int p1) throws android.os.RemoteException {}
        public void simPhonebookChanged(int p0) throws android.os.RemoteException {}
        public void simPhonebookRecordsReceived(int p0, byte p1, android.hardware.radio.sim.PhonebookRecordInfo[] p2) throws android.os.RemoteException {}
        public void simRefresh(int p0, android.hardware.radio.sim.SimRefreshResult p1) throws android.os.RemoteException {}
        public void simStatusChanged(int p0) throws android.os.RemoteException {}
        public void stkEventNotify(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void stkProactiveCommand(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void stkSessionEnd(int p0) throws android.os.RemoteException {}
        public void subscriptionStatusChanged(int p0, boolean p1) throws android.os.RemoteException {}
        public void uiccApplicationsEnablementChanged(int p0, boolean p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.sim.IRadioSimIndication {
        static final int TRANSACTION_carrierInfoForImsiEncryption = 1;
        static final int TRANSACTION_cdmaSubscriptionSourceChanged = 2;
        static final int TRANSACTION_simPhonebookChanged = 3;
        static final int TRANSACTION_simPhonebookRecordsReceived = 4;
        static final int TRANSACTION_simRefresh = 5;
        static final int TRANSACTION_simStatusChanged = 6;
        static final int TRANSACTION_stkEventNotify = 7;
        static final int TRANSACTION_stkProactiveCommand = 8;
        static final int TRANSACTION_stkSessionEnd = 9;
        static final int TRANSACTION_subscriptionStatusChanged = 10;
        static final int TRANSACTION_uiccApplicationsEnablementChanged = 11;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.sim.IRadioSimIndication asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.sim.IRadioSimIndication {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void carrierInfoForImsiEncryption(int p0) throws android.os.RemoteException {}
            public void cdmaSubscriptionSourceChanged(int p0, int p1) throws android.os.RemoteException {}
            public void simPhonebookChanged(int p0) throws android.os.RemoteException {}
            public void simPhonebookRecordsReceived(int p0, byte p1, android.hardware.radio.sim.PhonebookRecordInfo[] p2) throws android.os.RemoteException {}
            public void simRefresh(int p0, android.hardware.radio.sim.SimRefreshResult p1) throws android.os.RemoteException {}
            public void simStatusChanged(int p0) throws android.os.RemoteException {}
            public void stkEventNotify(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void stkProactiveCommand(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void stkSessionEnd(int p0) throws android.os.RemoteException {}
            public void subscriptionStatusChanged(int p0, boolean p1) throws android.os.RemoteException {}
            public void uiccApplicationsEnablementChanged(int p0, boolean p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
