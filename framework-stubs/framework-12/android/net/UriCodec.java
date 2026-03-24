package android.net;

public final class UriCodec {
    private static final char INVALID_INPUT_CHARACTER = (char)0xfffd;
    private UriCodec() {}
    private static int hexCharToValue(char p0) { return 0; }
    private static java.net.URISyntaxException unexpectedCharacterException(java.lang.String p0, java.lang.String p1, char p2, int p3) { return null; }
    private static char getNextCharacter(java.lang.String p0, int p1, int p2, java.lang.String p3) throws java.net.URISyntaxException { return 0; }
    public static java.lang.String decode(java.lang.String p0, boolean p1, java.nio.charset.Charset p2, boolean p3) { return null; }
    private static void appendDecoded(java.lang.StringBuilder p0, java.lang.String p1, boolean p2, java.nio.charset.Charset p3, boolean p4) {}
    private static void flushDecodingByteAccumulator(java.lang.StringBuilder p0, java.nio.charset.CharsetDecoder p1, java.nio.ByteBuffer p2, boolean p3) {}
}
