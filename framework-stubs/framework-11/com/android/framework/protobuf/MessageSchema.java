package com.android.framework.protobuf;

final class MessageSchema<T extends java.lang.Object> implements com.android.framework.protobuf.Schema<T> {
    private static final int INTS_PER_FIELD = 3;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int REQUIRED_MASK = 268435456;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int[] EMPTY_INT_ARRAY = null;
    static final int ONEOF_TYPE_OFFSET = 51;
    private final int[] buffer = null;
    private final java.lang.Object[] objects = null;
    private final int minFieldNumber = 0;
    private final int maxFieldNumber = 0;
    private final com.android.framework.protobuf.MessageLite defaultInstance = null;
    private final boolean hasExtensions = false;
    private final boolean lite = false;
    private final boolean proto3 = false;
    private final boolean useCachedSizeField = false;
    private final int[] intArray = null;
    private final int checkInitializedCount = 0;
    private final int repeatedFieldOffsetStart = 0;
    private final com.android.framework.protobuf.NewInstanceSchema newInstanceSchema = null;
    private final com.android.framework.protobuf.ListFieldSchema listFieldSchema = null;
    private final com.android.framework.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema = null;
    private final com.android.framework.protobuf.ExtensionSchema<?> extensionSchema = null;
    private final com.android.framework.protobuf.MapFieldSchema mapFieldSchema = null;
    private MessageSchema(int[] p0, java.lang.Object[] p1, int p2, int p3, com.android.framework.protobuf.MessageLite p4, boolean p5, boolean p6, int[] p7, int p8, int p9, com.android.framework.protobuf.NewInstanceSchema p10, com.android.framework.protobuf.ListFieldSchema p11, com.android.framework.protobuf.UnknownFieldSchema<?, ?> p12, com.android.framework.protobuf.ExtensionSchema<?> p13, com.android.framework.protobuf.MapFieldSchema p14) {}
    static <T extends java.lang.Object> com.android.framework.protobuf.MessageSchema<T> newSchema(java.lang.Class<T> p0, com.android.framework.protobuf.MessageInfo p1, com.android.framework.protobuf.NewInstanceSchema p2, com.android.framework.protobuf.ListFieldSchema p3, com.android.framework.protobuf.UnknownFieldSchema<?, ?> p4, com.android.framework.protobuf.ExtensionSchema<?> p5, com.android.framework.protobuf.MapFieldSchema p6) { return null; }
    static <T extends java.lang.Object> com.android.framework.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(com.android.framework.protobuf.RawMessageInfo p0, com.android.framework.protobuf.NewInstanceSchema p1, com.android.framework.protobuf.ListFieldSchema p2, com.android.framework.protobuf.UnknownFieldSchema<?, ?> p3, com.android.framework.protobuf.ExtensionSchema<?> p4, com.android.framework.protobuf.MapFieldSchema p5) { return null; }
    private static java.lang.reflect.Field reflectField(java.lang.Class<?> p0, java.lang.String p1) { return null; }
    static <T extends java.lang.Object> com.android.framework.protobuf.MessageSchema<T> newSchemaForMessageInfo(com.android.framework.protobuf.StructuralMessageInfo p0, com.android.framework.protobuf.NewInstanceSchema p1, com.android.framework.protobuf.ListFieldSchema p2, com.android.framework.protobuf.UnknownFieldSchema<?, ?> p3, com.android.framework.protobuf.ExtensionSchema<?> p4, com.android.framework.protobuf.MapFieldSchema p5) { return null; }
    private static void storeFieldData(com.android.framework.protobuf.FieldInfo p0, int[] p1, int p2, boolean p3, java.lang.Object[] p4) {}
    public T newInstance() { return null; }
    public boolean equals(T p0, T p1) { return false; }
    private boolean equals(T p0, T p1, int p2) { return false; }
    public int hashCode(T p0) { return 0; }
    public void mergeFrom(T p0, T p1) {}
    private void mergeSingleField(T p0, T p1, int p2) {}
    private void mergeMessage(T p0, T p1, int p2) {}
    private void mergeOneofMessage(T p0, T p1, int p2) {}
    public int getSerializedSize(T p0) { return 0; }
    private int getSerializedSizeProto2(T p0) { return 0; }
    private int getSerializedSizeProto3(T p0) { return 0; }
    private <UT extends java.lang.Object, UB extends java.lang.Object> int getUnknownFieldsSerializedSize(com.android.framework.protobuf.UnknownFieldSchema<UT, UB> p0, T p1) { return 0; }
    private static java.util.List<?> listAt(java.lang.Object p0, long p1) { return null; }
    public void writeTo(T p0, com.android.framework.protobuf.Writer p1) throws java.io.IOException {}
    private void writeFieldsInAscendingOrderProto2(T p0, com.android.framework.protobuf.Writer p1) throws java.io.IOException {}
    private void writeFieldsInAscendingOrderProto3(T p0, com.android.framework.protobuf.Writer p1) throws java.io.IOException {}
    private void writeFieldsInDescendingOrder(T p0, com.android.framework.protobuf.Writer p1) throws java.io.IOException {}
    private <K extends java.lang.Object, V extends java.lang.Object> void writeMapHelper(com.android.framework.protobuf.Writer p0, int p1, java.lang.Object p2, int p3) throws java.io.IOException {}
    private <UT extends java.lang.Object, UB extends java.lang.Object> void writeUnknownInMessageTo(com.android.framework.protobuf.UnknownFieldSchema<UT, UB> p0, T p1, com.android.framework.protobuf.Writer p2) throws java.io.IOException {}
    public void mergeFrom(T p0, com.android.framework.protobuf.Reader p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
    private <UT extends java.lang.Object, UB extends java.lang.Object, ET extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.android.framework.protobuf.UnknownFieldSchema<UT, UB> p0, com.android.framework.protobuf.ExtensionSchema<ET> p1, T p2, com.android.framework.protobuf.Reader p3, com.android.framework.protobuf.ExtensionRegistryLite p4) throws java.io.IOException {}
    static com.android.framework.protobuf.UnknownFieldSetLite getMutableUnknownFields(java.lang.Object p0) { return null; }
    private int decodeMapEntryValue(byte[] p0, int p1, int p2, com.android.framework.protobuf.WireFormat.FieldType p3, java.lang.Class<?> p4, com.android.framework.protobuf.ArrayDecoders.Registers p5) throws java.io.IOException { return 0; }
    private <K extends java.lang.Object, V extends java.lang.Object> int decodeMapEntry(byte[] p0, int p1, int p2, com.android.framework.protobuf.MapEntryLite.Metadata<K, V> p3, java.util.Map<K, V> p4, com.android.framework.protobuf.ArrayDecoders.Registers p5) throws java.io.IOException { return 0; }
    private int parseRepeatedField(T p0, byte[] p1, int p2, int p3, int p4, int p5, int p6, int p7, long p8, int p9, long p10, com.android.framework.protobuf.ArrayDecoders.Registers p11) throws java.io.IOException { return 0; }
    private <K extends java.lang.Object, V extends java.lang.Object> int parseMapField(T p0, byte[] p1, int p2, int p3, int p4, long p5, com.android.framework.protobuf.ArrayDecoders.Registers p6) throws java.io.IOException { return 0; }
    private int parseOneofField(T p0, byte[] p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, long p9, int p10, com.android.framework.protobuf.ArrayDecoders.Registers p11) throws java.io.IOException { return 0; }
    private com.android.framework.protobuf.Schema getMessageFieldSchema(int p0) { return null; }
    private java.lang.Object getMapFieldDefaultEntry(int p0) { return null; }
    private com.android.framework.protobuf.Internal.EnumVerifier getEnumFieldVerifier(int p0) { return null; }
    int parseProto2Message(T p0, byte[] p1, int p2, int p3, int p4, com.android.framework.protobuf.ArrayDecoders.Registers p5) throws java.io.IOException { return 0; }
    private int parseProto3Message(T p0, byte[] p1, int p2, int p3, com.android.framework.protobuf.ArrayDecoders.Registers p4) throws java.io.IOException { return 0; }
    public void mergeFrom(T p0, byte[] p1, int p2, int p3, com.android.framework.protobuf.ArrayDecoders.Registers p4) throws java.io.IOException {}
    public void makeImmutable(T p0) {}
    private final <K extends java.lang.Object, V extends java.lang.Object> void mergeMap(java.lang.Object p0, int p1, java.lang.Object p2, com.android.framework.protobuf.ExtensionRegistryLite p3, com.android.framework.protobuf.Reader p4) throws java.io.IOException {}
    private final <UT extends java.lang.Object, UB extends java.lang.Object> UB filterMapUnknownEnumValues(java.lang.Object p0, int p1, UB p2, com.android.framework.protobuf.UnknownFieldSchema<UT, UB> p3) { return null; }
    private final <K extends java.lang.Object, V extends java.lang.Object, UT extends java.lang.Object, UB extends java.lang.Object> UB filterUnknownEnumMap(int p0, int p1, java.util.Map<K, V> p2, com.android.framework.protobuf.Internal.EnumVerifier p3, UB p4, com.android.framework.protobuf.UnknownFieldSchema<UT, UB> p5) { return null; }
    public final boolean isInitialized(T p0) { return false; }
    private static boolean isInitialized(java.lang.Object p0, int p1, com.android.framework.protobuf.Schema p2) { return false; }
    private <N extends java.lang.Object> boolean isListInitialized(java.lang.Object p0, int p1, int p2) { return false; }
    private boolean isMapInitialized(T p0, int p1, int p2) { return false; }
    private void writeString(int p0, java.lang.Object p1, com.android.framework.protobuf.Writer p2) throws java.io.IOException {}
    private void readString(java.lang.Object p0, int p1, com.android.framework.protobuf.Reader p2) throws java.io.IOException {}
    private void readStringList(java.lang.Object p0, int p1, com.android.framework.protobuf.Reader p2) throws java.io.IOException {}
    private <E extends java.lang.Object> void readMessageList(java.lang.Object p0, int p1, com.android.framework.protobuf.Reader p2, com.android.framework.protobuf.Schema<E> p3, com.android.framework.protobuf.ExtensionRegistryLite p4) throws java.io.IOException {}
    private <E extends java.lang.Object> void readGroupList(java.lang.Object p0, long p1, com.android.framework.protobuf.Reader p2, com.android.framework.protobuf.Schema<E> p3, com.android.framework.protobuf.ExtensionRegistryLite p4) throws java.io.IOException {}
    private int numberAt(int p0) { return 0; }
    private int typeAndOffsetAt(int p0) { return 0; }
    private int presenceMaskAndOffsetAt(int p0) { return 0; }
    private static int type(int p0) { return 0; }
    private static boolean isRequired(int p0) { return false; }
    private static boolean isEnforceUtf8(int p0) { return false; }
    private static long offset(int p0) { return 0L; }
    private static <T extends java.lang.Object> double doubleAt(T p0, long p1) { return 0.0; }
    private static <T extends java.lang.Object> float floatAt(T p0, long p1) { return 0.0f; }
    private static <T extends java.lang.Object> int intAt(T p0, long p1) { return 0; }
    private static <T extends java.lang.Object> long longAt(T p0, long p1) { return 0L; }
    private static <T extends java.lang.Object> boolean booleanAt(T p0, long p1) { return false; }
    private static <T extends java.lang.Object> double oneofDoubleAt(T p0, long p1) { return 0.0; }
    private static <T extends java.lang.Object> float oneofFloatAt(T p0, long p1) { return 0.0f; }
    private static <T extends java.lang.Object> int oneofIntAt(T p0, long p1) { return 0; }
    private static <T extends java.lang.Object> long oneofLongAt(T p0, long p1) { return 0L; }
    private static <T extends java.lang.Object> boolean oneofBooleanAt(T p0, long p1) { return false; }
    private boolean arePresentForEquals(T p0, T p1, int p2) { return false; }
    private boolean isFieldPresent(T p0, int p1, int p2, int p3) { return false; }
    private boolean isFieldPresent(T p0, int p1) { return false; }
    private void setFieldPresent(T p0, int p1) {}
    private boolean isOneofPresent(T p0, int p1, int p2) { return false; }
    private boolean isOneofCaseEqual(T p0, T p1, int p2) { return false; }
    private void setOneofPresent(T p0, int p1, int p2) {}
    private int positionForFieldNumber(int p0) { return 0; }
    private int positionForFieldNumber(int p0, int p1) { return 0; }
    private int slowPositionForFieldNumber(int p0, int p1) { return 0; }
    int getSchemaSize() { return 0; }
}
