package io.realworldapp

import java.text.SimpleDateFormat
import java.util.*

fun main() {

    val totalPoint = mutableListOf<Int>()
    val totalRent = mutableListOf<Int>()

    reportList.forEach {
        totalPoint.add(it.point)
        it.otherList?.first()?.rent?.let { it1 -> totalRent.add(it1) }
    }

    println("Total point is ${totalPoint.sum()}")
    println("Total rent is ${totalRent.sum()}")

    val sdf = SimpleDateFormat("dd MMM, yyyy - HH:mm a", Locale.getDefault())
    val currentDate = sdf.format(Date())
    println("current date is $currentDate")

}

data class Report(
    val id: Int? = null,
    val name: String? = null,
    val point: Int = 0,
    val otherList: List<Other>? = emptyList()
)

data class Other(
    val tax: Int? = null,
    val rent: Int? = null
)

val reportList = listOf(
    Report(
        1, "Sudipto", 8, listOf(
            Other(2, 400)
        )
    ),
    Report(
        1, "Sudipto", 8, listOf(
            Other(2)
        )
    ),
    Report(
        1, "Sudipto", 8, listOf(
            Other(2, 400)
        )
    ),
    Report(
        1, "Sudipto", 8, listOf(
            Other(2, 400)
        )
    ),
    Report(
        1, "Sudipto", 8, listOf(
            Other(2, 400)
        )
    ),
    Report(
        1, "Sudipto", 8, listOf(
            Other(2, 400)
        )
    )
)