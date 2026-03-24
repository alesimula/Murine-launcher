package android.media;

public interface ISoundDose extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public void setOutputRs2UpperBound(float p0) throws android.os.RemoteException;
    public void resetCsd(float p0, android.media.SoundDoseRecord[] p1) throws android.os.RemoteException;
    public void updateAttenuation(float p0, int p1) throws android.os.RemoteException;
    public void setCsdEnabled(boolean p0) throws android.os.RemoteException;
    public float getOutputRs2UpperBound() throws android.os.RemoteException;
    public float getCsd() throws android.os.RemoteException;
    public boolean isSoundDoseHalSupported() throws android.os.RemoteException;
    public void forceUseFrameworkMel(boolean p0) throws android.os.RemoteException;
    public void forceComputeCsdOnAllDevices(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.media.ISoundDose {
        public Default() {}
        public void setOutputRs2UpperBound(float p0) throws android.os.RemoteException {}
        public void resetCsd(float p0, android.media.SoundDoseRecord[] p1) throws android.os.RemoteException {}
        public void updateAttenuation(float p0, int p1) throws android.os.RemoteException {}
        public void setCsdEnabled(boolean p0) throws android.os.RemoteException {}
        public float getOutputRs2UpperBound() throws android.os.RemoteException { return 0.0f; }
        public float getCsd() throws android.os.RemoteException { return 0.0f; }
        public boolean isSoundDoseHalSupported() throws android.os.RemoteException { return false; }
        public void forceUseFrameworkMel(boolean p0) throws android.os.RemoteException {}
        public void forceComputeCsdOnAllDevices(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.ISoundDose {
        static final int TRANSACTION_setOutputRs2UpperBound = 1;
        static final int TRANSACTION_resetCsd = 2;
        static final int TRANSACTION_updateAttenuation = 3;
        static final int TRANSACTION_setCsdEnabled = 4;
        static final int TRANSACTION_getOutputRs2UpperBound = 5;
        static final int TRANSACTION_getCsd = 6;
        static final int TRANSACTION_isSoundDoseHalSupported = 7;
        static final int TRANSACTION_forceUseFrameworkMel = 8;
        static final int TRANSACTION_forceComputeCsdOnAllDevices = 9;
        public Stub() { super(); }
        public static android.media.ISoundDose asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.ISoundDose {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setOutputRs2UpperBound(float p0) throws android.os.RemoteException {}
            public void resetCsd(float p0, android.media.SoundDoseRecord[] p1) throws android.os.RemoteException {}
            public void updateAttenuation(float p0, int p1) throws android.os.RemoteException {}
            public void setCsdEnabled(boolean p0) throws android.os.RemoteException {}
            public float getOutputRs2UpperBound() throws android.os.RemoteException { return 0.0f; }
            public float getCsd() throws android.os.RemoteException { return 0.0f; }
            public boolean isSoundDoseHalSupported() throws android.os.RemoteException { return false; }
            public void forceUseFrameworkMel(boolean p0) throws android.os.RemoteException {}
            public void forceComputeCsdOnAllDevices(boolean p0) throws android.os.RemoteException {}
        }
    }
}
