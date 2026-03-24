package com.android.ims.internal.uce.options;

public interface IOptionsListener extends android.os.IInterface {
    public void getVersionCb(java.lang.String p0) throws android.os.RemoteException;
    public void serviceAvailable(com.android.ims.internal.uce.common.StatusCode p0) throws android.os.RemoteException;
    public void serviceUnavailable(com.android.ims.internal.uce.common.StatusCode p0) throws android.os.RemoteException;
    public void sipResponseReceived(java.lang.String p0, com.android.ims.internal.uce.options.OptionsSipResponse p1, com.android.ims.internal.uce.options.OptionsCapInfo p2) throws android.os.RemoteException;
    public void cmdStatus(com.android.ims.internal.uce.options.OptionsCmdStatus p0) throws android.os.RemoteException;
    public void incomingOptions(java.lang.String p0, com.android.ims.internal.uce.options.OptionsCapInfo p1, int p2) throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.uce.options.IOptionsListener {
        public Default() {}
        public void getVersionCb(java.lang.String p0) throws android.os.RemoteException {}
        public void serviceAvailable(com.android.ims.internal.uce.common.StatusCode p0) throws android.os.RemoteException {}
        public void serviceUnavailable(com.android.ims.internal.uce.common.StatusCode p0) throws android.os.RemoteException {}
        public void sipResponseReceived(java.lang.String p0, com.android.ims.internal.uce.options.OptionsSipResponse p1, com.android.ims.internal.uce.options.OptionsCapInfo p2) throws android.os.RemoteException {}
        public void cmdStatus(com.android.ims.internal.uce.options.OptionsCmdStatus p0) throws android.os.RemoteException {}
        public void incomingOptions(java.lang.String p0, com.android.ims.internal.uce.options.OptionsCapInfo p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.uce.options.IOptionsListener {
        public static final java.lang.String DESCRIPTOR = "com.android.ims.internal.uce.options.IOptionsListener";
        static final int TRANSACTION_getVersionCb = 1;
        static final int TRANSACTION_serviceAvailable = 2;
        static final int TRANSACTION_serviceUnavailable = 3;
        static final int TRANSACTION_sipResponseReceived = 4;
        static final int TRANSACTION_cmdStatus = 5;
        static final int TRANSACTION_incomingOptions = 6;
        public Stub() { super(); }
        public static com.android.ims.internal.uce.options.IOptionsListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.ims.internal.uce.options.IOptionsListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getVersionCb(java.lang.String p0) throws android.os.RemoteException {}
            public void serviceAvailable(com.android.ims.internal.uce.common.StatusCode p0) throws android.os.RemoteException {}
            public void serviceUnavailable(com.android.ims.internal.uce.common.StatusCode p0) throws android.os.RemoteException {}
            public void sipResponseReceived(java.lang.String p0, com.android.ims.internal.uce.options.OptionsSipResponse p1, com.android.ims.internal.uce.options.OptionsCapInfo p2) throws android.os.RemoteException {}
            public void cmdStatus(com.android.ims.internal.uce.options.OptionsCmdStatus p0) throws android.os.RemoteException {}
            public void incomingOptions(java.lang.String p0, com.android.ims.internal.uce.options.OptionsCapInfo p1, int p2) throws android.os.RemoteException {}
        }
    }
}
