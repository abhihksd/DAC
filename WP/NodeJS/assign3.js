exports.selectPrime = function (arr) {
  res = [];
  flag = true;
  for (i = 0; i < arr.length; i++) {
    flag = true;
    for (j = 2; j < arr[i]; j++) {
      if (arr[i] % j == 0) {
        flag = false;
      }
    }
    if (flag == true) res.push(arr[i]);
  }
  return res;
};

exports.longestString = function (arrstr) {
    longStr=arrstr[0]
  for (i = 1; i < arrstr.length; i++) {
    if(longStr.length<arrstr[i].length)
        longStr=arrstr[i]
  }
  return longStr
};

var date=new Date()
day=date.getDate()
month=date.getMonth()+1
year=date.getMonth()
hh=date.getHours()
mm=date.getMinutes()
ss=date.getSeconds()

exports.currdate=day+"/"+month+"/"+year+" "+hh+":"+mm+":"+ss


