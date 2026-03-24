package android.os.instrumentation;

public interface IOffsetCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.instrumentation.IOffsetCallback";
    public void onResult(android.os.instrumentation.ExecutableMethodFileOffsets p0) throws android.os.RemoteException;

    public static class Default implements android.os.instrumentation.IOffsetCallback {
        public Default() {}
        public void onResult(android.os.instrumentation.ExecutableMethodFileOffsets p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.instrumentation.IOffsetCallback {
        static final int TRANSACTION_onResult = 1;
        public Stub() { super(); }
        public static android.os.instrumentation.IOffsetCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.os.instrumentation.IOffsetCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onResult(android.os.instrumentation.ExecutableMethodFileOffsets p0) throws android.os.RemoteException {}
        }
    }
}
