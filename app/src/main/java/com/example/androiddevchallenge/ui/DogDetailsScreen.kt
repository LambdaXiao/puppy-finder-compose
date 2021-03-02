/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Dog

@Composable
fun DogDetails(dog: Dog, onAdopt: (Dog) -> Unit = {}) {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box {
            Image(
                painterResource(dog.picture),
                "Dog picture: ${dog.name}",
                Modifier.aspectRatio(1f),
                contentScale = ContentScale.Crop
            )
            Button(
                { onAdopt(dog) },
                Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp)
            ) {
                Text(text = "Adopt")
            }
        }
        Column(Modifier.padding(16.dp, 8.dp)) {
            Text("Name: ${dog.name}", style = MaterialTheme.typography.h4)
            ProvideTextStyle(MaterialTheme.typography.h6) {
                Text("Breed: ${dog.breed}")
                Text("Location: ${dog.location}")
                Text("Age: ${dog.age}")
                Text("Gender: ${dog.gender}")
                Text("Size: ${dog.size}")
            }
        }
    }
}
