#include <stdio.h>
#include <stdbool.h>
#define LENGTH 50

int main() {
    char input[LENGTH];
    int i;
    bool set_guard_money = false;
    bool set_guard_thief = false;
    bool safe = true;
    
    fgets(input, LENGTH, stdin);
    
    for (i = 0; i < LENGTH; ++i) {
        if (input[i] == 'T') {
            set_guard_money = true;
        }
        else if (set_guard_money
                   && input[i] == 'G') {
            break;
        }
        else if (set_guard_money
                   && input[i] == '$') {
            safe = false;
            break;
        }
        else if (input[i] == '$') {
            set_guard_thief = true;
        }
        else if (set_guard_thief
                   && input[i] == 'G') {
            break;
        }
        else if (set_guard_thief
                   && input[i] == 'T') {
            safe = false;
            break;
        }
    }
    
    if (!safe) {
        printf("ALARM");
    }
    else {
        printf("quiet");
    }

    return 0;
}