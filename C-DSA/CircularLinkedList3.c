#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node *next;
};
void TraverseLinkedList(struct Node *head){
    struct Node *temp = head;
    if(head != NULL){
        do{
            printf("%d \n",temp->data);
            temp = temp->next;
        }while(temp != head);
    } 
}
struct Node *DeletionNode( struct Node *head , int index){
    if(head == NULL) return NULL;
    // 1-2-3-4-5 -> 1-2-4-5 [2nd node remove]
    struct Node *Temp = head;
    struct Node *Tempnext = head->next;
    while(Tempnext != index-1){
        Temp = Temp->next;
        Tempnext = Tempnext->next;
    }
    Temp->next = Tempnext->next;
    
}
int main(){
    struct Node *head;
    struct Node *second;
    struct Node *third;
    struct Node *fourth;
    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));
    fourth = (struct Node *)malloc(sizeof(struct Node));

    head->data=7;
    head->next = second;

    second->data=8;
    second->next = third;

    third->data=9;
    third->next = fourth;

    fourth->data = 10;
    fourth->next = head;

    TraverseLinkedList(head);
    head = DeletionNode(head , 2);
    TraverseLinkedList(head);
}