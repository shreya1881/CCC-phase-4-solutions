#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <bits/stdc++.h>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    int arr[n];
    for(int i=0; i<n; i++)
        cin>>arr[i];
    int k=0;
    for(int i=0; i<n; i++)
    {
        if(arr[i]<=arr[n-1])
        {
            swap(arr[i],arr[k]);
            k++;
        }
            
    }
    //swap(arr[k],arr[n-1]);
    for(int i=0; i<n; i++)
        cout<<arr[i]<<" ";
    return 0;
}