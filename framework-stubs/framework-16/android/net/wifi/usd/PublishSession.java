package android.net.wifi.usd;

@android.annotation.FlaggedApi("android.net.wifi.flags.usd")
public class PublishSession {
    PublishSession() {}
    public void cancel() {}
    public void sendMessage(int p0, byte[] p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    public void updatePublish(byte[] p0) {}
}
