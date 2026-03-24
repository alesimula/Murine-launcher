package android.telephony;

public interface ICellBroadcastService extends android.os.IInterface {
    public void handleGsmCellBroadcastSms(int p0, byte[] p1) throws android.os.RemoteException;
    public void handleCdmaCellBroadcastSms(int p0, byte[] p1, int p2) throws android.os.RemoteException;
    public void handleCdmaScpMessage(int p0, java.util.List<android.telephony.cdma.CdmaSmsCbProgramData> p1, java.lang.String p2, android.os.RemoteCallback p3) throws android.os.RemoteException;
    public java.lang.CharSequence getCellBroadcastAreaInfo(int p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.ICellBroadcastService {
        public Default() {}
        public void handleGsmCellBroadcastSms(int p0, byte[] p1) throws android.os.RemoteException {}
        public void handleCdmaCellBroadcastSms(int p0, byte[] p1, int p2) throws android.os.RemoteException {}
        public void handleCdmaScpMessage(int p0, java.util.List<android.telephony.cdma.CdmaSmsCbProgramData> p1, java.lang.String p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public java.lang.CharSequence getCellBroadcastAreaInfo(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ICellBroadcastService {
        private static final java.lang.String DESCRIPTOR = "android.telephony.ICellBroadcastService";
        static final int TRANSACTION_handleGsmCellBroadcastSms = 1;
        static final int TRANSACTION_handleCdmaCellBroadcastSms = 2;
        static final int TRANSACTION_handleCdmaScpMessage = 3;
        static final int TRANSACTION_getCellBroadcastAreaInfo = 4;
        public Stub() { super(); }
        public static android.telephony.ICellBroadcastService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ICellBroadcastService p0) { return false; }
        public static android.telephony.ICellBroadcastService getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ICellBroadcastService {
            private android.os.IBinder mRemote;
            public static android.telephony.ICellBroadcastService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void handleGsmCellBroadcastSms(int p0, byte[] p1) throws android.os.RemoteException {}
            public void handleCdmaCellBroadcastSms(int p0, byte[] p1, int p2) throws android.os.RemoteException {}
            public void handleCdmaScpMessage(int p0, java.util.List<android.telephony.cdma.CdmaSmsCbProgramData> p1, java.lang.String p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
            public java.lang.CharSequence getCellBroadcastAreaInfo(int p0) throws android.os.RemoteException { return null; }
        }
    }
}
