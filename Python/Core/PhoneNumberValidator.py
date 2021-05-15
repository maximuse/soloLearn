import re

#your code goes here
n = str(input())
p = '\A(1|8|9)\d{7}$'

if re.match(p, n):
    print('Valid')
else:
    print('Invalid')