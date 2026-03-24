package com.android.internal.telecom;

public interface ICallScreeningAdapter extends android.os.IInterface {
    public void allowCall(java.lang.String p0) throws android.os.RemoteException;
    public void silenceCall(java.lang.String p0) throws android.os.RemoteException;
    public void screenCallFurther(java.lang.String p0) throws android.os.RemoteException;
    public void disallowCall(java.lang.String p0, boolean p1, boolean p2, boolean p3, android.content.ComponentName p4) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telecom.ICallScreeningAdapter {
        public Default() {}
        public void allowCall(java.lang.String p0) throws android.os.RemoteException {}
        public void silenceCall(java.lang.String p0) throws android.os.RemoteException {}
        public void screenCallFurther(java.lang.String p0) throws android.os.RemoteException {}
        public void disallowCall(java.lang.String p0, boolean p1, boolean p2, boolean p3, android.content.ComponentName p4) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.ICallScreeningAdapter {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.ICallScreeningAdapter";
        static final int TRANSACTION_allowCall = 1;
        static final int TRANSACTION_silenceCall = 2;
        static final int TRANSACTION_screenCallFurther = 3;
        static final int TRANSACTION_disallowCall = 4;
        public Stub() { super(); }
        public static com.android.internal.telecom.ICallScreeningAdapter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telecom.ICallScreeningAdapter p0) { return false; }
        public static com.android.internal.telecom.ICallScreeningAdapter getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telecom.ICallScreeningAdapter {
            private android.os.IBinder mRemote;
            public static com.android.internal.telecom.ICallScreeningAdapter sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void allowCall(java.lang.String p0) throws android.os.RemoteException {}
            public void silenceCall(java.lang.String p0) throws android.os.RemoteException {}
            public void screenCallFurther(java.lang.String p0) throws android.os.RemoteException {}
            public void disallowCall(java.lang.String p0, boolean p1, boolean p2, boolean p3, android.content.ComponentName p4) throws android.os.RemoteException {}
        }
    }
}
