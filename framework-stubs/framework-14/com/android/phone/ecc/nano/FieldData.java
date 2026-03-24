package com.android.phone.ecc.nano;

class FieldData implements java.lang.Cloneable {
    <T extends java.lang.Object> FieldData(com.android.phone.ecc.nano.Extension<?, T> p0, T p1) {}
    FieldData() {}
    void addUnknownField(com.android.phone.ecc.nano.UnknownFieldData p0) {}
    com.android.phone.ecc.nano.UnknownFieldData getUnknownField(int p0) { return null; }
    int getUnknownFieldSize() { return 0; }
    <T extends java.lang.Object> T getValue(com.android.phone.ecc.nano.Extension<?, T> p0) { return null; }
    <T extends java.lang.Object> void setValue(com.android.phone.ecc.nano.Extension<?, T> p0, T p1) {}
    int computeSerializedSize() { return 0; }
    void writeTo(com.android.phone.ecc.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final com.android.phone.ecc.nano.FieldData clone() { return null; }
}
