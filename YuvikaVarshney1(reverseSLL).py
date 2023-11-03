def reverseLinkedList(head):
    # write your code here
    nex=head
    temp=head
    temp=None
    while head.next!=None:
        nex=nex.next
        head.next=temp
        temp=head
        head=nex
    head.next=temp
    return head
    pass
