package com.android.internal.org.bouncycastle.crypto;

public interface EncapsulatedSecretExtractor {
    public byte[] extractSecret(byte[] p0);
    public int getEncapsulationLength();
}
