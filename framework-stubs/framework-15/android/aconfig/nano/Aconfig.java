package android.aconfig.nano;

public interface Aconfig {
    public static final int ENABLED = 1;
    public static final int DISABLED = 2;
    public static final int READ_ONLY = 1;
    public static final int READ_WRITE = 2;

    public static final class flag_declaration extends android.internal.framework.protobuf.nano.MessageNano {
        public java.lang.String name;
        public java.lang.String namespace;
        public java.lang.String description;
        public java.lang.String[] bug;
        public boolean isFixedReadOnly;
        public boolean isExported;
        public android.aconfig.nano.Aconfig.flag_metadata metadata;
        public static android.aconfig.nano.Aconfig.flag_declaration[] emptyArray() { return null; }
        public flag_declaration() { super(); }
        public android.aconfig.nano.Aconfig.flag_declaration clear() { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.flag_declaration mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.flag_declaration parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static android.aconfig.nano.Aconfig.flag_declaration parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class flag_declarations extends android.internal.framework.protobuf.nano.MessageNano {
        public java.lang.String package_;
        public android.aconfig.nano.Aconfig.flag_declaration[] flag;
        public java.lang.String container;
        public static android.aconfig.nano.Aconfig.flag_declarations[] emptyArray() { return null; }
        public flag_declarations() { super(); }
        public android.aconfig.nano.Aconfig.flag_declarations clear() { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.flag_declarations mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.flag_declarations parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static android.aconfig.nano.Aconfig.flag_declarations parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class flag_metadata extends android.internal.framework.protobuf.nano.MessageNano {
        public static final int PURPOSE_UNSPECIFIED = 0;
        public static final int PURPOSE_FEATURE = 1;
        public static final int PURPOSE_BUGFIX = 2;
        public int purpose;
        public static android.aconfig.nano.Aconfig.flag_metadata[] emptyArray() { return null; }
        public flag_metadata() { super(); }
        public android.aconfig.nano.Aconfig.flag_metadata clear() { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.flag_metadata mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.flag_metadata parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static android.aconfig.nano.Aconfig.flag_metadata parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class flag_value extends android.internal.framework.protobuf.nano.MessageNano {
        public java.lang.String package_;
        public java.lang.String name;
        public int state;
        public int permission;
        public static android.aconfig.nano.Aconfig.flag_value[] emptyArray() { return null; }
        public flag_value() { super(); }
        public android.aconfig.nano.Aconfig.flag_value clear() { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.flag_value mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.flag_value parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static android.aconfig.nano.Aconfig.flag_value parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class flag_values extends android.internal.framework.protobuf.nano.MessageNano {
        public android.aconfig.nano.Aconfig.flag_value[] flagValue;
        public static android.aconfig.nano.Aconfig.flag_values[] emptyArray() { return null; }
        public flag_values() { super(); }
        public android.aconfig.nano.Aconfig.flag_values clear() { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.flag_values mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.flag_values parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static android.aconfig.nano.Aconfig.flag_values parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class parsed_flag extends android.internal.framework.protobuf.nano.MessageNano {
        public java.lang.String package_;
        public java.lang.String name;
        public java.lang.String namespace;
        public java.lang.String description;
        public java.lang.String[] bug;
        public int state;
        public int permission;
        public android.aconfig.nano.Aconfig.tracepoint[] trace;
        public boolean isFixedReadOnly;
        public boolean isExported;
        public java.lang.String container;
        public android.aconfig.nano.Aconfig.flag_metadata metadata;
        public static android.aconfig.nano.Aconfig.parsed_flag[] emptyArray() { return null; }
        public parsed_flag() { super(); }
        public android.aconfig.nano.Aconfig.parsed_flag clear() { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.parsed_flag mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.parsed_flag parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static android.aconfig.nano.Aconfig.parsed_flag parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class parsed_flags extends android.internal.framework.protobuf.nano.MessageNano {
        public android.aconfig.nano.Aconfig.parsed_flag[] parsedFlag;
        public static android.aconfig.nano.Aconfig.parsed_flags[] emptyArray() { return null; }
        public parsed_flags() { super(); }
        public android.aconfig.nano.Aconfig.parsed_flags clear() { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.parsed_flags mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.parsed_flags parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static android.aconfig.nano.Aconfig.parsed_flags parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class tracepoint extends android.internal.framework.protobuf.nano.MessageNano {
        public java.lang.String source;
        public int state;
        public int permission;
        public static android.aconfig.nano.Aconfig.tracepoint[] emptyArray() { return null; }
        public tracepoint() { super(); }
        public android.aconfig.nano.Aconfig.tracepoint clear() { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.tracepoint mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.tracepoint parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static android.aconfig.nano.Aconfig.tracepoint parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }
}
