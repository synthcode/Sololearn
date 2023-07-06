#include <stdio.h>
#define INMAX 50
#define OUTMAX 150

int main() {
    char chars_in[INMAX];
    char chars_out[OUTMAX];
    char prev_char = 'a';
    int i, j, k;
    
    fgets(chars_in, INMAX, stdin);

    j = 0;
    for (i = 0; i < INMAX; ++i) {
        if (chars_in[i] >= '0'
              && chars_in[i] <= '9') {
            for (k = 0;
                   k < chars_in[i] - '1';
                     ++k) {
                chars_out[j]
                  = prev_char;
                ++j;
            }
        }
        else {
            chars_out[j]
              = chars_in[i];
            ++j;
        }
      
        prev_char = chars_in[i];
    }
    
    fputs(chars_out, stdout);

    return 0;
}