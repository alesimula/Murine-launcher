package com.android.internal.org.bouncycastle.math;

public abstract class Primes {
    public static final int SMALL_FACTOR_LIMIT = 211;
    public Primes() {}
    public static com.android.internal.org.bouncycastle.math.Primes.STOutput generateSTRandomPrime(com.android.internal.org.bouncycastle.crypto.Digest p0, int p1, byte[] p2) { return null; }
    public static com.android.internal.org.bouncycastle.math.Primes.MROutput enhancedMRProbablePrimeTest(java.math.BigInteger p0, java.security.SecureRandom p1, int p2) { return null; }
    public static boolean hasAnySmallFactors(java.math.BigInteger p0) { return false; }
    public static boolean isMRProbablePrime(java.math.BigInteger p0, java.security.SecureRandom p1, int p2) { return false; }
    public static boolean isMRProbablePrimeToBase(java.math.BigInteger p0, java.math.BigInteger p1) { return false; }

    public static class MROutput {
        public java.math.BigInteger getFactor() { return null; }
        public boolean isProvablyComposite() { return false; }
        public boolean isNotPrimePower() { return false; }
    }

    public static class STOutput {
        public java.math.BigInteger getPrime() { return null; }
        public byte[] getPrimeSeed() { return null; }
        public int getPrimeGenCounter() { return 0; }
    }
}
