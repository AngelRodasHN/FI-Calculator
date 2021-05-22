public boolean isHombre(String genero){
    boolean g = false;

    if(genero == "M" || genero == "m"){
        g = true;
    }else if(genero == "F" || genero == "f"){
        g = false;
    }
    
    return g;
}


public static void main(String[] args) {
    String genero = "M";

    if(isHombre = true){
        System.out.println("Soy hombre");
    }else{
        System.out.println("Soy mujer");
    }


}