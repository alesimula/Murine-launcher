package com.android.internal.org.bouncycastle.cert.selector;

class MSOutlookKeyIdCalculator {
    MSOutlookKeyIdCalculator() {}
    static byte[] calculateKeyId(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) { return null; }

    private static abstract class GeneralDigest {
        protected GeneralDigest() {}
        protected GeneralDigest(com.android.internal.org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest p0) {}
        protected void copyIn(com.android.internal.org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest p0) {}
        public void update(byte p0) {}
        public void update(byte[] p0, int p1, int p2) {}
        public void finish() {}
        public void reset() {}
        protected abstract void processWord(byte[] p0, int p1);
        protected abstract void processLength(long p0);
        protected abstract void processBlock();
    }

    private static class SHA1Digest extends com.android.internal.org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest {
        public SHA1Digest() { super(); }
        public java.lang.String getAlgorithmName() { return null; }
        public int getDigestSize() { return 0; }
        protected void processWord(byte[] p0, int p1) {}
        protected void processLength(long p0) {}
        public int doFinal(byte[] p0, int p1) { return 0; }
        public void reset() {}
        protected void processBlock() {}
    }
}
