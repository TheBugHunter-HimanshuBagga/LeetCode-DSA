#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};
void TraverseLinkedList(struct node *ptr){
    while(ptr != NULL){
        printf("Element: %d\n" , ptr->data);
        ptr = ptr->next;
    }
}
// from the Beginning use the double pointer
void deletefromBeginning(struct node **head){
    if(*head == NULL){
        printf("List is Empty: ");
        return; 
    }
    else{
        struct node *temp = *head;
        *head = (*head)->next;
        free(temp);
    }
}
int main(){

    struct node *head;
    struct node *second;
    struct node *third;
    struct node *fourth;

    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));
    fourth = (struct node *)malloc(sizeof(struct node));

    head->data=7;
    head->next = second;

    second->data=8;
    second->next = third;

    third->data=9;
    third->next = fourth;

    fourth->data = 10;
    fourth->next = NULL;

    TraverseLinkedList(head);
    deletefromBeginning(&head);
    TraverseLinkedList(head);
}