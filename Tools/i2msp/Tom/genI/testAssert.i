int f(int a)
{
	int res;
	res = 2*a;
	return res;
}

assert( myf ( 2, 3, true, 4) );
assert(myf(2,'a',true));
assert(myf(2,'a',">2"));