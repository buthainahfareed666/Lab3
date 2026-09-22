package com.example.lab3task1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab3task1.ui.theme.Lab3Task1Theme


data class Student(
    val name: String,
    val program: String,
    val gpa: String,
    val email: String,
    val city: String
)


@Composable
fun StudentCard(
    student: Student,
    modifier: Modifier = Modifier
) {
    // TODO: Task 2 fills this in
}


@Preview(showBackground = true)
@Composable
private fun StudentCardPreview() {
    Lab3Task1Theme {
        StudentCard(
            student = Student(
                name = "Buthainah Fareed",
                program = "Computer Science",
                gpa = "4.5",
                email = "student@iau.edu.sa",
                city = "Jubail"
            )
        )
    }
}