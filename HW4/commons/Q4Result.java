int n;

void f(int k){
	n = n + 1
	k = k + 4;
	printf("n=%d, k=%d", n, k);
	return;
}
int main(){
	n = 0;
	f(n);
	print("n=%d", n);
}
