#include <iostream>
using namespace std;

int main() {
    const float separation = 50.f;
    float safety, roadrunner, coyote;
    
    cin >> safety;
    cin >> roadrunner;
    cin >> coyote;
    
    if ((separation + safety)/coyote
            >= safety/roadrunner) {
        cout << "Meep Meep";
    }
    else {
        cout << "Yum";
    }

    return 0;
}