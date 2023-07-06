#include <stdio.h> 
 
int main() { 
    int houses; 
    scanf("%d", &houses); 
 
    float fhouses = (float) houses;
    float fpc = (2.f * 100.f)/fhouses;
    int pc = (int) (fpc + 0.999999f);
    
    printf("%d", pc);
     
    return 0; 
}