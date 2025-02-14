class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverse_linked_list(head: ListNode) -> ListNode:
    prev = None
    curr = head
    
    while curr:
        next_node = curr.next  # Store next node
        curr.next = prev       # Reverse current node's pointer
        prev = curr            # Move prev and curr one step forward
        curr = next_node
    
    return prev

def create_linked_list(values):
    head = ListNode(values[0])
    current = head
    for value in values[1:]:
        current.next = ListNode(value)
        current = current.next
    return head

def print_linked_list(head):
    current = head
    while current:
        print(current.val, end=" -> ")
        current = current.next
    print("None")

head = create_linked_list([1, 2, 3, 4, 5])

reversed_head = reverse_linked_list(head)

print_linked_list(reversed_head)
