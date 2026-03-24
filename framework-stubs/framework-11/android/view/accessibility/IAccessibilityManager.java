package android.view.accessibility;

public interface IAccessibilityManager extends android.os.IInterface {
    public void interrupt(int p0) throws android.os.RemoteException;
    public void sendAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, int p1) throws android.os.RemoteException;
    public long addClient(android.view.accessibility.IAccessibilityManagerClient p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(int p0) throws android.os.RemoteException;
    public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int p0, int p1) throws android.os.RemoteException;
    public int addAccessibilityInteractionConnection(android.view.IWindow p0, android.os.IBinder p1, android.view.accessibility.IAccessibilityInteractionConnection p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public void removeAccessibilityInteractionConnection(android.view.IWindow p0) throws android.os.RemoteException;
    public void setPictureInPictureActionReplacingConnection(android.view.accessibility.IAccessibilityInteractionConnection p0) throws android.os.RemoteException;
    public void registerUiTestAutomationService(android.os.IBinder p0, android.accessibilityservice.IAccessibilityServiceClient p1, android.accessibilityservice.AccessibilityServiceInfo p2, int p3) throws android.os.RemoteException;
    public void unregisterUiTestAutomationService(android.accessibilityservice.IAccessibilityServiceClient p0) throws android.os.RemoteException;
    public void temporaryEnableAccessibilityStateUntilKeyguardRemoved(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public android.os.IBinder getWindowToken(int p0, int p1) throws android.os.RemoteException;
    public void notifyAccessibilityButtonClicked(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void notifyAccessibilityButtonVisibilityChanged(boolean p0) throws android.os.RemoteException;
    public void performAccessibilityShortcut(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAccessibilityShortcutTargets(int p0) throws android.os.RemoteException;
    public boolean sendFingerprintGesture(int p0) throws android.os.RemoteException;
    public int getAccessibilityWindowId(android.os.IBinder p0) throws android.os.RemoteException;
    public long getRecommendedTimeoutMillis() throws android.os.RemoteException;
    public void registerSystemAction(android.app.RemoteAction p0, int p1) throws android.os.RemoteException;
    public void unregisterSystemAction(int p0) throws android.os.RemoteException;
    public void setWindowMagnificationConnection(android.view.accessibility.IWindowMagnificationConnection p0) throws android.os.RemoteException;
    public void associateEmbeddedHierarchy(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void disassociateEmbeddedHierarchy(android.os.IBinder p0) throws android.os.RemoteException;

    public static class Default implements android.view.accessibility.IAccessibilityManager {
        public Default() {}
        public void interrupt(int p0) throws android.os.RemoteException {}
        public void sendAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, int p1) throws android.os.RemoteException {}
        public long addClient(android.view.accessibility.IAccessibilityManagerClient p0, int p1) throws android.os.RemoteException { return 0L; }
        public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int p0, int p1) throws android.os.RemoteException { return null; }
        public int addAccessibilityInteractionConnection(android.view.IWindow p0, android.os.IBinder p1, android.view.accessibility.IAccessibilityInteractionConnection p2, java.lang.String p3, int p4) throws android.os.RemoteException { return 0; }
        public void removeAccessibilityInteractionConnection(android.view.IWindow p0) throws android.os.RemoteException {}
        public void setPictureInPictureActionReplacingConnection(android.view.accessibility.IAccessibilityInteractionConnection p0) throws android.os.RemoteException {}
        public void registerUiTestAutomationService(android.os.IBinder p0, android.accessibilityservice.IAccessibilityServiceClient p1, android.accessibilityservice.AccessibilityServiceInfo p2, int p3) throws android.os.RemoteException {}
        public void unregisterUiTestAutomationService(android.accessibilityservice.IAccessibilityServiceClient p0) throws android.os.RemoteException {}
        public void temporaryEnableAccessibilityStateUntilKeyguardRemoved(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder getWindowToken(int p0, int p1) throws android.os.RemoteException { return null; }
        public void notifyAccessibilityButtonClicked(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void notifyAccessibilityButtonVisibilityChanged(boolean p0) throws android.os.RemoteException {}
        public void performAccessibilityShortcut(java.lang.String p0) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getAccessibilityShortcutTargets(int p0) throws android.os.RemoteException { return null; }
        public boolean sendFingerprintGesture(int p0) throws android.os.RemoteException { return false; }
        public int getAccessibilityWindowId(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public long getRecommendedTimeoutMillis() throws android.os.RemoteException { return 0L; }
        public void registerSystemAction(android.app.RemoteAction p0, int p1) throws android.os.RemoteException {}
        public void unregisterSystemAction(int p0) throws android.os.RemoteException {}
        public void setWindowMagnificationConnection(android.view.accessibility.IWindowMagnificationConnection p0) throws android.os.RemoteException {}
        public void associateEmbeddedHierarchy(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void disassociateEmbeddedHierarchy(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.accessibility.IAccessibilityManager {
        private static final java.lang.String DESCRIPTOR = "android.view.accessibility.IAccessibilityManager";
        static final int TRANSACTION_interrupt = 1;
        static final int TRANSACTION_sendAccessibilityEvent = 2;
        static final int TRANSACTION_addClient = 3;
        static final int TRANSACTION_getInstalledAccessibilityServiceList = 4;
        static final int TRANSACTION_getEnabledAccessibilityServiceList = 5;
        static final int TRANSACTION_addAccessibilityInteractionConnection = 6;
        static final int TRANSACTION_removeAccessibilityInteractionConnection = 7;
        static final int TRANSACTION_setPictureInPictureActionReplacingConnection = 8;
        static final int TRANSACTION_registerUiTestAutomationService = 9;
        static final int TRANSACTION_unregisterUiTestAutomationService = 10;
        static final int TRANSACTION_temporaryEnableAccessibilityStateUntilKeyguardRemoved = 11;
        static final int TRANSACTION_getWindowToken = 12;
        static final int TRANSACTION_notifyAccessibilityButtonClicked = 13;
        static final int TRANSACTION_notifyAccessibilityButtonVisibilityChanged = 14;
        static final int TRANSACTION_performAccessibilityShortcut = 15;
        static final int TRANSACTION_getAccessibilityShortcutTargets = 16;
        static final int TRANSACTION_sendFingerprintGesture = 17;
        static final int TRANSACTION_getAccessibilityWindowId = 18;
        static final int TRANSACTION_getRecommendedTimeoutMillis = 19;
        static final int TRANSACTION_registerSystemAction = 20;
        static final int TRANSACTION_unregisterSystemAction = 21;
        static final int TRANSACTION_setWindowMagnificationConnection = 22;
        static final int TRANSACTION_associateEmbeddedHierarchy = 23;
        static final int TRANSACTION_disassociateEmbeddedHierarchy = 24;
        public Stub() { super(); }
        public static android.view.accessibility.IAccessibilityManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.accessibility.IAccessibilityManager p0) { return false; }
        public static android.view.accessibility.IAccessibilityManager getDefaultImpl() { return null; }

        private static class Proxy implements android.view.accessibility.IAccessibilityManager {
            private android.os.IBinder mRemote;
            public static android.view.accessibility.IAccessibilityManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void interrupt(int p0) throws android.os.RemoteException {}
            public void sendAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, int p1) throws android.os.RemoteException {}
            public long addClient(android.view.accessibility.IAccessibilityManagerClient p0, int p1) throws android.os.RemoteException { return 0L; }
            public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int p0, int p1) throws android.os.RemoteException { return null; }
            public int addAccessibilityInteractionConnection(android.view.IWindow p0, android.os.IBinder p1, android.view.accessibility.IAccessibilityInteractionConnection p2, java.lang.String p3, int p4) throws android.os.RemoteException { return 0; }
            public void removeAccessibilityInteractionConnection(android.view.IWindow p0) throws android.os.RemoteException {}
            public void setPictureInPictureActionReplacingConnection(android.view.accessibility.IAccessibilityInteractionConnection p0) throws android.os.RemoteException {}
            public void registerUiTestAutomationService(android.os.IBinder p0, android.accessibilityservice.IAccessibilityServiceClient p1, android.accessibilityservice.AccessibilityServiceInfo p2, int p3) throws android.os.RemoteException {}
            public void unregisterUiTestAutomationService(android.accessibilityservice.IAccessibilityServiceClient p0) throws android.os.RemoteException {}
            public void temporaryEnableAccessibilityStateUntilKeyguardRemoved(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public android.os.IBinder getWindowToken(int p0, int p1) throws android.os.RemoteException { return null; }
            public void notifyAccessibilityButtonClicked(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void notifyAccessibilityButtonVisibilityChanged(boolean p0) throws android.os.RemoteException {}
            public void performAccessibilityShortcut(java.lang.String p0) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getAccessibilityShortcutTargets(int p0) throws android.os.RemoteException { return null; }
            public boolean sendFingerprintGesture(int p0) throws android.os.RemoteException { return false; }
            public int getAccessibilityWindowId(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public long getRecommendedTimeoutMillis() throws android.os.RemoteException { return 0L; }
            public void registerSystemAction(android.app.RemoteAction p0, int p1) throws android.os.RemoteException {}
            public void unregisterSystemAction(int p0) throws android.os.RemoteException {}
            public void setWindowMagnificationConnection(android.view.accessibility.IWindowMagnificationConnection p0) throws android.os.RemoteException {}
            public void associateEmbeddedHierarchy(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void disassociateEmbeddedHierarchy(android.os.IBinder p0) throws android.os.RemoteException {}
        }
    }
}
