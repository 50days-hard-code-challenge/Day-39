def detectCycle(head) :
    # Write your code here.
    slow=head
    fast=head
    while fast.next!=None and fast.next.next!=None:
        slow=slow.next
        fast=fast.next.next
        if slow==fast:
            return 1
        
    return 0
    pass
