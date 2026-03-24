package android.view;

public interface ISystemGestureExclusionListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.ISystemGestureExclusionListener";
    public void onSystemGestureExclusionChanged(int p0, android.graphics.Region p1, android.graphics.Region p2) throws android.os.RemoteException;

    public static class Default implements android.view.ISystemGestureExclusionListener {
        public Default() {}
        public void onSystemGestureExclusionChanged(int p0, android.graphics.Region p1, android.graphics.Region p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.ISystemGestureExclusionListener {
        static final int TRANSACTION_onSystemGestureExclusionChanged = 1;
        public Stub() { super(); }
        public static android.view.ISystemGestureExclusionListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.ISystemGestureExclusionListener p0) { return false; }
        public static android.view.ISystemGestureExclusionListener getDefaultImpl() { return null; }

        private static class Proxy implements android.view.ISystemGestureExclusionListener {
            private android.os.IBinder mRemote;
            public static android.view.ISystemGestureExclusionListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSystemGestureExclusionChanged(int p0, android.graphics.Region p1, android.graphics.Region p2) throws android.os.RemoteException {}
        }
    }
}
