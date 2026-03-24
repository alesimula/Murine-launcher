package android.service.dreams;

public interface IDreamManager extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public void dream() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void awaken() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setDreamComponents(android.content.ComponentName[] p0) throws android.os.RemoteException;
    public android.content.ComponentName[] getDreamComponents() throws android.os.RemoteException;
    public android.content.ComponentName getDefaultDreamComponent() throws android.os.RemoteException;
    public void testDream(android.content.ComponentName p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean isDreaming() throws android.os.RemoteException;
    public void finishSelf(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void startDozing(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public void stopDozing(android.os.IBinder p0) throws android.os.RemoteException;
    public void forceAmbientDisplayEnabled(boolean p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.dreams.IDreamManager {
        private static final java.lang.String DESCRIPTOR = "android.service.dreams.IDreamManager";
        static final int TRANSACTION_dream = 1;
        static final int TRANSACTION_awaken = 2;
        static final int TRANSACTION_setDreamComponents = 3;
        static final int TRANSACTION_getDreamComponents = 4;
        static final int TRANSACTION_getDefaultDreamComponent = 5;
        static final int TRANSACTION_testDream = 6;
        static final int TRANSACTION_isDreaming = 7;
        static final int TRANSACTION_finishSelf = 8;
        static final int TRANSACTION_startDozing = 9;
        static final int TRANSACTION_stopDozing = 10;
        static final int TRANSACTION_forceAmbientDisplayEnabled = 11;
        public Stub() { super(); }
        public static android.service.dreams.IDreamManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.dreams.IDreamManager p0) { return false; }
        public static android.service.dreams.IDreamManager getDefaultImpl() { return null; }

        private static class Proxy implements android.service.dreams.IDreamManager {
            private android.os.IBinder mRemote;
            public static android.service.dreams.IDreamManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void dream() throws android.os.RemoteException {}
            public void awaken() throws android.os.RemoteException {}
            public void setDreamComponents(android.content.ComponentName[] p0) throws android.os.RemoteException {}
            public android.content.ComponentName[] getDreamComponents() throws android.os.RemoteException { return null; }
            public android.content.ComponentName getDefaultDreamComponent() throws android.os.RemoteException { return null; }
            public void testDream(android.content.ComponentName p0) throws android.os.RemoteException {}
            public boolean isDreaming() throws android.os.RemoteException { return false; }
            public void finishSelf(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void startDozing(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
            public void stopDozing(android.os.IBinder p0) throws android.os.RemoteException {}
            public void forceAmbientDisplayEnabled(boolean p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.dreams.IDreamManager {
        public Default() {}
        public void dream() throws android.os.RemoteException {}
        public void awaken() throws android.os.RemoteException {}
        public void setDreamComponents(android.content.ComponentName[] p0) throws android.os.RemoteException {}
        public android.content.ComponentName[] getDreamComponents() throws android.os.RemoteException { return null; }
        public android.content.ComponentName getDefaultDreamComponent() throws android.os.RemoteException { return null; }
        public void testDream(android.content.ComponentName p0) throws android.os.RemoteException {}
        public boolean isDreaming() throws android.os.RemoteException { return false; }
        public void finishSelf(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void startDozing(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
        public void stopDozing(android.os.IBinder p0) throws android.os.RemoteException {}
        public void forceAmbientDisplayEnabled(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
