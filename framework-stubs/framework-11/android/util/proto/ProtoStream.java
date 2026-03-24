package android.util.proto;

public class ProtoStream {
    public static final int FIELD_ID_SHIFT = 3;
    public static final int WIRE_TYPE_MASK = 7;
    public static final int FIELD_ID_MASK = -8;
    public static final int WIRE_TYPE_VARINT = 0;
    public static final int WIRE_TYPE_FIXED64 = 1;
    public static final int WIRE_TYPE_LENGTH_DELIMITED = 2;
    public static final int WIRE_TYPE_START_GROUP = 3;
    public static final int WIRE_TYPE_END_GROUP = 4;
    public static final int WIRE_TYPE_FIXED32 = 5;
    public static final int FIELD_TYPE_SHIFT = 32;
    public static final long FIELD_TYPE_MASK = 1095216660480L;
    public static final long FIELD_TYPE_UNKNOWN = 0L;
    public static final long FIELD_TYPE_DOUBLE = 4294967296L;
    public static final long FIELD_TYPE_FLOAT = 8589934592L;
    public static final long FIELD_TYPE_INT64 = 12884901888L;
    public static final long FIELD_TYPE_UINT64 = 17179869184L;
    public static final long FIELD_TYPE_INT32 = 21474836480L;
    public static final long FIELD_TYPE_FIXED64 = 25769803776L;
    public static final long FIELD_TYPE_FIXED32 = 30064771072L;
    public static final long FIELD_TYPE_BOOL = 34359738368L;
    public static final long FIELD_TYPE_STRING = 38654705664L;
    public static final long FIELD_TYPE_MESSAGE = 47244640256L;
    public static final long FIELD_TYPE_BYTES = 51539607552L;
    public static final long FIELD_TYPE_UINT32 = 55834574848L;
    public static final long FIELD_TYPE_ENUM = 60129542144L;
    public static final long FIELD_TYPE_SFIXED32 = 64424509440L;
    public static final long FIELD_TYPE_SFIXED64 = 68719476736L;
    public static final long FIELD_TYPE_SINT32 = 73014444032L;
    public static final long FIELD_TYPE_SINT64 = 77309411328L;
    private static final java.lang.String[] FIELD_TYPE_NAMES = null;
    public static final int FIELD_COUNT_SHIFT = 40;
    public static final long FIELD_COUNT_MASK = 16492674416640L;
    public static final long FIELD_COUNT_UNKNOWN = 0L;
    public static final long FIELD_COUNT_SINGLE = 1099511627776L;
    public static final long FIELD_COUNT_REPEATED = 2199023255552L;
    public static final long FIELD_COUNT_PACKED = 5497558138880L;
    public static java.lang.String getFieldTypeString(long p0) { return null; }
    public static java.lang.String getFieldCountString(long p0) { return null; }
    public static java.lang.String getWireTypeString(int p0) { return null; }
    public static java.lang.String getFieldIdString(long p0) { return null; }
    public static long makeFieldId(int p0, long p1) { return 0L; }
    public static long makeToken(int p0, boolean p1, int p2, int p3, int p4) { return 0L; }
    public static int getTagSizeFromToken(long p0) { return 0; }
    public static boolean getRepeatedFromToken(long p0) { return false; }
    public static int getDepthFromToken(long p0) { return 0; }
    public static int getObjectIdFromToken(long p0) { return 0; }
    public static int getOffsetFromToken(long p0) { return 0; }
    public static int convertObjectIdToOrdinal(int p0) { return 0; }
    public static java.lang.String token2String(long p0) { return null; }
    protected ProtoStream() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FieldCount {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FieldType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WireType {
    }
}
