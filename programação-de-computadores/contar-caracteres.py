def contar_caracteres(string):
    string = string.upper()
    contagem_caracteres = {}
    for caractere in string:
        contagem_caracteres[caractere] = contagem_caracteres.get(caractere, 0) + 1
    return contagem_caracteres

def main():
    entrada = input("Entre com uma string: ")
    contagem = contar_caracteres(entrada)
    for caractere, quantidade in contagem.items():
        print(f"O caractere {caractere} aparece {quantidade} vezes.")

if __name__ == "__main__":
    main()
