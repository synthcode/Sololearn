#include <stdio.h>

int main() {
    int height, width, area, rolls;
    
    scanf("%d", &height);
    scanf("%d", &width);
    
    area = height * width;
    // 10 feet = 60 feet * 2 inches
    rolls = (2 * area)/10;
    if ((2 * area) % 10 > 0) {
        rolls += 1;
    }
    
    printf("%d", rolls);

    return 0;
}