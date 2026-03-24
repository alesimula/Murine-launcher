package com.android.internal.telecom;

public interface ICallDiagnosticService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.ICallDiagnosticService";
    public void setAdapter(com.android.internal.telecom.ICallDiagnosticServiceAdapter p0) throws android.os.RemoteException;
    public void initializeDiagnosticCall(android.telecom.ParcelableCall p0) throws android.os.RemoteException;
    public void updateCall(android.telecom.ParcelableCall p0) throws android.os.RemoteException;
    public void updateCallAudioState(android.telecom.CallAudioState p0) throws android.os.RemoteException;
    public void removeDiagnosticCall(java.lang.String p0) throws android.os.RemoteException;
    public void receiveDeviceToDeviceMessage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void callQualityChanged(java.lang.String p0, android.telephony.CallQuality p1) throws android.os.RemoteException;
    public void receiveBluetoothCallQualityReport(android.telecom.BluetoothCallQualityReport p0) throws android.os.RemoteException;
    public void notifyCallDisconnected(java.lang.String p0, android.telecom.DisconnectCause p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telecom.ICallDiagnosticService {
        public Default() {}
        public void setAdapter(com.android.internal.telecom.ICallDiagnosticServiceAdapter p0) throws android.os.RemoteException {}
        public void initializeDiagnosticCall(android.telecom.ParcelableCall p0) throws android.os.RemoteException {}
        public void updateCall(android.telecom.ParcelableCall p0) throws android.os.RemoteException {}
        public void updateCallAudioState(android.telecom.CallAudioState p0) throws android.os.RemoteException {}
        public void removeDiagnosticCall(java.lang.String p0) throws android.os.RemoteException {}
        public void receiveDeviceToDeviceMessage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void callQualityChanged(java.lang.String p0, android.telephony.CallQuality p1) throws android.os.RemoteException {}
        public void receiveBluetoothCallQualityReport(android.telecom.BluetoothCallQualityReport p0) throws android.os.RemoteException {}
        public void notifyCallDisconnected(java.lang.String p0, android.telecom.DisconnectCause p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.ICallDiagnosticService {
        static final int TRANSACTION_setAdapter = 1;
        static final int TRANSACTION_initializeDiagnosticCall = 2;
        static final int TRANSACTION_updateCall = 3;
        static final int TRANSACTION_updateCallAudioState = 4;
        static final int TRANSACTION_removeDiagnosticCall = 5;
        static final int TRANSACTION_receiveDeviceToDeviceMessage = 6;
        static final int TRANSACTION_callQualityChanged = 7;
        static final int TRANSACTION_receiveBluetoothCallQualityReport = 8;
        static final int TRANSACTION_notifyCallDisconnected = 9;
        public Stub() { super(); }
        public static com.android.internal.telecom.ICallDiagnosticService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telecom.ICallDiagnosticService p0) { return false; }
        public static com.android.internal.telecom.ICallDiagnosticService getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telecom.ICallDiagnosticService {
            private android.os.IBinder mRemote;
            public static com.android.internal.telecom.ICallDiagnosticService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setAdapter(com.android.internal.telecom.ICallDiagnosticServiceAdapter p0) throws android.os.RemoteException {}
            public void initializeDiagnosticCall(android.telecom.ParcelableCall p0) throws android.os.RemoteException {}
            public void updateCall(android.telecom.ParcelableCall p0) throws android.os.RemoteException {}
            public void updateCallAudioState(android.telecom.CallAudioState p0) throws android.os.RemoteException {}
            public void removeDiagnosticCall(java.lang.String p0) throws android.os.RemoteException {}
            public void receiveDeviceToDeviceMessage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void callQualityChanged(java.lang.String p0, android.telephony.CallQuality p1) throws android.os.RemoteException {}
            public void receiveBluetoothCallQualityReport(android.telecom.BluetoothCallQualityReport p0) throws android.os.RemoteException {}
            public void notifyCallDisconnected(java.lang.String p0, android.telecom.DisconnectCause p1) throws android.os.RemoteException {}
        }
    }
}
