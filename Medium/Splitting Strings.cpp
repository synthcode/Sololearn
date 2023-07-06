#include <iostream>
#include <string>
using namespace std;

int main() {
    string word;
    int partLength;
    
    cin >> word;
    cin >> partLength;
    
    int k = 0;
    for (int i = 0;
           i < word.length(); ++i) {
        if (k == partLength) {
            cout << '-';
            k = 0;
        }
        cout << word[i];
        ++k;
    }

    return 0;
}