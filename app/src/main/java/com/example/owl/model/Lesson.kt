package com.example.owl.model

import androidx.compose.runtime.Immutable

@Immutable
data class Lesson(
    val title: String,
    val formattedStepNumber: String,
    val length: String,
    val imageUrl: String,
    val imageContentDescription: String = ""
)

/**
  fake data
 */
object LessonsRepo {
    fun getLessons(@Suppress("UNUSED_PARAMETER") courseId: Long) = lessons
}

val lessons = listOf(
    Lesson(
        title = "An introduction to  Psychology",
        formattedStepNumber = "01",
        length = "4:14",
        imageUrl = "https://i.ytimg.com/vi/vo4pMVb0R6M/maxresdefault.jpg"
    ),
    Lesson(
        title = "Expression",
        formattedStepNumber = "02",
        length = "7:28",
        imageUrl = "https://www.verywellmind.com/thmb/QF9LKy3pE-dfW1RtGmqd_EZ-thQ=/500x350/filters:no_upscale():max_bytes(150000):strip_icc()/feel-better-by-smiling-logo-38ff063629564404b4cc5b01b1c9fb17.png"
    ),
    Lesson(
        title = "Composition and the Urban Canvas",
        formattedStepNumber = "03",
        length = "3:43",
        imageUrl = "https://images.unsplash.com/photo-1494616150024-f6040d5220c0"
    ),
    Lesson(
        title = "Lighting Techniques and Aesthetics",
        formattedStepNumber = "04",
        length = "4:45",
        imageUrl = "https://images.unsplash.com/photo-1544980944-0bf2ec0063ef"
    ),
    Lesson(
        title = "Special Effects",
        formattedStepNumber = "05",
        length = "6:19",
        imageUrl = "https://images.unsplash.com/photo-1508521049563-61d4bb00b270"
    ),
    Lesson(
        title = "Techniques with Structures",
        formattedStepNumber = "06",
        length = "9:41",
        imageUrl = "https://images.unsplash.com/photo-1479839672679-a46483c0e7c8"
    ),
    Lesson(
        title = "Deep Focus Using a Camera Dolly",
        formattedStepNumber = "07",
        length = "4:43",
        imageUrl = "https://images.unsplash.com/photo-1495854245347-f3936493f799"
    ),
    Lesson(
        title = "Point of View Shots with Structures",
        formattedStepNumber = "08",
        length = "9:41",
        imageUrl = "https://images.unsplash.com/photo-1534971710649-2f97e5f98bc4"
    ),
    Lesson(
        title = "Photojournalism: Street Art",
        formattedStepNumber = "09",
        length = "9:41",
        imageUrl = "https://images.unsplash.com/photo-1453814235491-3cfac3999928"
    )
)
