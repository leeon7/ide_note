package com.github.leeon7.idenote.services

import com.intellij.openapi.project.Project
import com.github.leeon7.idenote.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
