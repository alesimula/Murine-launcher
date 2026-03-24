package android.hardware.security.keymint;

public final class KeyParameterValue implements android.os.Parcelable {
    public static final int invalid = 0;
    public static final int algorithm = 1;
    public static final int blockMode = 2;
    public static final int paddingMode = 3;
    public static final int digest = 4;
    public static final int ecCurve = 5;
    public static final int origin = 6;
    public static final int keyPurpose = 7;
    public static final int hardwareAuthenticatorType = 8;
    public static final int securityLevel = 9;
    public static final int boolValue = 10;
    public static final int integer = 11;
    public static final int longInteger = 12;
    public static final int dateTime = 13;
    public static final int blob = 14;
    private int _tag;
    private java.lang.Object _value;
    public static final android.os.Parcelable.Creator<android.hardware.security.keymint.KeyParameterValue> CREATOR = null;
    public KeyParameterValue() {}
    private KeyParameterValue(android.os.Parcel p0) {}
    private KeyParameterValue(int p0, java.lang.Object p1) {}
    public int getTag() { return 0; }
    public static android.hardware.security.keymint.KeyParameterValue invalid(int p0) { return null; }
    public int getInvalid() { return 0; }
    public void setInvalid(int p0) {}
    public static android.hardware.security.keymint.KeyParameterValue algorithm(int p0) { return null; }
    public int getAlgorithm() { return 0; }
    public void setAlgorithm(int p0) {}
    public static android.hardware.security.keymint.KeyParameterValue blockMode(int p0) { return null; }
    public int getBlockMode() { return 0; }
    public void setBlockMode(int p0) {}
    public static android.hardware.security.keymint.KeyParameterValue paddingMode(int p0) { return null; }
    public int getPaddingMode() { return 0; }
    public void setPaddingMode(int p0) {}
    public static android.hardware.security.keymint.KeyParameterValue digest(int p0) { return null; }
    public int getDigest() { return 0; }
    public void setDigest(int p0) {}
    public static android.hardware.security.keymint.KeyParameterValue ecCurve(int p0) { return null; }
    public int getEcCurve() { return 0; }
    public void setEcCurve(int p0) {}
    public static android.hardware.security.keymint.KeyParameterValue origin(int p0) { return null; }
    public int getOrigin() { return 0; }
    public void setOrigin(int p0) {}
    public static android.hardware.security.keymint.KeyParameterValue keyPurpose(int p0) { return null; }
    public int getKeyPurpose() { return 0; }
    public void setKeyPurpose(int p0) {}
    public static android.hardware.security.keymint.KeyParameterValue hardwareAuthenticatorType(int p0) { return null; }
    public int getHardwareAuthenticatorType() { return 0; }
    public void setHardwareAuthenticatorType(int p0) {}
    public static android.hardware.security.keymint.KeyParameterValue securityLevel(int p0) { return null; }
    public int getSecurityLevel() { return 0; }
    public void setSecurityLevel(int p0) {}
    public static android.hardware.security.keymint.KeyParameterValue boolValue(boolean p0) { return null; }
    public boolean getBoolValue() { return false; }
    public void setBoolValue(boolean p0) {}
    public static android.hardware.security.keymint.KeyParameterValue integer(int p0) { return null; }
    public int getInteger() { return 0; }
    public void setInteger(int p0) {}
    public static android.hardware.security.keymint.KeyParameterValue longInteger(long p0) { return null; }
    public long getLongInteger() { return 0L; }
    public void setLongInteger(long p0) {}
    public static android.hardware.security.keymint.KeyParameterValue dateTime(long p0) { return null; }
    public long getDateTime() { return 0L; }
    public void setDateTime(long p0) {}
    public static android.hardware.security.keymint.KeyParameterValue blob(byte[] p0) { return null; }
    public byte[] getBlob() { return null; }
    public void setBlob(byte[] p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    private void _assertTag(int p0) {}
    private java.lang.String _tagString(int p0) { return null; }
    private void _set(int p0, java.lang.Object p1) {}
}
