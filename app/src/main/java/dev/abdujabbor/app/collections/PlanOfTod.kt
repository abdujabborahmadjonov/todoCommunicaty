package dev.abdujabbor.app.collections

import dev.abdujabbor.app.R
import dev.abdujabbor.app.activities.ToDoList


class TodoPlan {
    var name:String = ""
    var description:String=""
    var degree:User? = null
    var createData = ""
    var dedline = ""
    var level:String = ""


    constructor(name: String, description: String, degree: User, createData: String, dedline: String, level: String) {
        this.name = name
        this.description = description
        this.degree = degree
        this.createData = createData
        this.dedline = dedline
        this.level = level
    }

    constructor()

    override fun toString(): String {
        return "TodoPlan(name='$name', description='$description', degree='$degree', createData='$createData', dedline='$dedline', level='$level')"
    }


}

object PlanObject{
    var toDoPlanList = ArrayList<TodoPlan>()
}