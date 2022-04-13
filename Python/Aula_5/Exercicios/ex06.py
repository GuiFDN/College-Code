print("Insira o comprimentos dos lados do triângulo: ")
x = int(input("x: "))
y = int(input("y: "))
z = int(input("z: "))

if x == y == z:
    print ("Triângulo Equilátero")

elif x==y or y==z or z==x:
	print("Triângulo Isôsceles")
else:
	print("Triângulo Escaleno")
