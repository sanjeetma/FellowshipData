set server on;
declare
string varchar(20);
rev varchar(20);
str varchar(20);
len number;
begin
dbms_output.put_line('enter string');
string:=&str;
len:= Length(string); 
for i in reverse 1 ..len
loop
rev := rev||Substr(str, i, 1); 
    END LOOP; 
  dbms_output.Put_line('Reverse of string is ' || str1); 

  if rev=string
  then
  dbms_output.put_line('pallindrome');
  else
  dbms_output.put_line('not pallndrome');
  end if;
END; 
/