package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class AudioDescriptor {
    private final byte mAdFade = 0;
    private final byte mAdPan = 0;
    private final char mVersionTextTag = 0;
    private final byte mAdGainCenter = 0;
    private final byte mAdGainFront = 0;
    private final byte mAdGainSurround = 0;
    private AudioDescriptor(byte p0, byte p1, char p2, byte p3, byte p4, byte p5) {}
    public byte getAdFade() { return 0; }
    public byte getAdPan() { return 0; }
    public char getAdVersionTextTag() { return 0; }
    public byte getAdGainCenter() { return 0; }
    public byte getAdGainFront() { return 0; }
    public byte getAdGainSurround() { return 0; }
}
