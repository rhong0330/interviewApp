package com.example.myapplication.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.presentation.viewmodel.UserViewModel

@Composable
fun UserScreen(viewModel: UserViewModel = hiltViewModel()) {
    val users by viewModel.users.collectAsState()


    Column {
        Text(text = "User List", style = MaterialTheme.typography.headlineSmall, modifier = Modifier.padding(16.dp))
    }

    LazyColumn {
        items(users, key = { it.url }) { user ->
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
                Column {
                    Text(text = user.name, style = MaterialTheme.typography.headlineSmall)
                    Text(text = user.birth_year, style = MaterialTheme.typography.headlineSmall)
                }
            }

        }
    }

}