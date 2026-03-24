package android.sysprop;

public final class CarProperties {
    private CarProperties() {}
    private static java.lang.Boolean tryParseBoolean(java.lang.String p0) { return null; }
    private static java.lang.Integer tryParseInteger(java.lang.String p0) { return null; }
    private static java.lang.Integer tryParseUInt(java.lang.String p0) { return null; }
    private static java.lang.Long tryParseLong(java.lang.String p0) { return null; }
    private static java.lang.Long tryParseULong(java.lang.String p0) { return null; }
    private static java.lang.Double tryParseDouble(java.lang.String p0) { return null; }
    private static java.lang.String tryParseString(java.lang.String p0) { return null; }
    private static <T extends java.lang.Enum<T>> T tryParseEnum(java.lang.Class<T> p0, java.lang.String p1) { return null; }
    private static <T extends java.lang.Object> java.util.List<T> tryParseList(java.util.function.Function<java.lang.String, T> p0, java.lang.String p1) { return null; }
    private static <T extends java.lang.Enum<T>> java.util.List<T> tryParseEnumList(java.lang.Class<T> p0, java.lang.String p1) { return null; }
    private static java.lang.String escape(java.lang.String p0) { return null; }
    private static <T extends java.lang.Object> java.lang.String formatList(java.util.List<T> p0) { return null; }
    private static java.lang.String formatUIntList(java.util.List<java.lang.Integer> p0) { return null; }
    private static java.lang.String formatULongList(java.util.List<java.lang.Long> p0) { return null; }
    private static <T extends java.lang.Enum<T>> java.lang.String formatEnumList(java.util.List<T> p0, java.util.function.Function<T, java.lang.String> p1) { return null; }
    public static java.util.Optional<java.lang.Integer> boot_user_override_id() { return null; }
    public static void boot_user_override_id(java.lang.Integer p0) {}
    public static java.util.Optional<java.lang.String> trusted_device_device_name_prefix() { return null; }
    public static java.util.Optional<java.lang.Integer> number_pre_created_users() { return null; }
    public static void number_pre_created_users(java.lang.Integer p0) {}
    public static java.util.Optional<java.lang.Integer> number_pre_created_guests() { return null; }
    public static void number_pre_created_guests(java.lang.Integer p0) {}
    public static java.util.Optional<java.lang.Integer> user_hal_timeout() { return null; }
    public static void user_hal_timeout(java.lang.Integer p0) {}
    public static java.util.Optional<java.lang.Integer> device_policy_manager_timeout() { return null; }
    public static void device_policy_manager_timeout(java.lang.Integer p0) {}
}
