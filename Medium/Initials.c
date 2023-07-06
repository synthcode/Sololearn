#include <stdio.h>
#include <stdlib.h>

int main() {
    int i, j, n;
    char c;
    size_t buf_size = 50;
    char* buffer = (char*) malloc(
        buf_size * sizeof(char));
    
    getline(&buffer, &buf_size,
              stdin);
    n = atoi(buffer);
    //printf("%d", n);
    
    for (i = 0; i < n; ++i) {
        getline(&buffer, &buf_size,
                  stdin);
        fputc(buffer[0], stdout);
        
        j = 0;
        c = buffer[j];
        while (c != ' ') {
            ++j;
            c = buffer[j];
        }
        
        fputc(buffer[j + 1], stdout);
        fputc(' ', stdout);
    }

    return 0;
}