# -*- coding: utf-8 -*-
TAXA = 0.07
num_itens = int(input('Quantos itens? '))
itens = []
for item in range(num_itens):
    preco = float(input(f'Valor do item #{item+1}: '))
    itens.append(preco)
subtotal = sum(itens)
print(f'\nSubtotal da compra = {subtotal:.2f}')
imposto = subtotal * TAXA
print(f'Total de impostos = {imposto:.2f}')
total = subtotal + imposto
print(f'Total da compra = {total:.2f}')