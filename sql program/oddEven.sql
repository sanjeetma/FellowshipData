SET SERVEROUTPUT ON;
declare

num number(10):=10;
begin

if mod(num,2)=0
then
dbms_output.put_line('even number');
else
dbms_output.put_line('odd number');
end if;
end;
/
