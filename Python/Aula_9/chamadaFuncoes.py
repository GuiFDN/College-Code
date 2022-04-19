# Definição da função
def uma_funcao (x):
    y = 2*x + 3
    return y

# Programa principal

y1 = uma_funcao (10)
y2 = uma_funcao (20)
y3 = uma_funcao (30)
print (f'y1 = {y1}, y2 = {y2}, y3 {y3}')

y4 = uma_funcao(uma_funcao(10))
print (f'y4 = {y4}')