exports.isPrime=function(n){
    flag=true
    for(i=2;i<n;i++)
    {
        if(n%i==0)
        {
            flag=false
        }
    }
    return flag?true:false
}

exports.calFact=function(n)
{
    prod=1;
    for(i=1;i<=n;i++)
    {
        prod*=i
    }
    return prod
}
exports.isPerfect=function(n)
{
    sum=0
    for(i=0;i<n;i++)
    {
        if(n%i==0)
        {
            sum+=i
        }
    }
    if(sum==n)
    return true
else return false
}