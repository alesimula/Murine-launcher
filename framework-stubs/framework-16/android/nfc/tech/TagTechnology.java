package android.nfc.tech;

public interface TagTechnology extends java.io.Closeable {
    public void connect() throws java.io.IOException;
    public android.nfc.Tag getTag();
    public boolean isConnected();
}
