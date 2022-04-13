N = int(input(""))
aux = -8000
aux = aux + N
if aux < 0:
    aux = aux * -1
    print(f"{aux} A.C.")
else:
  print(f"{aux} D.C.")