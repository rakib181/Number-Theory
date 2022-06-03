/*----->Hope Can Set You Free<-----*/
import java.util.*;

public class AlmostPrime {	
static List<Integer>pri=new ArrayList<>();
public static void imSeive(int n) {
	boolean[] yoPrime=new boolean[n+1];
 Arrays.fill(yoPrime, true);
 for(int i=2;i*i<=n;i++) {
	 if(yoPrime[i]==true) {
		 for(int j=2*i;j<=n;j+=i) {
			yoPrime[j]=false;
		 }
	 }
 }
 for(int i=2;i<=n;i++) {
	 if(yoPrime[i]==true) {
		 pri.add(i);
	 }
 }
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),cnt=0,pfact=0;
          imSeive(n);
         for(int i=1;i<=n;i++) {
        	 for(int j=0;j<pri.size()-1;j++) {
        		 if(i%(pri.get(j))==0) {
        			 ++pfact;
        			
        		 } 
        	 }
        	 if(pfact==2) {
    			 cnt++;
    		 }
        	pfact=0;
         }
         System.out.println(cnt);
	}
}

// Second Approach

#include<bits/stdc++.h>
using namespace std;
const int N=3010;
bool ok[N];
int Sieve[N];

void precompute(){
  for(int i=2;i<=N;i++){
    if(!ok[i]){
      for(int j=i;j<=N;j+=i){
        Sieve[j]++;
        ok[j]=true;
      }
    }
  }
}

int32_t main(){
   ios_base::sync_with_stdio(0);
    cin.tie(0); 
    cout.tie(0);
    #ifndef ONLINE_JUDGE 
    freopen("input.txt","r",stdin); 
    freopen("output.txt","w",stdout); 
    #endif
    auto start=clock();
    int n,cnt=0;
    cin >> n;
    precompute();
      for(int i=2 ;i<=n;i++){
       if(Sieve[i]==2){
         cnt++;
       }
  }
  cout << cnt << '\n';
    cerr<<1.0 * (clock()-start)/CLOCKS_PER_SEC<<endl;
    return 0;
}

