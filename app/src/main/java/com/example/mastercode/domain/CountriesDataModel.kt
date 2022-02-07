package com.example.mastercode.domain

data class CountriesDataModel(
    val name: Name?,
    val region: String?,
    val capital: List<String>?,
    val flags: List<String>?,
    val borders: List<String>?
    )

data class Name(
    val official: String?
)

