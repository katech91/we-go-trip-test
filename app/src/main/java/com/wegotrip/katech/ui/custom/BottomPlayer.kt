package com.wegotrip.katech.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.shape.MaterialShapeDrawable
import com.wegotrip.katech.R

class BottomPlayer @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): ConstraintLayout(context, attrs, defStyleAttr) {

    init {
        val view = View.inflate(context, R.layout.layout_bottom_player, this)

        val materialBg = MaterialShapeDrawable.createWithElevationOverlay(context)
    }
}