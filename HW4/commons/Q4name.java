int n;

void f(int m){
	int k = m;
	printf("k=%d", k);
	n = n + 1;
	k = k + m;
	printf("k=%d", k);
	return;
}
int main(){
	n = 1;
	f(n*n);
}
