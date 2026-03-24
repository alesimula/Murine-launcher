package android.hardware.lights;

public interface ILightsManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.lights.ILightsManager";
    @android.annotation.EnforcePermission("android.permission.CONTROL_DEVICE_LIGHTS")
    public java.util.List<android.hardware.lights.Light> getLights() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CONTROL_DEVICE_LIGHTS")
    public android.hardware.lights.LightState getLightState(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CONTROL_DEVICE_LIGHTS")
    public void openSession(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CONTROL_DEVICE_LIGHTS")
    public void closeSession(android.os.IBinder p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CONTROL_DEVICE_LIGHTS")
    public void setLightStates(android.os.IBinder p0, int[] p1, android.hardware.lights.LightState[] p2) throws android.os.RemoteException;

    public static class Default implements android.hardware.lights.ILightsManager {
        public Default() {}
        public java.util.List<android.hardware.lights.Light> getLights() throws android.os.RemoteException { return null; }
        public android.hardware.lights.LightState getLightState(int p0) throws android.os.RemoteException { return null; }
        public void openSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void closeSession(android.os.IBinder p0) throws android.os.RemoteException {}
        public void setLightStates(android.os.IBinder p0, int[] p1, android.hardware.lights.LightState[] p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.lights.ILightsManager {
        static final int TRANSACTION_getLights = 1;
        static final int TRANSACTION_getLightState = 2;
        static final int TRANSACTION_openSession = 3;
        static final int TRANSACTION_closeSession = 4;
        static final int TRANSACTION_setLightStates = 5;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.hardware.lights.ILightsManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void getLights_enforcePermission() throws java.lang.SecurityException {}
        protected void getLightState_enforcePermission() throws java.lang.SecurityException {}
        protected void openSession_enforcePermission() throws java.lang.SecurityException {}
        protected void closeSession_enforcePermission() throws java.lang.SecurityException {}
        protected void setLightStates_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.lights.ILightsManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.hardware.lights.Light> getLights() throws android.os.RemoteException { return null; }
            public android.hardware.lights.LightState getLightState(int p0) throws android.os.RemoteException { return null; }
            public void openSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void closeSession(android.os.IBinder p0) throws android.os.RemoteException {}
            public void setLightStates(android.os.IBinder p0, int[] p1, android.hardware.lights.LightState[] p2) throws android.os.RemoteException {}
        }
    }
}
