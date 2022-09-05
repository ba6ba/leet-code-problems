class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    var remainder = 0
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode {
        val l1Value = l1?.`val` ?: 0
        val l2Value = l2?.`val` ?: 0
        val sum = l1Value.plus(l2Value).plus(remainder)
        val mod = sum % 10
        remainder = sum / 10
        val listNode = ListNode(mod)
        if (l1?.next == null && l2?.next == null) {
            if (remainder > 0) listNode.next = ListNode(remainder)
            return listNode
        }
        if (l1?.next == null) {
            listNode.next = addTwoNumbers(null, l2?.next)
        } else if (l2?.next == null) {
            listNode.next = addTwoNumbers(l1.next, null)
        } else {
            listNode.next = addTwoNumbers(l1.next, l2.next)
        }
        return listNode
    }
}

fun main(args: Array<String>) {
    val l1 = ListNode(9)
    l1.next = ListNode(9)
    l1.next?.next = ListNode(9)
    l1.next?.next?.next = ListNode(9)
    l1.next?.next?.next?.next = ListNode(9)
    l1.next?.next?.next?.next?.next = ListNode(9)
    l1.next?.next?.next?.next?.next?.next = ListNode(9)

    val l2 = ListNode(9)
    l2.next = ListNode(9)
    l2.next?.next = ListNode(9)
    l2.next?.next?.next = ListNode(9)
    val resultNode = Solution().addTwoNumbers(l1, l2)
    println(resultNode)
}