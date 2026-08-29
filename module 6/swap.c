#include <stdio.h>

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

void broken_swap(int a, int b)
{
    int temp = a;
    a = b;
    b = temp;

    // This does not change the original variables because
    // this function receives copies of their values, not addresses.
}

int main()
{
    int x = 10;
    int y = 20;

    printf("Before broken_swap: x = %d, y = %d\n", x, y);

    broken_swap(x, y);

    printf("After broken_swap:  x = %d, y = %d\n", x, y);

    printf("\nBefore swap: x = %d, y = %d\n", x, y);

    swap(&x, &y);

    printf("After swap:  x = %d, y = %d\n", x, y);

    return 0;
}