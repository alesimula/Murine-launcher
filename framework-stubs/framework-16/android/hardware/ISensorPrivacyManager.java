package android.hardware;

public interface ISensorPrivacyManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.ISensorPrivacyManager";
    public boolean supportsSensorToggle(int p0, int p1) throws android.os.RemoteException;
    public void addSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException;
    public void addToggleSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException;
    public void removeSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException;
    public void removeToggleSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException;
    public boolean isSensorPrivacyEnabled() throws android.os.RemoteException;
    public boolean isCombinedToggleSensorPrivacyEnabled(int p0) throws android.os.RemoteException;
    public boolean isToggleSensorPrivacyEnabled(int p0, int p1) throws android.os.RemoteException;
    public void setSensorPrivacy(boolean p0) throws android.os.RemoteException;
    public void setToggleSensorPrivacy(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
    public void setToggleSensorPrivacyForProfileGroup(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public java.util.List<java.lang.String> getCameraPrivacyAllowlist() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public int getToggleSensorPrivacyState(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_SENSOR_PRIVACY")
    public void setToggleSensorPrivacyState(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_SENSOR_PRIVACY")
    public void setToggleSensorPrivacyStateForProfileGroup(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.OBSERVE_SENSOR_PRIVACY")
    public boolean isCameraPrivacyEnabled(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_SENSOR_PRIVACY")
    public void setCameraPrivacyAllowlist(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public void suppressToggleSensorPrivacyReminders(int p0, int p1, android.os.IBinder p2, boolean p3) throws android.os.RemoteException;
    public boolean requiresAuthentication() throws android.os.RemoteException;
    public void showSensorUseDialog(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.ISensorPrivacyManager {
        public Default() {}
        public boolean supportsSensorToggle(int p0, int p1) throws android.os.RemoteException { return false; }
        public void addSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
        public void addToggleSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
        public void removeSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
        public void removeToggleSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
        public boolean isSensorPrivacyEnabled() throws android.os.RemoteException { return false; }
        public boolean isCombinedToggleSensorPrivacyEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isToggleSensorPrivacyEnabled(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setSensorPrivacy(boolean p0) throws android.os.RemoteException {}
        public void setToggleSensorPrivacy(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void setToggleSensorPrivacyForProfileGroup(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getCameraPrivacyAllowlist() throws android.os.RemoteException { return null; }
        public int getToggleSensorPrivacyState(int p0, int p1) throws android.os.RemoteException { return 0; }
        public void setToggleSensorPrivacyState(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void setToggleSensorPrivacyStateForProfileGroup(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public boolean isCameraPrivacyEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setCameraPrivacyAllowlist(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public void suppressToggleSensorPrivacyReminders(int p0, int p1, android.os.IBinder p2, boolean p3) throws android.os.RemoteException {}
        public boolean requiresAuthentication() throws android.os.RemoteException { return false; }
        public void showSensorUseDialog(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.ISensorPrivacyManager {
        static final int TRANSACTION_supportsSensorToggle = 1;
        static final int TRANSACTION_addSensorPrivacyListener = 2;
        static final int TRANSACTION_addToggleSensorPrivacyListener = 3;
        static final int TRANSACTION_removeSensorPrivacyListener = 4;
        static final int TRANSACTION_removeToggleSensorPrivacyListener = 5;
        static final int TRANSACTION_isSensorPrivacyEnabled = 6;
        static final int TRANSACTION_isCombinedToggleSensorPrivacyEnabled = 7;
        static final int TRANSACTION_isToggleSensorPrivacyEnabled = 8;
        static final int TRANSACTION_setSensorPrivacy = 9;
        static final int TRANSACTION_setToggleSensorPrivacy = 10;
        static final int TRANSACTION_setToggleSensorPrivacyForProfileGroup = 11;
        static final int TRANSACTION_getCameraPrivacyAllowlist = 12;
        static final int TRANSACTION_getToggleSensorPrivacyState = 13;
        static final int TRANSACTION_setToggleSensorPrivacyState = 14;
        static final int TRANSACTION_setToggleSensorPrivacyStateForProfileGroup = 15;
        static final int TRANSACTION_isCameraPrivacyEnabled = 16;
        static final int TRANSACTION_setCameraPrivacyAllowlist = 17;
        static final int TRANSACTION_suppressToggleSensorPrivacyReminders = 18;
        static final int TRANSACTION_requiresAuthentication = 19;
        static final int TRANSACTION_showSensorUseDialog = 20;
        public Stub() { super(); }
        public static android.hardware.ISensorPrivacyManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.ISensorPrivacyManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean supportsSensorToggle(int p0, int p1) throws android.os.RemoteException { return false; }
            public void addSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
            public void addToggleSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
            public void removeSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
            public void removeToggleSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
            public boolean isSensorPrivacyEnabled() throws android.os.RemoteException { return false; }
            public boolean isCombinedToggleSensorPrivacyEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isToggleSensorPrivacyEnabled(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setSensorPrivacy(boolean p0) throws android.os.RemoteException {}
            public void setToggleSensorPrivacy(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
            public void setToggleSensorPrivacyForProfileGroup(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getCameraPrivacyAllowlist() throws android.os.RemoteException { return null; }
            public int getToggleSensorPrivacyState(int p0, int p1) throws android.os.RemoteException { return 0; }
            public void setToggleSensorPrivacyState(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void setToggleSensorPrivacyStateForProfileGroup(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public boolean isCameraPrivacyEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setCameraPrivacyAllowlist(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public void suppressToggleSensorPrivacyReminders(int p0, int p1, android.os.IBinder p2, boolean p3) throws android.os.RemoteException {}
            public boolean requiresAuthentication() throws android.os.RemoteException { return false; }
            public void showSensorUseDialog(int p0) throws android.os.RemoteException {}
        }
    }
}
