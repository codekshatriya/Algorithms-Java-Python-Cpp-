#include <bits/stdc++.h>
using namespace std;		//Deletion Algorithm by Harshvardhan Singh
int main(){
vector<int>v{1,2,3,4,5,6,7,8,9,10};
	int pos;
	cout<<"Enter position to delete";cin>>pos;pos--;
	short n=v.size();
	for(short i=pos;i<n-1;i++){//here,traversing from pos to last
	v[i]=v[i+1];}v.pop_back();
for(int x:v){cout<<x<<' ';}
}
