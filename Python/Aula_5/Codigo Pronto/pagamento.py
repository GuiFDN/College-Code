# Valor do produto
preco = float(input('Qual o valor do produto? '))

# Menu - Forma de pagamento
print(''' *** Formas de pagamento ***
      1. À vista (PIX, dinheiro ou cheque): 10% de desconto
      2. À vista (Crédito): 5% de desconto
      3. Em 2 parcelas (Crédito): sem desconto
      4. Em 3 ou mais parcelas (Crédito): juros de 20%''')

# Escolha da forma de pagamento
forma = input('Qual a forma de pagamento? ')

# Determinação do valor a ser pago
if forma == '1':
    pagamento = 0.9 * preco
    print(f'Valor a ser pago = {pagamento:.2f}')
elif forma == '2':
    pagamento = 0.95 * preco
    print(f'Valor a ser pago = {pagamento:.2f}')
elif forma == '3':
    parcelas = preco / 2
    print(f'Valor a ser pago = 2 parcelas de {parcelas:.2f}')
elif forma == '4':
    num_parcelas = int(input('Quantas parcelas? '))
    parcelas = (1.2 * preco) / num_parcelas
    print(f'Valor a ser pago = {num_parcelas} parcelas de {parcelas:.2f}')
else:
    print('ERRO: Escolha de pagamento inexistente')