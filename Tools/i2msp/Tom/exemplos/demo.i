void main() {

}



int maximo(int a, int b)
{
	if(a>b)
	{
		return a;
	}
	else
	{
		return b;
	}
}

assert(maximo(5,4,5));
assert(maximo(5,5,5));
assert(maximo(4,5,5));



int somaDez(int a)
{
	int res;
	res = a + 10;
	return res;
}

assert( somaDez(5,15) );
assert( somaDez(5,15) );
assert( somaDez(5,">=15") );
assert( somaDez(5,"<=15") );
assert( somaDez(5,"<20") );
assert( somaDez(12,"==22") );
assert( somaDez(5,">5") );


char letraA()
{
	return 'a';
}

assert( letraA('a') );


boolean maior(int a, int b)
{
	if(a>b)
	{
		return true;
	}
	else
	{
		return false;
	}
}

assert( maior(3,4,false) );
assert( maior(5,4,true) );
