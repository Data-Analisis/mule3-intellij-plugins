package com.github.karnilaev.mule3intellijplugins.services

import com.github.karnilaev.mule3intellijplugins.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
