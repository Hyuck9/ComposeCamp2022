package com.codelabs.basicstatecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun WellnessTasksList(
	list: List<WellnessTask>,
	onCloseTask: (WellnessTask) -> Unit,
	modifier: Modifier = Modifier
) {
	LazyColumn(
		modifier = modifier
	) {
		items(list) { task ->
			WellnessTaskItem(
				taskName = task.label,
				onClose = { onCloseTask(task) }
			)
		}
	}
}