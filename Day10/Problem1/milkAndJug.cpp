#include<bits/stdc++.h>
using namespace std;

int gcd(int a,int b) {
    if(b==0) {
        return a;
    }
    return gcd(b,a%b);
}
bool fulfills(int m,int n,int p) {
    if(p>m+n) return false;
    if(p==m || p==n) return true;
    int g = gcd(m,n);
    if(g>p || p%g!=0) return false;
    return true;
}
int main() {
    int m,n,p;
    cin>>m>>n>>p;
    if(fulfills(m,n,p) && p>=0) {
        cout<<"true";
    }
    else {
        cout<<"false";
    }
}
