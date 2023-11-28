package com.example.newpro

data class Story (
    val profile: Int,
    val name: String,
    val image: Int,
    val like: String,
    val content: String,
    val comment: String,
    val day: String,

)
data class Profile (
    val profile: Int,
    val name: String,
)

object DataProvider {
    val storyList = listOf(
        Story(R.drawable.yeon,"kimmatchess", R.drawable.feed,"승연 님 외 여러 명이 좋아합니다." ,"내용입니다!", "댓글 36개 모두 보기", "2시간 전"),
        Story(R.drawable.yeon,"iias_flk;", R.drawable.feed, "하이 님 외 여러 명이 좋아합니다." ,"내용입니다!", "댓글 100개 모두 보기", "10시간 전"),
        Story(R.drawable.yeon,"tdf_sasdf", R.drawable.feed, "상진 님 외 여러 명이 좋아합니다." ,"내용입니다!", "댓글 50개 모두 보기", "5시간 전"),
        Story(R.drawable.yeon,"lkgjsf_Dd", R.drawable.feed, "윤성 님 외 여러 명이 좋아합니다." ,"내용입니다!", "댓글 76개 모두 보기", "3일 전"),
        Story(R.drawable.yeon,"dapoj_df", R.drawable.feed, "와악 님 외 여러 명이 좋아합니다." ,"내용입니다!", "댓글 1개 모두 보기", "5일 전"),
        Story(R.drawable.yeon,"hlkd_df", R.drawable.feed, "랄라 님 외 여러 명이 좋아합니다." ,"내용입니다!", "댓글 3개 모두 보기", "10일 전"),
    )
    val profileList = listOf(
        Profile(R.drawable.yeon, "kim"),
        Profile(R.drawable.yeon, "dlkjf_Dd"),
        Profile(R.drawable.yeon,"klj;l_df"),
        Profile(R.drawable.yeon,"곽상진"),
        Profile(R.drawable.yeon,"승연"),
    )
}


