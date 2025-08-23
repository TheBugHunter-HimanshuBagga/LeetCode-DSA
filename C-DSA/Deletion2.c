#include<stdio.h>
#include<stdlib.h>

struct node{    
    int data;
    struct  node *next;
};
void TraverseLinkedList(struct node *ptr){
    while(ptr != NULL){
        printf("Element: %d\n" , ptr->data);
        ptr = ptr->next;
    }
}
void insertatend(struct node *head , int data){
    struct node *newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = 24;
    newNode->next = NULL;
    struct node *temp = head;
        while(temp->next != NULL){
            temp = temp->next;
        }
        temp->next = newNode;
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
    printf("\n");
    insertatend(head , 78);
    TraverseLinkedList(head);
}