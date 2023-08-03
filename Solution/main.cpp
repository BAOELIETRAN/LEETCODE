#include <bits/stdc++.h>;
using namespace std;

int task[4] = {2,3,5};
int arr[100];
int target = 8;
int counting = 0;

void print(){
    for (int i = 1; i <= counting; i ++){
        cout << arr[i];
    }
    cout << " ";
}

void backtrack(int i){
    for (int index = 0; index < 3; index ++){
        if (task[index] >= arr[i - 1] && task[index] <= target && target > 0){
            target -= task[index];
            arr[i] = task[index];
            counting ++;
            if (target == 0){
                print();
            }
            else{
                backtrack(i + 1);
            }
            counting --;
            target += task[index];
        }
    }
}

int main() {
   backtrack(1);
   return 0;
}
