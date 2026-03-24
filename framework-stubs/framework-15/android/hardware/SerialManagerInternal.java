package android.hardware;

public abstract class SerialManagerInternal {
    public SerialManagerInternal() {}
    public abstract void addVirtualSerialPortForTest(java.lang.String p0, java.util.function.Supplier<android.os.ParcelFileDescriptor> p1);
    public abstract void removeVirtualSerialPortForTest(java.lang.String p0);
}
