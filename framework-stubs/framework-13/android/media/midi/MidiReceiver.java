package android.media.midi;

public abstract class MidiReceiver {
    public MidiReceiver() {}
    public MidiReceiver(int p0) {}
    public abstract void onSend(byte[] p0, int p1, int p2, long p3) throws java.io.IOException;
    public void flush() throws java.io.IOException {}
    public void onFlush() throws java.io.IOException {}
    public final int getMaxMessageSize() { return 0; }
    public void send(byte[] p0, int p1, int p2) throws java.io.IOException {}
    public void send(byte[] p0, int p1, int p2, long p3) throws java.io.IOException {}
}
