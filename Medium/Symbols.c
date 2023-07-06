#include <stdio.h>

int main() {
    char c;
    
    while ((c = getchar()) != EOF) {
        if ((c == ' ')
            || (c >= '0' && c <= '9')
             || (c >= 'A' && c <= 'Z')
           || (c >= 'a' && c <= 'z')) {
               printf("%c", c);
           }
    }

    return 0;
}