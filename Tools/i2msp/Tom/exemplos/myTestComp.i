

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
