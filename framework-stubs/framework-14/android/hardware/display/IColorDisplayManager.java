package android.hardware.display;

public interface IColorDisplayManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.display.IColorDisplayManager";
    public boolean isDeviceColorManaged() throws android.os.RemoteException;
    public boolean setSaturationLevel(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CONTROL_DISPLAY_COLOR_TRANSFORMS")
    public boolean setAppSaturationLevel(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CONTROL_DISPLAY_COLOR_TRANSFORMS")
    public boolean isSaturationActivated() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CONTROL_DISPLAY_COLOR_TRANSFORMS")
    public int getTransformCapabilities() throws android.os.RemoteException;
    public boolean isNightDisplayActivated() throws android.os.RemoteException;
    public boolean setNightDisplayActivated(boolean p0) throws android.os.RemoteException;
    public int getNightDisplayColorTemperature() throws android.os.RemoteException;
    public boolean setNightDisplayColorTemperature(int p0) throws android.os.RemoteException;
    public int getNightDisplayAutoMode() throws android.os.RemoteException;
    public int getNightDisplayAutoModeRaw() throws android.os.RemoteException;
    public boolean setNightDisplayAutoMode(int p0) throws android.os.RemoteException;
    public android.hardware.display.Time getNightDisplayCustomStartTime() throws android.os.RemoteException;
    public boolean setNightDisplayCustomStartTime(android.hardware.display.Time p0) throws android.os.RemoteException;
    public android.hardware.display.Time getNightDisplayCustomEndTime() throws android.os.RemoteException;
    public boolean setNightDisplayCustomEndTime(android.hardware.display.Time p0) throws android.os.RemoteException;
    public int getColorMode() throws android.os.RemoteException;
    public void setColorMode(int p0) throws android.os.RemoteException;
    public boolean isDisplayWhiteBalanceEnabled() throws android.os.RemoteException;
    public boolean setDisplayWhiteBalanceEnabled(boolean p0) throws android.os.RemoteException;
    public boolean isReduceBrightColorsActivated() throws android.os.RemoteException;
    public boolean setReduceBrightColorsActivated(boolean p0) throws android.os.RemoteException;
    public int getReduceBrightColorsStrength() throws android.os.RemoteException;
    public boolean setReduceBrightColorsStrength(int p0) throws android.os.RemoteException;
    public float getReduceBrightColorsOffsetFactor() throws android.os.RemoteException;

    public static class Default implements android.hardware.display.IColorDisplayManager {
        public Default() {}
        public boolean isDeviceColorManaged() throws android.os.RemoteException { return false; }
        public boolean setSaturationLevel(int p0) throws android.os.RemoteException { return false; }
        public boolean setAppSaturationLevel(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isSaturationActivated() throws android.os.RemoteException { return false; }
        public int getTransformCapabilities() throws android.os.RemoteException { return 0; }
        public boolean isNightDisplayActivated() throws android.os.RemoteException { return false; }
        public boolean setNightDisplayActivated(boolean p0) throws android.os.RemoteException { return false; }
        public int getNightDisplayColorTemperature() throws android.os.RemoteException { return 0; }
        public boolean setNightDisplayColorTemperature(int p0) throws android.os.RemoteException { return false; }
        public int getNightDisplayAutoMode() throws android.os.RemoteException { return 0; }
        public int getNightDisplayAutoModeRaw() throws android.os.RemoteException { return 0; }
        public boolean setNightDisplayAutoMode(int p0) throws android.os.RemoteException { return false; }
        public android.hardware.display.Time getNightDisplayCustomStartTime() throws android.os.RemoteException { return null; }
        public boolean setNightDisplayCustomStartTime(android.hardware.display.Time p0) throws android.os.RemoteException { return false; }
        public android.hardware.display.Time getNightDisplayCustomEndTime() throws android.os.RemoteException { return null; }
        public boolean setNightDisplayCustomEndTime(android.hardware.display.Time p0) throws android.os.RemoteException { return false; }
        public int getColorMode() throws android.os.RemoteException { return 0; }
        public void setColorMode(int p0) throws android.os.RemoteException {}
        public boolean isDisplayWhiteBalanceEnabled() throws android.os.RemoteException { return false; }
        public boolean setDisplayWhiteBalanceEnabled(boolean p0) throws android.os.RemoteException { return false; }
        public boolean isReduceBrightColorsActivated() throws android.os.RemoteException { return false; }
        public boolean setReduceBrightColorsActivated(boolean p0) throws android.os.RemoteException { return false; }
        public int getReduceBrightColorsStrength() throws android.os.RemoteException { return 0; }
        public boolean setReduceBrightColorsStrength(int p0) throws android.os.RemoteException { return false; }
        public float getReduceBrightColorsOffsetFactor() throws android.os.RemoteException { return 0.0f; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.display.IColorDisplayManager {
        static final int TRANSACTION_isDeviceColorManaged = 1;
        static final int TRANSACTION_setSaturationLevel = 2;
        static final int TRANSACTION_setAppSaturationLevel = 3;
        static final int TRANSACTION_isSaturationActivated = 4;
        static final int TRANSACTION_getTransformCapabilities = 5;
        static final int TRANSACTION_isNightDisplayActivated = 6;
        static final int TRANSACTION_setNightDisplayActivated = 7;
        static final int TRANSACTION_getNightDisplayColorTemperature = 8;
        static final int TRANSACTION_setNightDisplayColorTemperature = 9;
        static final int TRANSACTION_getNightDisplayAutoMode = 10;
        static final int TRANSACTION_getNightDisplayAutoModeRaw = 11;
        static final int TRANSACTION_setNightDisplayAutoMode = 12;
        static final int TRANSACTION_getNightDisplayCustomStartTime = 13;
        static final int TRANSACTION_setNightDisplayCustomStartTime = 14;
        static final int TRANSACTION_getNightDisplayCustomEndTime = 15;
        static final int TRANSACTION_setNightDisplayCustomEndTime = 16;
        static final int TRANSACTION_getColorMode = 17;
        static final int TRANSACTION_setColorMode = 18;
        static final int TRANSACTION_isDisplayWhiteBalanceEnabled = 19;
        static final int TRANSACTION_setDisplayWhiteBalanceEnabled = 20;
        static final int TRANSACTION_isReduceBrightColorsActivated = 21;
        static final int TRANSACTION_setReduceBrightColorsActivated = 22;
        static final int TRANSACTION_getReduceBrightColorsStrength = 23;
        static final int TRANSACTION_setReduceBrightColorsStrength = 24;
        static final int TRANSACTION_getReduceBrightColorsOffsetFactor = 25;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.hardware.display.IColorDisplayManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setAppSaturationLevel_enforcePermission() throws java.lang.SecurityException {}
        protected void isSaturationActivated_enforcePermission() throws java.lang.SecurityException {}
        protected void getTransformCapabilities_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.display.IColorDisplayManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isDeviceColorManaged() throws android.os.RemoteException { return false; }
            public boolean setSaturationLevel(int p0) throws android.os.RemoteException { return false; }
            public boolean setAppSaturationLevel(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isSaturationActivated() throws android.os.RemoteException { return false; }
            public int getTransformCapabilities() throws android.os.RemoteException { return 0; }
            public boolean isNightDisplayActivated() throws android.os.RemoteException { return false; }
            public boolean setNightDisplayActivated(boolean p0) throws android.os.RemoteException { return false; }
            public int getNightDisplayColorTemperature() throws android.os.RemoteException { return 0; }
            public boolean setNightDisplayColorTemperature(int p0) throws android.os.RemoteException { return false; }
            public int getNightDisplayAutoMode() throws android.os.RemoteException { return 0; }
            public int getNightDisplayAutoModeRaw() throws android.os.RemoteException { return 0; }
            public boolean setNightDisplayAutoMode(int p0) throws android.os.RemoteException { return false; }
            public android.hardware.display.Time getNightDisplayCustomStartTime() throws android.os.RemoteException { return null; }
            public boolean setNightDisplayCustomStartTime(android.hardware.display.Time p0) throws android.os.RemoteException { return false; }
            public android.hardware.display.Time getNightDisplayCustomEndTime() throws android.os.RemoteException { return null; }
            public boolean setNightDisplayCustomEndTime(android.hardware.display.Time p0) throws android.os.RemoteException { return false; }
            public int getColorMode() throws android.os.RemoteException { return 0; }
            public void setColorMode(int p0) throws android.os.RemoteException {}
            public boolean isDisplayWhiteBalanceEnabled() throws android.os.RemoteException { return false; }
            public boolean setDisplayWhiteBalanceEnabled(boolean p0) throws android.os.RemoteException { return false; }
            public boolean isReduceBrightColorsActivated() throws android.os.RemoteException { return false; }
            public boolean setReduceBrightColorsActivated(boolean p0) throws android.os.RemoteException { return false; }
            public int getReduceBrightColorsStrength() throws android.os.RemoteException { return 0; }
            public boolean setReduceBrightColorsStrength(int p0) throws android.os.RemoteException { return false; }
            public float getReduceBrightColorsOffsetFactor() throws android.os.RemoteException { return 0.0f; }
        }
    }
}
