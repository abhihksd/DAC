show databases;
use knowitdb;
show tables;

delimiter //
create procedure check_cur1()
begin
 declare mjob varchar(9);
 declare mename varchar(10);
 declare mempno int;
 declare msal float(7,2);
 declare flag int default 0;
 
 declare cur cursor 
 for select empno,ename,sal,job from emp;
 
 declare continue handler for not found set flag=1;
 
 open cur;
 
 y:loop
  fetch cur into mempno,mename,msal,mjob;
  if flag=1 then
   leave y;
   end if;
   select mempno,mename,msal,mjob;
   end loop y;
   
   close cur;
   end //
   
call check_cur();   
 
drop procedure if exists check_cur1;

