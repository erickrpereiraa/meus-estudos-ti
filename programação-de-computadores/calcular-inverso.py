def calcular_inverso(numero):
    numero_str = str(numero)
    inverso_str = numero_str[::-1]
    inverso = int(inverso_str)
    return inverso

def main():
    numero = int(input("Digite um número inteiro com três algarismos: "))
    if 100 <= numero <= 999:
        inverso = calcular_inverso(numero)
        soma = numero + inverso
        print("O inverso do número é:", inverso)
        print("A soma é:", numero, "+", inverso, "=", soma)
    else:
        print("Número inválido! Por favor, digite um número inteiro com três algarismos.")

if __name__ == "__main__":
    main()
