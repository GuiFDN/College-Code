montante = float(input('Valor desejado: '))
prazo = int(input('Prazo do investimento (anos): '))
taxa = float(input('Taxa de juros anual (%): '))
deposito = montante / (1 + taxa/100)**prazo
print(f'\n Será preciso investir {deposito:.2f}')