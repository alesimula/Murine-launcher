package android.view.inspector;

public interface PropertyMapper {
    public int mapBoolean(java.lang.String p0, int p1);
    public int mapByte(java.lang.String p0, int p1);
    public int mapChar(java.lang.String p0, int p1);
    public int mapDouble(java.lang.String p0, int p1);
    public int mapFloat(java.lang.String p0, int p1);
    public int mapInt(java.lang.String p0, int p1);
    public int mapLong(java.lang.String p0, int p1);
    public int mapShort(java.lang.String p0, int p1);
    public int mapObject(java.lang.String p0, int p1);
    public int mapColor(java.lang.String p0, int p1);
    public int mapGravity(java.lang.String p0, int p1);
    public int mapIntEnum(java.lang.String p0, int p1, java.util.function.IntFunction<java.lang.String> p2);
    public int mapResourceId(java.lang.String p0, int p1);
    public int mapIntFlag(java.lang.String p0, int p1, java.util.function.IntFunction<java.util.Set<java.lang.String>> p2);

    public static class PropertyConflictException extends java.lang.RuntimeException {
        public PropertyConflictException(java.lang.String p0, java.lang.String p1, java.lang.String p2) { super(); }
    }
}
