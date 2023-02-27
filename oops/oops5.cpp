#include<iostream>
using namespace std;
class Complex
{
float real;
float imag;
public :
Complex()
{
real=0.0;
imag=0.0;
}
Complex(float val)
{
real=val;
imag=val;
}
Complex(float r,float i)
{
real=r;
imag=i;
}
friend Complex sum(Complex &a,Complex &b);
friend void show(Complex &ob);
};
Complex sum(Complex &a,Complex &b)
{
Complex c;
c.real=a.real+b.real;
c.imag=a.imag+b.imag;
return c; // returning object reference of a object
}
void show(Complex &ob)
{
cout<<"\nThe real part of result is : "<<ob.real;
cout<<"\nThe imaginary part is : "<<ob.imag;
return ;
}
int main()
{
Complex a(50,30.25);
Complex b(35.5,20);
Complex c(0.0,0.0);
c=sum(a,b);
show(c);
return 0;
}
