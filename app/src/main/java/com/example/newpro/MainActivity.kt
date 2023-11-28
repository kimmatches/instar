@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.example.newpro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.BottomAppBar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newpro.ui.theme.NewproTheme
import androidx.compose.material3.TopAppBar as TopAppBar
import com.example.newpro.Instarstory as Instarstory


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewproTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
//                        Instarstory()
//                        Instar_Feed()
                        Instar_Bottom()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Instarstory() {
    val profiles = remember { DataProvider.profileList}
    Box(
        modifier = Modifier
            .fillMaxWidth(),
    ){
        LazyRow(
            modifier = Modifier
            ,
            horizontalArrangement = Arrangement.spacedBy(10.dp, alignment = Alignment.CenterHorizontally),
            contentPadding = PaddingValues(horizontal = 10.dp), // 가로는 horizontal , 세로는 var

            //간격 주면서 센터
        ){
            items(
                items = profiles,
                itemContent =  {ProfileListItem(it) }
            )

//            items(profile){
//                var isClick by rememberSaveable {
//                    mutableStateOf(false)
//                }
//                var borderColor = if(isClick) Color.Gray else Color.Red
//                Image(
//                    modifier = Modifier
//                        .padding(30.dp)
//                        .size(80.dp)
//                        .clip(CircleShape) //동그라미
//                        .border(
//                            width = 3.dp,
//                            color = borderColor,
//                            shape = CircleShape,
//                        )
//                        .clickable {
////                            onClick()
//                            isClick = true
////                            Toast.makeText(this, "토스트 메세지 띄우기 입니다.", Toast.LENGTH_SHORT).show()
//                            Log.d("test", "click")
//
//
//                        },
//
////                    imageVector = ImageVector.vectorResource(id = it),
//                    contentDescription = null,
//                    contentScale = ContentScale.Crop,
//
//
//                    )
//            }
//
        }
    }

}

@Composable
fun ProfileListItem(profile: Profile) {
    Column(

    ){
        Image(
            modifier = Modifier
                .padding(10.dp)
                .size(70.dp)
                .clip(CircleShape) //동그라미
                .border(
                    width = 3.dp,
                    color = Color.Red,
//                    color = borderColor,
                    shape = CircleShape,
                ),
//                        .clickable {
////                            onClick()
//                            isClick = true
////                            Toast.makeText(this, "토스트 메세지 띄우기 입니다.", Toast.LENGTH_SHORT).show()
//                            Log.d("test", "click")
//
//
//                        },
            painter = painterResource(id = profile.profile),
            contentDescription = null,
        )
        Text(
            modifier = Modifier
                .padding(start = 35.dp),
            text = profile.name,
            fontSize = 9.sp,)

    }



}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Instar_Bottom() {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
    Scaffold(
        modifier = Modifier
//            .nestedScroll(scrollBehavior.nestedScrollConnection)
            .fillMaxSize()
            .height(10.dp),
        topBar = { TopAppBar(
                title = {
                    Row (
                        modifier = Modifier,
                        verticalAlignment = Alignment.CenterVertically, // 가운데 정렬
                    ){
                        Image(
                            modifier = Modifier,
                            painter = painterResource(id = R.drawable.logo),
                            contentDescription = "로드 불가"
                        )
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.Edit,
                                contentDescription = "Localized description",
                            )
                        }

            //                        Text(
            //                            text = ""
            //                        )
                    }
                },
                actions = {
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.Edit,
                                contentDescription = "Localized description",
                            )
                        }
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.Edit,
                                contentDescription = "Localized description",
                            )
                        }
                },
            modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection)
            )
        },
        bottomBar = {
            BottomAppBar(
                actions = {
                          Row(
                              modifier = Modifier
                                  .fillMaxWidth(),
//                              verticalAlignment = Alignment.CenterVertically, // 가운데 정렬/
                              horizontalArrangement = Arrangement.SpaceBetween

                          ){
                              IconButton(onClick = { /* do something */ }) {
                                  Icon(Icons.Filled.Check, contentDescription = "Localized description")
                              }
                              IconButton(onClick = { /* do something */ }) {
                                  Icon(
                                      Icons.Filled.Edit,
                                      contentDescription = "Localized description",
                                  )
                              }
                              IconButton(onClick = { /* do something */ }) {
                                  Icon(
                                      Icons.Filled.Edit,
                                      contentDescription = "Localized description",
                                  )
                              }
                              IconButton(onClick = { /* do something */ }) {
                                  Icon(
                                      Icons.Filled.Edit,
                                      contentDescription = "Localized description",
                                  )
                              }
                              IconButton(onClick = { /* do something */ }) {
                                  Icon(
                                      Icons.Filled.Edit,
                                      contentDescription = "Localized description",
                                  )
                              }
                          }

                },
            )
        },
//        scrollBehavior = scrollBehavior

        )
    { innerPadding ->Instar_Feed(innerPadding)
    }
}



//@Preview(showBackground = true)
@Composable
fun Instar_Feed(innerPadding: PaddingValues) {
    val storys = remember { DataProvider.storyList}
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(innerPadding),
    ) {
           LazyColumn (
               modifier = Modifier
           ){
               item {
                   Instarstory()
               }
               items(
                   items = storys,
                   itemContent =  {StoryListItem(it) }
               )



           }


    }

}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StoryListItem(story: Story) {
    Row (
    modifier = Modifier
        .padding(top = 10.dp)
        .height(40.dp)
        .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically, // 가운데 정렬
        horizontalArrangement = Arrangement.SpaceBetween

    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(30.dp)
                    .clip(CircleShape) //동그라미
                    .border(
                        width = 3.dp,
                        color = Color.Red,
                        //                    color = borderColor,
                        shape = CircleShape,
                    ),
                painter = painterResource(id = story.profile),
                contentDescription = "로드 불가"
            )
            Text(

                text = story.name
            )

        }
        Icon(
            Icons.Filled.Edit,
            contentDescription = "Localized description",
        )
    }

    Image(
        modifier = Modifier
            .height(400.dp),
        painter = painterResource(id = story.image),
        contentDescription = "로드 불가"
    )

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(30.dp),
//            .padding(top = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween

    ){
       Row(){
           IconButton(onClick = { /* do something */ }) {
               Icon(
                   Icons.Filled.Edit,
                   contentDescription = "Localized description",
               )
           }
           IconButton(onClick = { /* do something */ }) {
               Icon(
                   Icons.Filled.Edit,
                   contentDescription = "Localized description",
               )
           }
           IconButton(onClick = { /* do something */ }) {
               Icon(
                   Icons.Filled.Edit,
                   contentDescription = "Localized description",
               )
           }
       }
        IconButton(onClick = { /* do something */ }) {
            Icon(
                Icons.Filled.Edit,
                contentDescription = "Localized description",
            )
        }
    }
    Text(text = story.like, fontWeight = FontWeight.Bold)
    Text(text = story.content)
    Text(
        text = story.comment,
        color = Color.Gray,
        fontSize = 11.sp,
    )
    Text(
        modifier = Modifier
            .padding(bottom = 10.dp),
        text = story.day,
        color = Color.Gray,
        fontSize = 9.sp,

    )


}





