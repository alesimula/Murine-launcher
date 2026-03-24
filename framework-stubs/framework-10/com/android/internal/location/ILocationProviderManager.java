package com.android.internal.location;

public interface ILocationProviderManager extends android.os.IInterface {
    public void onSetAdditionalProviderPackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void onSetEnabled(boolean p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void onSetProperties(com.android.internal.location.ProviderProperties p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void onReportLocation(android.location.Location p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.location.ILocationProviderManager {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.location.ILocationProviderManager";
        static final int TRANSACTION_onSetAdditionalProviderPackages = 1;
        static final int TRANSACTION_onSetEnabled = 2;
        static final int TRANSACTION_onSetProperties = 3;
        static final int TRANSACTION_onReportLocation = 4;
        public Stub() { super(); }
        public static com.android.internal.location.ILocationProviderManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.location.ILocationProviderManager p0) { return false; }
        public static com.android.internal.location.ILocationProviderManager getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.location.ILocationProviderManager {
            private android.os.IBinder mRemote;
            public static com.android.internal.location.ILocationProviderManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSetAdditionalProviderPackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public void onSetEnabled(boolean p0) throws android.os.RemoteException {}
            public void onSetProperties(com.android.internal.location.ProviderProperties p0) throws android.os.RemoteException {}
            public void onReportLocation(android.location.Location p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.location.ILocationProviderManager {
        public Default() {}
        public void onSetAdditionalProviderPackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public void onSetEnabled(boolean p0) throws android.os.RemoteException {}
        public void onSetProperties(com.android.internal.location.ProviderProperties p0) throws android.os.RemoteException {}
        public void onReportLocation(android.location.Location p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
