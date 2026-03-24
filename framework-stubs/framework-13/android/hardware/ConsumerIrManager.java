package android.hardware;

public final class ConsumerIrManager {
    public ConsumerIrManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    public boolean hasIrEmitter() { return false; }
    public void transmit(int p0, int[] p1) {}
    public android.hardware.ConsumerIrManager.CarrierFrequencyRange[] getCarrierFrequencies() { return null; }

    public final class CarrierFrequencyRange {
        public CarrierFrequencyRange(android.hardware.ConsumerIrManager p0, int p1, int p2) {}
        public int getMinFrequency() { return 0; }
        public int getMaxFrequency() { return 0; }
    }
}
