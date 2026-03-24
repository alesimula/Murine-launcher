package android.media.midi;

public abstract class MidiSender {
    public MidiSender() {}
    public void connect(android.media.midi.MidiReceiver p0) {}
    public void disconnect(android.media.midi.MidiReceiver p0) {}
    public abstract void onConnect(android.media.midi.MidiReceiver p0);
    public abstract void onDisconnect(android.media.midi.MidiReceiver p0);
}
