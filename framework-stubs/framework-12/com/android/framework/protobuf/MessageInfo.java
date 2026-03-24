package com.android.framework.protobuf;

interface MessageInfo {
    public com.android.framework.protobuf.ProtoSyntax getSyntax();
    public boolean isMessageSetWireFormat();
    public com.android.framework.protobuf.MessageLite getDefaultInstance();
}
