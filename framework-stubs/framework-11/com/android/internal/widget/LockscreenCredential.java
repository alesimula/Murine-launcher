package com.android.internal.widget;

public class LockscreenCredential implements android.os.Parcelable, java.lang.AutoCloseable {
    private final int mType = 0;
    private byte[] mCredential;
    public static final android.os.Parcelable.Creator<com.android.internal.widget.LockscreenCredential> CREATOR = null;
    private LockscreenCredential(int p0, byte[] p1) {}
    public static com.android.internal.widget.LockscreenCredential createNone() { return null; }
    public static com.android.internal.widget.LockscreenCredential createPattern(java.util.List<com.android.internal.widget.LockPatternView.Cell> p0) { return null; }
    public static com.android.internal.widget.LockscreenCredential createPassword(java.lang.CharSequence p0) { return null; }
    public static com.android.internal.widget.LockscreenCredential createManagedPassword(byte[] p0) { return null; }
    public static com.android.internal.widget.LockscreenCredential createPin(java.lang.CharSequence p0) { return null; }
    public static com.android.internal.widget.LockscreenCredential createPasswordOrNone(java.lang.CharSequence p0) { return null; }
    public static com.android.internal.widget.LockscreenCredential createPinOrNone(java.lang.CharSequence p0) { return null; }
    private void ensureNotZeroized() {}
    public int getType() { return 0; }
    public byte[] getCredential() { return null; }
    public int getStorageCryptType() { return 0; }
    public boolean isNone() { return false; }
    public boolean isPattern() { return false; }
    public boolean isPin() { return false; }
    public boolean isPassword() { return false; }
    public int size() { return 0; }
    public com.android.internal.widget.LockscreenCredential duplicate() { return null; }
    public void zeroize() {}
    public void checkLength() {}
    public boolean checkAgainstStoredType(int p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public void close() {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    private static byte[] charSequenceToByteArray(java.lang.CharSequence p0) { return null; }
}
