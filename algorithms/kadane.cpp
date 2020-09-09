#include<iostream>
#include<algorithm>
using namespace std;


int kadane(int arr[], int size) {
    int global_max, current_max = arr[0];
    for(int i = 1; i < size; i++ ) {
        current_max = max(arr[i],current_max + arr[i]);
        if (current_max > global_max) {
            global_max = current_max;
        }
    }
    return global_max;
}


int main() {
    int a[5] = {1, 2, 3, 4, 5};
    cout<<kadane(a, sizeof(a)/sizeof(a[0]));
}

