package com.android.internal.telephony.uicc.asn1;

public final class Asn1Node {
    private static final int INT_BYTES = 4;
    private static final java.util.List<com.android.internal.telephony.uicc.asn1.Asn1Node> EMPTY_NODE_LIST = null;
    private static final byte[] TRUE_BYTES = null;
    private static final byte[] FALSE_BYTES = null;
    private final int mTag = 0;
    private final boolean mConstructed = false;
    private final java.util.List<com.android.internal.telephony.uicc.asn1.Asn1Node> mChildren = null;
    private byte[] mDataBytes;
    private int mDataOffset;
    private int mDataLength;
    private int mEncodedLength;
    public static com.android.internal.telephony.uicc.asn1.Asn1Node.Builder newBuilder(int p0) { return null; }
    private static boolean isConstructedTag(int p0) { return false; }
    private static int calculateEncodedBytesNumForLength(int p0) { return 0; }
    Asn1Node(int p0, byte[] p1, int p2, int p3) {}
    private Asn1Node(int p0, java.util.List<com.android.internal.telephony.uicc.asn1.Asn1Node> p1) {}
    public int getTag() { return 0; }
    public boolean isConstructed() { return false; }
    public boolean hasChild(int p0, int... p1) throws com.android.internal.telephony.uicc.asn1.InvalidAsn1DataException { return false; }
    public com.android.internal.telephony.uicc.asn1.Asn1Node getChild(int p0, int... p1) throws com.android.internal.telephony.uicc.asn1.TagNotFoundException, com.android.internal.telephony.uicc.asn1.InvalidAsn1DataException { return null; }
    public java.util.List<com.android.internal.telephony.uicc.asn1.Asn1Node> getChildren(int p0) throws com.android.internal.telephony.uicc.asn1.TagNotFoundException, com.android.internal.telephony.uicc.asn1.InvalidAsn1DataException { return null; }
    public java.util.List<com.android.internal.telephony.uicc.asn1.Asn1Node> getChildren() throws com.android.internal.telephony.uicc.asn1.InvalidAsn1DataException { return null; }
    public boolean hasValue() { return false; }
    public int asInteger() throws com.android.internal.telephony.uicc.asn1.InvalidAsn1DataException { return 0; }
    public long asRawLong() throws com.android.internal.telephony.uicc.asn1.InvalidAsn1DataException { return 0L; }
    public java.lang.String asString() throws com.android.internal.telephony.uicc.asn1.InvalidAsn1DataException { return null; }
    public byte[] asBytes() throws com.android.internal.telephony.uicc.asn1.InvalidAsn1DataException { return null; }
    public int asBits() throws com.android.internal.telephony.uicc.asn1.InvalidAsn1DataException { return 0; }
    public boolean asBoolean() throws com.android.internal.telephony.uicc.asn1.InvalidAsn1DataException { return false; }
    public int getEncodedLength() { return 0; }
    public int getDataLength() { return 0; }
    public void writeToBytes(byte[] p0, int p1) {}
    public byte[] toBytes() { return null; }
    public java.lang.String toHex() { return null; }
    public java.lang.String getHeadAsHex() { return null; }
    private int write(byte[] p0, int p1) { return 0; }

    public static final class Builder {
        private final int mTag = 0;
        private final java.util.List<com.android.internal.telephony.uicc.asn1.Asn1Node> mChildren = null;
        private Builder(int p0) {}
        public com.android.internal.telephony.uicc.asn1.Asn1Node.Builder addChild(com.android.internal.telephony.uicc.asn1.Asn1Node p0) { return null; }
        public com.android.internal.telephony.uicc.asn1.Asn1Node.Builder addChild(com.android.internal.telephony.uicc.asn1.Asn1Node.Builder p0) { return null; }
        public com.android.internal.telephony.uicc.asn1.Asn1Node.Builder addChildren(byte[] p0) throws com.android.internal.telephony.uicc.asn1.InvalidAsn1DataException { return null; }
        public com.android.internal.telephony.uicc.asn1.Asn1Node.Builder addChildAsInteger(int p0, int p1) { return null; }
        public com.android.internal.telephony.uicc.asn1.Asn1Node.Builder addChildAsString(int p0, java.lang.String p1) { return null; }
        public com.android.internal.telephony.uicc.asn1.Asn1Node.Builder addChildAsBytes(int p0, byte[] p1) { return null; }
        public com.android.internal.telephony.uicc.asn1.Asn1Node.Builder addChildAsBytesFromHex(int p0, java.lang.String p1) { return null; }
        public com.android.internal.telephony.uicc.asn1.Asn1Node.Builder addChildAsBits(int p0, int p1) { return null; }
        public com.android.internal.telephony.uicc.asn1.Asn1Node.Builder addChildAsBoolean(int p0, boolean p1) { return null; }
        public com.android.internal.telephony.uicc.asn1.Asn1Node build() { return null; }
    }
}
