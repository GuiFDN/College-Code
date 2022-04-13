altura = float (input('Qual sua altura? (em metros): '))
peso = int (input('Digite seu peso (em Kilogramas): '))
imc = peso/(altura * altura)
print (f'Seu IMC é {imc:.2f}')