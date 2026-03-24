package com.android.internal.telephony.uicc;

public class IccUtils {
    static final java.lang.String LOG_TAG = "IccUtils";
    static final int FPLMN_BYTE_SIZE = 3;
    public static final java.lang.String TEST_ICCID = "FFFFFFFFFFFFFFFFFFFF";
    public IccUtils() {}
    public static java.lang.String bcdToString(byte[] p0, int p1, int p2) { return null; }
    public static java.lang.String bcdToString(byte[] p0) { return null; }
    public static byte[] bcdToBytes(java.lang.String p0) { return null; }
    public static void bcdToBytes(java.lang.String p0, byte[] p1) {}
    public static void bcdToBytes(java.lang.String p0, byte[] p1, int p2) {}
    public static java.lang.String bcdPlmnToString(byte[] p0, int p1) { return null; }
    public static void stringToBcdPlmn(java.lang.String p0, byte[] p1, int p2) {}
    public static java.lang.String bchToString(byte[] p0, int p1, int p2) { return null; }
    public static java.lang.String cdmaBcdToString(byte[] p0, int p1, int p2) { return null; }
    public static int gsmBcdByteToInt(byte p0) { return 0; }
    public static int cdmaBcdByteToInt(byte p0) { return 0; }
    @android.annotation.NonNull
    public static byte[] stringToAdnStringField(java.lang.String p0) { return null; }
    public static java.lang.String adnStringFieldToString(byte[] p0, int p1, int p2) { return null; }
    public static int hexCharToInt(char p0) { return 0; }
    public static byte[] hexStringToBytes(java.lang.String p0) { return null; }
    public static java.lang.String bytesToHexString(byte[] p0) { return null; }
    public static java.lang.String networkNameToString(byte[] p0, int p1, int p2) { return null; }
    public static android.graphics.Bitmap parseToBnW(byte[] p0, int p1) { return null; }
    public static android.graphics.Bitmap parseToRGB(byte[] p0, int p1, boolean p2) { return null; }
    public static java.lang.String getDecimalSubstring(java.lang.String p0) { return null; }
    public static int bytesToInt(byte[] p0, int p1, int p2) { return 0; }
    public static long bytesToRawLong(byte[] p0, int p1, int p2) { return 0L; }
    public static byte[] unsignedIntToBytes(int p0) { return null; }
    public static byte[] signedIntToBytes(int p0) { return null; }
    public static int unsignedIntToBytes(int p0, byte[] p1, int p2) { return 0; }
    public static int signedIntToBytes(int p0, byte[] p1, int p2) { return 0; }
    public static int byteNumForUnsignedInt(int p0) { return 0; }
    public static int byteNumForSignedInt(int p0) { return 0; }
    public static byte countTrailingZeros(byte p0) { return 0; }
    public static java.lang.String byteToHex(byte p0) { return null; }
    public static java.lang.String stripTrailingFs(java.lang.String p0) { return null; }
    public static boolean compareIgnoreTrailingFs(java.lang.String p0, java.lang.String p1) { return false; }
    public static byte[] encodeFplmns(java.util.List<java.lang.String> p0, int p1) { return null; }
}
