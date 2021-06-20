#!/usr/bin/env python
# coding: utf-8

# In[37]:


from py_expression_eval import Parser
from IPython.display import display, Math
import math
import sympy as sym
from sympy.parsing.sympy_parser import (parse_expr, standard_transformations,convert_xor, implicit_multiplication)
input_string=[]
transformations = (standard_transformations +(convert_xor,implicit_multiplication))
input_string.append(input("Enter the expression:"))
c=1
while input_string[c-1]!='0':
    input_string.append(input("Enter the expression:"))
    c+=1
parser = Parser()
for i in range(0,c-1):
    a= parse_expr(input_string[i],transformations = transformations)
    s = (str(a).replace("**","^").replace("*","") +" = "+ str(sym.expand(a)).replace("**","^").replace("*",""))
    display(Math(s))

    

