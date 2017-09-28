package com.yshr.ctcf_chapter5_seniorfunction

/**
 * Created by yshr on 2017/9/27.
 * 尾递归 关键字tailrec 递归的特殊形式 可以优化 防止java.lang.StackOverflowError
 */
data class ListNode(val value: Int, var next: ListNode? = null)

tailrec fun findListNode(head: ListNode?, value: Int): ListNode? {

    head ?: return null
    if (head?.value == value) return head
    return findListNode(head.next, value)
}

fun factorial(n: Long): Long {
    return n * factorial(n - 1)
}

data class TreeNode(val value: Int) {
    val left: TreeNode? = null
    val right: TreeNode? = null
}

fun findTreeNode(root: TreeNode?, value: Int): TreeNode? {
    root ?: return null
    if (root.value == value) return root
    return findTreeNode(root.left, value) ?: return findTreeNode(root.right, value)

}

fun main(args: Array<String>) {
//    println(factorial(5))
    val MAX_NODE_COUNT = 10000
    val head = ListNode(0)
    var p = head
    for (i in 1..MAX_NODE_COUNT) {
        p.next = ListNode(i)
        p = p.next!!
    }
    println(findListNode(head, MAX_NODE_COUNT - 2)?.value)
}