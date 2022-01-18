#include<bits/stdc++.h>
using namespace std;

void printPattern(int n) {
    if(n%2==0) {
        cout<<"-1";
        return;
    }
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(i==n/2 || j==n/2) {
                cout<<"0";
            }
            else {
                cout<<"1";
            }
        }
        cout<<endl;
    }
}
int main() {
    int n;
    cin>>n;
    printPattern(n);
    return 0;
}
