#include<stdio.h>
#include<stdlib.h>

/*
1. One can take different parameters as input and make appropriate changes in the formula to calculate the range of a car.
e.g for the given case, in which the battery capacity is variable for different electric cars, one can write range = (battery capacity * percentage of battery left) / (100 * given efficiency) after taking battery capacity as an additional input.

2. One can sort the 'range' array and print the elements in reverse order(i.e. from index n - 1 to 0) to get the ranges in decreasing order.
*/

int main()
{
	int n, type;
	float eff, fuel;
	scanf("%d", &n);
	float range[n];
	for(int i = 0; i < n; i++)
	{
		scanf("%d %f %f", &type, &eff, &fuel);
		if(type == 1) 	//Diesel cars
		{
			range[i] = eff * fuel;		//Formula for range of diesel cars
		}
		else	//Electric cars
		{
			range[i] = fuel * 1000 / eff;	//Formula for range of electric cars with 100 kW-h battery capacity (here fuel is percentage of battery)
		}
	}
	for(int i = n - 1; i >= 0; i--)
	{
		printf("Car %d: range = %.2f\n", i + 1, range[i]);
	}
}