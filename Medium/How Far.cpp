#include <iostream>
using namespace std;

int main() {
    string input;
    getline(cin, input);
    
    int count{0};
    bool beginCount{false};
    for (string::iterator it
           = input.begin();
             it != input.end(); ++it) {
        char c = *it;
        
        if (!beginCount) {
            if (c == 'H' || c == 'P') {
                beginCount = true;
            }
        }
        else if (beginCount) {
            if (c == 'P' || c == 'H') {
                break;
            }
            else {
                ++count;
            }
        }
    }
    
    cout << count;

    return 0;
}