package com.aman.model

import kotlinx.serialization.Serializable


@Serializable
data class Fruit(
    val name:String,
    val season:String,
    val type: Type,
    val image:String
)