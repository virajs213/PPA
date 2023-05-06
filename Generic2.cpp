#include<iostream>

using namespace std;

//Application for Generic Programming
template <class T>  // Template Header
T AdditionI(T i ,T j)  //T - Template Argument
{
    int result;
    result = i + j;
    return result;

}

 

int main()
{
    int i ;
    float f;
    double d;

    i = AdditionI(10,11);
    cout<<i<<"\n";
    f = AdditionI(10.7f,89.5f);
    cout<<f<<"\n";
    d = AdditionI(10.7f,89.5f);
    cout<<f<<"\n";


  return 0;
}
