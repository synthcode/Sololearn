#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;
    
    int evenSum = 0;
    for (int i = 0; i < N; ++i) {
        int number;
        cin >> number;
        if (number % 2 == 0) {
            evenSum += number;
        }
    }
    
    cout << evenSum;

    return 0;
}