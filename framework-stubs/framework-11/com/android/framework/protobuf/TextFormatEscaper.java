package com.android.framework.protobuf;

final class TextFormatEscaper {
    private TextFormatEscaper() {}
    static java.lang.String escapeBytes(com.android.framework.protobuf.TextFormatEscaper.ByteSequence p0) { return null; }
    static java.lang.String escapeBytes(com.android.framework.protobuf.ByteString p0) { return null; }
    static java.lang.String escapeBytes(byte[] p0) { return null; }
    static java.lang.String escapeText(java.lang.String p0) { return null; }
    static java.lang.String escapeDoubleQuotesAndBackslashes(java.lang.String p0) { return null; }

    private static interface ByteSequence {
        public int size();
        public byte byteAt(int p0);
    }
}
