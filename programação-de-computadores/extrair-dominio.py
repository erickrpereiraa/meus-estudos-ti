def extrair_dominio(email):
    partes = email.split('@')
    if len(partes) == 2:
        return partes[1]
    else:
        return None

def main():
    email = input("Entre com seu e-mail: ")
    dominio = extrair_dominio(email)
    if dominio:
        print("O domínio do seu e-mail é: http://" + dominio)
    else:
        print("E-mail inválido!")

if __name__ == "__main__":
    main()
