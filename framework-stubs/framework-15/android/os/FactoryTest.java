package android.os;

public final class FactoryTest {
    public static final int FACTORY_TEST_OFF = 0;
    public static final int FACTORY_TEST_LOW_LEVEL = 1;
    public static final int FACTORY_TEST_HIGH_LEVEL = 2;
    public FactoryTest() {}
    public static int getMode() { return 0; }
    public static boolean isLongPressOnPowerOffEnabled() { return false; }
}
