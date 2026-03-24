package android.bluetooth;

public interface IBluetoothHeadsetPhone extends android.os.IInterface {
    public boolean answerCall() throws android.os.RemoteException;
    public boolean hangupCall() throws android.os.RemoteException;
    public boolean sendDtmf(int p0) throws android.os.RemoteException;
    public boolean processChld(int p0) throws android.os.RemoteException;
    public java.lang.String getNetworkOperator() throws android.os.RemoteException;
    public java.lang.String getSubscriberNumber() throws android.os.RemoteException;
    public boolean listCurrentCalls() throws android.os.RemoteException;
    public boolean queryPhoneState() throws android.os.RemoteException;
    public void updateBtHandsfreeAfterRadioTechnologyChange() throws android.os.RemoteException;
    public void cdmaSwapSecondCallState() throws android.os.RemoteException;
    public void cdmaSetSecondCallState(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothHeadsetPhone {
        public Default() {}
        public boolean answerCall() throws android.os.RemoteException { return false; }
        public boolean hangupCall() throws android.os.RemoteException { return false; }
        public boolean sendDtmf(int p0) throws android.os.RemoteException { return false; }
        public boolean processChld(int p0) throws android.os.RemoteException { return false; }
        public java.lang.String getNetworkOperator() throws android.os.RemoteException { return null; }
        public java.lang.String getSubscriberNumber() throws android.os.RemoteException { return null; }
        public boolean listCurrentCalls() throws android.os.RemoteException { return false; }
        public boolean queryPhoneState() throws android.os.RemoteException { return false; }
        public void updateBtHandsfreeAfterRadioTechnologyChange() throws android.os.RemoteException {}
        public void cdmaSwapSecondCallState() throws android.os.RemoteException {}
        public void cdmaSetSecondCallState(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothHeadsetPhone {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothHeadsetPhone";
        static final int TRANSACTION_answerCall = 1;
        static final int TRANSACTION_hangupCall = 2;
        static final int TRANSACTION_sendDtmf = 3;
        static final int TRANSACTION_processChld = 4;
        static final int TRANSACTION_getNetworkOperator = 5;
        static final int TRANSACTION_getSubscriberNumber = 6;
        static final int TRANSACTION_listCurrentCalls = 7;
        static final int TRANSACTION_queryPhoneState = 8;
        static final int TRANSACTION_updateBtHandsfreeAfterRadioTechnologyChange = 9;
        static final int TRANSACTION_cdmaSwapSecondCallState = 10;
        static final int TRANSACTION_cdmaSetSecondCallState = 11;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothHeadsetPhone asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothHeadsetPhone p0) { return false; }
        public static android.bluetooth.IBluetoothHeadsetPhone getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothHeadsetPhone {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothHeadsetPhone sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean answerCall() throws android.os.RemoteException { return false; }
            public boolean hangupCall() throws android.os.RemoteException { return false; }
            public boolean sendDtmf(int p0) throws android.os.RemoteException { return false; }
            public boolean processChld(int p0) throws android.os.RemoteException { return false; }
            public java.lang.String getNetworkOperator() throws android.os.RemoteException { return null; }
            public java.lang.String getSubscriberNumber() throws android.os.RemoteException { return null; }
            public boolean listCurrentCalls() throws android.os.RemoteException { return false; }
            public boolean queryPhoneState() throws android.os.RemoteException { return false; }
            public void updateBtHandsfreeAfterRadioTechnologyChange() throws android.os.RemoteException {}
            public void cdmaSwapSecondCallState() throws android.os.RemoteException {}
            public void cdmaSetSecondCallState(boolean p0) throws android.os.RemoteException {}
        }
    }
}
