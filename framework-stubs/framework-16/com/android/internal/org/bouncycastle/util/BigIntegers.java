package com.android.internal.org.bouncycastle.util;

public final class BigIntegers {
    public static final java.math.BigInteger ZERO = null;
    public static final java.math.BigInteger ONE = null;
    public static final java.math.BigInteger TWO = null;
    public BigIntegers() {}
    public static byte[] asUnsignedByteArray(java.math.BigInteger p0) { return null; }
    public static byte[] asUnsignedByteArray(int p0, java.math.BigInteger p1) { return null; }
    public static void asUnsignedByteArray(java.math.BigInteger p0, byte[] p1, int p2, int p3) {}
    public static java.math.BigInteger createRandomInRange(java.math.BigInteger p0, java.math.BigInteger p1, java.security.SecureRandom p2) { return null; }
    public static java.math.BigInteger fromUnsignedByteArray(byte[] p0) { return null; }
    public static java.math.BigInteger fromUnsignedByteArray(byte[] p0, int p1, int p2) { return null; }
    public static byte byteValueExact(java.math.BigInteger p0) { return 0; }
    public static short shortValueExact(java.math.BigInteger p0) { return 0; }
    public static int intValueExact(java.math.BigInteger p0) { return 0; }
    public static long longValueExact(java.math.BigInteger p0) { return 0L; }
    public static java.math.BigInteger modOddInverse(java.math.BigInteger p0, java.math.BigInteger p1) { return null; }
    public static java.math.BigInteger modOddInverseVar(java.math.BigInteger p0, java.math.BigInteger p1) { return null; }
    public static int getUnsignedByteLength(java.math.BigInteger p0) { return 0; }
    public static java.math.BigInteger createRandomBigInteger(int p0, java.security.SecureRandom p1) { return null; }
    public static java.math.BigInteger createRandomPrime(int p0, int p1, java.security.SecureRandom p2) { return null; }

    public static class Cache {
        public Cache() {}
        public synchronized void add(java.math.BigInteger p0) {}
        public synchronized boolean contains(java.math.BigInteger p0) { return false; }
        public synchronized int size() { return 0; }
        public synchronized void clear() {}
    }
}
