import random
# Entrada de dados
escolha = input('Digite S/s para somar ou M/m para multiplicar: ')

# Sorteio dos inteiros entre 0 e 100
x = random.randint(0, 100)
y = random.randint(0, 100)

# Escolha do usuário
if escolha == 'S' or escolha == 's':
    res = x + y
    print(f'{x} + {y} = {res}')
elif escolha == 'M' or escolha == 'm':
    res = x * y
    print(f'{x} * {y} = {res}')
else:
    print('ERRO: Você deve digitar S ou M !!!')