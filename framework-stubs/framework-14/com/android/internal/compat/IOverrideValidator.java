package com.android.internal.compat;

public interface IOverrideValidator extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.compat.IOverrideValidator";
    public com.android.internal.compat.OverrideAllowedState getOverrideAllowedState(long p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.compat.IOverrideValidator {
        public Default() {}
        public com.android.internal.compat.OverrideAllowedState getOverrideAllowedState(long p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.compat.IOverrideValidator {
        static final int TRANSACTION_getOverrideAllowedState = 1;
        public Stub() { super(); }
        public static com.android.internal.compat.IOverrideValidator asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.compat.IOverrideValidator {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public com.android.internal.compat.OverrideAllowedState getOverrideAllowedState(long p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        }
    }
}
