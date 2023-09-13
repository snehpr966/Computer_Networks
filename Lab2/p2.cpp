#include "time.h"
#include "stdio.h"
int hamming_distance( int n,  int m);

int main()
{
	printf("%d    [should be   3]\n", hamming_distance(0, 11));
	printf("%d    [should be   3]\n", hamming_distance(0, 21));
	printf("%d   [should be  4]\n", hamming_distance(11, 21));
    printf("%d   [should be  3]\n", hamming_distance(11, 30));
    printf("%d   [should be  4]\n", hamming_distance(0,30));
    printf("%d   [should be  3]\n", hamming_distance(21,30));
	//printf("%d  [should be 119]\n");

	return 1;
}

int hamming_distance( int n, int m)
{
	int i = 0;
	unsigned int count = 0;
	
	for(i=0;i<64;i++)
	{
		if( (n&1) != (m&1) )
		{
			count++;
		}

		n >>= 1;
		m >>= 1;
	}

	return count;
}

 