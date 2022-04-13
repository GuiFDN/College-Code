# Entrada de dados
valor1 = float(input('Primeiro valor: '))
valor2 = float(input('Segundo valor: '))
valor3 = float(input('Terceiro valor: '))

# Processamento
res = (valor1 + valor2) * valor3

# Saída
print(f'''A soma de {valor1:.3f} com {valor2:.3f}
multiplicada por {valor3:.3f} vale {res:.3f}''')