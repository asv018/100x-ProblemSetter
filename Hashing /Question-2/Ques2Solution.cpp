#include <bits/stdc++.h>
using namespace std;
#define ll long long
#define nl '\n'

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        map<int, int> m;
        for (int i = 0; i < n; ++i) {
            int x;
            cin >> x;
            m[x]++;
        }
        int ans = 0;
        for (auto i : m) {
            if(i.second >= i.first) {
                ans += i.second - i.first;
            }
            else {
                ans += i.second;
            }
        }
        cout << ans << "\n";
    }
    return 0;
}
