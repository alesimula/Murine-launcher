package com.android.framework.protobuf;

public abstract class ExtensionLite<ContainingType extends com.android.framework.protobuf.MessageLite, Type extends java.lang.Object> {
    public ExtensionLite() {}
    public abstract int getNumber();
    public abstract com.android.framework.protobuf.WireFormat.FieldType getLiteType();
    public abstract boolean isRepeated();
    public abstract Type getDefaultValue();
    public abstract com.android.framework.protobuf.MessageLite getMessageDefaultInstance();
    boolean isLite() { return false; }
}
