#include<iostream>
using namespace std;

bool evenInversions(int arr[],int n) { //3 1 2:index=[0 1 2], 3
    int cnt = 0;
    for(int i=1;i<n;i++) {
        for(int j=0;j<i;j++) {
            if(arr[j]>arr[i]) {
                cnt++;
            }
        }
    }
    return cnt%2==0?true:false;
}
int main() {
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++) {
        cin>>arr[i];
    }
    if(evenInversions(arr,n)) {
        cout<<"YES"<<endl;
    }
    else {
        cout<<"NO"<<endl;
    }
}
