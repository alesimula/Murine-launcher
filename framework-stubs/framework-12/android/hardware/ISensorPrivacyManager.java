package android.hardware;

public interface ISensorPrivacyManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.ISensorPrivacyManager";
    public boolean supportsSensorToggle(int p0) throws android.os.RemoteException;
    public void addSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException;
    public void addIndividualSensorPrivacyListener(int p0, int p1, android.hardware.ISensorPrivacyListener p2) throws android.os.RemoteException;
    public void removeSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException;
    public void removeIndividualSensorPrivacyListener(int p0, android.hardware.ISensorPrivacyListener p1) throws android.os.RemoteException;
    public boolean isSensorPrivacyEnabled() throws android.os.RemoteException;
    public boolean isIndividualSensorPrivacyEnabled(int p0, int p1) throws android.os.RemoteException;
    public void setSensorPrivacy(boolean p0) throws android.os.RemoteException;
    public void setIndividualSensorPrivacy(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
    public void setIndividualSensorPrivacyForProfileGroup(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
    public void suppressIndividualSensorPrivacyReminders(int p0, int p1, android.os.IBinder p2, boolean p3) throws android.os.RemoteException;
    public void addUserGlobalIndividualSensorPrivacyListener(int p0, android.hardware.ISensorPrivacyListener p1) throws android.os.RemoteException;
    public void removeUserGlobalIndividualSensorPrivacyListener(int p0, android.hardware.ISensorPrivacyListener p1) throws android.os.RemoteException;
    public void showSensorUseDialog(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.ISensorPrivacyManager {
        public Default() {}
        public boolean supportsSensorToggle(int p0) throws android.os.RemoteException { return false; }
        public void addSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
        public void addIndividualSensorPrivacyListener(int p0, int p1, android.hardware.ISensorPrivacyListener p2) throws android.os.RemoteException {}
        public void removeSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
        public void removeIndividualSensorPrivacyListener(int p0, android.hardware.ISensorPrivacyListener p1) throws android.os.RemoteException {}
        public boolean isSensorPrivacyEnabled() throws android.os.RemoteException { return false; }
        public boolean isIndividualSensorPrivacyEnabled(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setSensorPrivacy(boolean p0) throws android.os.RemoteException {}
        public void setIndividualSensorPrivacy(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void setIndividualSensorPrivacyForProfileGroup(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void suppressIndividualSensorPrivacyReminders(int p0, int p1, android.os.IBinder p2, boolean p3) throws android.os.RemoteException {}
        public void addUserGlobalIndividualSensorPrivacyListener(int p0, android.hardware.ISensorPrivacyListener p1) throws android.os.RemoteException {}
        public void removeUserGlobalIndividualSensorPrivacyListener(int p0, android.hardware.ISensorPrivacyListener p1) throws android.os.RemoteException {}
        public void showSensorUseDialog(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.ISensorPrivacyManager {
        static final int TRANSACTION_supportsSensorToggle = 1;
        static final int TRANSACTION_addSensorPrivacyListener = 2;
        static final int TRANSACTION_addIndividualSensorPrivacyListener = 3;
        static final int TRANSACTION_removeSensorPrivacyListener = 4;
        static final int TRANSACTION_removeIndividualSensorPrivacyListener = 5;
        static final int TRANSACTION_isSensorPrivacyEnabled = 6;
        static final int TRANSACTION_isIndividualSensorPrivacyEnabled = 7;
        static final int TRANSACTION_setSensorPrivacy = 8;
        static final int TRANSACTION_setIndividualSensorPrivacy = 9;
        static final int TRANSACTION_setIndividualSensorPrivacyForProfileGroup = 10;
        static final int TRANSACTION_suppressIndividualSensorPrivacyReminders = 11;
        static final int TRANSACTION_addUserGlobalIndividualSensorPrivacyListener = 12;
        static final int TRANSACTION_removeUserGlobalIndividualSensorPrivacyListener = 13;
        static final int TRANSACTION_showSensorUseDialog = 14;
        public Stub() { super(); }
        public static android.hardware.ISensorPrivacyManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.ISensorPrivacyManager p0) { return false; }
        public static android.hardware.ISensorPrivacyManager getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.ISensorPrivacyManager {
            private android.os.IBinder mRemote;
            public static android.hardware.ISensorPrivacyManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean supportsSensorToggle(int p0) throws android.os.RemoteException { return false; }
            public void addSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
            public void addIndividualSensorPrivacyListener(int p0, int p1, android.hardware.ISensorPrivacyListener p2) throws android.os.RemoteException {}
            public void removeSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
            public void removeIndividualSensorPrivacyListener(int p0, android.hardware.ISensorPrivacyListener p1) throws android.os.RemoteException {}
            public boolean isSensorPrivacyEnabled() throws android.os.RemoteException { return false; }
            public boolean isIndividualSensorPrivacyEnabled(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setSensorPrivacy(boolean p0) throws android.os.RemoteException {}
            public void setIndividualSensorPrivacy(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
            public void setIndividualSensorPrivacyForProfileGroup(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
            public void suppressIndividualSensorPrivacyReminders(int p0, int p1, android.os.IBinder p2, boolean p3) throws android.os.RemoteException {}
            public void addUserGlobalIndividualSensorPrivacyListener(int p0, android.hardware.ISensorPrivacyListener p1) throws android.os.RemoteException {}
            public void removeUserGlobalIndividualSensorPrivacyListener(int p0, android.hardware.ISensorPrivacyListener p1) throws android.os.RemoteException {}
            public void showSensorUseDialog(int p0) throws android.os.RemoteException {}
        }
    }
}
