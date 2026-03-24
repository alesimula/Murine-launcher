package com.android.internal.telecom;

public interface ICallScreeningAdapter extends android.os.IInterface {
    public void onScreeningResponse(java.lang.String p0, android.content.ComponentName p1, android.telecom.CallScreeningService.ParcelableCallResponse p2) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telecom.ICallScreeningAdapter {
        public Default() {}
        public void onScreeningResponse(java.lang.String p0, android.content.ComponentName p1, android.telecom.CallScreeningService.ParcelableCallResponse p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.ICallScreeningAdapter {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.ICallScreeningAdapter";
        static final int TRANSACTION_onScreeningResponse = 1;
        public Stub() { super(); }
        public static com.android.internal.telecom.ICallScreeningAdapter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telecom.ICallScreeningAdapter {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onScreeningResponse(java.lang.String p0, android.content.ComponentName p1, android.telecom.CallScreeningService.ParcelableCallResponse p2) throws android.os.RemoteException {}
        }
    }
}
