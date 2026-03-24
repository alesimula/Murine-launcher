package com.android.org.conscrypt;

abstract class NativeRef {
    final long address = 0L;
    NativeRef(long p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    protected void finalize() throws java.lang.Throwable {}
    abstract void doFree(long p0);

    static final class CMAC_CTX extends com.android.org.conscrypt.NativeRef {
        CMAC_CTX(long p0) { super(0L); }
        void doFree(long p0) {}
    }

    static final class EC_GROUP extends com.android.org.conscrypt.NativeRef {
        EC_GROUP(long p0) { super(0L); }
        void doFree(long p0) {}
    }

    static final class EC_POINT extends com.android.org.conscrypt.NativeRef {
        EC_POINT(long p0) { super(0L); }
        void doFree(long p0) {}
    }

    static final class EVP_CIPHER_CTX extends com.android.org.conscrypt.NativeRef {
        EVP_CIPHER_CTX(long p0) { super(0L); }
        void doFree(long p0) {}
    }

    static final class EVP_MD_CTX extends com.android.org.conscrypt.NativeRef {
        EVP_MD_CTX(long p0) { super(0L); }
        void doFree(long p0) {}
    }

    static final class EVP_PKEY extends com.android.org.conscrypt.NativeRef {
        EVP_PKEY(long p0) { super(0L); }
        void doFree(long p0) {}
    }

    static final class EVP_PKEY_CTX extends com.android.org.conscrypt.NativeRef {
        EVP_PKEY_CTX(long p0) { super(0L); }
        void doFree(long p0) {}
    }

    static final class HMAC_CTX extends com.android.org.conscrypt.NativeRef {
        HMAC_CTX(long p0) { super(0L); }
        void doFree(long p0) {}
    }

    static final class SSL_SESSION extends com.android.org.conscrypt.NativeRef {
        SSL_SESSION(long p0) { super(0L); }
        void doFree(long p0) {}
    }
}
