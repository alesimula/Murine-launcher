package android.telephony;

public class AccessNetworkUtils {
    public static final int INVALID_BAND = -1;
    public static final int INVALID_FREQUENCY = -1;
    private static final java.lang.String JAPAN_ISO_COUNTRY_CODE = "jp";
    private static final java.lang.String TAG = "AccessNetworkUtils";
    private static final int FREQUENCY_KHZ = 1000;
    private static final int FREQUENCY_RANGE_LOW_KHZ = 1000000;
    private static final int FREQUENCY_RANGE_MID_KHZ = 3000000;
    private static final int FREQUENCY_RANGE_HIGH_KHZ = 6000000;
    private static final java.util.Set<java.lang.Integer> UARFCN_NOT_GENERAL_BAND = null;
    private AccessNetworkUtils() {}
    public static int getDuplexModeForEutranBand(int p0) { return 0; }
    public static int getOperatingBandForEarfcn(int p0) { return 0; }
    public static int getOperatingBandForArfcn(int p0) { return 0; }
    public static int getOperatingBandForUarfcn(int p0) { return 0; }
    public static int getFrequencyRangeGroupFromGeranBand(int p0) { return 0; }
    public static int getFrequencyRangeGroupFromUtranBand(int p0) { return 0; }
    public static int getFrequencyRangeGroupFromEutranBand(int p0) { return 0; }
    public static int getFrequencyRangeGroupFromNrBand(int p0) { return 0; }
    public static int getFrequencyFromNrArfcn(int p0) { return 0; }
    public static int getFrequencyFromEarfcn(int p0, int p1, boolean p2) { return 0; }
    private static int convertEarfcnToFrequency(int p0, int p1, int p2) { return 0; }
    private static boolean isInEarfcnRange(int p0, android.telephony.AccessNetworkConstants.EutranBandArfcnFrequency p1, boolean p2) { return false; }
    public static int getFrequencyFromUarfcn(int p0, int p1, boolean p2) { return 0; }
    private static int convertUarfcnToFrequency(int p0, int p1) { return 0; }
    private static int convertUarfcnTddToFrequency(int p0, int p1) { return 0; }
    private static boolean isInUarfcnRange(int p0, android.telephony.AccessNetworkConstants.UtranBandArfcnFrequency p1, boolean p2) { return false; }
    public static int getFrequencyFromArfcn(int p0, int p1, boolean p2) { return 0; }
    private static int convertArfcnToFrequency(int p0, int p1, int p2) { return 0; }
    public static int getFrequencyRangeFromArfcn(int p0) { return 0; }
}
