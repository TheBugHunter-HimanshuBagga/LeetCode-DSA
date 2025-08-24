#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node *next;
};
void TraerseLinkedList(struct Node *q){
    while(q != NULL){
        printf("Element: %d\n" , q->data);
        q = q->next;
    }
}
struct Node *DeleteTheLastElement( struct Node *head){
    struct Node *p = head;
    struct Node *q = head->next;
    //int i = 0; // 1-2-3-4-5 //1-2-3-4
    while(q->next != NULL){
        p = p->next;
        q = q->next;
    }
    p->next = NULL;
    free(q);
    return head;
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
    fourth->next = NULL;

    TraerseLinkedList(head);
    head = DeleteTheLastElement(head );
    TraerseLinkedList(head);
}