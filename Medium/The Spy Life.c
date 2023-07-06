#include <stdio.h>
#define MAXCHAR 100

int main() {
    char in_chars[MAXCHAR];
    int i = 0;
    int j = 0;
    int ch = 0;
    
    while ((ch = getchar()) != EOF
             && ch != '\n') {
        in_chars[i] = (char) ch;
        ++i;
        if (i == MAXCHAR) break;
    }
    
    for (j = i - 1; j >= 0; --j) {
        if (in_chars[j] == ' ') {
            printf("%c", in_chars[j]);
        }
        else if (in_chars[j] >= 'A' &&
                   in_chars[j] <= 'Z') {
            printf("%c", in_chars[j]);
        }
        else if (in_chars[j] >= 'a' &&
                   in_chars[j] <= 'z') {
            printf("%c", in_chars[j]);
        }
    }

    return 0;
}