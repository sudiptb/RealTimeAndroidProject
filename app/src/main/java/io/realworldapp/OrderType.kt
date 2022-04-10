package io.realworldapp

sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()
}
