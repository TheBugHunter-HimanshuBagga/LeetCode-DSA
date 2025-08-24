#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node *next;
};
// Traverse Linked List
void TraverseLinkedList(struct Node *head){
    struct Node *temp = head;
    if(head != NULL){
        do{
            printf("%d \n",temp->data);
            temp = temp->next;
        }while(temp != head);
    } 
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
}