package android.net.wifi.usd;

@android.annotation.FlaggedApi("android.net.wifi.flags.usd")
public class UsdManager {
    UsdManager() {}
    @android.annotation.Nullable
    public android.net.wifi.usd.Characteristics getCharacteristics() { return null; }
    public void publish(android.net.wifi.usd.PublishConfig p0, java.util.concurrent.Executor p1, android.net.wifi.usd.PublishSessionCallback p2) {}
    public void registerPublisherStatusListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
    public void registerSubscriberStatusListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
    public void subscribe(android.net.wifi.usd.SubscribeConfig p0, java.util.concurrent.Executor p1, android.net.wifi.usd.SubscribeSessionCallback p2) {}
    public void unregisterPublisherStatusListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    public void unregisterSubscriberStatusListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
}
