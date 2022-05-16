import moeda

p = float (input("Digite um preço em R$: "))
print (f"Aumento de {p} é {moeda.aumentar(p)}")

p = float (input("Digite um preço em R$: "))
print (f"Subtração de {p} é {moeda.diminuir(p)}")

p = float (input("Digite um preço em R$: "))
print (f"Dobro {p} é {moeda.dobro(p)}")

p = float(input("Digite um preço em R$: "))
print (f"Metade {p} é {moeda.metade(p)}")