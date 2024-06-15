#include<bits/stdc++.h>
using namespace std;

#define ll long long
#define nl '\n'

void solve(){
    long long n;
    cin >> n;
    ll m = 1 << n;
    ll arr[m];
    for(ll i = 0 ; i < m ; i++)
        cin >> arr[i];

    sort(arr , arr + m);

    map<ll,ll> sums;

    sums[0] = 1;

    vector<int> ans;

    vector<ll> subsums;

    for(int i = 0 ; i < m ; i++){
        if(sums[arr[i]]){
            sums[arr[i]]--;
        }
        else{
            ans.push_back(arr[i]);
            vector<ll> temp;
            for(auto&z : subsums)
                temp.push_back(z + arr[i]) , sums[z + arr[i]]++;

            for(auto&z : temp)
                subsums.push_back(z);
            subsums.push_back(arr[i]);
        }
    }

    for(auto&x : ans){
        cout << x << " ";
    }
    cout << nl;
}




int32_t main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int __;
    cin >> __;
    while(__--){
      solve();  

     }

  return 0;
}