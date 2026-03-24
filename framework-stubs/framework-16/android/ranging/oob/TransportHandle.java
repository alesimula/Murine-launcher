package android.ranging.oob;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public interface TransportHandle extends java.lang.AutoCloseable {
    public void registerReceiveCallback(java.util.concurrent.Executor p0, android.ranging.oob.TransportHandle.ReceiveCallback p1);
    public void sendData(byte[] p0);

    public static interface ReceiveCallback {
        public void onClose();
        public void onDisconnect();
        public void onReceiveData(byte[] p0);
        public void onReconnect();
        public void onSendFailed();
    }
}
