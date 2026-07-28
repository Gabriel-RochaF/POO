void main(){
    int idade = Integer.parseInt(IO.readln("Entre com sua idade: "));
    char sexo = IO.readln("entre com seu sexo(f/m): ").toLowerCase().charAt(0);

    if (idade >= 18 && sexo == 'm'){
        IO.println("Precisa apresentar atestado de reservista.");
    } else {
        IO.println("Não precisa apresentar atestado de reservista.");
    }
}