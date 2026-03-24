package com.android.internal.org.bouncycastle.math.raw;

public abstract class Nat {
    public Nat() {}
    public static int add(int p0, int[] p1, int[] p2, int[] p3) { return 0; }
    public static int add33At(int p0, int p1, int[] p2, int p3) { return 0; }
    public static int add33At(int p0, int p1, int[] p2, int p3, int p4) { return 0; }
    public static int add33To(int p0, int p1, int[] p2) { return 0; }
    public static int add33To(int p0, int p1, int[] p2, int p3) { return 0; }
    public static int addBothTo(int p0, int[] p1, int[] p2, int[] p3) { return 0; }
    public static int addBothTo(int p0, int[] p1, int p2, int[] p3, int p4, int[] p5, int p6) { return 0; }
    public static int addDWordAt(int p0, long p1, int[] p2, int p3) { return 0; }
    public static int addDWordAt(int p0, long p1, int[] p2, int p3, int p4) { return 0; }
    public static int addDWordTo(int p0, long p1, int[] p2) { return 0; }
    public static int addDWordTo(int p0, long p1, int[] p2, int p3) { return 0; }
    public static int addTo(int p0, int[] p1, int[] p2) { return 0; }
    public static int addTo(int p0, int[] p1, int p2, int[] p3, int p4) { return 0; }
    public static int addTo(int p0, int[] p1, int p2, int[] p3, int p4, int p5) { return 0; }
    public static int addToEachOther(int p0, int[] p1, int p2, int[] p3, int p4) { return 0; }
    public static int addWordAt(int p0, int p1, int[] p2, int p3) { return 0; }
    public static int addWordAt(int p0, int p1, int[] p2, int p3, int p4) { return 0; }
    public static int addWordTo(int p0, int p1, int[] p2) { return 0; }
    public static int addWordTo(int p0, int p1, int[] p2, int p3) { return 0; }
    public static int cadd(int p0, int p1, int[] p2, int[] p3, int[] p4) { return 0; }
    public static int caddTo(int p0, int p1, int[] p2, int[] p3) { return 0; }
    public static void cmov(int p0, int p1, int[] p2, int p3, int[] p4, int p5) {}
    public static int compare(int p0, int[] p1, int[] p2) { return 0; }
    public static int compare(int p0, int[] p1, int p2, int[] p3, int p4) { return 0; }
    public static int[] copy(int p0, int[] p1) { return null; }
    public static void copy(int p0, int[] p1, int[] p2) {}
    public static void copy(int p0, int[] p1, int p2, int[] p3, int p4) {}
    public static long[] copy64(int p0, long[] p1) { return null; }
    public static void copy64(int p0, long[] p1, long[] p2) {}
    public static void copy64(int p0, long[] p1, int p2, long[] p3, int p4) {}
    public static int[] create(int p0) { return null; }
    public static long[] create64(int p0) { return null; }
    public static int csub(int p0, int p1, int[] p2, int[] p3, int[] p4) { return 0; }
    public static int csub(int p0, int p1, int[] p2, int p3, int[] p4, int p5, int[] p6, int p7) { return 0; }
    public static int dec(int p0, int[] p1) { return 0; }
    public static int dec(int p0, int[] p1, int[] p2) { return 0; }
    public static int decAt(int p0, int[] p1, int p2) { return 0; }
    public static int decAt(int p0, int[] p1, int p2, int p3) { return 0; }
    public static boolean diff(int p0, int[] p1, int p2, int[] p3, int p4, int[] p5, int p6) { return false; }
    public static boolean eq(int p0, int[] p1, int[] p2) { return false; }
    public static int equalTo(int p0, int[] p1, int p2) { return 0; }
    public static int equalTo(int p0, int[] p1, int p2, int p3) { return 0; }
    public static int equalTo(int p0, int[] p1, int[] p2) { return 0; }
    public static int equalTo(int p0, int[] p1, int p2, int[] p3, int p4) { return 0; }
    public static int equalToZero(int p0, int[] p1) { return 0; }
    public static int equalToZero(int p0, int[] p1, int p2) { return 0; }
    public static int[] fromBigInteger(int p0, java.math.BigInteger p1) { return null; }
    public static long[] fromBigInteger64(int p0, java.math.BigInteger p1) { return null; }
    public static int getBit(int[] p0, int p1) { return 0; }
    public static boolean gte(int p0, int[] p1, int[] p2) { return false; }
    public static boolean gte(int p0, int[] p1, int p2, int[] p3, int p4) { return false; }
    public static int inc(int p0, int[] p1) { return 0; }
    public static int inc(int p0, int[] p1, int[] p2) { return 0; }
    public static int incAt(int p0, int[] p1, int p2) { return 0; }
    public static int incAt(int p0, int[] p1, int p2, int p3) { return 0; }
    public static boolean isOne(int p0, int[] p1) { return false; }
    public static boolean isZero(int p0, int[] p1) { return false; }
    public static int lessThan(int p0, int[] p1, int[] p2) { return 0; }
    public static int lessThan(int p0, int[] p1, int p2, int[] p3, int p4) { return 0; }
    public static void mul(int p0, int[] p1, int[] p2, int[] p3) {}
    public static void mul(int p0, int[] p1, int p2, int[] p3, int p4, int[] p5, int p6) {}
    public static void mul(int[] p0, int p1, int p2, int[] p3, int p4, int p5, int[] p6, int p7) {}
    public static int mulAddTo(int p0, int[] p1, int[] p2, int[] p3) { return 0; }
    public static int mulAddTo(int p0, int[] p1, int p2, int[] p3, int p4, int[] p5, int p6) { return 0; }
    public static int mul31BothAdd(int p0, int p1, int[] p2, int p3, int[] p4, int[] p5, int p6) { return 0; }
    public static int mulWord(int p0, int p1, int[] p2, int[] p3) { return 0; }
    public static int mulWord(int p0, int p1, int[] p2, int p3, int[] p4, int p5) { return 0; }
    public static int mulWordAddTo(int p0, int p1, int[] p2, int p3, int[] p4, int p5) { return 0; }
    public static int mulWordDwordAddAt(int p0, int p1, long p2, int[] p3, int p4) { return 0; }
    public static int shiftDownBit(int p0, int[] p1, int p2) { return 0; }
    public static int shiftDownBit(int p0, int[] p1, int p2, int p3) { return 0; }
    public static int shiftDownBit(int p0, int[] p1, int p2, int[] p3) { return 0; }
    public static int shiftDownBit(int p0, int[] p1, int p2, int p3, int[] p4, int p5) { return 0; }
    public static int shiftDownBits(int p0, int[] p1, int p2, int p3) { return 0; }
    public static int shiftDownBits(int p0, int[] p1, int p2, int p3, int p4) { return 0; }
    public static int shiftDownBits(int p0, int[] p1, int p2, int p3, int[] p4) { return 0; }
    public static int shiftDownBits(int p0, int[] p1, int p2, int p3, int p4, int[] p5, int p6) { return 0; }
    public static int shiftDownWord(int p0, int[] p1, int p2) { return 0; }
    public static int shiftUpBit(int p0, int[] p1, int p2) { return 0; }
    public static int shiftUpBit(int p0, int[] p1, int p2, int p3) { return 0; }
    public static int shiftUpBit(int p0, int[] p1, int p2, int[] p3) { return 0; }
    public static int shiftUpBit(int p0, int[] p1, int p2, int p3, int[] p4, int p5) { return 0; }
    public static long shiftUpBit64(int p0, long[] p1, int p2, long p3, long[] p4, int p5) { return 0L; }
    public static int shiftUpBits(int p0, int[] p1, int p2, int p3) { return 0; }
    public static int shiftUpBits(int p0, int[] p1, int p2, int p3, int p4) { return 0; }
    public static long shiftUpBits64(int p0, long[] p1, int p2, int p3, long p4) { return 0L; }
    public static int shiftUpBits(int p0, int[] p1, int p2, int p3, int[] p4) { return 0; }
    public static int shiftUpBits(int p0, int[] p1, int p2, int p3, int p4, int[] p5, int p6) { return 0; }
    public static long shiftUpBits64(int p0, long[] p1, int p2, int p3, long p4, long[] p5, int p6) { return 0L; }
    public static void square(int p0, int[] p1, int[] p2) {}
    public static void square(int p0, int[] p1, int p2, int[] p3, int p4) {}
    public static int squareWordAddTo(int[] p0, int p1, int[] p2) { return 0; }
    public static int squareWordAddTo(int[] p0, int p1, int p2, int[] p3, int p4) { return 0; }
    public static int sub(int p0, int[] p1, int[] p2, int[] p3) { return 0; }
    public static int sub(int p0, int[] p1, int p2, int[] p3, int p4, int[] p5, int p6) { return 0; }
    public static int sub33At(int p0, int p1, int[] p2, int p3) { return 0; }
    public static int sub33At(int p0, int p1, int[] p2, int p3, int p4) { return 0; }
    public static int sub33From(int p0, int p1, int[] p2) { return 0; }
    public static int sub33From(int p0, int p1, int[] p2, int p3) { return 0; }
    public static int subBothFrom(int p0, int[] p1, int[] p2, int[] p3) { return 0; }
    public static int subBothFrom(int p0, int[] p1, int p2, int[] p3, int p4, int[] p5, int p6) { return 0; }
    public static int subDWordAt(int p0, long p1, int[] p2, int p3) { return 0; }
    public static int subDWordAt(int p0, long p1, int[] p2, int p3, int p4) { return 0; }
    public static int subDWordFrom(int p0, long p1, int[] p2) { return 0; }
    public static int subDWordFrom(int p0, long p1, int[] p2, int p3) { return 0; }
    public static int subFrom(int p0, int[] p1, int[] p2) { return 0; }
    public static int subFrom(int p0, int[] p1, int p2, int[] p3, int p4) { return 0; }
    public static int subWordAt(int p0, int p1, int[] p2, int p3) { return 0; }
    public static int subWordAt(int p0, int p1, int[] p2, int p3, int p4) { return 0; }
    public static int subWordFrom(int p0, int p1, int[] p2) { return 0; }
    public static int subWordFrom(int p0, int p1, int[] p2, int p3) { return 0; }
    public static java.math.BigInteger toBigInteger(int p0, int[] p1) { return null; }
    public static void zero(int p0, int[] p1) {}
    public static void zero(int p0, int[] p1, int p2) {}
    public static void zero64(int p0, long[] p1) {}
}
