# -*- coding: utf-8 -*-
TAXA = 0.07
item1 = float(input('Valor do primeiro item: '))
item2 = float(input('Valor do segundo item: '))
item3 = float(input('Valor do terceiro item: '))
subtotal = item1 + item2 + item3
print(f'Subtotal da compra = {subtotal:.2f}')
imposto = subtotal * TAXA
print(f'Total de impostos = {imposto:.2f}')
total = subtotal + imposto
print(f'Total da compra = {total:.2f}')