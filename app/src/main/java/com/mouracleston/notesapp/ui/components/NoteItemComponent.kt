package com.mouracleston.notesapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteItemComponent(title: String, onItemClick: () -> Unit) {
    Card(
        onClick = onItemClick,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(text = title, modifier = Modifier.padding(10.dp))
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun NoteItemComponentPreview() {
    Column(modifier = Modifier.fillMaxSize().padding(horizontal = 20.dp)) {
        NoteItemComponent("Sample", {})
    }
}