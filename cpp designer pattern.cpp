#include <bits/stdc++.h>
using namespace std;
int main(){
	cout<<"Enter a number,specially enter less than 10 ";
	int p;cin>>p;
	string dig="",rev="";
	for(short i=0;i<p;i++){
		for(short j=0;j<p-1-dig.length();j++){
			cout<<' ';
		}string nstr=to_string(i+1)+dig;dig=nstr;rev=nstr;
		for(short l=0;l<rev.length();l++){
		if(i>2 && ((int)rev.at(l)-'0')<4){cout<<' ';}
		else{cout<<rev.at(l);}}
		for(short l=rev.length()-2;l>=0;l--){
		
		if(i>2 && ((int)rev.at(l)-'0')<4){cout<<' ';}
		else{cout<<rev.at(l);}}cout<<endl;
	
	}
	}
