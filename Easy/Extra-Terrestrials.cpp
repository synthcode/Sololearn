#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main() {
    stack<char> st;
    string input, output;
    
    cin >> input;
    
    for (char c: input) {
        st.push(c);
    }
    
    while (!st.empty()) {
        output += st.top();
        st.pop();
    }
    
    cout << output;

    return 0;
}