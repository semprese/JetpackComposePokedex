package com.bignerdranch.android.jetpackcomposepokedex.data.remote.responces

data class HeldItem(
    val item: Item,
    val version_details: List<VersionDetail>
)