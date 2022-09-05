package `medium-problems`

import AddTwoNumbers
import ListNode
import org.junit.Assert.assertEquals
import org.junit.Test

class AddTwoNumbersTest {

    private val addTwoNumbers = AddTwoNumbers()

    @Test
    fun `add two numbers with same number of nodes`() {
        val listNode1 = ListNode(9)
        val listNode2 = ListNode(9)
        val expectedResult = ListNode(8, next = ListNode(1))

        val actualResult = addTwoNumbers.add(listNode1, listNode2)

        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `add two numbers with first node values greater than second node`() {
        val listNode1 = ListNode(9, next = ListNode(1))
        val listNode2 = ListNode(9)
        val expectedResult = ListNode(8, next = ListNode(2))

        val actualResult = addTwoNumbers.add(listNode1, listNode2)

        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `add two numbers with second node values greater than first node`() {
        val listNode1 = ListNode(2, next = ListNode(1))
        val listNode2 = ListNode(3, next = ListNode(5, next = ListNode(6)))
        val expectedResult = ListNode(5, next = ListNode(6, next = ListNode(6)))

        val actualResult = addTwoNumbers.add(listNode1, listNode2)

        assertEquals(expectedResult, actualResult)
    }
}