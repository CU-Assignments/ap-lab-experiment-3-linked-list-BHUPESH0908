class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def delete_middle_node(head: ListNode) -> ListNode:
    # Edge case: If there's only one node, return None
    if not head or not head.next:
        return None
    
    # Initialize slow and fast pointers
    slow = head
    fast = head
    prev = None
    
    # Move fast pointer by two steps and slow pointer by one step
    while fast and fast.next:
        fast = fast.next.next
        prev = slow
        slow = slow.next
    
    # Remove the middle node
    if prev:
        prev.next = slow.next
    
    return head

# Helper function to create a linked list from a list
def create_linked_list(values):
    head = ListNode(values[0])
    current = head
    for value in values[1:]:
        current.next = ListNode(value)
        current = current.next
    return head

# Helper function to print a linked list
def print_linked_list(head):
    current = head
    while current:
        print(current.val, end=" -> ")
        current = current.next
    print("None")

# Example Input: [1, 3, 4, 7, 1, 2, 6]
head = create_linked_list([1, 3, 4, 7, 1, 2, 6])

# Delete middle node
new_head = delete_middle_node(head)

# Output: [1, 3, 4, 1, 2, 6]
print_linked_list(new_head)
