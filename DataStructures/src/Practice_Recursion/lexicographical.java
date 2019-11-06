#include <iostream>
using namespace std;
int QUE1(int n)
{
    int i=0,rem,que,A[10];
    while(n!=0)
    {
        rem=n%10;
        A[i]=rem;
        n=n/10;
        i++;
    }
    return A[1];
}
void number(int n1,int n2)
{
    for(int i=n1;i<=n2;i++)
    {
        cout<<i<<"\n";
    }
}
void lexicographicalOrder(int num)
{
   int i,j,k;
   if(num<=0)
   {
     return ;   
    }
  else if(num>0 && num<10)
   {
     for(i=1;i<=num;i++)
     {
     cout<<i<<"\n";
     }
   }
   else if(num>9 && num<100)
   {
       int que=num/10;
       int rem=num%10;
       for(i=1;i<=que;i++)
       {
           cout<<i<<"\n";
           for(j=0;j<=rem;j++)
           {
               cout<<i<<j<<"\n";
           }
       }
       number(que+1,9);
   }
   else if(num>99 && num<1000)
   {
       int que=num/10;
       int rem=num%10;
       int que1=QUE1(num);
       for(i=1;i<=que;i++)
       {
           for(j=0;j<=que1;j++)
           {
             for(k=0;k<=rem;k++)
             {
            //cout<<i<<"\n";
            //cout<<i<<j<<"\n";
            cout<<i<<j<<k<<"\n";
             }
           }
       }
       number(que+1,9);
   }
}
