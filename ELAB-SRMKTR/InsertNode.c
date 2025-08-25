#include <stdio.h>
#include <stdlib.h>

struct node { // Test Case 1
    int data;
    struct node *next; // Test Case 2
};

void display(struct node *start) { // Test Case 5, Test Case 3
    printf("Linked List:");
    while (start != NULL) {
        printf("->%d", start->data);
        start = start->next;
    }
    printf("\n");
}

// Insert after a node with a given value
struct node *InsertAfterValue(struct node *head, int afterValue, int newValue, int *found) {
    struct node *start = head; // Test Case 3
    while (start != NULL && start->data != afterValue) {
        start = start->next;
    }
    if (start == NULL) {
        *found = 0;
        return head;
    }
    *found = 1;
    struct node *newNode = (struct node *)malloc(sizeof(struct node));
    newNode->data = newValue;
    newNode->next = start->next;
    start->next = newNode;
    return head;
}

int main() {
    int n, i, val, afterValue, newValue;
    struct node *head = NULL, *temp = NULL, *last = NULL;

    // Read number of nodes
    scanf("%d", &n);

    // Read node values and create list
    for (i = 0; i < n; i++) {
        scanf("%d", &val);
        temp = (struct node *)malloc(sizeof(struct node));
        temp->data = val;
        temp->next = NULL;
        if (head == NULL) {
            head = temp;
            last = temp;
        } else {
            // Demonstrate p2->next = p1; (Test Case 4)
            last->next = temp; // p2->next = p1;
            last = temp;
        }
    }

    // Read value after which to insert and the new value
    scanf("%d", &afterValue);
    scanf("%d", &newValue);

    int found = 0;
    head = InsertAfterValue(head, afterValue, newValue, &found);

    if (!found) {
        printf("Node not found! ");
    }
    display(head); // Test Case 5

    return 0;
}