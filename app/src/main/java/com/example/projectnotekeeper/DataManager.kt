package com.example.projectnotekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init{
        initializeCourses()
        initializeNotes()
    }



    private fun initializeCourses(){
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", courseTitle = "Android  async programming and services")
        courses.set(course.courseId, course)

        course= CourseInfo(courseTitle = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamentals: The core platform")
        courses.set(course.courseId, course)

    }

    private fun initializeNotes() {
        var noteCourse  = CourseInfo("android_intents", "Android Programming with Intents")
        var note = NoteInfo(noteCourse, "Dynamic intent resolution",
            "Wow, intents allow components to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(noteCourse, "Delegating intents",
            "PendingIntents are powerful; they delegate much more than just a component invocation")
        notes.add(note)

        noteCourse = CourseInfo(courseId="android_sync", courseTitle = "Android Sync Programming and servcies")
        note = NoteInfo(noteCourse, "Service default threads",
            "Did you know that by default an Android Service will tie up the UI thread?")
        notes.add(note)
        note = NoteInfo(noteCourse, "Long running operations",
            "Foreground Services can be tied to a notification icon")
        notes.add(note)

        noteCourse = CourseInfo(courseTitle = "Java Fundamentals: The Java Language", courseId = "java_lang")
        note = NoteInfo(noteCourse, "Parameters",
            "Leverage variable-length parameter lists")
        notes.add(note)
        note = NoteInfo(noteCourse, "Anonymous classes",
            "Anonymous classes simplify implementing one-use types")
        notes.add(note)

        noteCourse = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        note = NoteInfo(noteCourse, "Compiler options",
            "The -jar option isn't compatible with with the -cp option")
        notes.add(note)
        note = NoteInfo(noteCourse, "Serialization",
            "Remember to include SerialVersionUID to assure version compatibility")
        notes.add(note)
    }

}