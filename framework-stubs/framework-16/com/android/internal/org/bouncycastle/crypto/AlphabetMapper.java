package com.android.internal.org.bouncycastle.crypto;

public interface AlphabetMapper {
    public int getRadix();
    public byte[] convertToIndexes(char[] p0);
    public char[] convertToChars(byte[] p0);
}
