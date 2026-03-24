package android.icu.lang;

public final class UCharacter implements android.icu.lang.UCharacterEnums.ECharacterCategory, android.icu.lang.UCharacterEnums.ECharacterDirection {
    public static final int FOLD_CASE_DEFAULT = 0;
    public static final int FOLD_CASE_EXCLUDE_SPECIAL_I = 1;
    public static final int MAX_CODE_POINT = 1114111;
    public static final char MAX_HIGH_SURROGATE = (char)0xdbff;
    public static final char MAX_LOW_SURROGATE = (char)0xdfff;
    public static final int MAX_RADIX = 36;
    public static final char MAX_SURROGATE = (char)0xdfff;
    public static final int MAX_VALUE = 1114111;
    public static final int MIN_CODE_POINT = 0;
    public static final char MIN_HIGH_SURROGATE = (char)0xd800;
    public static final char MIN_LOW_SURROGATE = (char)0xdc00;
    public static final int MIN_RADIX = 2;
    public static final int MIN_SUPPLEMENTARY_CODE_POINT = 65536;
    public static final char MIN_SURROGATE = (char)0xd800;
    public static final int MIN_VALUE = 0;
    public static final double NO_NUMERIC_VALUE = -123456789.0;
    public static final int REPLACEMENT_CHAR = 65533;
    public static final int SUPPLEMENTARY_MIN_VALUE = 65536;
    public static final int TITLECASE_NO_BREAK_ADJUSTMENT = 512;
    public static final int TITLECASE_NO_LOWERCASE = 256;
    private UCharacter() {}
    public static int digit(int p0, int p1) { return 0; }
    public static int digit(int p0) { return 0; }
    public static int getNumericValue(int p0) { return 0; }
    public static double getUnicodeNumericValue(int p0) { return 0.0; }
    public static int getType(int p0) { return 0; }
    public static boolean isDefined(int p0) { return false; }
    public static boolean isDigit(int p0) { return false; }
    public static boolean isISOControl(int p0) { return false; }
    public static boolean isLetter(int p0) { return false; }
    public static boolean isLetterOrDigit(int p0) { return false; }
    public static boolean isJavaIdentifierStart(int p0) { return false; }
    public static boolean isJavaIdentifierPart(int p0) { return false; }
    public static boolean isLowerCase(int p0) { return false; }
    public static boolean isWhitespace(int p0) { return false; }
    public static boolean isSpaceChar(int p0) { return false; }
    public static boolean isTitleCase(int p0) { return false; }
    public static boolean isUnicodeIdentifierPart(int p0) { return false; }
    public static boolean isUnicodeIdentifierStart(int p0) { return false; }
    public static boolean isIdentifierIgnorable(int p0) { return false; }
    public static boolean isUpperCase(int p0) { return false; }
    public static int toLowerCase(int p0) { return 0; }
    public static java.lang.String toString(int p0) { return null; }
    public static int toTitleCase(int p0) { return 0; }
    public static int toUpperCase(int p0) { return 0; }
    public static boolean isSupplementary(int p0) { return false; }
    public static boolean isBMP(int p0) { return false; }
    public static boolean isPrintable(int p0) { return false; }
    public static boolean isBaseForm(int p0) { return false; }
    public static int getDirection(int p0) { return 0; }
    public static boolean isMirrored(int p0) { return false; }
    public static int getMirror(int p0) { return 0; }
    public static int getBidiPairedBracket(int p0) { return 0; }
    public static int getCombiningClass(int p0) { return 0; }
    public static boolean isLegal(int p0) { return false; }
    public static boolean isLegal(java.lang.String p0) { return false; }
    public static android.icu.util.VersionInfo getUnicodeVersion() { return null; }
    public static java.lang.String getName(int p0) { return null; }
    public static java.lang.String getName(java.lang.String p0, java.lang.String p1) { return null; }
    public static java.lang.String getExtendedName(int p0) { return null; }
    public static java.lang.String getNameAlias(int p0) { return null; }
    public static int getCharFromName(java.lang.String p0) { return 0; }
    public static int getCharFromExtendedName(java.lang.String p0) { return 0; }
    public static int getCharFromNameAlias(java.lang.String p0) { return 0; }
    public static java.lang.String getPropertyName(int p0, int p1) { return null; }
    public static int getPropertyEnum(java.lang.CharSequence p0) { return 0; }
    public static java.lang.String getPropertyValueName(int p0, int p1, int p2) { return null; }
    public static int getPropertyValueEnum(int p0, java.lang.CharSequence p1) { return 0; }
    public static int getCodePoint(int p0, int p1) { return 0; }
    public static int getCodePoint(char p0, char p1) { return 0; }
    public static int getCodePoint(char p0) { return 0; }
    public static java.lang.String toUpperCase(java.lang.String p0) { return null; }
    public static java.lang.String toLowerCase(java.lang.String p0) { return null; }
    public static java.lang.String toTitleCase(java.lang.String p0, android.icu.text.BreakIterator p1) { return null; }
    public static java.lang.String toUpperCase(java.util.Locale p0, java.lang.String p1) { return null; }
    public static java.lang.String toUpperCase(android.icu.util.ULocale p0, java.lang.String p1) { return null; }
    public static java.lang.String toLowerCase(java.util.Locale p0, java.lang.String p1) { return null; }
    public static java.lang.String toLowerCase(android.icu.util.ULocale p0, java.lang.String p1) { return null; }
    public static java.lang.String toTitleCase(java.util.Locale p0, java.lang.String p1, android.icu.text.BreakIterator p2) { return null; }
    public static java.lang.String toTitleCase(android.icu.util.ULocale p0, java.lang.String p1, android.icu.text.BreakIterator p2) { return null; }
    public static java.lang.String toTitleCase(android.icu.util.ULocale p0, java.lang.String p1, android.icu.text.BreakIterator p2, int p3) { return null; }
    public static java.lang.String toTitleCase(java.util.Locale p0, java.lang.String p1, android.icu.text.BreakIterator p2, int p3) { return null; }
    public static int foldCase(int p0, boolean p1) { return 0; }
    public static java.lang.String foldCase(java.lang.String p0, boolean p1) { return null; }
    public static int foldCase(int p0, int p1) { return 0; }
    public static java.lang.String foldCase(java.lang.String p0, int p1) { return null; }
    public static int getHanNumericValue(int p0) { return 0; }
    public static android.icu.util.RangeValueIterator getTypeIterator() { return null; }
    public static android.icu.util.ValueIterator getNameIterator() { return null; }
    public static android.icu.util.ValueIterator getExtendedNameIterator() { return null; }
    public static android.icu.util.VersionInfo getAge(int p0) { return null; }
    public static boolean hasBinaryProperty(int p0, int p1) { return false; }
    public static boolean isUAlphabetic(int p0) { return false; }
    public static boolean isULowercase(int p0) { return false; }
    public static boolean isUUppercase(int p0) { return false; }
    public static boolean isUWhiteSpace(int p0) { return false; }
    public static int getIntPropertyValue(int p0, int p1) { return 0; }
    public static int getIntPropertyMinValue(int p0) { return 0; }
    public static int getIntPropertyMaxValue(int p0) { return 0; }
    public static char forDigit(int p0, int p1) { return 0; }
    public static boolean isValidCodePoint(int p0) { return false; }
    public static boolean isSupplementaryCodePoint(int p0) { return false; }
    public static boolean isHighSurrogate(int p0) { return false; }
    public static boolean isHighSurrogate(char p0) { return false; }
    public static boolean isLowSurrogate(int p0) { return false; }
    public static boolean isLowSurrogate(char p0) { return false; }
    public static boolean isSurrogatePair(int p0, int p1) { return false; }
    public static boolean isSurrogatePair(char p0, char p1) { return false; }
    public static int charCount(int p0) { return 0; }
    public static int toCodePoint(int p0, int p1) { return 0; }
    public static int toCodePoint(char p0, char p1) { return 0; }
    public static int codePointAt(java.lang.CharSequence p0, int p1) { return 0; }
    public static int codePointAt(char[] p0, int p1) { return 0; }
    public static int codePointAt(char[] p0, int p1, int p2) { return 0; }
    public static int codePointBefore(java.lang.CharSequence p0, int p1) { return 0; }
    public static int codePointBefore(char[] p0, int p1) { return 0; }
    public static int codePointBefore(char[] p0, int p1, int p2) { return 0; }
    public static int toChars(int p0, char[] p1, int p2) { return 0; }
    public static char[] toChars(int p0) { return null; }
    public static byte getDirectionality(int p0) { return 0; }
    public static int codePointCount(java.lang.CharSequence p0, int p1, int p2) { return 0; }
    public static int codePointCount(char[] p0, int p1, int p2) { return 0; }
    public static int offsetByCodePoints(java.lang.CharSequence p0, int p1, int p2) { return 0; }
    public static int offsetByCodePoints(char[] p0, int p1, int p2, int p3, int p4) { return 0; }

    public static interface BidiPairedBracketType {
        public static final int CLOSE = 2;
        public static final int NONE = 0;
        public static final int OPEN = 1;
    }

    public static interface DecompositionType {
        public static final int CANONICAL = 1;
        public static final int CIRCLE = 3;
        public static final int COMPAT = 2;
        public static final int FINAL = 4;
        public static final int FONT = 5;
        public static final int FRACTION = 6;
        public static final int INITIAL = 7;
        public static final int ISOLATED = 8;
        public static final int MEDIAL = 9;
        public static final int NARROW = 10;
        public static final int NOBREAK = 11;
        public static final int NONE = 0;
        public static final int SMALL = 12;
        public static final int SQUARE = 13;
        public static final int SUB = 14;
        public static final int SUPER = 15;
        public static final int VERTICAL = 16;
        public static final int WIDE = 17;
    }

    public static interface EastAsianWidth {
        public static final int AMBIGUOUS = 1;
        public static final int FULLWIDTH = 3;
        public static final int HALFWIDTH = 2;
        public static final int NARROW = 4;
        public static final int NEUTRAL = 0;
        public static final int WIDE = 5;
    }

    public static interface GraphemeClusterBreak {
        public static final int CONTROL = 1;
        public static final int CR = 2;
        public static final int EXTEND = 3;
        public static final int E_BASE = 13;
        public static final int E_BASE_GAZ = 14;
        public static final int E_MODIFIER = 15;
        public static final int GLUE_AFTER_ZWJ = 16;
        public static final int L = 4;
        public static final int LF = 5;
        public static final int LV = 6;
        public static final int LVT = 7;
        public static final int OTHER = 0;
        public static final int PREPEND = 11;
        public static final int REGIONAL_INDICATOR = 12;
        public static final int SPACING_MARK = 10;
        public static final int T = 8;
        public static final int V = 9;
        public static final int ZWJ = 17;
    }

    public static interface HangulSyllableType {
        public static final int LEADING_JAMO = 1;
        public static final int LVT_SYLLABLE = 5;
        public static final int LV_SYLLABLE = 4;
        public static final int NOT_APPLICABLE = 0;
        public static final int TRAILING_JAMO = 3;
        public static final int VOWEL_JAMO = 2;
    }

    public static interface IndicPositionalCategory {
        public static final int BOTTOM = 1;
        public static final int BOTTOM_AND_LEFT = 2;
        public static final int BOTTOM_AND_RIGHT = 3;
        public static final int LEFT = 4;
        public static final int LEFT_AND_RIGHT = 5;
        public static final int NA = 0;
        public static final int OVERSTRUCK = 6;
        public static final int RIGHT = 7;
        public static final int TOP = 8;
        public static final int TOP_AND_BOTTOM = 9;
        public static final int TOP_AND_BOTTOM_AND_LEFT = 15;
        public static final int TOP_AND_BOTTOM_AND_RIGHT = 10;
        public static final int TOP_AND_LEFT = 11;
        public static final int TOP_AND_LEFT_AND_RIGHT = 12;
        public static final int TOP_AND_RIGHT = 13;
        public static final int VISUAL_ORDER_LEFT = 14;
    }

    public static interface IndicSyllabicCategory {
        public static final int AVAGRAHA = 1;
        public static final int BINDU = 2;
        public static final int BRAHMI_JOINING_NUMBER = 3;
        public static final int CANTILLATION_MARK = 4;
        public static final int CONSONANT = 5;
        public static final int CONSONANT_DEAD = 6;
        public static final int CONSONANT_FINAL = 7;
        public static final int CONSONANT_HEAD_LETTER = 8;
        public static final int CONSONANT_INITIAL_POSTFIXED = 9;
        public static final int CONSONANT_KILLER = 10;
        public static final int CONSONANT_MEDIAL = 11;
        public static final int CONSONANT_PLACEHOLDER = 12;
        public static final int CONSONANT_PRECEDING_REPHA = 13;
        public static final int CONSONANT_PREFIXED = 14;
        public static final int CONSONANT_SUBJOINED = 15;
        public static final int CONSONANT_SUCCEEDING_REPHA = 16;
        public static final int CONSONANT_WITH_STACKER = 17;
        public static final int GEMINATION_MARK = 18;
        public static final int INVISIBLE_STACKER = 19;
        public static final int JOINER = 20;
        public static final int MODIFYING_LETTER = 21;
        public static final int NON_JOINER = 22;
        public static final int NUKTA = 23;
        public static final int NUMBER = 24;
        public static final int NUMBER_JOINER = 25;
        public static final int OTHER = 0;
        public static final int PURE_KILLER = 26;
        public static final int REGISTER_SHIFTER = 27;
        public static final int SYLLABLE_MODIFIER = 28;
        public static final int TONE_LETTER = 29;
        public static final int TONE_MARK = 30;
        public static final int VIRAMA = 31;
        public static final int VISARGA = 32;
        public static final int VOWEL = 33;
        public static final int VOWEL_DEPENDENT = 34;
        public static final int VOWEL_INDEPENDENT = 35;
    }

    public static interface JoiningGroup {
        public static final int AFRICAN_FEH = 86;
        public static final int AFRICAN_NOON = 87;
        public static final int AFRICAN_QAF = 88;
        public static final int AIN = 1;
        public static final int ALAPH = 2;
        public static final int ALEF = 3;
        public static final int BEH = 4;
        public static final int BETH = 5;
        public static final int BURUSHASKI_YEH_BARREE = 54;
        public static final int DAL = 6;
        public static final int DALATH_RISH = 7;
        public static final int E = 8;
        public static final int FARSI_YEH = 55;
        public static final int FE = 51;
        public static final int FEH = 9;
        public static final int FINAL_SEMKATH = 10;
        public static final int GAF = 11;
        public static final int GAMAL = 12;
        public static final int HAH = 13;
        public static final int HAMZA_ON_HEH_GOAL = 14;
        public static final int HANIFI_ROHINGYA_KINNA_YA = 100;
        public static final int HANIFI_ROHINGYA_PA = 101;
        public static final int HE = 15;
        public static final int HEH = 16;
        public static final int HEH_GOAL = 17;
        public static final int HETH = 18;
        public static final int KAF = 19;
        public static final int KAPH = 20;
        public static final int KHAPH = 52;
        public static final int KNOTTED_HEH = 21;
        public static final int LAM = 22;
        public static final int LAMADH = 23;
        public static final int MALAYALAM_BHA = 89;
        public static final int MALAYALAM_JA = 90;
        public static final int MALAYALAM_LLA = 91;
        public static final int MALAYALAM_LLLA = 92;
        public static final int MALAYALAM_NGA = 93;
        public static final int MALAYALAM_NNA = 94;
        public static final int MALAYALAM_NNNA = 95;
        public static final int MALAYALAM_NYA = 96;
        public static final int MALAYALAM_RA = 97;
        public static final int MALAYALAM_SSA = 98;
        public static final int MALAYALAM_TTA = 99;
        public static final int MANICHAEAN_ALEPH = 58;
        public static final int MANICHAEAN_AYIN = 59;
        public static final int MANICHAEAN_BETH = 60;
        public static final int MANICHAEAN_DALETH = 61;
        public static final int MANICHAEAN_DHAMEDH = 62;
        public static final int MANICHAEAN_FIVE = 63;
        public static final int MANICHAEAN_GIMEL = 64;
        public static final int MANICHAEAN_HETH = 65;
        public static final int MANICHAEAN_HUNDRED = 66;
        public static final int MANICHAEAN_KAPH = 67;
        public static final int MANICHAEAN_LAMEDH = 68;
        public static final int MANICHAEAN_MEM = 69;
        public static final int MANICHAEAN_NUN = 70;
        public static final int MANICHAEAN_ONE = 71;
        public static final int MANICHAEAN_PE = 72;
        public static final int MANICHAEAN_QOPH = 73;
        public static final int MANICHAEAN_RESH = 74;
        public static final int MANICHAEAN_SADHE = 75;
        public static final int MANICHAEAN_SAMEKH = 76;
        public static final int MANICHAEAN_TAW = 77;
        public static final int MANICHAEAN_TEN = 78;
        public static final int MANICHAEAN_TETH = 79;
        public static final int MANICHAEAN_THAMEDH = 80;
        public static final int MANICHAEAN_TWENTY = 81;
        public static final int MANICHAEAN_WAW = 82;
        public static final int MANICHAEAN_YODH = 83;
        public static final int MANICHAEAN_ZAYIN = 84;
        public static final int MEEM = 24;
        public static final int MIM = 25;
        public static final int NOON = 26;
        public static final int NO_JOINING_GROUP = 0;
        public static final int NUN = 27;
        public static final int NYA = 56;
        public static final int PE = 28;
        public static final int QAF = 29;
        public static final int QAPH = 30;
        public static final int REH = 31;
        public static final int REVERSED_PE = 32;
        public static final int ROHINGYA_YEH = 57;
        public static final int SAD = 33;
        public static final int SADHE = 34;
        public static final int SEEN = 35;
        public static final int SEMKATH = 36;
        public static final int SHIN = 37;
        public static final int STRAIGHT_WAW = 85;
        public static final int SWASH_KAF = 38;
        public static final int SYRIAC_WAW = 39;
        public static final int TAH = 40;
        public static final int TAW = 41;
        public static final int TEH_MARBUTA = 42;
        public static final int TEH_MARBUTA_GOAL = 14;
        public static final int TETH = 43;
        public static final int THIN_YEH = 102;
        public static final int VERTICAL_TAIL = 103;
        public static final int WAW = 44;
        public static final int YEH = 45;
        public static final int YEH_BARREE = 46;
        public static final int YEH_WITH_TAIL = 47;
        public static final int YUDH = 48;
        public static final int YUDH_HE = 49;
        public static final int ZAIN = 50;
        public static final int ZHAIN = 53;
    }

    public static interface JoiningType {
        public static final int DUAL_JOINING = 2;
        public static final int JOIN_CAUSING = 1;
        public static final int LEFT_JOINING = 3;
        public static final int NON_JOINING = 0;
        public static final int RIGHT_JOINING = 4;
        public static final int TRANSPARENT = 5;
    }

    public static interface LineBreak {
        public static final int ALPHABETIC = 2;
        public static final int AMBIGUOUS = 1;
        public static final int BREAK_AFTER = 4;
        public static final int BREAK_BEFORE = 5;
        public static final int BREAK_BOTH = 3;
        public static final int BREAK_SYMBOLS = 27;
        public static final int CARRIAGE_RETURN = 10;
        public static final int CLOSE_PARENTHESIS = 36;
        public static final int CLOSE_PUNCTUATION = 8;
        public static final int COMBINING_MARK = 9;
        public static final int COMPLEX_CONTEXT = 24;
        public static final int CONDITIONAL_JAPANESE_STARTER = 37;
        public static final int CONTINGENT_BREAK = 7;
        public static final int EXCLAMATION = 11;
        public static final int E_BASE = 40;
        public static final int E_MODIFIER = 41;
        public static final int GLUE = 12;
        public static final int H2 = 31;
        public static final int H3 = 32;
        public static final int HEBREW_LETTER = 38;
        public static final int HYPHEN = 13;
        public static final int IDEOGRAPHIC = 14;
        public static final int INFIX_NUMERIC = 16;
        public static final int INSEPARABLE = 15;
        public static final int INSEPERABLE = 15;
        public static final int JL = 33;
        public static final int JT = 34;
        public static final int JV = 35;
        public static final int LINE_FEED = 17;
        public static final int MANDATORY_BREAK = 6;
        public static final int NEXT_LINE = 29;
        public static final int NONSTARTER = 18;
        public static final int NUMERIC = 19;
        public static final int OPEN_PUNCTUATION = 20;
        public static final int POSTFIX_NUMERIC = 21;
        public static final int PREFIX_NUMERIC = 22;
        public static final int QUOTATION = 23;
        public static final int REGIONAL_INDICATOR = 39;
        public static final int SPACE = 26;
        public static final int SURROGATE = 25;
        public static final int UNKNOWN = 0;
        public static final int WORD_JOINER = 30;
        public static final int ZWJ = 42;
        public static final int ZWSPACE = 28;
    }

    public static interface NumericType {
        public static final int DECIMAL = 1;
        public static final int DIGIT = 2;
        public static final int NONE = 0;
        public static final int NUMERIC = 3;
    }

    public static interface SentenceBreak {
        public static final int ATERM = 1;
        public static final int CLOSE = 2;
        public static final int CR = 11;
        public static final int EXTEND = 12;
        public static final int FORMAT = 3;
        public static final int LF = 13;
        public static final int LOWER = 4;
        public static final int NUMERIC = 5;
        public static final int OLETTER = 6;
        public static final int OTHER = 0;
        public static final int SCONTINUE = 14;
        public static final int SEP = 7;
        public static final int SP = 8;
        public static final int STERM = 9;
        public static final int UPPER = 10;
    }

    public static final class UnicodeBlock extends java.lang.Character.Subset {
        public static final android.icu.lang.UCharacter.UnicodeBlock ADLAM = null;
        public static final int ADLAM_ID = 263;
        public static final android.icu.lang.UCharacter.UnicodeBlock AEGEAN_NUMBERS = null;
        public static final int AEGEAN_NUMBERS_ID = 119;
        public static final android.icu.lang.UCharacter.UnicodeBlock AHOM = null;
        public static final int AHOM_ID = 253;
        public static final android.icu.lang.UCharacter.UnicodeBlock ALCHEMICAL_SYMBOLS = null;
        public static final int ALCHEMICAL_SYMBOLS_ID = 208;
        public static final android.icu.lang.UCharacter.UnicodeBlock ALPHABETIC_PRESENTATION_FORMS = null;
        public static final int ALPHABETIC_PRESENTATION_FORMS_ID = 80;
        public static final android.icu.lang.UCharacter.UnicodeBlock ANATOLIAN_HIEROGLYPHS = null;
        public static final int ANATOLIAN_HIEROGLYPHS_ID = 254;
        public static final android.icu.lang.UCharacter.UnicodeBlock ANCIENT_GREEK_MUSICAL_NOTATION = null;
        public static final int ANCIENT_GREEK_MUSICAL_NOTATION_ID = 126;
        public static final android.icu.lang.UCharacter.UnicodeBlock ANCIENT_GREEK_NUMBERS = null;
        public static final int ANCIENT_GREEK_NUMBERS_ID = 127;
        public static final android.icu.lang.UCharacter.UnicodeBlock ANCIENT_SYMBOLS = null;
        public static final int ANCIENT_SYMBOLS_ID = 165;
        public static final android.icu.lang.UCharacter.UnicodeBlock ARABIC = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock ARABIC_EXTENDED_A = null;
        public static final int ARABIC_EXTENDED_A_ID = 210;
        public static final android.icu.lang.UCharacter.UnicodeBlock ARABIC_EXTENDED_B = null;
        public static final int ARABIC_EXTENDED_B_ID = 309;
        public static final int ARABIC_ID = 12;
        public static final android.icu.lang.UCharacter.UnicodeBlock ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS = null;
        public static final int ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS_ID = 211;
        public static final android.icu.lang.UCharacter.UnicodeBlock ARABIC_PRESENTATION_FORMS_A = null;
        public static final int ARABIC_PRESENTATION_FORMS_A_ID = 81;
        public static final android.icu.lang.UCharacter.UnicodeBlock ARABIC_PRESENTATION_FORMS_B = null;
        public static final int ARABIC_PRESENTATION_FORMS_B_ID = 85;
        public static final android.icu.lang.UCharacter.UnicodeBlock ARABIC_SUPPLEMENT = null;
        public static final int ARABIC_SUPPLEMENT_ID = 128;
        public static final android.icu.lang.UCharacter.UnicodeBlock ARMENIAN = null;
        public static final int ARMENIAN_ID = 10;
        public static final android.icu.lang.UCharacter.UnicodeBlock ARROWS = null;
        public static final int ARROWS_ID = 46;
        public static final android.icu.lang.UCharacter.UnicodeBlock AVESTAN = null;
        public static final int AVESTAN_ID = 188;
        public static final android.icu.lang.UCharacter.UnicodeBlock BALINESE = null;
        public static final int BALINESE_ID = 147;
        public static final android.icu.lang.UCharacter.UnicodeBlock BAMUM = null;
        public static final int BAMUM_ID = 177;
        public static final android.icu.lang.UCharacter.UnicodeBlock BAMUM_SUPPLEMENT = null;
        public static final int BAMUM_SUPPLEMENT_ID = 202;
        public static final android.icu.lang.UCharacter.UnicodeBlock BASIC_LATIN = null;
        public static final int BASIC_LATIN_ID = 1;
        public static final android.icu.lang.UCharacter.UnicodeBlock BASSA_VAH = null;
        public static final int BASSA_VAH_ID = 221;
        public static final android.icu.lang.UCharacter.UnicodeBlock BATAK = null;
        public static final int BATAK_ID = 199;
        public static final android.icu.lang.UCharacter.UnicodeBlock BENGALI = null;
        public static final int BENGALI_ID = 16;
        public static final android.icu.lang.UCharacter.UnicodeBlock BHAIKSUKI = null;
        public static final int BHAIKSUKI_ID = 264;
        public static final android.icu.lang.UCharacter.UnicodeBlock BLOCK_ELEMENTS = null;
        public static final int BLOCK_ELEMENTS_ID = 53;
        public static final android.icu.lang.UCharacter.UnicodeBlock BOPOMOFO = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock BOPOMOFO_EXTENDED = null;
        public static final int BOPOMOFO_EXTENDED_ID = 67;
        public static final int BOPOMOFO_ID = 64;
        public static final android.icu.lang.UCharacter.UnicodeBlock BOX_DRAWING = null;
        public static final int BOX_DRAWING_ID = 52;
        public static final android.icu.lang.UCharacter.UnicodeBlock BRAHMI = null;
        public static final int BRAHMI_ID = 201;
        public static final android.icu.lang.UCharacter.UnicodeBlock BRAILLE_PATTERNS = null;
        public static final int BRAILLE_PATTERNS_ID = 57;
        public static final android.icu.lang.UCharacter.UnicodeBlock BUGINESE = null;
        public static final int BUGINESE_ID = 129;
        public static final android.icu.lang.UCharacter.UnicodeBlock BUHID = null;
        public static final int BUHID_ID = 100;
        public static final android.icu.lang.UCharacter.UnicodeBlock BYZANTINE_MUSICAL_SYMBOLS = null;
        public static final int BYZANTINE_MUSICAL_SYMBOLS_ID = 91;
        public static final android.icu.lang.UCharacter.UnicodeBlock CARIAN = null;
        public static final int CARIAN_ID = 168;
        public static final android.icu.lang.UCharacter.UnicodeBlock CAUCASIAN_ALBANIAN = null;
        public static final int CAUCASIAN_ALBANIAN_ID = 222;
        public static final android.icu.lang.UCharacter.UnicodeBlock CHAKMA = null;
        public static final int CHAKMA_ID = 212;
        public static final android.icu.lang.UCharacter.UnicodeBlock CHAM = null;
        public static final int CHAM_ID = 164;
        public static final android.icu.lang.UCharacter.UnicodeBlock CHEROKEE = null;
        public static final int CHEROKEE_ID = 32;
        public static final android.icu.lang.UCharacter.UnicodeBlock CHEROKEE_SUPPLEMENT = null;
        public static final int CHEROKEE_SUPPLEMENT_ID = 255;
        public static final android.icu.lang.UCharacter.UnicodeBlock CHESS_SYMBOLS = null;
        public static final int CHESS_SYMBOLS_ID = 281;
        public static final android.icu.lang.UCharacter.UnicodeBlock CHORASMIAN = null;
        public static final int CHORASMIAN_ID = 301;
        public static final android.icu.lang.UCharacter.UnicodeBlock CJK_COMPATIBILITY = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock CJK_COMPATIBILITY_FORMS = null;
        public static final int CJK_COMPATIBILITY_FORMS_ID = 83;
        public static final int CJK_COMPATIBILITY_ID = 69;
        public static final android.icu.lang.UCharacter.UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS = null;
        public static final int CJK_COMPATIBILITY_IDEOGRAPHS_ID = 79;
        public static final android.icu.lang.UCharacter.UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT = null;
        public static final int CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT_ID = 95;
        public static final android.icu.lang.UCharacter.UnicodeBlock CJK_RADICALS_SUPPLEMENT = null;
        public static final int CJK_RADICALS_SUPPLEMENT_ID = 58;
        public static final android.icu.lang.UCharacter.UnicodeBlock CJK_STROKES = null;
        public static final int CJK_STROKES_ID = 130;
        public static final android.icu.lang.UCharacter.UnicodeBlock CJK_SYMBOLS_AND_PUNCTUATION = null;
        public static final int CJK_SYMBOLS_AND_PUNCTUATION_ID = 61;
        public static final android.icu.lang.UCharacter.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A = null;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A_ID = 70;
        public static final android.icu.lang.UCharacter.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B = null;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B_ID = 94;
        public static final android.icu.lang.UCharacter.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C = null;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C_ID = 197;
        public static final android.icu.lang.UCharacter.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D = null;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D_ID = 209;
        public static final android.icu.lang.UCharacter.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_E = null;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_E_ID = 256;
        public static final android.icu.lang.UCharacter.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_F = null;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_F_ID = 274;
        public static final android.icu.lang.UCharacter.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_G = null;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_G_ID = 302;
        public static final int CJK_UNIFIED_IDEOGRAPHS_ID = 71;
        public static final android.icu.lang.UCharacter.UnicodeBlock COMBINING_DIACRITICAL_MARKS = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock COMBINING_DIACRITICAL_MARKS_EXTENDED = null;
        public static final int COMBINING_DIACRITICAL_MARKS_EXTENDED_ID = 224;
        public static final int COMBINING_DIACRITICAL_MARKS_ID = 7;
        public static final android.icu.lang.UCharacter.UnicodeBlock COMBINING_DIACRITICAL_MARKS_SUPPLEMENT = null;
        public static final int COMBINING_DIACRITICAL_MARKS_SUPPLEMENT_ID = 131;
        public static final android.icu.lang.UCharacter.UnicodeBlock COMBINING_HALF_MARKS = null;
        public static final int COMBINING_HALF_MARKS_ID = 82;
        public static final android.icu.lang.UCharacter.UnicodeBlock COMBINING_MARKS_FOR_SYMBOLS = null;
        public static final int COMBINING_MARKS_FOR_SYMBOLS_ID = 43;
        public static final android.icu.lang.UCharacter.UnicodeBlock COMMON_INDIC_NUMBER_FORMS = null;
        public static final int COMMON_INDIC_NUMBER_FORMS_ID = 178;
        public static final android.icu.lang.UCharacter.UnicodeBlock CONTROL_PICTURES = null;
        public static final int CONTROL_PICTURES_ID = 49;
        public static final android.icu.lang.UCharacter.UnicodeBlock COPTIC = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock COPTIC_EPACT_NUMBERS = null;
        public static final int COPTIC_EPACT_NUMBERS_ID = 223;
        public static final int COPTIC_ID = 132;
        public static final android.icu.lang.UCharacter.UnicodeBlock COUNTING_ROD_NUMERALS = null;
        public static final int COUNTING_ROD_NUMERALS_ID = 154;
        public static final android.icu.lang.UCharacter.UnicodeBlock CUNEIFORM = null;
        public static final int CUNEIFORM_ID = 152;
        public static final android.icu.lang.UCharacter.UnicodeBlock CUNEIFORM_NUMBERS_AND_PUNCTUATION = null;
        public static final int CUNEIFORM_NUMBERS_AND_PUNCTUATION_ID = 153;
        public static final android.icu.lang.UCharacter.UnicodeBlock CURRENCY_SYMBOLS = null;
        public static final int CURRENCY_SYMBOLS_ID = 42;
        public static final android.icu.lang.UCharacter.UnicodeBlock CYPRIOT_SYLLABARY = null;
        public static final int CYPRIOT_SYLLABARY_ID = 123;
        public static final android.icu.lang.UCharacter.UnicodeBlock CYPRO_MINOAN = null;
        public static final int CYPRO_MINOAN_ID = 310;
        public static final android.icu.lang.UCharacter.UnicodeBlock CYRILLIC = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock CYRILLIC_EXTENDED_A = null;
        public static final int CYRILLIC_EXTENDED_A_ID = 158;
        public static final android.icu.lang.UCharacter.UnicodeBlock CYRILLIC_EXTENDED_B = null;
        public static final int CYRILLIC_EXTENDED_B_ID = 160;
        public static final android.icu.lang.UCharacter.UnicodeBlock CYRILLIC_EXTENDED_C = null;
        public static final int CYRILLIC_EXTENDED_C_ID = 265;
        public static final int CYRILLIC_ID = 9;
        public static final android.icu.lang.UCharacter.UnicodeBlock CYRILLIC_SUPPLEMENT = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock CYRILLIC_SUPPLEMENTARY = null;
        public static final int CYRILLIC_SUPPLEMENTARY_ID = 97;
        public static final int CYRILLIC_SUPPLEMENT_ID = 97;
        public static final android.icu.lang.UCharacter.UnicodeBlock DESERET = null;
        public static final int DESERET_ID = 90;
        public static final android.icu.lang.UCharacter.UnicodeBlock DEVANAGARI = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock DEVANAGARI_EXTENDED = null;
        public static final int DEVANAGARI_EXTENDED_ID = 179;
        public static final int DEVANAGARI_ID = 15;
        public static final android.icu.lang.UCharacter.UnicodeBlock DINGBATS = null;
        public static final int DINGBATS_ID = 56;
        public static final android.icu.lang.UCharacter.UnicodeBlock DIVES_AKURU = null;
        public static final int DIVES_AKURU_ID = 303;
        public static final android.icu.lang.UCharacter.UnicodeBlock DOGRA = null;
        public static final int DOGRA_ID = 282;
        public static final android.icu.lang.UCharacter.UnicodeBlock DOMINO_TILES = null;
        public static final int DOMINO_TILES_ID = 171;
        public static final android.icu.lang.UCharacter.UnicodeBlock DUPLOYAN = null;
        public static final int DUPLOYAN_ID = 225;
        public static final android.icu.lang.UCharacter.UnicodeBlock EARLY_DYNASTIC_CUNEIFORM = null;
        public static final int EARLY_DYNASTIC_CUNEIFORM_ID = 257;
        public static final android.icu.lang.UCharacter.UnicodeBlock EGYPTIAN_HIEROGLYPHS = null;
        public static final int EGYPTIAN_HIEROGLYPHS_ID = 194;
        public static final android.icu.lang.UCharacter.UnicodeBlock EGYPTIAN_HIEROGLYPH_FORMAT_CONTROLS = null;
        public static final int EGYPTIAN_HIEROGLYPH_FORMAT_CONTROLS_ID = 292;
        public static final android.icu.lang.UCharacter.UnicodeBlock ELBASAN = null;
        public static final int ELBASAN_ID = 226;
        public static final android.icu.lang.UCharacter.UnicodeBlock ELYMAIC = null;
        public static final int ELYMAIC_ID = 293;
        public static final android.icu.lang.UCharacter.UnicodeBlock EMOTICONS = null;
        public static final int EMOTICONS_ID = 206;
        public static final android.icu.lang.UCharacter.UnicodeBlock ENCLOSED_ALPHANUMERICS = null;
        public static final int ENCLOSED_ALPHANUMERICS_ID = 51;
        public static final android.icu.lang.UCharacter.UnicodeBlock ENCLOSED_ALPHANUMERIC_SUPPLEMENT = null;
        public static final int ENCLOSED_ALPHANUMERIC_SUPPLEMENT_ID = 195;
        public static final android.icu.lang.UCharacter.UnicodeBlock ENCLOSED_CJK_LETTERS_AND_MONTHS = null;
        public static final int ENCLOSED_CJK_LETTERS_AND_MONTHS_ID = 68;
        public static final android.icu.lang.UCharacter.UnicodeBlock ENCLOSED_IDEOGRAPHIC_SUPPLEMENT = null;
        public static final int ENCLOSED_IDEOGRAPHIC_SUPPLEMENT_ID = 196;
        public static final android.icu.lang.UCharacter.UnicodeBlock ETHIOPIC = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock ETHIOPIC_EXTENDED = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock ETHIOPIC_EXTENDED_A = null;
        public static final int ETHIOPIC_EXTENDED_A_ID = 200;
        public static final android.icu.lang.UCharacter.UnicodeBlock ETHIOPIC_EXTENDED_B = null;
        public static final int ETHIOPIC_EXTENDED_B_ID = 311;
        public static final int ETHIOPIC_EXTENDED_ID = 133;
        public static final int ETHIOPIC_ID = 31;
        public static final android.icu.lang.UCharacter.UnicodeBlock ETHIOPIC_SUPPLEMENT = null;
        public static final int ETHIOPIC_SUPPLEMENT_ID = 134;
        public static final android.icu.lang.UCharacter.UnicodeBlock GENERAL_PUNCTUATION = null;
        public static final int GENERAL_PUNCTUATION_ID = 40;
        public static final android.icu.lang.UCharacter.UnicodeBlock GEOMETRIC_SHAPES = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock GEOMETRIC_SHAPES_EXTENDED = null;
        public static final int GEOMETRIC_SHAPES_EXTENDED_ID = 227;
        public static final int GEOMETRIC_SHAPES_ID = 54;
        public static final android.icu.lang.UCharacter.UnicodeBlock GEORGIAN = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock GEORGIAN_EXTENDED = null;
        public static final int GEORGIAN_EXTENDED_ID = 283;
        public static final int GEORGIAN_ID = 29;
        public static final android.icu.lang.UCharacter.UnicodeBlock GEORGIAN_SUPPLEMENT = null;
        public static final int GEORGIAN_SUPPLEMENT_ID = 135;
        public static final android.icu.lang.UCharacter.UnicodeBlock GLAGOLITIC = null;
        public static final int GLAGOLITIC_ID = 136;
        public static final android.icu.lang.UCharacter.UnicodeBlock GLAGOLITIC_SUPPLEMENT = null;
        public static final int GLAGOLITIC_SUPPLEMENT_ID = 266;
        public static final android.icu.lang.UCharacter.UnicodeBlock GOTHIC = null;
        public static final int GOTHIC_ID = 89;
        public static final android.icu.lang.UCharacter.UnicodeBlock GRANTHA = null;
        public static final int GRANTHA_ID = 228;
        public static final android.icu.lang.UCharacter.UnicodeBlock GREEK = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock GREEK_EXTENDED = null;
        public static final int GREEK_EXTENDED_ID = 39;
        public static final int GREEK_ID = 8;
        public static final android.icu.lang.UCharacter.UnicodeBlock GUJARATI = null;
        public static final int GUJARATI_ID = 18;
        public static final android.icu.lang.UCharacter.UnicodeBlock GUNJALA_GONDI = null;
        public static final int GUNJALA_GONDI_ID = 284;
        public static final android.icu.lang.UCharacter.UnicodeBlock GURMUKHI = null;
        public static final int GURMUKHI_ID = 17;
        public static final android.icu.lang.UCharacter.UnicodeBlock HALFWIDTH_AND_FULLWIDTH_FORMS = null;
        public static final int HALFWIDTH_AND_FULLWIDTH_FORMS_ID = 87;
        public static final android.icu.lang.UCharacter.UnicodeBlock HANGUL_COMPATIBILITY_JAMO = null;
        public static final int HANGUL_COMPATIBILITY_JAMO_ID = 65;
        public static final android.icu.lang.UCharacter.UnicodeBlock HANGUL_JAMO = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock HANGUL_JAMO_EXTENDED_A = null;
        public static final int HANGUL_JAMO_EXTENDED_A_ID = 180;
        public static final android.icu.lang.UCharacter.UnicodeBlock HANGUL_JAMO_EXTENDED_B = null;
        public static final int HANGUL_JAMO_EXTENDED_B_ID = 185;
        public static final int HANGUL_JAMO_ID = 30;
        public static final android.icu.lang.UCharacter.UnicodeBlock HANGUL_SYLLABLES = null;
        public static final int HANGUL_SYLLABLES_ID = 74;
        public static final android.icu.lang.UCharacter.UnicodeBlock HANIFI_ROHINGYA = null;
        public static final int HANIFI_ROHINGYA_ID = 285;
        public static final android.icu.lang.UCharacter.UnicodeBlock HANUNOO = null;
        public static final int HANUNOO_ID = 99;
        public static final android.icu.lang.UCharacter.UnicodeBlock HATRAN = null;
        public static final int HATRAN_ID = 258;
        public static final android.icu.lang.UCharacter.UnicodeBlock HEBREW = null;
        public static final int HEBREW_ID = 11;
        public static final android.icu.lang.UCharacter.UnicodeBlock HIGH_PRIVATE_USE_SURROGATES = null;
        public static final int HIGH_PRIVATE_USE_SURROGATES_ID = 76;
        public static final android.icu.lang.UCharacter.UnicodeBlock HIGH_SURROGATES = null;
        public static final int HIGH_SURROGATES_ID = 75;
        public static final android.icu.lang.UCharacter.UnicodeBlock HIRAGANA = null;
        public static final int HIRAGANA_ID = 62;
        public static final android.icu.lang.UCharacter.UnicodeBlock IDEOGRAPHIC_DESCRIPTION_CHARACTERS = null;
        public static final int IDEOGRAPHIC_DESCRIPTION_CHARACTERS_ID = 60;
        public static final android.icu.lang.UCharacter.UnicodeBlock IDEOGRAPHIC_SYMBOLS_AND_PUNCTUATION = null;
        public static final int IDEOGRAPHIC_SYMBOLS_AND_PUNCTUATION_ID = 267;
        public static final android.icu.lang.UCharacter.UnicodeBlock IMPERIAL_ARAMAIC = null;
        public static final int IMPERIAL_ARAMAIC_ID = 186;
        public static final android.icu.lang.UCharacter.UnicodeBlock INDIC_SIYAQ_NUMBERS = null;
        public static final int INDIC_SIYAQ_NUMBERS_ID = 286;
        public static final android.icu.lang.UCharacter.UnicodeBlock INSCRIPTIONAL_PAHLAVI = null;
        public static final int INSCRIPTIONAL_PAHLAVI_ID = 190;
        public static final android.icu.lang.UCharacter.UnicodeBlock INSCRIPTIONAL_PARTHIAN = null;
        public static final int INSCRIPTIONAL_PARTHIAN_ID = 189;
        public static final android.icu.lang.UCharacter.UnicodeBlock INVALID_CODE = null;
        public static final int INVALID_CODE_ID = -1;
        public static final android.icu.lang.UCharacter.UnicodeBlock IPA_EXTENSIONS = null;
        public static final int IPA_EXTENSIONS_ID = 5;
        public static final android.icu.lang.UCharacter.UnicodeBlock JAVANESE = null;
        public static final int JAVANESE_ID = 181;
        public static final android.icu.lang.UCharacter.UnicodeBlock KAITHI = null;
        public static final int KAITHI_ID = 193;
        public static final android.icu.lang.UCharacter.UnicodeBlock KANA_EXTENDED_A = null;
        public static final int KANA_EXTENDED_A_ID = 275;
        public static final android.icu.lang.UCharacter.UnicodeBlock KANA_EXTENDED_B = null;
        public static final int KANA_EXTENDED_B_ID = 312;
        public static final android.icu.lang.UCharacter.UnicodeBlock KANA_SUPPLEMENT = null;
        public static final int KANA_SUPPLEMENT_ID = 203;
        public static final android.icu.lang.UCharacter.UnicodeBlock KANBUN = null;
        public static final int KANBUN_ID = 66;
        public static final android.icu.lang.UCharacter.UnicodeBlock KANGXI_RADICALS = null;
        public static final int KANGXI_RADICALS_ID = 59;
        public static final android.icu.lang.UCharacter.UnicodeBlock KANNADA = null;
        public static final int KANNADA_ID = 22;
        public static final android.icu.lang.UCharacter.UnicodeBlock KATAKANA = null;
        public static final int KATAKANA_ID = 63;
        public static final android.icu.lang.UCharacter.UnicodeBlock KATAKANA_PHONETIC_EXTENSIONS = null;
        public static final int KATAKANA_PHONETIC_EXTENSIONS_ID = 107;
        public static final android.icu.lang.UCharacter.UnicodeBlock KAYAH_LI = null;
        public static final int KAYAH_LI_ID = 162;
        public static final android.icu.lang.UCharacter.UnicodeBlock KHAROSHTHI = null;
        public static final int KHAROSHTHI_ID = 137;
        public static final android.icu.lang.UCharacter.UnicodeBlock KHITAN_SMALL_SCRIPT = null;
        public static final int KHITAN_SMALL_SCRIPT_ID = 304;
        public static final android.icu.lang.UCharacter.UnicodeBlock KHMER = null;
        public static final int KHMER_ID = 36;
        public static final android.icu.lang.UCharacter.UnicodeBlock KHMER_SYMBOLS = null;
        public static final int KHMER_SYMBOLS_ID = 113;
        public static final android.icu.lang.UCharacter.UnicodeBlock KHOJKI = null;
        public static final int KHOJKI_ID = 229;
        public static final android.icu.lang.UCharacter.UnicodeBlock KHUDAWADI = null;
        public static final int KHUDAWADI_ID = 230;
        public static final android.icu.lang.UCharacter.UnicodeBlock LAO = null;
        public static final int LAO_ID = 26;
        public static final android.icu.lang.UCharacter.UnicodeBlock LATIN_1_SUPPLEMENT = null;
        public static final int LATIN_1_SUPPLEMENT_ID = 2;
        public static final android.icu.lang.UCharacter.UnicodeBlock LATIN_EXTENDED_A = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock LATIN_EXTENDED_ADDITIONAL = null;
        public static final int LATIN_EXTENDED_ADDITIONAL_ID = 38;
        public static final int LATIN_EXTENDED_A_ID = 3;
        public static final android.icu.lang.UCharacter.UnicodeBlock LATIN_EXTENDED_B = null;
        public static final int LATIN_EXTENDED_B_ID = 4;
        public static final android.icu.lang.UCharacter.UnicodeBlock LATIN_EXTENDED_C = null;
        public static final int LATIN_EXTENDED_C_ID = 148;
        public static final android.icu.lang.UCharacter.UnicodeBlock LATIN_EXTENDED_D = null;
        public static final int LATIN_EXTENDED_D_ID = 149;
        public static final android.icu.lang.UCharacter.UnicodeBlock LATIN_EXTENDED_E = null;
        public static final int LATIN_EXTENDED_E_ID = 231;
        public static final android.icu.lang.UCharacter.UnicodeBlock LATIN_EXTENDED_F = null;
        public static final int LATIN_EXTENDED_F_ID = 313;
        public static final android.icu.lang.UCharacter.UnicodeBlock LATIN_EXTENDED_G = null;
        public static final int LATIN_EXTENDED_G_ID = 314;
        public static final android.icu.lang.UCharacter.UnicodeBlock LEPCHA = null;
        public static final int LEPCHA_ID = 156;
        public static final android.icu.lang.UCharacter.UnicodeBlock LETTERLIKE_SYMBOLS = null;
        public static final int LETTERLIKE_SYMBOLS_ID = 44;
        public static final android.icu.lang.UCharacter.UnicodeBlock LIMBU = null;
        public static final int LIMBU_ID = 111;
        public static final android.icu.lang.UCharacter.UnicodeBlock LINEAR_A = null;
        public static final int LINEAR_A_ID = 232;
        public static final android.icu.lang.UCharacter.UnicodeBlock LINEAR_B_IDEOGRAMS = null;
        public static final int LINEAR_B_IDEOGRAMS_ID = 118;
        public static final android.icu.lang.UCharacter.UnicodeBlock LINEAR_B_SYLLABARY = null;
        public static final int LINEAR_B_SYLLABARY_ID = 117;
        public static final android.icu.lang.UCharacter.UnicodeBlock LISU = null;
        public static final int LISU_ID = 176;
        public static final android.icu.lang.UCharacter.UnicodeBlock LISU_SUPPLEMENT = null;
        public static final int LISU_SUPPLEMENT_ID = 305;
        public static final android.icu.lang.UCharacter.UnicodeBlock LOW_SURROGATES = null;
        public static final int LOW_SURROGATES_ID = 77;
        public static final android.icu.lang.UCharacter.UnicodeBlock LYCIAN = null;
        public static final int LYCIAN_ID = 167;
        public static final android.icu.lang.UCharacter.UnicodeBlock LYDIAN = null;
        public static final int LYDIAN_ID = 169;
        public static final android.icu.lang.UCharacter.UnicodeBlock MAHAJANI = null;
        public static final int MAHAJANI_ID = 233;
        public static final android.icu.lang.UCharacter.UnicodeBlock MAHJONG_TILES = null;
        public static final int MAHJONG_TILES_ID = 170;
        public static final android.icu.lang.UCharacter.UnicodeBlock MAKASAR = null;
        public static final int MAKASAR_ID = 287;
        public static final android.icu.lang.UCharacter.UnicodeBlock MALAYALAM = null;
        public static final int MALAYALAM_ID = 23;
        public static final android.icu.lang.UCharacter.UnicodeBlock MANDAIC = null;
        public static final int MANDAIC_ID = 198;
        public static final android.icu.lang.UCharacter.UnicodeBlock MANICHAEAN = null;
        public static final int MANICHAEAN_ID = 234;
        public static final android.icu.lang.UCharacter.UnicodeBlock MARCHEN = null;
        public static final int MARCHEN_ID = 268;
        public static final android.icu.lang.UCharacter.UnicodeBlock MASARAM_GONDI = null;
        public static final int MASARAM_GONDI_ID = 276;
        public static final android.icu.lang.UCharacter.UnicodeBlock MATHEMATICAL_ALPHANUMERIC_SYMBOLS = null;
        public static final int MATHEMATICAL_ALPHANUMERIC_SYMBOLS_ID = 93;
        public static final android.icu.lang.UCharacter.UnicodeBlock MATHEMATICAL_OPERATORS = null;
        public static final int MATHEMATICAL_OPERATORS_ID = 47;
        public static final android.icu.lang.UCharacter.UnicodeBlock MAYAN_NUMERALS = null;
        public static final int MAYAN_NUMERALS_ID = 288;
        public static final android.icu.lang.UCharacter.UnicodeBlock MEDEFAIDRIN = null;
        public static final int MEDEFAIDRIN_ID = 289;
        public static final android.icu.lang.UCharacter.UnicodeBlock MEETEI_MAYEK = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock MEETEI_MAYEK_EXTENSIONS = null;
        public static final int MEETEI_MAYEK_EXTENSIONS_ID = 213;
        public static final int MEETEI_MAYEK_ID = 184;
        public static final android.icu.lang.UCharacter.UnicodeBlock MENDE_KIKAKUI = null;
        public static final int MENDE_KIKAKUI_ID = 235;
        public static final android.icu.lang.UCharacter.UnicodeBlock MEROITIC_CURSIVE = null;
        public static final int MEROITIC_CURSIVE_ID = 214;
        public static final android.icu.lang.UCharacter.UnicodeBlock MEROITIC_HIEROGLYPHS = null;
        public static final int MEROITIC_HIEROGLYPHS_ID = 215;
        public static final android.icu.lang.UCharacter.UnicodeBlock MIAO = null;
        public static final int MIAO_ID = 216;
        public static final android.icu.lang.UCharacter.UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A = null;
        public static final int MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A_ID = 102;
        public static final android.icu.lang.UCharacter.UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B = null;
        public static final int MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B_ID = 105;
        public static final android.icu.lang.UCharacter.UnicodeBlock MISCELLANEOUS_SYMBOLS = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_ARROWS = null;
        public static final int MISCELLANEOUS_SYMBOLS_AND_ARROWS_ID = 115;
        public static final android.icu.lang.UCharacter.UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS = null;
        public static final int MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS_ID = 205;
        public static final int MISCELLANEOUS_SYMBOLS_ID = 55;
        public static final android.icu.lang.UCharacter.UnicodeBlock MISCELLANEOUS_TECHNICAL = null;
        public static final int MISCELLANEOUS_TECHNICAL_ID = 48;
        public static final android.icu.lang.UCharacter.UnicodeBlock MODI = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock MODIFIER_TONE_LETTERS = null;
        public static final int MODIFIER_TONE_LETTERS_ID = 138;
        public static final int MODI_ID = 236;
        public static final android.icu.lang.UCharacter.UnicodeBlock MONGOLIAN = null;
        public static final int MONGOLIAN_ID = 37;
        public static final android.icu.lang.UCharacter.UnicodeBlock MONGOLIAN_SUPPLEMENT = null;
        public static final int MONGOLIAN_SUPPLEMENT_ID = 269;
        public static final android.icu.lang.UCharacter.UnicodeBlock MRO = null;
        public static final int MRO_ID = 237;
        public static final android.icu.lang.UCharacter.UnicodeBlock MULTANI = null;
        public static final int MULTANI_ID = 259;
        public static final android.icu.lang.UCharacter.UnicodeBlock MUSICAL_SYMBOLS = null;
        public static final int MUSICAL_SYMBOLS_ID = 92;
        public static final android.icu.lang.UCharacter.UnicodeBlock MYANMAR = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock MYANMAR_EXTENDED_A = null;
        public static final int MYANMAR_EXTENDED_A_ID = 182;
        public static final android.icu.lang.UCharacter.UnicodeBlock MYANMAR_EXTENDED_B = null;
        public static final int MYANMAR_EXTENDED_B_ID = 238;
        public static final int MYANMAR_ID = 28;
        public static final android.icu.lang.UCharacter.UnicodeBlock NABATAEAN = null;
        public static final int NABATAEAN_ID = 239;
        public static final android.icu.lang.UCharacter.UnicodeBlock NANDINAGARI = null;
        public static final int NANDINAGARI_ID = 294;
        public static final android.icu.lang.UCharacter.UnicodeBlock NEWA = null;
        public static final int NEWA_ID = 270;
        public static final android.icu.lang.UCharacter.UnicodeBlock NEW_TAI_LUE = null;
        public static final int NEW_TAI_LUE_ID = 139;
        public static final android.icu.lang.UCharacter.UnicodeBlock NKO = null;
        public static final int NKO_ID = 146;
        public static final android.icu.lang.UCharacter.UnicodeBlock NO_BLOCK = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock NUMBER_FORMS = null;
        public static final int NUMBER_FORMS_ID = 45;
        public static final android.icu.lang.UCharacter.UnicodeBlock NUSHU = null;
        public static final int NUSHU_ID = 277;
        public static final android.icu.lang.UCharacter.UnicodeBlock NYIAKENG_PUACHUE_HMONG = null;
        public static final int NYIAKENG_PUACHUE_HMONG_ID = 295;
        public static final android.icu.lang.UCharacter.UnicodeBlock OGHAM = null;
        public static final int OGHAM_ID = 34;
        public static final android.icu.lang.UCharacter.UnicodeBlock OLD_HUNGARIAN = null;
        public static final int OLD_HUNGARIAN_ID = 260;
        public static final android.icu.lang.UCharacter.UnicodeBlock OLD_ITALIC = null;
        public static final int OLD_ITALIC_ID = 88;
        public static final android.icu.lang.UCharacter.UnicodeBlock OLD_NORTH_ARABIAN = null;
        public static final int OLD_NORTH_ARABIAN_ID = 240;
        public static final android.icu.lang.UCharacter.UnicodeBlock OLD_PERMIC = null;
        public static final int OLD_PERMIC_ID = 241;
        public static final android.icu.lang.UCharacter.UnicodeBlock OLD_PERSIAN = null;
        public static final int OLD_PERSIAN_ID = 140;
        public static final android.icu.lang.UCharacter.UnicodeBlock OLD_SOGDIAN = null;
        public static final int OLD_SOGDIAN_ID = 290;
        public static final android.icu.lang.UCharacter.UnicodeBlock OLD_SOUTH_ARABIAN = null;
        public static final int OLD_SOUTH_ARABIAN_ID = 187;
        public static final android.icu.lang.UCharacter.UnicodeBlock OLD_TURKIC = null;
        public static final int OLD_TURKIC_ID = 191;
        public static final android.icu.lang.UCharacter.UnicodeBlock OLD_UYGHUR = null;
        public static final int OLD_UYGHUR_ID = 315;
        public static final android.icu.lang.UCharacter.UnicodeBlock OL_CHIKI = null;
        public static final int OL_CHIKI_ID = 157;
        public static final android.icu.lang.UCharacter.UnicodeBlock OPTICAL_CHARACTER_RECOGNITION = null;
        public static final int OPTICAL_CHARACTER_RECOGNITION_ID = 50;
        public static final android.icu.lang.UCharacter.UnicodeBlock ORIYA = null;
        public static final int ORIYA_ID = 19;
        public static final android.icu.lang.UCharacter.UnicodeBlock ORNAMENTAL_DINGBATS = null;
        public static final int ORNAMENTAL_DINGBATS_ID = 242;
        public static final android.icu.lang.UCharacter.UnicodeBlock OSAGE = null;
        public static final int OSAGE_ID = 271;
        public static final android.icu.lang.UCharacter.UnicodeBlock OSMANYA = null;
        public static final int OSMANYA_ID = 122;
        public static final android.icu.lang.UCharacter.UnicodeBlock OTTOMAN_SIYAQ_NUMBERS = null;
        public static final int OTTOMAN_SIYAQ_NUMBERS_ID = 296;
        public static final android.icu.lang.UCharacter.UnicodeBlock PAHAWH_HMONG = null;
        public static final int PAHAWH_HMONG_ID = 243;
        public static final android.icu.lang.UCharacter.UnicodeBlock PALMYRENE = null;
        public static final int PALMYRENE_ID = 244;
        public static final android.icu.lang.UCharacter.UnicodeBlock PAU_CIN_HAU = null;
        public static final int PAU_CIN_HAU_ID = 245;
        public static final android.icu.lang.UCharacter.UnicodeBlock PHAGS_PA = null;
        public static final int PHAGS_PA_ID = 150;
        public static final android.icu.lang.UCharacter.UnicodeBlock PHAISTOS_DISC = null;
        public static final int PHAISTOS_DISC_ID = 166;
        public static final android.icu.lang.UCharacter.UnicodeBlock PHOENICIAN = null;
        public static final int PHOENICIAN_ID = 151;
        public static final android.icu.lang.UCharacter.UnicodeBlock PHONETIC_EXTENSIONS = null;
        public static final int PHONETIC_EXTENSIONS_ID = 114;
        public static final android.icu.lang.UCharacter.UnicodeBlock PHONETIC_EXTENSIONS_SUPPLEMENT = null;
        public static final int PHONETIC_EXTENSIONS_SUPPLEMENT_ID = 141;
        public static final android.icu.lang.UCharacter.UnicodeBlock PLAYING_CARDS = null;
        public static final int PLAYING_CARDS_ID = 204;
        public static final android.icu.lang.UCharacter.UnicodeBlock PRIVATE_USE = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock PRIVATE_USE_AREA = null;
        public static final int PRIVATE_USE_AREA_ID = 78;
        public static final int PRIVATE_USE_ID = 78;
        public static final android.icu.lang.UCharacter.UnicodeBlock PSALTER_PAHLAVI = null;
        public static final int PSALTER_PAHLAVI_ID = 246;
        public static final android.icu.lang.UCharacter.UnicodeBlock REJANG = null;
        public static final int REJANG_ID = 163;
        public static final android.icu.lang.UCharacter.UnicodeBlock RUMI_NUMERAL_SYMBOLS = null;
        public static final int RUMI_NUMERAL_SYMBOLS_ID = 192;
        public static final android.icu.lang.UCharacter.UnicodeBlock RUNIC = null;
        public static final int RUNIC_ID = 35;
        public static final android.icu.lang.UCharacter.UnicodeBlock SAMARITAN = null;
        public static final int SAMARITAN_ID = 172;
        public static final android.icu.lang.UCharacter.UnicodeBlock SAURASHTRA = null;
        public static final int SAURASHTRA_ID = 161;
        public static final android.icu.lang.UCharacter.UnicodeBlock SHARADA = null;
        public static final int SHARADA_ID = 217;
        public static final android.icu.lang.UCharacter.UnicodeBlock SHAVIAN = null;
        public static final int SHAVIAN_ID = 121;
        public static final android.icu.lang.UCharacter.UnicodeBlock SHORTHAND_FORMAT_CONTROLS = null;
        public static final int SHORTHAND_FORMAT_CONTROLS_ID = 247;
        public static final android.icu.lang.UCharacter.UnicodeBlock SIDDHAM = null;
        public static final int SIDDHAM_ID = 248;
        public static final android.icu.lang.UCharacter.UnicodeBlock SINHALA = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock SINHALA_ARCHAIC_NUMBERS = null;
        public static final int SINHALA_ARCHAIC_NUMBERS_ID = 249;
        public static final int SINHALA_ID = 24;
        public static final android.icu.lang.UCharacter.UnicodeBlock SMALL_FORM_VARIANTS = null;
        public static final int SMALL_FORM_VARIANTS_ID = 84;
        public static final android.icu.lang.UCharacter.UnicodeBlock SMALL_KANA_EXTENSION = null;
        public static final int SMALL_KANA_EXTENSION_ID = 297;
        public static final android.icu.lang.UCharacter.UnicodeBlock SOGDIAN = null;
        public static final int SOGDIAN_ID = 291;
        public static final android.icu.lang.UCharacter.UnicodeBlock SORA_SOMPENG = null;
        public static final int SORA_SOMPENG_ID = 218;
        public static final android.icu.lang.UCharacter.UnicodeBlock SOYOMBO = null;
        public static final int SOYOMBO_ID = 278;
        public static final android.icu.lang.UCharacter.UnicodeBlock SPACING_MODIFIER_LETTERS = null;
        public static final int SPACING_MODIFIER_LETTERS_ID = 6;
        public static final android.icu.lang.UCharacter.UnicodeBlock SPECIALS = null;
        public static final int SPECIALS_ID = 86;
        public static final android.icu.lang.UCharacter.UnicodeBlock SUNDANESE = null;
        public static final int SUNDANESE_ID = 155;
        public static final android.icu.lang.UCharacter.UnicodeBlock SUNDANESE_SUPPLEMENT = null;
        public static final int SUNDANESE_SUPPLEMENT_ID = 219;
        public static final android.icu.lang.UCharacter.UnicodeBlock SUPERSCRIPTS_AND_SUBSCRIPTS = null;
        public static final int SUPERSCRIPTS_AND_SUBSCRIPTS_ID = 41;
        public static final android.icu.lang.UCharacter.UnicodeBlock SUPPLEMENTAL_ARROWS_A = null;
        public static final int SUPPLEMENTAL_ARROWS_A_ID = 103;
        public static final android.icu.lang.UCharacter.UnicodeBlock SUPPLEMENTAL_ARROWS_B = null;
        public static final int SUPPLEMENTAL_ARROWS_B_ID = 104;
        public static final android.icu.lang.UCharacter.UnicodeBlock SUPPLEMENTAL_ARROWS_C = null;
        public static final int SUPPLEMENTAL_ARROWS_C_ID = 250;
        public static final android.icu.lang.UCharacter.UnicodeBlock SUPPLEMENTAL_MATHEMATICAL_OPERATORS = null;
        public static final int SUPPLEMENTAL_MATHEMATICAL_OPERATORS_ID = 106;
        public static final android.icu.lang.UCharacter.UnicodeBlock SUPPLEMENTAL_PUNCTUATION = null;
        public static final int SUPPLEMENTAL_PUNCTUATION_ID = 142;
        public static final android.icu.lang.UCharacter.UnicodeBlock SUPPLEMENTAL_SYMBOLS_AND_PICTOGRAPHS = null;
        public static final int SUPPLEMENTAL_SYMBOLS_AND_PICTOGRAPHS_ID = 261;
        public static final android.icu.lang.UCharacter.UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_A = null;
        public static final int SUPPLEMENTARY_PRIVATE_USE_AREA_A_ID = 109;
        public static final android.icu.lang.UCharacter.UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_B = null;
        public static final int SUPPLEMENTARY_PRIVATE_USE_AREA_B_ID = 110;
        public static final android.icu.lang.UCharacter.UnicodeBlock SUTTON_SIGNWRITING = null;
        public static final int SUTTON_SIGNWRITING_ID = 262;
        public static final android.icu.lang.UCharacter.UnicodeBlock SYLOTI_NAGRI = null;
        public static final int SYLOTI_NAGRI_ID = 143;
        public static final android.icu.lang.UCharacter.UnicodeBlock SYMBOLS_AND_PICTOGRAPHS_EXTENDED_A = null;
        public static final int SYMBOLS_AND_PICTOGRAPHS_EXTENDED_A_ID = 298;
        public static final android.icu.lang.UCharacter.UnicodeBlock SYMBOLS_FOR_LEGACY_COMPUTING = null;
        public static final int SYMBOLS_FOR_LEGACY_COMPUTING_ID = 306;
        public static final android.icu.lang.UCharacter.UnicodeBlock SYRIAC = null;
        public static final int SYRIAC_ID = 13;
        public static final android.icu.lang.UCharacter.UnicodeBlock SYRIAC_SUPPLEMENT = null;
        public static final int SYRIAC_SUPPLEMENT_ID = 279;
        public static final android.icu.lang.UCharacter.UnicodeBlock TAGALOG = null;
        public static final int TAGALOG_ID = 98;
        public static final android.icu.lang.UCharacter.UnicodeBlock TAGBANWA = null;
        public static final int TAGBANWA_ID = 101;
        public static final android.icu.lang.UCharacter.UnicodeBlock TAGS = null;
        public static final int TAGS_ID = 96;
        public static final android.icu.lang.UCharacter.UnicodeBlock TAI_LE = null;
        public static final int TAI_LE_ID = 112;
        public static final android.icu.lang.UCharacter.UnicodeBlock TAI_THAM = null;
        public static final int TAI_THAM_ID = 174;
        public static final android.icu.lang.UCharacter.UnicodeBlock TAI_VIET = null;
        public static final int TAI_VIET_ID = 183;
        public static final android.icu.lang.UCharacter.UnicodeBlock TAI_XUAN_JING_SYMBOLS = null;
        public static final int TAI_XUAN_JING_SYMBOLS_ID = 124;
        public static final android.icu.lang.UCharacter.UnicodeBlock TAKRI = null;
        public static final int TAKRI_ID = 220;
        public static final android.icu.lang.UCharacter.UnicodeBlock TAMIL = null;
        public static final int TAMIL_ID = 20;
        public static final android.icu.lang.UCharacter.UnicodeBlock TAMIL_SUPPLEMENT = null;
        public static final int TAMIL_SUPPLEMENT_ID = 299;
        public static final android.icu.lang.UCharacter.UnicodeBlock TANGSA = null;
        public static final int TANGSA_ID = 316;
        public static final android.icu.lang.UCharacter.UnicodeBlock TANGUT = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock TANGUT_COMPONENTS = null;
        public static final int TANGUT_COMPONENTS_ID = 273;
        public static final int TANGUT_ID = 272;
        public static final android.icu.lang.UCharacter.UnicodeBlock TANGUT_SUPPLEMENT = null;
        public static final int TANGUT_SUPPLEMENT_ID = 307;
        public static final android.icu.lang.UCharacter.UnicodeBlock TELUGU = null;
        public static final int TELUGU_ID = 21;
        public static final android.icu.lang.UCharacter.UnicodeBlock THAANA = null;
        public static final int THAANA_ID = 14;
        public static final android.icu.lang.UCharacter.UnicodeBlock THAI = null;
        public static final int THAI_ID = 25;
        public static final android.icu.lang.UCharacter.UnicodeBlock TIBETAN = null;
        public static final int TIBETAN_ID = 27;
        public static final android.icu.lang.UCharacter.UnicodeBlock TIFINAGH = null;
        public static final int TIFINAGH_ID = 144;
        public static final android.icu.lang.UCharacter.UnicodeBlock TIRHUTA = null;
        public static final int TIRHUTA_ID = 251;
        public static final android.icu.lang.UCharacter.UnicodeBlock TOTO = null;
        public static final int TOTO_ID = 317;
        public static final android.icu.lang.UCharacter.UnicodeBlock TRANSPORT_AND_MAP_SYMBOLS = null;
        public static final int TRANSPORT_AND_MAP_SYMBOLS_ID = 207;
        public static final android.icu.lang.UCharacter.UnicodeBlock UGARITIC = null;
        public static final int UGARITIC_ID = 120;
        public static final android.icu.lang.UCharacter.UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED = null;
        public static final android.icu.lang.UCharacter.UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED_A = null;
        public static final int UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED_A_ID = 318;
        public static final int UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED_ID = 173;
        public static final int UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_ID = 33;
        public static final android.icu.lang.UCharacter.UnicodeBlock VAI = null;
        public static final int VAI_ID = 159;
        public static final android.icu.lang.UCharacter.UnicodeBlock VARIATION_SELECTORS = null;
        public static final int VARIATION_SELECTORS_ID = 108;
        public static final android.icu.lang.UCharacter.UnicodeBlock VARIATION_SELECTORS_SUPPLEMENT = null;
        public static final int VARIATION_SELECTORS_SUPPLEMENT_ID = 125;
        public static final android.icu.lang.UCharacter.UnicodeBlock VEDIC_EXTENSIONS = null;
        public static final int VEDIC_EXTENSIONS_ID = 175;
        public static final android.icu.lang.UCharacter.UnicodeBlock VERTICAL_FORMS = null;
        public static final int VERTICAL_FORMS_ID = 145;
        public static final android.icu.lang.UCharacter.UnicodeBlock VITHKUQI = null;
        public static final int VITHKUQI_ID = 319;
        public static final android.icu.lang.UCharacter.UnicodeBlock WANCHO = null;
        public static final int WANCHO_ID = 300;
        public static final android.icu.lang.UCharacter.UnicodeBlock WARANG_CITI = null;
        public static final int WARANG_CITI_ID = 252;
        public static final android.icu.lang.UCharacter.UnicodeBlock YEZIDI = null;
        public static final int YEZIDI_ID = 308;
        public static final android.icu.lang.UCharacter.UnicodeBlock YIJING_HEXAGRAM_SYMBOLS = null;
        public static final int YIJING_HEXAGRAM_SYMBOLS_ID = 116;
        public static final android.icu.lang.UCharacter.UnicodeBlock YI_RADICALS = null;
        public static final int YI_RADICALS_ID = 73;
        public static final android.icu.lang.UCharacter.UnicodeBlock YI_SYLLABLES = null;
        public static final int YI_SYLLABLES_ID = 72;
        public static final android.icu.lang.UCharacter.UnicodeBlock ZANABAZAR_SQUARE = null;
        public static final int ZANABAZAR_SQUARE_ID = 280;
        public static final android.icu.lang.UCharacter.UnicodeBlock ZNAMENNY_MUSICAL_NOTATION = null;
        public static final int ZNAMENNY_MUSICAL_NOTATION_ID = 320;
        private UnicodeBlock() { super(null); }
        public static android.icu.lang.UCharacter.UnicodeBlock getInstance(int p0) { return null; }
        public static android.icu.lang.UCharacter.UnicodeBlock of(int p0) { return null; }
        public static android.icu.lang.UCharacter.UnicodeBlock forName(java.lang.String p0) { return null; }
        public int getID() { return 0; }
    }

    public static interface VerticalOrientation {
        public static final int ROTATED = 0;
        public static final int TRANSFORMED_ROTATED = 1;
        public static final int TRANSFORMED_UPRIGHT = 2;
        public static final int UPRIGHT = 3;
    }

    public static interface WordBreak {
        public static final int ALETTER = 1;
        public static final int CR = 8;
        public static final int DOUBLE_QUOTE = 16;
        public static final int EXTEND = 9;
        public static final int EXTENDNUMLET = 7;
        public static final int E_BASE = 17;
        public static final int E_BASE_GAZ = 18;
        public static final int E_MODIFIER = 19;
        public static final int FORMAT = 2;
        public static final int GLUE_AFTER_ZWJ = 20;
        public static final int HEBREW_LETTER = 14;
        public static final int KATAKANA = 3;
        public static final int LF = 10;
        public static final int MIDLETTER = 4;
        public static final int MIDNUM = 5;
        public static final int MIDNUMLET = 11;
        public static final int NEWLINE = 12;
        public static final int NUMERIC = 6;
        public static final int OTHER = 0;
        public static final int REGIONAL_INDICATOR = 13;
        public static final int SINGLE_QUOTE = 15;
        public static final int WSEGSPACE = 22;
        public static final int ZWJ = 21;
    }
}
