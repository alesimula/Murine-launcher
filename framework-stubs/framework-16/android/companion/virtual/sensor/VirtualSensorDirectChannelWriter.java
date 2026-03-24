package android.companion.virtual.sensor;

@android.annotation.SystemApi
public final class VirtualSensorDirectChannelWriter implements java.lang.AutoCloseable {
    public VirtualSensorDirectChannelWriter() {}
    public void close() {}
    public void addChannel(int p0, android.os.SharedMemory p1) throws android.system.ErrnoException {}
    public void removeChannel(int p0) {}
    public boolean configureChannel(int p0, android.companion.virtual.sensor.VirtualSensor p1, int p2, int p3) { return false; }
    public boolean writeSensorEvent(android.companion.virtual.sensor.VirtualSensor p0, android.companion.virtual.sensor.VirtualSensorEvent p1) { return false; }

    private static final class DirectChannelConfiguration {
        DirectChannelConfiguration(int p0, int p1, android.companion.virtual.sensor.VirtualSensorDirectChannelWriter.SharedMemoryWrapper p2) {}
        void write(android.companion.virtual.sensor.VirtualSensorEvent p0) {}
    }

    private static final class SharedMemoryWrapper {
        SharedMemoryWrapper(android.os.SharedMemory p0) throws android.system.ErrnoException {}
        void close() {}
        void write(int p0, int p1, long p2, android.companion.virtual.sensor.VirtualSensorEvent p3) {}
    }
}
