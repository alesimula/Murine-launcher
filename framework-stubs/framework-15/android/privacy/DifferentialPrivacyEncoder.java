package android.privacy;

public interface DifferentialPrivacyEncoder {
    public byte[] encodeString(java.lang.String p0);
    public byte[] encodeBoolean(boolean p0);
    public byte[] encodeBits(byte[] p0);
    public android.privacy.DifferentialPrivacyConfig getConfig();
    public boolean isInsecureEncoderForTest();
}
