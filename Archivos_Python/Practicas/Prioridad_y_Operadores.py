stack = []

expresion = "ABC+*"
for carac in expresion:
  print(carac)
  if carac == "+" or carac == "*":
    a = stack.pop()
    b = stack.pop()
    stack.append("(" + b + carac + a + ")")
  else: # Apilo caracteres
    stack.append(carac)
print(stack.pop())
print