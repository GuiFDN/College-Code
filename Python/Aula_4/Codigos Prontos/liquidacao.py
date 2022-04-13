# -*- coding: utf-8 -*-
DESCONTO = 0.2
PORCENTAGEM = 1 - DESCONTO
print('*** Grande Liquidação ***')
preco = float(input('Qual o valor do item? '))
novo_preco = preco * PORCENTAGEM
print(f'Você vai pagar somente {novo_preco:.2f}')