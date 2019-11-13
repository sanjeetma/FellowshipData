set server on;
Declare
num number;
pallindrome number:=0;
remainder number:=0;
n number:=0;


Begin
dbms_output.put_line('ENter number to check for Pallindrome');
num:=&n;
while num > 0
loop
remainder:=mod(num,10);
pallindrome:=(pallindrome*10)+remainder;
n:=trunc(n/10);
end loop;

if pallindrome==num
then
dbms_output.put_line('pallindrome');
else
dbms_output.put_line('not pallindrome');
end if;


end;
/