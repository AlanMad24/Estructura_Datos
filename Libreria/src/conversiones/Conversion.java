package conversiones;

public class Conversion {
    public String binario (int numero){
        int expon=0 , digito;
        double binario=0;
        while (numero!=0){
            digito= numero % 2;
            binario = binario + digito * Math.pow(10,expon);
            expon ++;
            numero = numero /2;

        }
        return String.format("%.0f %n",binario);
    }
    public String hex(int numero){
        return Integer.toHexString(numero);
    }
    public String octal(int numero){

        return Integer.toOctalString(numero);

    }//octal
    public String conv(int numero, int base){
        String dig="ABCDEF";
        String res="";
        while(numero >0) {
            int digito = numero % base;
            res = dig.charAt(digito) + res;
            numero = numero / base;

        }//while
        return res;
    }//conv

}//public













