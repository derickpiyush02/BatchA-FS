#include<bits/stdc++.h>
using namespace std;
int main(){
    string s;
    vector <int> vec;
    getline(cin,s);
    int x;
    stringstream obj(s);
    for(int i=0;i<s.length();i++){
            while(obj>>x)
            vec.push_back(x);
    }
    map <int,int> m;
    float n=vec.size();
    for(int i=0;i<vec.size();i++){
        m[vec[i]]++;
    }
    for(auto i:m){
        if(i.second >= n/2){
            cout<<i.first;
            break;
        }
        
    }
}
