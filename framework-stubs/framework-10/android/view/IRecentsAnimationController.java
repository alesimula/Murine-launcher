package android.view;

public interface IRecentsAnimationController extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public android.app.ActivityManager.TaskSnapshot screenshotTask(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void finish(boolean p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setInputConsumerEnabled(boolean p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setAnimationTargetsBehindSystemBars(boolean p0) throws android.os.RemoteException;
    public void setSplitScreenMinimized(boolean p0) throws android.os.RemoteException;
    public void hideCurrentInputMethod() throws android.os.RemoteException;
    public void setCancelWithDeferredScreenshot(boolean p0) throws android.os.RemoteException;
    public void cleanupScreenshot() throws android.os.RemoteException;
    public void setDeferCancelUntilNextTransition(boolean p0, boolean p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.view.IRecentsAnimationController {
        private static final java.lang.String DESCRIPTOR = "android.view.IRecentsAnimationController";
        static final int TRANSACTION_screenshotTask = 1;
        static final int TRANSACTION_finish = 2;
        static final int TRANSACTION_setInputConsumerEnabled = 3;
        static final int TRANSACTION_setAnimationTargetsBehindSystemBars = 4;
        static final int TRANSACTION_setSplitScreenMinimized = 5;
        static final int TRANSACTION_hideCurrentInputMethod = 6;
        static final int TRANSACTION_setCancelWithDeferredScreenshot = 7;
        static final int TRANSACTION_cleanupScreenshot = 8;
        static final int TRANSACTION_setDeferCancelUntilNextTransition = 9;
        public Stub() { super(); }
        public static android.view.IRecentsAnimationController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IRecentsAnimationController p0) { return false; }
        public static android.view.IRecentsAnimationController getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IRecentsAnimationController {
            private android.os.IBinder mRemote;
            public static android.view.IRecentsAnimationController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.app.ActivityManager.TaskSnapshot screenshotTask(int p0) throws android.os.RemoteException { return null; }
            public void finish(boolean p0, boolean p1) throws android.os.RemoteException {}
            public void setInputConsumerEnabled(boolean p0) throws android.os.RemoteException {}
            public void setAnimationTargetsBehindSystemBars(boolean p0) throws android.os.RemoteException {}
            public void setSplitScreenMinimized(boolean p0) throws android.os.RemoteException {}
            public void hideCurrentInputMethod() throws android.os.RemoteException {}
            public void setCancelWithDeferredScreenshot(boolean p0) throws android.os.RemoteException {}
            public void cleanupScreenshot() throws android.os.RemoteException {}
            public void setDeferCancelUntilNextTransition(boolean p0, boolean p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.view.IRecentsAnimationController {
        public Default() {}
        public android.app.ActivityManager.TaskSnapshot screenshotTask(int p0) throws android.os.RemoteException { return null; }
        public void finish(boolean p0, boolean p1) throws android.os.RemoteException {}
        public void setInputConsumerEnabled(boolean p0) throws android.os.RemoteException {}
        public void setAnimationTargetsBehindSystemBars(boolean p0) throws android.os.RemoteException {}
        public void setSplitScreenMinimized(boolean p0) throws android.os.RemoteException {}
        public void hideCurrentInputMethod() throws android.os.RemoteException {}
        public void setCancelWithDeferredScreenshot(boolean p0) throws android.os.RemoteException {}
        public void cleanupScreenshot() throws android.os.RemoteException {}
        public void setDeferCancelUntilNextTransition(boolean p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
