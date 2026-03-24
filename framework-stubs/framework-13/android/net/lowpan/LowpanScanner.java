package android.net.lowpan;

public class LowpanScanner {
    LowpanScanner(android.net.lowpan.ILowpanInterface p0) {}
    public synchronized void setCallback(android.net.lowpan.LowpanScanner.Callback p0, android.os.Handler p1) {}
    public void setCallback(android.net.lowpan.LowpanScanner.Callback p0) {}
    public void setChannelMask(java.util.Collection<java.lang.Integer> p0) {}
    public java.util.Collection<java.lang.Integer> getChannelMask() { return null; }
    public void addChannel(int p0) {}
    public void setTxPower(int p0) {}
    public int getTxPower() { return 0; }
    public void startNetScan() throws android.net.lowpan.LowpanException {}
    public void stopNetScan() {}
    public void startEnergyScan() throws android.net.lowpan.LowpanException {}
    public void stopEnergyScan() {}

    public static abstract class Callback {
        public Callback() {}
        public void onNetScanBeacon(android.net.lowpan.LowpanBeaconInfo p0) {}
        public void onEnergyScanResult(android.net.lowpan.LowpanEnergyScanResult p0) {}
        public void onScanFinished() {}
    }
}
