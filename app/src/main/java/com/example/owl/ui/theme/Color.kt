
package com.example.owl.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver

val yellow200 = Color(4289972442)
val yellow400 = Color(4282197858)
val yellow500 = Color(4287058613)
val yellowDarkPrimary = Color(0xff1c1d24)

val blue200 = Color(0xff91a4fc)
val blue700 = Color(0xff0336ff)
val blue800 = Color(0xff0035c9)
val blueDarkPrimary = Color(0xff1c1d24)

val pink200 = Color(0xffff7597)
val pink500 = Color(0xffff0266)
val pink600 = Color(0xffd8004d)
val pinkDarkPrimary = Color(0xff24191c)


@Composable
fun Colors.compositedOnSurface(alpha: Float): Color {
    return onSurface.copy(alpha = alpha).compositeOver(surface)
}
