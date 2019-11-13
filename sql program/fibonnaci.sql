set server on;
declare
n number;
first number:=0;
second number:=1;
sum number;
begin
dbms_output.put_line('enter the number');
dbms_output.put_line(first);
dbms_output.put_line(second);
n:=&n;
for i in 2 .. n
loop
sum:=first+second;
set server on;
declare
   n number;
    first number:=0;
    second number:=1;
    sum number;
    begin
    dbms_output.put_line('enter the number');
    n:=&n;
    dbms_output.put_line(first);
    dbms_output.put_line(second);
   n:=&n;
   for i in 2 .. n
   loop
   sum:=first+second;
   dbms_output.put_line(sum);
   first:=second;
   second:=sum;
   end loop;
   end;
   /