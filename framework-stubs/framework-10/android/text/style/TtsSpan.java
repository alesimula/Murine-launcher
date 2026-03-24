package android.text.style;

public class TtsSpan implements android.text.ParcelableSpan {
    private final java.lang.String mType = null;
    private final android.os.PersistableBundle mArgs = null;
    public static final java.lang.String TYPE_TEXT = "android.type.text";
    public static final java.lang.String TYPE_CARDINAL = "android.type.cardinal";
    public static final java.lang.String TYPE_ORDINAL = "android.type.ordinal";
    public static final java.lang.String TYPE_DECIMAL = "android.type.decimal";
    public static final java.lang.String TYPE_FRACTION = "android.type.fraction";
    public static final java.lang.String TYPE_MEASURE = "android.type.measure";
    public static final java.lang.String TYPE_TIME = "android.type.time";
    public static final java.lang.String TYPE_DATE = "android.type.date";
    public static final java.lang.String TYPE_TELEPHONE = "android.type.telephone";
    public static final java.lang.String TYPE_ELECTRONIC = "android.type.electronic";
    public static final java.lang.String TYPE_MONEY = "android.type.money";
    public static final java.lang.String TYPE_DIGITS = "android.type.digits";
    public static final java.lang.String TYPE_VERBATIM = "android.type.verbatim";
    public static final java.lang.String ARG_GENDER = "android.arg.gender";
    public static final java.lang.String GENDER_NEUTRAL = "android.neutral";
    public static final java.lang.String GENDER_MALE = "android.male";
    public static final java.lang.String GENDER_FEMALE = "android.female";
    public static final java.lang.String ARG_ANIMACY = "android.arg.animacy";
    public static final java.lang.String ANIMACY_ANIMATE = "android.animate";
    public static final java.lang.String ANIMACY_INANIMATE = "android.inanimate";
    public static final java.lang.String ARG_MULTIPLICITY = "android.arg.multiplicity";
    public static final java.lang.String MULTIPLICITY_SINGLE = "android.single";
    public static final java.lang.String MULTIPLICITY_DUAL = "android.dual";
    public static final java.lang.String MULTIPLICITY_PLURAL = "android.plural";
    public static final java.lang.String ARG_CASE = "android.arg.case";
    public static final java.lang.String CASE_NOMINATIVE = "android.nominative";
    public static final java.lang.String CASE_ACCUSATIVE = "android.accusative";
    public static final java.lang.String CASE_DATIVE = "android.dative";
    public static final java.lang.String CASE_ABLATIVE = "android.ablative";
    public static final java.lang.String CASE_GENITIVE = "android.genitive";
    public static final java.lang.String CASE_VOCATIVE = "android.vocative";
    public static final java.lang.String CASE_LOCATIVE = "android.locative";
    public static final java.lang.String CASE_INSTRUMENTAL = "android.instrumental";
    public static final java.lang.String ARG_TEXT = "android.arg.text";
    public static final java.lang.String ARG_NUMBER = "android.arg.number";
    public static final java.lang.String ARG_INTEGER_PART = "android.arg.integer_part";
    public static final java.lang.String ARG_FRACTIONAL_PART = "android.arg.fractional_part";
    public static final java.lang.String ARG_QUANTITY = "android.arg.quantity";
    public static final java.lang.String ARG_NUMERATOR = "android.arg.numerator";
    public static final java.lang.String ARG_DENOMINATOR = "android.arg.denominator";
    public static final java.lang.String ARG_UNIT = "android.arg.unit";
    public static final java.lang.String ARG_HOURS = "android.arg.hours";
    public static final java.lang.String ARG_MINUTES = "android.arg.minutes";
    public static final java.lang.String ARG_WEEKDAY = "android.arg.weekday";
    public static final int WEEKDAY_SUNDAY = 1;
    public static final int WEEKDAY_MONDAY = 2;
    public static final int WEEKDAY_TUESDAY = 3;
    public static final int WEEKDAY_WEDNESDAY = 4;
    public static final int WEEKDAY_THURSDAY = 5;
    public static final int WEEKDAY_FRIDAY = 6;
    public static final int WEEKDAY_SATURDAY = 7;
    public static final java.lang.String ARG_DAY = "android.arg.day";
    public static final java.lang.String ARG_MONTH = "android.arg.month";
    public static final int MONTH_JANUARY = 0;
    public static final int MONTH_FEBRUARY = 1;
    public static final int MONTH_MARCH = 2;
    public static final int MONTH_APRIL = 3;
    public static final int MONTH_MAY = 4;
    public static final int MONTH_JUNE = 5;
    public static final int MONTH_JULY = 6;
    public static final int MONTH_AUGUST = 7;
    public static final int MONTH_SEPTEMBER = 8;
    public static final int MONTH_OCTOBER = 9;
    public static final int MONTH_NOVEMBER = 10;
    public static final int MONTH_DECEMBER = 11;
    public static final java.lang.String ARG_YEAR = "android.arg.year";
    public static final java.lang.String ARG_COUNTRY_CODE = "android.arg.country_code";
    public static final java.lang.String ARG_NUMBER_PARTS = "android.arg.number_parts";
    public static final java.lang.String ARG_EXTENSION = "android.arg.extension";
    public static final java.lang.String ARG_PROTOCOL = "android.arg.protocol";
    public static final java.lang.String ARG_USERNAME = "android.arg.username";
    public static final java.lang.String ARG_PASSWORD = "android.arg.password";
    public static final java.lang.String ARG_DOMAIN = "android.arg.domain";
    public static final java.lang.String ARG_PORT = "android.arg.port";
    public static final java.lang.String ARG_PATH = "android.arg.path";
    public static final java.lang.String ARG_QUERY_STRING = "android.arg.query_string";
    public static final java.lang.String ARG_FRAGMENT_ID = "android.arg.fragment_id";
    public static final java.lang.String ARG_CURRENCY = "android.arg.money";
    public static final java.lang.String ARG_DIGITS = "android.arg.digits";
    public static final java.lang.String ARG_VERBATIM = "android.arg.verbatim";
    public TtsSpan(java.lang.String p0, android.os.PersistableBundle p1) {}
    public TtsSpan(android.os.Parcel p0) {}
    public java.lang.String getType() { return null; }
    public android.os.PersistableBundle getArgs() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }

    public static class VerbatimBuilder extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.VerbatimBuilder> {
        public VerbatimBuilder() { super(null); }
        public VerbatimBuilder(java.lang.String p0) { super(null); }
        public android.text.style.TtsSpan.VerbatimBuilder setVerbatim(java.lang.String p0) { return null; }
    }

    public static class TimeBuilder extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.TimeBuilder> {
        public TimeBuilder() { super(null); }
        public TimeBuilder(int p0, int p1) { super(null); }
        public android.text.style.TtsSpan.TimeBuilder setHours(int p0) { return null; }
        public android.text.style.TtsSpan.TimeBuilder setMinutes(int p0) { return null; }
    }

    public static class TextBuilder extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.TextBuilder> {
        public TextBuilder() { super(null); }
        public TextBuilder(java.lang.String p0) { super(null); }
        public android.text.style.TtsSpan.TextBuilder setText(java.lang.String p0) { return null; }
    }

    public static class TelephoneBuilder extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.TelephoneBuilder> {
        public TelephoneBuilder() { super(null); }
        public TelephoneBuilder(java.lang.String p0) { super(null); }
        public android.text.style.TtsSpan.TelephoneBuilder setCountryCode(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.TelephoneBuilder setNumberParts(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.TelephoneBuilder setExtension(java.lang.String p0) { return null; }
    }

    public static class SemioticClassBuilder<C extends android.text.style.TtsSpan.SemioticClassBuilder<?>> extends android.text.style.TtsSpan.Builder<C> {
        public SemioticClassBuilder(java.lang.String p0) { super(null); }
        public C setGender(java.lang.String p0) { return null; }
        public C setAnimacy(java.lang.String p0) { return null; }
        public C setMultiplicity(java.lang.String p0) { return null; }
        public C setCase(java.lang.String p0) { return null; }
    }

    public static class OrdinalBuilder extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.OrdinalBuilder> {
        public OrdinalBuilder() { super(null); }
        public OrdinalBuilder(long p0) { super(null); }
        public OrdinalBuilder(java.lang.String p0) { super(null); }
        public android.text.style.TtsSpan.OrdinalBuilder setNumber(long p0) { return null; }
        public android.text.style.TtsSpan.OrdinalBuilder setNumber(java.lang.String p0) { return null; }
    }

    public static class MoneyBuilder extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.MoneyBuilder> {
        public MoneyBuilder() { super(null); }
        public android.text.style.TtsSpan.MoneyBuilder setIntegerPart(long p0) { return null; }
        public android.text.style.TtsSpan.MoneyBuilder setIntegerPart(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.MoneyBuilder setFractionalPart(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.MoneyBuilder setCurrency(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.MoneyBuilder setQuantity(java.lang.String p0) { return null; }
    }

    public static class MeasureBuilder extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.MeasureBuilder> {
        public MeasureBuilder() { super(null); }
        public android.text.style.TtsSpan.MeasureBuilder setNumber(long p0) { return null; }
        public android.text.style.TtsSpan.MeasureBuilder setNumber(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.MeasureBuilder setIntegerPart(long p0) { return null; }
        public android.text.style.TtsSpan.MeasureBuilder setIntegerPart(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.MeasureBuilder setFractionalPart(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.MeasureBuilder setNumerator(long p0) { return null; }
        public android.text.style.TtsSpan.MeasureBuilder setNumerator(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.MeasureBuilder setDenominator(long p0) { return null; }
        public android.text.style.TtsSpan.MeasureBuilder setDenominator(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.MeasureBuilder setUnit(java.lang.String p0) { return null; }
    }

    public static class FractionBuilder extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.FractionBuilder> {
        public FractionBuilder() { super(null); }
        public FractionBuilder(long p0, long p1, long p2) { super(null); }
        public android.text.style.TtsSpan.FractionBuilder setIntegerPart(long p0) { return null; }
        public android.text.style.TtsSpan.FractionBuilder setIntegerPart(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.FractionBuilder setNumerator(long p0) { return null; }
        public android.text.style.TtsSpan.FractionBuilder setNumerator(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.FractionBuilder setDenominator(long p0) { return null; }
        public android.text.style.TtsSpan.FractionBuilder setDenominator(java.lang.String p0) { return null; }
    }

    public static class ElectronicBuilder extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.ElectronicBuilder> {
        public ElectronicBuilder() { super(null); }
        public android.text.style.TtsSpan.ElectronicBuilder setEmailArguments(java.lang.String p0, java.lang.String p1) { return null; }
        public android.text.style.TtsSpan.ElectronicBuilder setProtocol(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.ElectronicBuilder setUsername(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.ElectronicBuilder setPassword(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.ElectronicBuilder setDomain(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.ElectronicBuilder setPort(int p0) { return null; }
        public android.text.style.TtsSpan.ElectronicBuilder setPath(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.ElectronicBuilder setQueryString(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.ElectronicBuilder setFragmentId(java.lang.String p0) { return null; }
    }

    public static class DigitsBuilder extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.DigitsBuilder> {
        public DigitsBuilder() { super(null); }
        public DigitsBuilder(java.lang.String p0) { super(null); }
        public android.text.style.TtsSpan.DigitsBuilder setDigits(java.lang.String p0) { return null; }
    }

    public static class DecimalBuilder extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.DecimalBuilder> {
        public DecimalBuilder() { super(null); }
        public DecimalBuilder(double p0, int p1, int p2) { super(null); }
        public DecimalBuilder(java.lang.String p0, java.lang.String p1) { super(null); }
        public android.text.style.TtsSpan.DecimalBuilder setArgumentsFromDouble(double p0, int p1, int p2) { return null; }
        public android.text.style.TtsSpan.DecimalBuilder setIntegerPart(long p0) { return null; }
        public android.text.style.TtsSpan.DecimalBuilder setIntegerPart(java.lang.String p0) { return null; }
        public android.text.style.TtsSpan.DecimalBuilder setFractionalPart(java.lang.String p0) { return null; }
    }

    public static class DateBuilder extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.DateBuilder> {
        public DateBuilder() { super(null); }
        public DateBuilder(java.lang.Integer p0, java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3) { super(null); }
        public android.text.style.TtsSpan.DateBuilder setWeekday(int p0) { return null; }
        public android.text.style.TtsSpan.DateBuilder setDay(int p0) { return null; }
        public android.text.style.TtsSpan.DateBuilder setMonth(int p0) { return null; }
        public android.text.style.TtsSpan.DateBuilder setYear(int p0) { return null; }
    }

    public static class CardinalBuilder extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.CardinalBuilder> {
        public CardinalBuilder() { super(null); }
        public CardinalBuilder(long p0) { super(null); }
        public CardinalBuilder(java.lang.String p0) { super(null); }
        public android.text.style.TtsSpan.CardinalBuilder setNumber(long p0) { return null; }
        public android.text.style.TtsSpan.CardinalBuilder setNumber(java.lang.String p0) { return null; }
    }

    public static class Builder<C extends android.text.style.TtsSpan.Builder<?>> {
        private final java.lang.String mType = null;
        private android.os.PersistableBundle mArgs;
        public Builder(java.lang.String p0) {}
        public android.text.style.TtsSpan build() { return null; }
        public C setStringArgument(java.lang.String p0, java.lang.String p1) { return null; }
        public C setIntArgument(java.lang.String p0, int p1) { return null; }
        public C setLongArgument(java.lang.String p0, long p1) { return null; }
    }
}
