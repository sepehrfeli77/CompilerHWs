int main() 
{ 
    // E is a start symbol. 
    E(); 
  
    // if lookahead = $, it represents the end of the string 
    // Here l is lookahead. 
    if (l == '$') 
        printf("Parsing Successful"); 
} 
  
// Definition of E, as per the given production 
E() 
{ 
    T();
    if (l == '+') { 
        match('+'); 
        E(); 
    } else if (l == '-'){
        match('-');
        E();
    }
    return();
} 
  
// Definition of E' as per the given production 
T()    
{ 
    if (l == '1') { 
        match('1');
        if(l == '1'){
            match('1');
            T'();
        }else if(l == '0'){
            match('0');
            T'();
        }
    }
         
} 

T'()
{
    if (l == '1') { 
        match('1');
        if(l == '1'){
            match('1');
            T();
        }else if(l == '0'){
            match('0');
            T();
        }
    }else{
        return();
    }
}
  
// Match function 
match(char t) 
{ 
    if (l == t) { 
        l = getchar(); 
    } 
    else
        printf("Error"); 
} 