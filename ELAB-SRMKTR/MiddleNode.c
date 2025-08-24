// LinkedList Elab

// #include <stdio.h>
// #include<stdlib.h>
// struct node{
//     int data;
//     struct node *next;
// };
// void TraverseLinkedList(struct node *ptr){
//     while(ptr != NULL){
//         printf("%d ",ptr->data);
//         ptr = ptr->next;
//     }
// }
// struct node *reverseLinkedList(struct node *head){
//     struct node *prev = NULL;
//     struct node *current = head;
//     struct node *next = NULL;

//     while(current != NULL){
//         next = current->next;
//         current->next = prev;
//         prev = current;
//         current = next; 
//     }
//     return prev;
// } 

// struct node *printMiddle(struct node *head){
//     struct node *fast = head;
//     struct node *slow = head;
    
//     while(fast != NULL && fast->next != NULL){
//         slow = slow->next;
//         fast = fast->next->next;
//     }
//     return slow;
// }

// int main()
// {
//     struct node *head;
//     struct node *second;
//     struct node *third;
//     struct node *fourth;

//     head = (struct node *)malloc(sizeof(struct node));
//     second = (struct node *)malloc(sizeof(struct node));
//     third = (struct node *)malloc(sizeof(struct node));
//     fourth = (struct node *)malloc(sizeof(struct node));

//     head->data = 7;
//     head->next = second;
//     second->data = 1;
//     second->next = third;
//     third->data = 72;
//     third->next = fourth;
//     fourth->data = 23;
//     fourth->next = NULL;
    
//     printf("Original list: ");
//     TraverseLinkedList(head);
//     printf("\n");
//     struct node *middle = printMiddle(head);
//     printf("Middle element of original list: %d\n", middle->data);
//     printf("\n");
//     head = reverseLinkedList(head);
//     printf("Reversed list: ");
//     TraverseLinkedList(head);
//     printf("\n");
//     struct node *middleReversed = printMiddle(head);
//     printf("Middle element of reversed list: %d\n", middleReversed->data);
//     return 0;

// }

#include <stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
};
void TraverseLinkedList(struct node *ptr){
    while(ptr != NULL){
        printf("%d ",ptr->data);
        ptr = ptr->next;
    }
    printf("\n");
}
struct node *ReverseList(struct node *head){
    struct node *prev = NULL , *current = head ,*next = NULL;
    while(current != NULL){
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    return prev;
}
struct node *printMiddle(struct node *head){
    struct node *fast = head;
    struct node *slow = head;
    
    while(fast != NULL && fast->next != NULL){
        slow = slow->next;
        fast = fast->next->next;
    }
    return slow;
}
int main()
{   int n;
    scanf("%d",&n);
    struct node *head = NULL , *temp = NULL , *newNode = NULL;
    for(int i=0;i<n;i++){
        newNode = (struct node *)malloc(sizeof(struct node));
        
        scanf("%d", &newNode->data);
        newNode->next = NULL;
        
        if(head == NULL){
            head = newNode;
            temp = head;
        }else{
            temp->next = newNode;
            temp = newNode;
        }
    }
    head = ReverseList(head);
    printf("LinkedList:-->");
    TraverseLinkedList(head);
    struct node *middle = printMiddle(head);
    printf("The middle element is [%d]\n", middle->data);
	return 0;
}