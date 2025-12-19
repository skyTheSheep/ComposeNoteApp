package com.skyyeoh.composenoteapp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.skyyeoh.composenoteapp.model.Note
import java.time.format.DateTimeFormatter

@Composable
fun NoteInputText(
    modifier: Modifier = Modifier,
    text: String,
    label: String,
    maxLine: Int = 1,
    onTextChange: (String) -> Unit,
    onImeAction: () -> Unit = {}
) {
    val keyboardController = LocalSoftwareKeyboardController.current

     TextField(
         value = text,
         onValueChange = onTextChange,
         colors = TextFieldDefaults.colors(
             focusedContainerColor = Color.Transparent,
             unfocusedContainerColor = Color.Transparent,
             disabledContainerColor = Color.Transparent,
             errorContainerColor = Color.Transparent
         ),
         maxLines = maxLine,
         label = { Text(text = label) },
         keyboardOptions = KeyboardOptions.Default.copy(
             imeAction = ImeAction.Done
         ),
         keyboardActions = KeyboardActions(onDone = {
             onImeAction()
             keyboardController?.hide()
         }),
         modifier = modifier
     )
}

@Composable
fun NoteButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    enabled: Boolean = true
) {
    Button(onClick = onClick,
        shape = CircleShape,
        enabled = enabled,
        modifier = modifier) {
        Text(text)
    }

}