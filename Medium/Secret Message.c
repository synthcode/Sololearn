#include <stdio.h>

int main() {
    char chars[50];
    int i;
    
    fgets(chars, 50, stdin);
    
    for (i = 0; i < 50; ++i) {
        if (chars[i] == '\0') {
            break;
        }
        else if (chars[i] >= 'A'
                   && chars[i] <= 'Z') {
            chars[i] += 'a' - 'A';
            chars[i]
              = 'a' + ('z' - chars[i]);
        }
        else if (chars[i] >= 'a'
                   && chars[i] <= 'z') {
            chars[i]
              = 'a' + ('z' - chars[i]);
        }
    }
    
    printf("%s", chars);

    return 0;
}