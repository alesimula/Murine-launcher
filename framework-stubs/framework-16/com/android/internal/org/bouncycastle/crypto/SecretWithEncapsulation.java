package com.android.internal.org.bouncycastle.crypto;

public interface SecretWithEncapsulation extends javax.security.auth.Destroyable {
    public byte[] getSecret();
    public byte[] getEncapsulation();
}
