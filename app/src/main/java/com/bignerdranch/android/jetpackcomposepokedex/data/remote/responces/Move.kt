package com.bignerdranch.android.jetpackcomposepokedex.data.remote.responces

data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)