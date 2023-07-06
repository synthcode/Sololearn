#include <iostream>
#include <string>
#include <vector>
#include <sstream>
#include <cmath>
using namespace std;

// Cases 3, 4 and 5 fail

int calculate(string expression) {
    int length{expression.length()};
    vector<long long>
      numbers(length, -1);
    //vector<float> numbers(
    //  length, -1.f);
    vector<char> operators(length, '#');
    
    istringstream ss{expression};
    int i{0};
    ss >> numbers.at(i);
    while (ss >> operators.at(i)) {
        ++i;
        ss >> numbers.at(i);
    }
    
    i = 0;
    // Multiplication and division first
    while (operators.at(i) != '#') {
        if (operators.at(i) == '*') {
            numbers.at(i)
              *= numbers.at(i + 1);
        }
        else if (operators.at(i)
                   == '/') {
            numbers.at(i)
              /= numbers.at(i + 1);    
        }
        
        if (operators.at(i) == '*'
              || operators.at(i)
                   == '/') {
            numbers.erase(
              numbers.begin() + i + 1);
            operators.erase(
              operators.begin() + i);
        }
        else {
            ++i;
        }
    }

    i = 0;
    // Addition and subtraction
    while (operators.at(i) != '#') {
        if (operators.at(i) == '+') {
            numbers.at(i)
              += numbers.at(i + 1);
        }
        else if (operators.at(i)
                   == '-') {
            numbers.at(i)
              -= numbers.at(i + 1);    
        }
        
        if (operators.at(i) == '+'
              || operators.at(i)
                   == '-') {
            numbers.erase(
              numbers.begin() + i + 1);
            operators.erase(
              operators.begin() + i);
        }
        else {
            ++i;
        }
    }
    
    /*
    length = numbers.size();
    for (i = 0; i < length; ++i) {
        cout << numbers.at(i) << '\n';
        cout << operators.at(i) << '\n';
    }
    */
    
    long long result = numbers.at(0);
    //int result
    //  = int(round(numbers.at(0)));
    return result;
}

int calcBrackets(string expr) {
    int bCount{0};
    int left{0};
    int right{0};
    int i{0};
    long long result{0};
    
    /*
    cout << "Before do: "
      << expr << '\n';
    */
    
    do {
        int length{expr.length()};
        bCount = 0;
        for (i = 0; i < length; ++i) {
            if (expr[i] == '(') {
                left = i;
                ++bCount;
            }
        }
        
        for (i = left + 1;
               i < length; ++i) {
            if (expr[i] == ')') {
                right = i;
                break;
            }
        }
        
        int subLength
          = right - left - 1;
    
        string sub = expr.substr(
                       left + 1,
                         subLength);
        result = calculate(sub);
        
        string sRes = to_string(result);
        
        /*
        cout << length << '\n';
        cout << bCount << '\n';
        cout << left << '\n';
        cout << right << '\n';
        cout << subLength << '\n';
        cout << result << '\n';
        cout << sRes << '\n';
        */
        
        expr = expr.substr(0, left)
          + sRes + expr.substr(
              right + 1,
                length - right - 1);
        
        /*
        cout << "During do: "
          << expr << '\n';
        */
          
        --bCount;
    } while (bCount > 0);
    
    return result;
}

int main() {
    long long answer;
    int index{-1};
    string expression;
    
    cin >> answer;
    
    while (cin >> expression) {
        int test;
        /*
        test = calculate(
          "-5 + 4*6/2 - 6");
        cout << "Test calculate(): "
          << test << '\n';
        */
        
        /*
        test = calculate("2*9+7");
        cout << "Test calculate(): "
          << test << '\n';
        test = calcBrackets("(2*9+7)");
        cout << "Test calcBrackets(): "
          << test << '\n';
        */
        
        /*
        test = calcBrackets(
          "(2*9+(4+7*(2+2))*(6/2)+1)");
        cout << "Test calcBrackets(): "
          << test << '\n';
        */
        
        long long result{
          calcBrackets(expression)
        };
        //cout << result << '\n';
        
        /*
        // remove outer brackets
        expression = expression.substr(
          1, expression.length() - 2);
        result
          = calculate(expression);
        cout << result << '\n';
        */
        
        //++index;
        //cout << index << '\n';
        
        if (result == answer) {
            ++index;
            break;
        }
    }
    
    if (index != -1) {
        cout << "index " << index;
    }
    else {
        cout << "none";
    }

    return 0;
}