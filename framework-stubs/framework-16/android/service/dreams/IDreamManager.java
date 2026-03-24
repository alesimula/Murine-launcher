package android.service.dreams;

public interface IDreamManager extends android.os.IInterface {
    public void dream() throws android.os.RemoteException;
    public void awaken() throws android.os.RemoteException;
    public void setDreamComponents(android.content.ComponentName[] p0) throws android.os.RemoteException;
    public android.content.ComponentName[] getDreamComponents() throws android.os.RemoteException;
    public android.content.ComponentName getDefaultDreamComponentForUser(int p0) throws android.os.RemoteException;
    public void testDream(int p0, android.content.ComponentName p1) throws android.os.RemoteException;
    public boolean isDreaming() throws android.os.RemoteException;
    public boolean isDreamingOrInPreview() throws android.os.RemoteException;
    public boolean canStartDreaming(boolean p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void finishSelf(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void startDozing(android.os.IBinder p0, int p1, int p2, float p3, int p4, boolean p5) throws android.os.RemoteException;
    public void stopDozing(android.os.IBinder p0) throws android.os.RemoteException;
    public void forceAmbientDisplayEnabled(boolean p0) throws android.os.RemoteException;
    public android.content.ComponentName[] getDreamComponentsForUser(int p0) throws android.os.RemoteException;
    public void setDreamComponentsForUser(int p0, android.content.ComponentName[] p1) throws android.os.RemoteException;
    public void setSystemDreamComponent(android.content.ComponentName p0) throws android.os.RemoteException;
    public void registerDreamOverlayService(android.content.ComponentName p0) throws android.os.RemoteException;
    public void startDreamActivity(android.content.Intent p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.WRITE_DREAM_STATE")
    public void setDreamIsObscured(boolean p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.WRITE_DREAM_STATE")
    public void setDevicePostured(boolean p0) throws android.os.RemoteException;
    public void startDozingOneway(android.os.IBinder p0, int p1, int p2, float p3, int p4, boolean p5) throws android.os.RemoteException;
    public void finishSelfOneway(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public void setScreensaverEnabled(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.service.dreams.IDreamManager {
        public Default() {}
        public void dream() throws android.os.RemoteException {}
        public void awaken() throws android.os.RemoteException {}
        public void setDreamComponents(android.content.ComponentName[] p0) throws android.os.RemoteException {}
        public android.content.ComponentName[] getDreamComponents() throws android.os.RemoteException { return null; }
        public android.content.ComponentName getDefaultDreamComponentForUser(int p0) throws android.os.RemoteException { return null; }
        public void testDream(int p0, android.content.ComponentName p1) throws android.os.RemoteException {}
        public boolean isDreaming() throws android.os.RemoteException { return false; }
        public boolean isDreamingOrInPreview() throws android.os.RemoteException { return false; }
        public boolean canStartDreaming(boolean p0) throws android.os.RemoteException { return false; }
        public void finishSelf(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void startDozing(android.os.IBinder p0, int p1, int p2, float p3, int p4, boolean p5) throws android.os.RemoteException {}
        public void stopDozing(android.os.IBinder p0) throws android.os.RemoteException {}
        public void forceAmbientDisplayEnabled(boolean p0) throws android.os.RemoteException {}
        public android.content.ComponentName[] getDreamComponentsForUser(int p0) throws android.os.RemoteException { return null; }
        public void setDreamComponentsForUser(int p0, android.content.ComponentName[] p1) throws android.os.RemoteException {}
        public void setSystemDreamComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void registerDreamOverlayService(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void startDreamActivity(android.content.Intent p0) throws android.os.RemoteException {}
        public void setDreamIsObscured(boolean p0) throws android.os.RemoteException {}
        public void setDevicePostured(boolean p0) throws android.os.RemoteException {}
        public void startDozingOneway(android.os.IBinder p0, int p1, int p2, float p3, int p4, boolean p5) throws android.os.RemoteException {}
        public void finishSelfOneway(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void setScreensaverEnabled(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.dreams.IDreamManager {
        public static final java.lang.String DESCRIPTOR = "android.service.dreams.IDreamManager";
        static final int TRANSACTION_dream = 1;
        static final int TRANSACTION_awaken = 2;
        static final int TRANSACTION_setDreamComponents = 3;
        static final int TRANSACTION_getDreamComponents = 4;
        static final int TRANSACTION_getDefaultDreamComponentForUser = 5;
        static final int TRANSACTION_testDream = 6;
        static final int TRANSACTION_isDreaming = 7;
        static final int TRANSACTION_isDreamingOrInPreview = 8;
        static final int TRANSACTION_canStartDreaming = 9;
        static final int TRANSACTION_finishSelf = 10;
        static final int TRANSACTION_startDozing = 11;
        static final int TRANSACTION_stopDozing = 12;
        static final int TRANSACTION_forceAmbientDisplayEnabled = 13;
        static final int TRANSACTION_getDreamComponentsForUser = 14;
        static final int TRANSACTION_setDreamComponentsForUser = 15;
        static final int TRANSACTION_setSystemDreamComponent = 16;
        static final int TRANSACTION_registerDreamOverlayService = 17;
        static final int TRANSACTION_startDreamActivity = 18;
        static final int TRANSACTION_setDreamIsObscured = 19;
        static final int TRANSACTION_setDevicePostured = 20;
        static final int TRANSACTION_startDozingOneway = 21;
        static final int TRANSACTION_finishSelfOneway = 22;
        static final int TRANSACTION_setScreensaverEnabled = 23;
        public Stub() { super(); }
        public static android.service.dreams.IDreamManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.dreams.IDreamManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void dream() throws android.os.RemoteException {}
            public void awaken() throws android.os.RemoteException {}
            public void setDreamComponents(android.content.ComponentName[] p0) throws android.os.RemoteException {}
            public android.content.ComponentName[] getDreamComponents() throws android.os.RemoteException { return null; }
            public android.content.ComponentName getDefaultDreamComponentForUser(int p0) throws android.os.RemoteException { return null; }
            public void testDream(int p0, android.content.ComponentName p1) throws android.os.RemoteException {}
            public boolean isDreaming() throws android.os.RemoteException { return false; }
            public boolean isDreamingOrInPreview() throws android.os.RemoteException { return false; }
            public boolean canStartDreaming(boolean p0) throws android.os.RemoteException { return false; }
            public void finishSelf(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void startDozing(android.os.IBinder p0, int p1, int p2, float p3, int p4, boolean p5) throws android.os.RemoteException {}
            public void stopDozing(android.os.IBinder p0) throws android.os.RemoteException {}
            public void forceAmbientDisplayEnabled(boolean p0) throws android.os.RemoteException {}
            public android.content.ComponentName[] getDreamComponentsForUser(int p0) throws android.os.RemoteException { return null; }
            public void setDreamComponentsForUser(int p0, android.content.ComponentName[] p1) throws android.os.RemoteException {}
            public void setSystemDreamComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void registerDreamOverlayService(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void startDreamActivity(android.content.Intent p0) throws android.os.RemoteException {}
            public void setDreamIsObscured(boolean p0) throws android.os.RemoteException {}
            public void setDevicePostured(boolean p0) throws android.os.RemoteException {}
            public void startDozingOneway(android.os.IBinder p0, int p1, int p2, float p3, int p4, boolean p5) throws android.os.RemoteException {}
            public void finishSelfOneway(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void setScreensaverEnabled(boolean p0) throws android.os.RemoteException {}
        }
    }
}
