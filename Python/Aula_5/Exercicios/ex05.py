produto = float(input("Digite o preço do produto: R$ "))

pix = float
vista = float
vista = float
parcela2 = float
parcela3 = float
user = str (input("Selecione a forma de pagamento: P para Pix, V para a vista, P2 para pagar em 2 parcelas e P3 para pagar em 3 parcelas:"))

pix = produto - (produto * 10/100)
vista = produto - (produto * 5/100)
parcela2 = produto 
parcela3 = produto * 1.2

if (user == "P"):
    print ("Pagamento em Pix, desconto de 10%. Preço: R$ " ,pix)
elif (user == "V"):
        print ("Pagamento a vista, desconto de 5%. Preço: R$ ", vista)
elif (user == "P2"):
        print ("Pagamento com 2 parcelas, sem desconto. Preço: R$ ", parcela2)
elif (user == "P3"):
        print ("Pagamento com 3 parcelas, aumento de preço por juros. Preço: R$ ",parcela3)
