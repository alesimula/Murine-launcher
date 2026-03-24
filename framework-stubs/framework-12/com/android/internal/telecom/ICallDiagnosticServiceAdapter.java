package com.android.internal.telecom;

public interface ICallDiagnosticServiceAdapter extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.ICallDiagnosticServiceAdapter";
    public void displayDiagnosticMessage(java.lang.String p0, int p1, java.lang.CharSequence p2) throws android.os.RemoteException;
    public void clearDiagnosticMessage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void sendDeviceToDeviceMessage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void overrideDisconnectMessage(java.lang.String p0, java.lang.CharSequence p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telecom.ICallDiagnosticServiceAdapter {
        public Default() {}
        public void displayDiagnosticMessage(java.lang.String p0, int p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
        public void clearDiagnosticMessage(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void sendDeviceToDeviceMessage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void overrideDisconnectMessage(java.lang.String p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.ICallDiagnosticServiceAdapter {
        static final int TRANSACTION_displayDiagnosticMessage = 1;
        static final int TRANSACTION_clearDiagnosticMessage = 2;
        static final int TRANSACTION_sendDeviceToDeviceMessage = 3;
        static final int TRANSACTION_overrideDisconnectMessage = 4;
        public Stub() { super(); }
        public static com.android.internal.telecom.ICallDiagnosticServiceAdapter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telecom.ICallDiagnosticServiceAdapter p0) { return false; }
        public static com.android.internal.telecom.ICallDiagnosticServiceAdapter getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telecom.ICallDiagnosticServiceAdapter {
            private android.os.IBinder mRemote;
            public static com.android.internal.telecom.ICallDiagnosticServiceAdapter sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void displayDiagnosticMessage(java.lang.String p0, int p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
            public void clearDiagnosticMessage(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void sendDeviceToDeviceMessage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void overrideDisconnectMessage(java.lang.String p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        }
    }
}
