# Entrada de dados
P1 = float(input('Nota da P1: '))
P2 = float(input('Nota da P2: '))
PI = float(input('Nota do Projeto Integrador: '))

# Processamento
MF = 0.3*P1 + 0.5*P2 + 0.2*PI

# Saída
print(f'A média final na disciplina é {MF:.1f}')