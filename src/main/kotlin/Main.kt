import `medium-problems`.ReorderDataInLogFiles

fun main(args: Array<String>) {
    val addTwoNumbers = AddTwoNumbers()
    val resultNode = addTwoNumbers.add(MockData.getListNode1(), MockData.getListNode2())
    println(resultNode)

    val reorderDataInLogFiles = ReorderDataInLogFiles()
    val result = reorderDataInLogFiles.reorderLogFiles(ReorderDataInLogFiles.getArray())
    println(result)
}