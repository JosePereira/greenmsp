

void main(){
    boolean a;
    boolean b;
    
    a=true;
    b=false;
    
    print('1');
    if(a && b){ print('T'); }
    else { print('F'); }
    print('2');
    
}

void myAssert1(){
    print('S');
    if(myF(4) == 'S'){ print('T'); }
    else{ print('F'); }
    print('K');
}


char myF(int a){
    print('X');
    if(a > 10){
        return 'S';
    }
    else{
        return 'N';
    }
    return ' ';
}
