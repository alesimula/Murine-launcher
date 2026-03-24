package com.android.framework.protobuf;

@com.android.framework.protobuf.CheckReturnValue
interface MessageInfo {
    public com.android.framework.protobuf.ProtoSyntax getSyntax();
    public boolean isMessageSetWireFormat();
    public com.android.framework.protobuf.MessageLite getDefaultInstance();
}
