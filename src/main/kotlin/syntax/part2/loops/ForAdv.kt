fun main() {
    val allStudents1 = listOf("Beibut","Azat","Dias","Nurbek","Dauren")
    allStudents1.forEach{
        print(it)
    }

    val allStudents2 = listOf("Beibut","Azat","Dias","Nurbek","Dauren")
    allStudents2.forEachIndexed{ index, item ->
        println("$index : $item")
    }
}