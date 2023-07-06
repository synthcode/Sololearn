#include <iostream>
using namespace std;

int main() {
    int length, width;
    cin >> length >> width;
    
    int perimeter = 2 * (length + width);
    cout << perimeter/2;

    return 0;
}