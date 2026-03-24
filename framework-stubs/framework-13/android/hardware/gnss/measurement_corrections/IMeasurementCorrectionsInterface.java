package android.hardware.gnss.measurement_corrections;

public interface IMeasurementCorrectionsInterface extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final java.lang.String DESCRIPTOR = null;
    public void setCorrections(android.hardware.gnss.measurement_corrections.MeasurementCorrections p0) throws android.os.RemoteException;
    public void setCallback(android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsCallback p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsInterface {
        public Default() {}
        public void setCorrections(android.hardware.gnss.measurement_corrections.MeasurementCorrections p0) throws android.os.RemoteException {}
        public void setCallback(android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsCallback p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsInterface {
        static final int TRANSACTION_setCorrections = 1;
        static final int TRANSACTION_setCallback = 2;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsInterface asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsInterface {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setCorrections(android.hardware.gnss.measurement_corrections.MeasurementCorrections p0) throws android.os.RemoteException {}
            public void setCallback(android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsCallback p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
