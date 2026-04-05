package app.murinelauncher.widget.radio

import android.content.Context
import android.content.ContextWrapper
import android.content.res.TypedArray
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.preference.Preference
import androidx.preference.PreferenceManager
import com.android.launcher3.R

class RadioGroupPreference @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = androidx.preference.R.attr.preferenceStyle,
    defStyleRes: Int = 0
) : Preference(context, attrs, defStyleAttr, defStyleRes) {

    private var sheetTitle: CharSequence? = null
    var iconPosition: RadioGroupBottomSheet.IconPosition = RadioGroupBottomSheet.IconPosition.START
        private set
    var entryCount: Int = 0
        internal set

    private var showPreviewIcon: Boolean = true
    private var iconTintColor: Int? = null
    private var tintSheetIcons: Boolean = true
    private val defaultIconTint: Int
        get() = ContextCompat.getColor(context,
            com.android.settingslib.widget.theme.R.color.settingslib_materialColorPrimary)

    internal var textProviderIdx: ((Context, Int) -> CharSequence)? = null
    internal var iconProviderIdx: ((Context, Int) -> Drawable?)? = null
    internal var currentIdxProvider: (() -> Int)? = null
    internal var onSelectedIdx: ((Int) -> Unit)? = null
    internal var summaryProviderIdx: ((Context, Int) -> CharSequence?)? = null
    internal var isVisibleProviderIdx: ((Context, Int) -> Boolean)? = null
    internal var isEnabledProviderIdx: ((Context, Int) -> Boolean)? = null

    private var enumEntries: Array<out Enum<*>>? = null
    private var keyEntries: Array<String>? = null
    private var fragmentManager: FragmentManager? = null
    private var defaultValueRaw: String? = null
    private var needsViewUpdate = false

    init {
        if (attrs != null) {
            val a = context.obtainStyledAttributes(attrs, R.styleable.RadioGroupPreference)
            try {
                sheetTitle = a.getString(R.styleable.RadioGroupPreference_sheetTitle)
                iconPosition = when (a.getInt(R.styleable.RadioGroupPreference_iconPosition, 0)) {
                    1 -> RadioGroupBottomSheet.IconPosition.END
                    else -> RadioGroupBottomSheet.IconPosition.START
                }
                val xmlEntries = a.getInt(R.styleable.RadioGroupPreference_indexedEntries, -1)
                if (xmlEntries > 0) entryCount = xmlEntries
                showPreviewIcon = a.getBoolean(R.styleable.RadioGroupPreference_showPreviewIcon, true)
                iconTintColor = if (a.hasValue(R.styleable.RadioGroupPreference_iconTint))
                    a.getColor(R.styleable.RadioGroupPreference_iconTint, 0) else null
                tintSheetIcons = a.getBoolean(R.styleable.RadioGroupPreference_tintSheetIcons, true)
            } finally {
                a.recycle()
            }
        }
    }

    // Common setters

    fun setFragmentManager(fm: FragmentManager) { fragmentManager = fm }
    fun getSheetTitle(): CharSequence = sheetTitle ?: title ?: ""
    fun setSheetTitle(title: CharSequence?) { sheetTitle = title }
    fun setIconPosition(position: RadioGroupBottomSheet.IconPosition) { iconPosition = position }
    fun setShowPreviewIcon(show: Boolean) { showPreviewIcon = show }
    fun setIconTint(color: Int?) { iconTintColor = color }
    fun setTintSheetIcons(tint: Boolean) { tintSheetIcons = tint }
    fun setEntryCount(count: Int) { entryCount = count; enumEntries = null; keyEntries = null }

    fun setTextProvider(provider: (Context, Int) -> CharSequence) {
        textProviderIdx = provider
        scheduleViewUpdate()
    }

    fun setIconProvider(provider: ((Context, Int) -> Drawable?)?) {
        iconProviderIdx = provider
        scheduleViewUpdate()
    }

    fun setCurrentValue(provider: () -> Int) {
        currentIdxProvider = provider
        scheduleViewUpdate()
    }

    fun setOnSelected(listener: (Int) -> Unit) {
        onSelectedIdx = listener
    }

    fun setSummaryProvider(provider: ((Context, Int) -> CharSequence?)?) {
        summaryProviderIdx = provider
        scheduleViewUpdate()
    }

    fun setVisibleProvider(provider: ((Context, Int) -> Boolean)?) {
        isVisibleProviderIdx = provider
    }

    fun setEnabledProvider(provider: ((Context, Int) -> Boolean)?) {
        isEnabledProviderIdx = provider
    }

    /**
     * Enable saving preference as Enum (internally saved with enum name rather than index)
     */
    fun <E : Enum<E>> asEnum(enumClass: Class<E>): Typed<E> {
        val entries = enumClass.enumConstants!!
        entryCount = entries.size
        enumEntries = entries
        keyEntries = null
        return Typed(this, entries)
    }

    /**
     * Create a Typed preference backed by a dynamic list with string-key persistence.
     * @param items the list of items to display
     * @param keyProvider maps each item to a unique persistence key
     */
    fun <T> asList(items: List<T>, keyProvider: (T) -> String): Typed<T> {
        val arr = @Suppress("UNCHECKED_CAST") (items.toTypedArray<Any?>() as Array<T>)
        entryCount = items.size
        enumEntries = null
        keyEntries = items.map(keyProvider).toTypedArray()
        return Typed(this, arr)
    }

    private fun persistValue(index: Int) {
        if (!isPersistent) return

        val stringKey = keyEntries?.getOrNull(index) ?: enumEntries?.getOrNull(index)?.name

        try {
            if (stringKey == null) persistInt(index)
            else persistString(stringKey)
        } catch (_: ClassCastException) {
            val prefs = preferenceManager?.sharedPreferences ?: return
            val key = key ?: return

            prefs.edit().remove(key).apply()

            if (stringKey == null) persistInt(index)
            else persistString(stringKey)
        }
    }

    @Suppress("EmptyRange")
    private fun getPersistedIndex(): Int? {
        if (!isPersistent) return null

        val prefs = preferenceManager?.sharedPreferences ?: return null
        val key = key ?: return null
        if (!prefs.contains(key)) return null

        val value = try {
            prefs.getString(key, null)
        } catch (e: ClassCastException) {
            try {
                prefs.getInt(key, Int.MIN_VALUE)
            } catch (e: ClassCastException) {
                null
            }
        }
        val ee = enumEntries
        val ke = keyEntries
        return when (value) {
            is Int -> value.takeIf { it in if (ke != null) ke.indices else if (ee != null) ee.indices else 0 until entryCount }
            is String -> {
                if (ke != null) {
                    val idx = ke.indexOf(value)
                    if (idx >= 0) idx else null
                } else if (ee == null) value.toIntOrNull()?.takeIf { it in 0 until entryCount }
                else {
                    val idx = ee.indexOfFirst { it.name == value }
                    if (idx >= 0) idx else null
                }
            }
            else -> null
        }
    }

    internal fun resolveCurrentIndex(): Int {
        return currentIdxProvider?.invoke() ?: getPersistedIndex() ?: resolveDefaultIndex()
    }

    override fun onGetDefaultValue(a: TypedArray, index: Int): Any? {
        val raw = a.getString(index)
        defaultValueRaw = raw
        return raw
    }

    override fun onSetInitialValue(defaultValue: Any?) {
        if (defaultValue is String) defaultValueRaw = defaultValue
    }

    override fun setDefaultValue(defaultValue: Any?) {
        super.setDefaultValue(defaultValue)
        defaultValueRaw = "$defaultValue"
    }

    private fun resolveDefaultIndex(): Int {
        val raw = defaultValueRaw ?: return 0
        val asInt = raw.toIntOrNull()
        if (asInt != null) return asInt.coerceIn(0, (entryCount - 1).coerceAtLeast(0))
        val ke = keyEntries; if (ke != null) {
            val idx = ke.indexOf(raw)
            return if (idx >= 0) idx else 0
        }
        val ee = enumEntries ?: return 0
        val idx = ee.indexOfFirst { it.name == raw }
        return if (idx >= 0) idx else 0
    }

    private fun resolveFragmentManager(): FragmentManager? {
        fragmentManager?.let { return it }
        var ctx = context
        while (ctx is ContextWrapper) {
            if (ctx is FragmentActivity) return ctx.supportFragmentManager
            ctx = ctx.baseContext
        }
        return null
    }

    private fun resolveIconTint(): Int = iconTintColor ?: defaultIconTint

    private fun applyTint(drawable: Drawable) {
        drawable.colorFilter = PorterDuffColorFilter(resolveIconTint(), PorterDuff.Mode.SRC_IN)
    }

    private fun scheduleViewUpdate() {
        if (isAttached) {
            updatePreferenceView()
        } else {
            needsViewUpdate = true
        }
    }

    private val isAttached: Boolean
        get() = preferenceManager != null

    override fun onAttachedToHierarchy(preferenceManager: PreferenceManager) {
        super.onAttachedToHierarchy(preferenceManager)
        if (needsViewUpdate || (showPreviewIcon && iconProviderIdx != null)) {
            needsViewUpdate = false
            updatePreferenceView()
        }
    }

    fun updatePreferenceView() {
        val ctx = context
        val idx = resolveCurrentIndex()
        summary = summaryProviderIdx?.invoke(ctx, idx) ?: textProviderIdx?.invoke(ctx, idx)
        if (showPreviewIcon) {
            icon = iconProviderIdx?.invoke(ctx, idx)?.also { applyTint(it) }
        }
    }

    override fun onClick() {
        val fm = resolveFragmentManager() ?: return
        val ctx = context
        val tp = textProviderIdx ?: { _: Context, i: Int -> i.toString() }
        val currentIdx = resolveCurrentIndex()

        val sheet = RadioGroupBottomSheet()
        sheet.configure(
            title = getSheetTitle(),
            entryCount = entryCount,
            iconPosition = iconPosition,
            currentIndex = currentIdx,
            textProvider = { i -> tp(ctx, i) },
            iconProvider = iconProviderIdx?.let { p -> { i -> p(ctx, i) } },
            iconTint = if (tintSheetIcons) resolveIconTint() else null,
            isVisibleProvider = isVisibleProviderIdx?.let { p -> { i -> p(ctx, i) } },
            isEnabledProvider = isEnabledProviderIdx?.let { p -> { i -> p(ctx, i) } },
            listener = RadioGroupBottomSheet.OnItemSelectedListener { index ->
                if (!callChangeListener(index)) return@OnItemSelectedListener
                persistValue(index)
                onSelectedIdx?.invoke(index)
                updatePreferenceView()
            }
        )
        sheet.show(fm, RadioGroupBottomSheet.TAG)
    }

    class Typed<T> internal constructor(
        val preference: RadioGroupPreference,
        private val entries: Array<T>
    ) {
        private fun toIndex(value: T): Int = if (value is Enum<*>) value.ordinal else entries.indexOf(value)
        fun setDefaultValue(value: T) = preference.setDefaultValue(value)
        fun updatePreferenceView() = preference.updatePreferenceView()

        fun setTextProvider(provider: (Context, T) -> CharSequence) {
            preference.textProviderIdx = { ctx, i -> provider(ctx, entries[i]) }
            preference.scheduleViewUpdate()
        }

        fun setIconProvider(provider: ((Context, T) -> Drawable?)?) {
            preference.iconProviderIdx = provider?.let { p -> { ctx, i -> p(ctx, entries[i]) } }
            preference.scheduleViewUpdate()
        }

        fun setCurrentValue(provider: () -> T) {
            preference.currentIdxProvider = { toIndex(provider()).coerceAtLeast(0) }
            preference.scheduleViewUpdate()
        }

        fun setOnSelected(listener: (T) -> Unit) {
            preference.onSelectedIdx = { i -> listener(entries[i]) }
        }

        fun setSummaryProvider(provider: ((Context, T) -> CharSequence?)?) {
            preference.summaryProviderIdx = provider?.let { p -> { ctx, i -> p(ctx, entries[i]) } }
            preference.scheduleViewUpdate()
        }

        fun setVisibleProvider(provider: ((Context, T) -> Boolean)?) {
            preference.isVisibleProviderIdx = provider?.let { p -> { ctx, i -> p(ctx, entries[i]) } }
        }

        fun setEnabledProvider(provider: ((Context, T) -> Boolean)?) {
            preference.isEnabledProviderIdx = provider?.let { p -> { ctx, i -> p(ctx, entries[i]) } }
        }

        fun setOnPreferenceChangeListener(listener: ((T?) -> Boolean)?) {
            preference.onPreferenceChangeListener = listener?.let { l -> OnPreferenceChangeListener {
                _, i ->  l((i as? Int)?.let { entries[i] }) }
            }
        }
    }
}
