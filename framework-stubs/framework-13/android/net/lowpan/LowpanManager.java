package android.net.lowpan;

public class LowpanManager {
    public static android.net.lowpan.LowpanManager from(android.content.Context p0) { return null; }
    public static android.net.lowpan.LowpanManager getManager() { return null; }
    LowpanManager(android.net.lowpan.ILowpanManager p0) {}
    public LowpanManager(android.content.Context p0, android.net.lowpan.ILowpanManager p1) {}
    public LowpanManager(android.content.Context p0, android.net.lowpan.ILowpanManager p1, android.os.Looper p2) {}
    public android.net.lowpan.LowpanInterface getInterfaceNoCreate(android.net.lowpan.ILowpanInterface p0) { return null; }
    public android.net.lowpan.LowpanInterface getInterface(android.net.lowpan.ILowpanInterface p0) { return null; }
    public android.net.lowpan.LowpanInterface getInterface(java.lang.String p0) { return null; }
    public android.net.lowpan.LowpanInterface getInterface() { return null; }
    public java.lang.String[] getInterfaceList() { return null; }
    public void registerCallback(android.net.lowpan.LowpanManager.Callback p0, android.os.Handler p1) throws android.net.lowpan.LowpanException {}
    public void registerCallback(android.net.lowpan.LowpanManager.Callback p0) throws android.net.lowpan.LowpanException {}
    public void unregisterCallback(android.net.lowpan.LowpanManager.Callback p0) {}

    public static abstract class Callback {
        public Callback() {}
        public void onInterfaceAdded(android.net.lowpan.LowpanInterface p0) {}
        public void onInterfaceRemoved(android.net.lowpan.LowpanInterface p0) {}
    }
}
