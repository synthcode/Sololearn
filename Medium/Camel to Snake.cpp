#include <iostream>
#include <string>
using namespace std;

int main() {
    string camel;
    cin >> camel;
    
    if (camel[0] >= 65
          && camel[0] <= 90) {
        camel[0] += 32;
    }
    
    int i = 1;
    while(true) {
        if (i > camel.length()) break;
        
        if (camel[i] >= 65
              && camel[i] <= 90) {
            camel[i] += 32;
            camel.insert(i, "_");
        }
        
        ++i;
    }
    
    cout << camel;

    return 0;
}