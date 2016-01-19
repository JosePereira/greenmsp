

void main(){
}


assert(myF(4,"==8"));

assert(myF(4,"<=8"));
assert(myF(4,">=8"));
assert(myF(4,"<9"));
assert(myF(4,">7"));

assert(myF(4,"==10"));
assert(myF(4,"<=3"));
assert(myF(4,">=80"));
assert(myF(4,"<6"));
assert(myF(4,">10"));


int myF(int a){
  int res;
  res = 2*a;
  return res;
}

assert(myT(3,6));
assert(myT(9,11));

assert(myT(5,10));
assert(myT(8,10));

int myT(int a){
  int res;
  res = 2*a;
  return res;
}



assert(myBool(10,true));
assert(myBool(9,true));
assert(myBool(11,true));

boolean myBool(int a)
{
  if(a>=10)
  {
    return true;
  }
  else
  {
    return false;
  }
}

assert(myChar(10,'R'));
assert(myChar(10,'G'));
assert(myChar(8,'F'));

char myChar(int a)
{
  if(a>=10)
  {
    return 'R';
  }
  else
  {
    return 'F';
  }
}
