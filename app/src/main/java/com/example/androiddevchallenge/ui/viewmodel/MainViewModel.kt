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
package com.example.androiddevchallenge.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.R

class MainViewModel : ViewModel() {
    val dogs by mutableStateOf(
        listOf(
            Dog(
                "Alaskan Klee Kai", "Pit Bull Terrier Mix", "Sunnyvale, CA",
                "Adult", "Female", "Large", R.drawable.alaskan_klee_kai
            ),
            Dog(
                "Bernedoodle", "Terrier Mix", "Sunnyvale, CA",
                "Young", "Female", "Medium", R.drawable.bernedoodle
            ),
            Dog(
                "Cavachon", "American Staffordshire Terrier Mix", "Sunnyvale, CA",
                "Adult", "Male", "Large", R.drawable.cavachon
            ),
            Dog(
                "Dorkie", "Chihuahua Mix", "Mountain View, CA",
                "Young", "Male", "Small", R.drawable.dorkie
            ),
            Dog(
                "Eurasier", "Mountain Dog & Shepherd Mix", "Sunnyvale, CA",
                "Puppy", "Female", "Medium", R.drawable.eurasier
            ),
            Dog(
                "French Bullhuahua", "Mountain Dog & Shepherd Mix", "Sunnyvale, CA",
                "Puppy", "Male", "Medium", R.drawable.french_bullhuahua
            ),
            Dog(
                "Golden Retriever Corgi",
                "Border Collie & German Shepherd Dog Mix",
                "Los Altos, CA",
                "Young",
                "Male",
                "Medium",
                R.drawable.golden_retriever_corgi
            ),
            Dog(
                "Horgi", "Chihuahua & Rat Terrier Mix", "Santa Clara, CA",
                "Young", "Male", "Medium", R.drawable.horgi
            ),
            Dog(
                "Icelandic Sheepdog", "Chihuahua & Terrier Mix", "Santa Clara, CA",
                "Young", "Female", "Medium", R.drawable.icelandic_sheepdog
            ),
            Dog(
                "Jack Chi", "Pit Bull Terrier Mix", "Santa Clara, CA",
                "Adult", "Female", "Large", R.drawable.jack_chi
            ),
            Dog(
                "Kishu Ken", "Pit Bull Terrier", "Santa Clara, CA",
                "Young", "Female", "Medium", R.drawable.kishu_ken
            ),
        )
    )

    var currentDog: Dog? by mutableStateOf(null)

    fun showDog(dog: Dog) {
        currentDog = dog
    }

    fun closeDog() {
        currentDog = null
    }
}
