#include <bits/stdc++.h>
using namespace std;		//Insertion Algorithm by Harshvardhan Singh
int main(){
vector<int>v{1,2,3,4,5,6,7,8,9,10};
	int val,pos;
	cout<<"Enter value";cin>>val;
	cout<<"Enter position to insert";cin>>pos;pos--;
	v.push_back(0);//this pushback enhances size of vector by 1
	short n=v.size();
	for(short i=n;i>pos;i--){//here,traversing from last to pos;
	v[i]=v[i-1];}
	v[pos]=val;//now,assigned the value at given position
for(int x:v){cout<<x<<' ';}
}
