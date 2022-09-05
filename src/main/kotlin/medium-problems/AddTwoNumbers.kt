data class ListNode(val data: Int, var next: ListNode? = null)

class AddTwoNumbers {
    private var remainder = 0

    fun add(l1: ListNode?, l2: ListNode?): ListNode {
        val l1Value = l1?.data ?: 0
        val l2Value = l2?.data ?: 0
        val sum = l1Value.plus(l2Value).plus(remainder)
        val mod = sum % 10
        remainder = sum / 10
        val listNode = ListNode(mod)
        if (l1?.next == null && l2?.next == null) {
            if (remainder > 0) listNode.next = ListNode(remainder)
            return listNode
        }
        if (l1?.next == null) {
            listNode.next = add(null, l2?.next)
        } else if (l2?.next == null) {
            listNode.next = add(l1.next, null)
        } else {
            listNode.next = add(l1.next, l2.next)
        }
        return listNode
    }
}

object MockData {
    fun getListNode1(): ListNode =
        ListNode(
            9,
            next = ListNode(
                9,
                next = ListNode(
                    9,
                    next = ListNode(
                        9,
                        next = ListNode(
                            9,
                            next = ListNode(
                                9,
                                next = ListNode(9)
                            )
                        )
                    )
                )
            )
        )

    fun getListNode2(): ListNode =
        ListNode(
            9,
            next = ListNode(
                9,
                next = ListNode(
                    9,
                    next = ListNode(
                        9
                    )
                )
            )
        )
}
