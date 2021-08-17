package com.example.projectnotekeeper

data class CourseInfo(val courseId:String, val courseTitle:String) {
    override fun toString(): String {
        return courseTitle
    }
}


data class NoteInfo(var noteCourse:CourseInfo, var noteTitle:String, var noteText:String)